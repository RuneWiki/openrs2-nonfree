import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class16_Sub1_Sub1 extends Class16_Sub1 {

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Lclient!gl;")
	private Class3_Sub3 aClass3_Sub3_1;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	private final int anInt540;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "I")
	private final int anInt542;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	private final int anInt549;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "I")
	private final int anInt550;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_3;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	private final int anInt544;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	private final int anInt545;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!kd;IIIIII)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt540 = arg2;
		this.anInt542 = arg4;
		this.anInt549 = arg3;
		this.anInt550 = arg6;
		this.aClass39_Sub2_3 = arg0;
		this.anInt544 = arg1;
		this.anInt545 = arg5;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lclient!gl;")
	@Override
	public Class3_Sub3 method5750() {
		if (this.aClass3_Sub3_1 == null) {
			Static154.anIntArray595[2] = this.anInt549;
			Static154.anIntArray595[0] = this.anInt544;
			@Pc(32) Interface4 local32 = this.aClass39_Sub2_3.anInterface4_12;
			Static154.anIntArray595[5] = this.anInt550;
			Static154.anIntArray595[3] = this.anInt542;
			Static154.anIntArray595[4] = this.anInt545;
			Static154.anIntArray595[1] = this.anInt540;
			@Pc(54) boolean local54 = false;
			@Pc(56) int local56 = 0;
			for (@Pc(58) int local58 = 0; local58 < 6; local58++) {
				if (!local32.method2454(Static154.anIntArray595[local58])) {
					return null;
				}
				@Pc(76) Class183 local76 = local32.method2450(Static154.anIntArray595[local58]);
				@Pc(83) int local83 = local76.aBoolean331 ? 64 : 128;
				if (local76.aByte77 > 0) {
					local54 = true;
				}
				if (local56 < local83) {
					local56 = local83;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static302.anIntArrayArray52[local102] = local32.method2451(local56, local56, Static154.anIntArray595[local102], 1.0F, false);
			}
			this.aClass3_Sub3_1 = new Class3_Sub3(this.aClass39_Sub2_3, 6407, local56, local54, Static302.anIntArrayArray52);
		}
		return this.aClass3_Sub3_1;
	}
}
