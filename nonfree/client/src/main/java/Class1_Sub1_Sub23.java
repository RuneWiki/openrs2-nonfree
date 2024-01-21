import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
	private int anInt2836 = 0;

	@OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
	private int anInt2831 = 1;

	@OriginalMember(owner = "client!me", name = "sb", descriptor = "I")
	private int anInt2842 = 0;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		Static161.method2763();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(25) int local25 = Static22.anIntArray68[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static176.anInt3921; local33++) {
				@Pc(39) int local39 = Static171.anIntArray439[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(59) int local59;
				if (this.anInt2836 == 0) {
					local59 = (local39 - local25) * this.anInt2831;
				} else {
					@Pc(71) int local71 = local31 * local31 + local45 * local45 >> 12;
					local59 = (int) (Math.sqrt((double) ((float) local71 / 4096.0F)) * 4096.0D);
					local59 = (int) ((double) (local59 * this.anInt2831) * 3.141592653589793D);
				}
				local59 -= local59 & 0xFFFFF000;
				if (this.anInt2842 == 0) {
					local59 = Static21.anIntArray66[local59 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2842 == 2) {
					local59 -= 2048;
					if (local59 < 0) {
						local59 = -local59;
					}
					local59 = 2048 - local59 << 1;
				}
				local7[local33] = local59;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2836 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt2842 = arg1.method1738();
		} else if (arg0 == 3) {
			this.anInt2831 = arg1.method1738();
		}
	}
}
