import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
	private int anInt1370;

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
	private int anInt1373;

	@OriginalMember(owner = "client!eb", name = "cb", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
	private int anInt1374 = -1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177 && this.method971()) {
			@Pc(47) int local47 = this.anInt1373 * (this.anInt1370 == Static57.anInt1795 ? arg0 : arg0 * this.anInt1370 / Static57.anInt1795);
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[2];
			@Pc(59) int[] local59 = local11[1];
			@Pc(69) int local69;
			@Pc(78) int local78;
			if (Static106.anInt3045 == this.anInt1373) {
				for (local69 = 0; local69 < Static106.anInt3045; local69++) {
					local78 = this.anIntArray124[local47++];
					local55[local69] = (local78 & 0xFF) << 4;
					local59[local69] = local78 >> 4 & 0xFF0;
					local51[local69] = local78 >> 12 & 0xFF0;
				}
			} else {
				for (local69 = 0; local69 < Static106.anInt3045; local69++) {
					local78 = local69 * this.anInt1373 / Static106.anInt3045;
					@Pc(86) int local86 = this.anIntArray124[local47 + local78];
					local55[local69] = (local86 & 0xFF) << 4;
					local59[local69] = local86 >> 4 & 0xFF0;
					local51[local69] = local86 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1374 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)Z")
	private boolean method971() {
		if (this.anIntArray124 != null) {
			return true;
		} else if (this.anInt1374 >= 0) {
			@Pc(24) int local24 = Static106.anInt3045;
			@Pc(26) int local26 = Static57.anInt1795;
			@Pc(36) int local36 = Static42.anInterface1_1.method2881(this.anInt1374) ? 64 : 128;
			this.anIntArray124 = Static42.anInterface1_1.method2885(this.anInt1374);
			this.anInt1370 = local36;
			this.anInt1373 = local36;
			Static46.method1061(local24, local26);
			return this.anIntArray124 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)I")
	@Override
	public int method3559() {
		return this.anInt1374;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	@Override
	public void method3567() {
		super.method3567();
		this.anIntArray124 = null;
	}
}
