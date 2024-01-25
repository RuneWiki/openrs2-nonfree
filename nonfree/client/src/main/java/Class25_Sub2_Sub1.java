import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class25_Sub2_Sub1 extends Class25_Sub2 {

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Lclient!jka;")
	private Class53_Sub3 aClass53_Sub3_1;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
	private final int anInt2760;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_14;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
	private final int anInt2756;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
	private final int anInt2763;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	private final int anInt2758;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
	private final int anInt2762;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
	private final int anInt2761;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!pq;IIIIII)V")
	public Class25_Sub2_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2760 = arg2;
		this.aClass132_Sub3_14 = arg0;
		this.anInt2756 = arg5;
		this.anInt2763 = arg4;
		this.anInt2758 = arg6;
		this.anInt2762 = arg1;
		this.anInt2761 = arg3;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Lclient!jka;")
	@Override
	public Class53_Sub3 method6550() {
		if (this.aClass53_Sub3_1 == null) {
			Static230.anIntArray223[0] = this.anInt2762;
			@Pc(22) Interface6 local22 = this.aClass132_Sub3_14.anInterface6_11;
			Static230.anIntArray223[1] = this.anInt2760;
			Static230.anIntArray223[2] = this.anInt2761;
			Static230.anIntArray223[5] = this.anInt2758;
			Static230.anIntArray223[4] = this.anInt2756;
			Static230.anIntArray223[3] = this.anInt2763;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local22.method7090(Static230.anIntArray223[local53])) {
					return null;
				}
				@Pc(73) Class294 local73 = local22.method7088(Static230.anIntArray223[local53]);
				@Pc(80) int local80 = local73.aBoolean574 ? 64 : 128;
				if (local73.aByte119 > 0) {
					local49 = true;
				}
				if (local80 > local51) {
					local51 = local80;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static104.anIntArrayArray10[local102] = local22.method7085(local51, false, Static230.anIntArray223[local102], 1.0F, local51);
			}
			this.aClass53_Sub3_1 = new Class53_Sub3(this.aClass132_Sub3_14, 6407, local51, local49, Static104.anIntArrayArray10);
		}
		return this.aClass53_Sub3_1;
	}
}
