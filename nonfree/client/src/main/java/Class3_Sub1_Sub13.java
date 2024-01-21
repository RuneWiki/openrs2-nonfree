import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!he", name = "M", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
	private int anInt1630;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "I")
	private int anInt1628;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "I")
	private int anInt1631;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1631 = arg1.method208();
		} else if (arg0 == 1) {
			this.anInt1628 = arg1.method208();
		} else if (arg0 == 2) {
			this.anInt1630 = arg1.method208();
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		this.method1127();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(25) int[] local25 = this.method2904(0, arg0 - 1 & Static169.anInt3754);
			@Pc(31) int[] local31 = this.method2904(0, arg0);
			@Pc(41) int[] local41 = this.method2904(0, Static169.anInt3754 & arg0 + 1);
			for (@Pc(43) int local43 = 0; local43 < Static141.anInt3261; local43++) {
				@Pc(65) int local65 = this.anInt1631 * (local31[local43 + 1 & Static67.anInt1764] - local31[Static67.anInt1764 & local43 - 1]);
				@Pc(77) int local77 = this.anInt1631 * (local41[local43] - local25[local43]);
				@Pc(81) int local81 = local77 >> 12;
				@Pc(85) int local85 = local65 >> 12;
				@Pc(91) int local91 = local81 * local81 >> 12;
				@Pc(97) int local97 = local85 * local85 >> 12;
				@Pc(110) int local110 = (int) (Math.sqrt((double) ((local91 + local97 + 4096) / 4096)) * 4096.0D);
				@Pc(116) int local116;
				@Pc(124) int local124;
				@Pc(120) int local120;
				if (local110 == 0) {
					local124 = 0;
					local120 = 0;
					local116 = 0;
				} else {
					local116 = local65 / local110;
					local120 = 16777216 / local110;
					local124 = local77 / local110;
				}
				local120 = local120 * this.anIntArray153[2] >> 12;
				local116 = this.anIntArray153[0] * local116 >> 12;
				local124 = this.anIntArray153[1] * local124 >> 12;
				local11[local43] = local124 + local116 + local120;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	private void method1127() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt1630 / 4096));
		this.anIntArray153[0] = (int) (local10 * Math.sin((double) (this.anInt1628 / 4096)) * 4096.0D);
		this.anIntArray153[1] = (int) (local10 * Math.cos((double) (this.anInt1628 / 4096)) * 4096.0D);
		this.anIntArray153[2] = (int) (Math.sin((double) (this.anInt1630 / 4096)) * 4096.0D);
		@Pc(70) int local70 = this.anIntArray153[1] * this.anIntArray153[1] >> 12;
		@Pc(82) int local82 = this.anIntArray153[2] * this.anIntArray153[2] >> 12;
		@Pc(94) int local94 = this.anIntArray153[0] * this.anIntArray153[0] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local82 + local70 + local94 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray153[2] = (this.anIntArray153[2] << 12) / local107;
			this.anIntArray153[0] = (this.anIntArray153[0] << 12) / local107;
			this.anIntArray153[1] = (this.anIntArray153[1] << 12) / local107;
		}
	}
}
