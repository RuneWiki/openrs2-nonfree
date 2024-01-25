import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class17_Sub1_Sub1 extends Class17_Sub1 {

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Lclient!m;")
	private Class92_Sub3 aClass92_Sub3_1;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "I")
	private final int anInt404;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "I")
	private final int anInt401;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_2;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	private final int anInt403;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	private final int anInt402;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	private final int anInt400;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	private final int anInt399;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!hd;IIIIII)V")
	public Class17_Sub1_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt404 = arg2;
		this.anInt401 = arg4;
		this.aClass89_Sub1_2 = arg0;
		this.anInt403 = arg3;
		this.anInt402 = arg5;
		this.anInt400 = arg1;
		this.anInt399 = arg6;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Lclient!m;")
	@Override
	public Class92_Sub3 method1865() {
		if (this.aClass92_Sub3_1 == null) {
			@Pc(6) Interface6 local6 = this.aClass89_Sub1_2.anInterface6_3;
			Static19.anIntArray39[2] = this.anInt403;
			Static19.anIntArray39[4] = this.anInt402;
			Static19.anIntArray39[3] = this.anInt401;
			Static19.anIntArray39[0] = this.anInt400;
			Static19.anIntArray39[1] = this.anInt404;
			Static19.anIntArray39[5] = this.anInt399;
			@Pc(38) byte local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(42) int local42;
			for (local42 = 0; local42 < 6; local42++) {
				if (!local6.method5615(Static19.anIntArray39[local42])) {
					return null;
				}
				@Pc(63) Class18 local63 = local6.method5614(Static19.anIntArray39[local42]);
				@Pc(70) int local70 = local63.aBoolean15 ? 64 : 128;
				if (local70 > local40) {
					local40 = local70;
				}
				if (local63.aByte1 > 0) {
					local38 = 1;
				}
			}
			for (local42 = 0; local42 < 6; local42++) {
				Static19.anIntArrayArray4[local42] = local6.method5616(local40, local40, Static19.anIntArray39[local42], false, 1.0F);
			}
			this.aClass92_Sub3_1 = new Class92_Sub3(this.aClass89_Sub1_2, 6407, local40, local38 != 0, Static19.anIntArrayArray4);
		}
		return this.aClass92_Sub3_1;
	}
}
