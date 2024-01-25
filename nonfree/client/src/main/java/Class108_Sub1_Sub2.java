import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class108_Sub1_Sub2 extends Class108_Sub1 {

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "Lclient!gfa;")
	private Class11_Sub3 aClass11_Sub3_2;

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
	private final int anInt9733;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
	private final int anInt9735;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_39;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
	private final int anInt9737;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
	private final int anInt9732;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
	private final int anInt9734;

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
	private final int anInt9730;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!ji;IIIIII)V")
	public Class108_Sub1_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9733 = arg5;
		this.anInt9735 = arg2;
		this.aClass15_Sub3_39 = arg0;
		this.anInt9737 = arg3;
		this.anInt9732 = arg6;
		this.anInt9734 = arg1;
		this.anInt9730 = arg4;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)Lclient!gfa;")
	@Override
	public Class11_Sub3 method7913() {
		if (this.aClass11_Sub3_2 == null) {
			Static440.anIntArray298[2] = this.anInt9737;
			Static440.anIntArray298[3] = this.anInt9730;
			@Pc(30) Interface4 local30 = this.aClass15_Sub3_39.anInterface4_11;
			Static440.anIntArray298[1] = this.anInt9735;
			Static440.anIntArray298[5] = this.anInt9732;
			Static440.anIntArray298[4] = this.anInt9733;
			Static440.anIntArray298[0] = this.anInt9734;
			@Pc(52) byte local52 = 0;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local30.method3090(Static440.anIntArray298[local56])) {
					return null;
				}
				@Pc(74) Class178 local74 = local30.method3088(Static440.anIntArray298[local56]);
				@Pc(81) int local81 = local74.aBoolean486 ? 64 : 128;
				if (local74.aByte53 > 0) {
					local52 = 1;
				}
				if (local54 < local81) {
					local54 = local81;
				}
			}
			for (@Pc(103) int local103 = 0; local103 < 6; local103++) {
				Static259.anIntArrayArray41[local103] = local30.method3086(local54, false, 1.0F, local54, Static440.anIntArray298[local103]);
			}
			this.aClass11_Sub3_2 = new Class11_Sub3(this.aClass15_Sub3_39, 6407, local54, local52 != 0, Static259.anIntArrayArray41);
		}
		return this.aClass11_Sub3_2;
	}
}
