import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class36_Sub2_Sub1 extends Class36_Sub2 {

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!sa;")
	private Class77_Sub4 aClass77_Sub4_1;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
	private final int anInt3687;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
	private final int anInt3692;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	private final int anInt3691;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
	private final int anInt3693;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	private final int anInt3688;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_16;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	private final int anInt3689;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!kga;IIIIII)V")
	public Class36_Sub2_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3687 = arg4;
		this.anInt3692 = arg6;
		this.anInt3691 = arg3;
		this.anInt3693 = arg2;
		this.anInt3688 = arg5;
		this.aClass44_Sub3_16 = arg0;
		this.anInt3689 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)Lclient!sa;")
	@Override
	public Class77_Sub4 method6497() {
		if (this.aClass77_Sub4_1 == null) {
			@Pc(17) Interface11 local17 = this.aClass44_Sub3_16.anInterface11_11;
			Static176.anIntArray179[4] = this.anInt3688;
			Static176.anIntArray179[5] = this.anInt3692;
			Static176.anIntArray179[2] = this.anInt3691;
			Static176.anIntArray179[3] = this.anInt3687;
			Static176.anIntArray179[0] = this.anInt3689;
			Static176.anIntArray179[1] = this.anInt3693;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method7407(Static176.anIntArray179[local53])) {
					return null;
				}
				@Pc(71) Class14 local71 = local17.method7405(Static176.anIntArray179[local53]);
				@Pc(78) int local78 = local71.aBoolean12 ? 64 : 128;
				if (local51 < local78) {
					local51 = local78;
				}
				if (local71.aByte10 > 0) {
					local49 = true;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static15.anIntArrayArray3[local99] = local17.method7408(local51, false, local51, Static176.anIntArray179[local99], 1.0F);
			}
			this.aClass77_Sub4_1 = new Class77_Sub4(this.aClass44_Sub3_16, 6407, local51, local49, Static15.anIntArrayArray3);
		}
		return this.aClass77_Sub4_1;
	}
}
