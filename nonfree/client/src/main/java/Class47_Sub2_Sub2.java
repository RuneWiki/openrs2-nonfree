import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class47_Sub2_Sub2 extends Class47_Sub2 {

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "Lclient!qn;")
	private Class50_Sub4 aClass50_Sub4_2;

	@OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
	private final int anInt4069;

	@OriginalMember(owner = "client!hba", name = "v", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_18;

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
	private final int anInt4062;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "I")
	private final int anInt4068;

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "I")
	private final int anInt4067;

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	private final int anInt4063;

	@OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
	private final int anInt4066;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!er;IIIIII)V")
	public Class47_Sub2_Sub2(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4069 = arg2;
		this.aClass31_Sub2_18 = arg0;
		this.anInt4062 = arg4;
		this.anInt4068 = arg5;
		this.anInt4067 = arg3;
		this.anInt4063 = arg1;
		this.anInt4066 = arg6;
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)Lclient!qn;")
	@Override
	public Class50_Sub4 method3299() {
		if (this.aClass50_Sub4_2 == null) {
			Static480.anIntArray494[4] = this.anInt4068;
			Static480.anIntArray494[3] = this.anInt4062;
			Static480.anIntArray494[0] = this.anInt4063;
			Static480.anIntArray494[5] = this.anInt4066;
			Static480.anIntArray494[1] = this.anInt4069;
			Static480.anIntArray494[2] = this.anInt4067;
			@Pc(47) Interface4 local47 = this.aClass31_Sub2_18.anInterface4_14;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local47.method7227(Static480.anIntArray494[local53])) {
					return null;
				}
				@Pc(71) Class172 local71 = local47.method7229(Static480.anIntArray494[local53]);
				@Pc(78) int local78 = local71.aBoolean358 ? 64 : 128;
				if (local51 < local78) {
					local51 = local78;
				}
				if (local71.aByte59 > 0) {
					local49 = true;
				}
			}
			for (@Pc(96) int local96 = 0; local96 < 6; local96++) {
				Static362.anIntArrayArray69[local96] = local47.method7226(local51, Static480.anIntArray494[local96], false, local51, 1.0F);
			}
			this.aClass50_Sub4_2 = new Class50_Sub4(this.aClass31_Sub2_18, 6407, local51, local49, Static362.anIntArrayArray69);
		}
		return this.aClass50_Sub4_2;
	}
}
