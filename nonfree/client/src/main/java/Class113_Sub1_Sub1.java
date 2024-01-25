import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class113_Sub1_Sub1 extends Class113_Sub1 {

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Lclient!c;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
	private final int anInt3055;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
	private final int anInt3060;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
	private final int anInt3057;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_5;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	private final int anInt3058;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	private final int anInt3062;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	private final int anInt3056;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!jca;IIIIII)V")
	public Class113_Sub1_Sub1(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3055 = arg6;
		this.anInt3060 = arg4;
		this.anInt3057 = arg5;
		this.aClass22_Sub2_5 = arg0;
		this.anInt3058 = arg1;
		this.anInt3062 = arg2;
		this.anInt3056 = arg3;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Lclient!c;")
	@Override
	public Interface1 method2783() {
		if (this.anInterface1_1 == null) {
			Static371.anIntArray415[4] = this.anInt3057;
			Static371.anIntArray415[3] = this.anInt3060;
			Static371.anIntArray415[0] = this.anInt3058;
			Static371.anIntArray415[2] = this.anInt3056;
			Static371.anIntArray415[5] = this.anInt3055;
			@Pc(44) Interface4 local44 = this.aClass22_Sub2_5.anInterface4_14;
			Static371.anIntArray415[1] = this.anInt3062;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local44.method5758(Static371.anIntArray415[local55])) {
					return null;
				}
				@Pc(78) Class406 local78 = local44.method5761(Static371.anIntArray415[local55]);
				@Pc(86) int local86 = local78.aBoolean762 ? 64 : 128;
				if (local86 > local53) {
					local53 = local86;
				}
				if (local78.aByte148 > 0) {
					local51 = true;
				}
			}
			for (@Pc(109) int local109 = 0; local109 < 6; local109++) {
				Static692.anIntArrayArray67[local109] = local44.method5760(local53, local53, false, 1.0F, Static371.anIntArray415[local109]);
			}
			this.anInterface1_1 = this.aClass22_Sub2_5.method8881(Static692.anIntArrayArray67, local53, local51);
		}
		return this.anInterface1_1;
	}
}
