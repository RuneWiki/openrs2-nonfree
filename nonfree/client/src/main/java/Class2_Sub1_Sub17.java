import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
	private int anInt1552;

	@OriginalMember(owner = "client!hg", name = "db", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
	private int anInt1555;

	@OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
	private int anInt1554;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		this.method1004();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1555 = arg0.method1397();
		} else if (arg1 == 1) {
			this.anInt1552 = arg0.method1397();
		} else if (arg1 == 2) {
			this.anInt1554 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
	private void method1004() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt1554 / 4096));
		this.anIntArray100[0] = (int) (local10 * 4096.0D * Math.sin((double) (this.anInt1552 / 4096)));
		this.anIntArray100[1] = (int) (Math.cos((double) (this.anInt1552 / 4096)) * local10 * 4096.0D);
		this.anIntArray100[2] = (int) (Math.sin((double) (this.anInt1554 / 4096)) * 4096.0D);
		@Pc(65) int local65 = this.anIntArray100[1] * this.anIntArray100[1] >> 12;
		@Pc(77) int local77 = this.anIntArray100[2] * this.anIntArray100[2] >> 12;
		@Pc(89) int local89 = this.anIntArray100[0] * this.anIntArray100[0] >> 12;
		@Pc(103) int local103 = (int) (Math.sqrt((double) (local89 + local65 + local77 >> 12)) * 4096.0D);
		if (local103 != 0) {
			this.anIntArray100[1] = (this.anIntArray100[1] << 12) / local103;
			this.anIntArray100[2] = (this.anIntArray100[2] << 12) / local103;
			this.anIntArray100[0] = (this.anIntArray100[0] << 12) / local103;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(31) int[] local31 = this.method2796(0, Static180.anInt4192 & arg0 - 1);
			@Pc(37) int[] local37 = this.method2796(0, arg0);
			@Pc(47) int[] local47 = this.method2796(0, Static180.anInt4192 & arg0 + 1);
			for (@Pc(49) int local49 = 0; local49 < Static120.anInt2812; local49++) {
				@Pc(63) int local63 = this.anInt1555 * (local47[local49] - local31[local49]);
				@Pc(82) int local82 = this.anInt1555 * (local37[Static49.anInt1370 & local49 + 1] - local37[local49 - 1 & Static49.anInt1370]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local63 >> 12;
				@Pc(96) int local96 = local90 * local90 >> 12;
				@Pc(102) int local102 = local86 * local86 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((local96 + local102 + 4096) / 4096)) * 4096.0D);
				@Pc(121) int local121;
				@Pc(123) int local123;
				@Pc(119) int local119;
				if (local115 == 0) {
					local119 = 0;
					local121 = 0;
					local123 = 0;
				} else {
					local119 = 16777216 / local115;
					local123 = local63 / local115;
					local121 = local82 / local115;
				}
				local123 = this.anIntArray100[1] * local123 >> 12;
				local121 = local121 * this.anIntArray100[0] >> 12;
				local119 = this.anIntArray100[2] * local119 >> 12;
				local17[local49] = local123 + local121 + local119;
			}
		}
		return local17;
	}
}
