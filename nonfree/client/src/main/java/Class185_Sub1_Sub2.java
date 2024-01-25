import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class185_Sub1_Sub2 extends Class185_Sub1 {

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "Lclient!dka;")
	private Class29_Sub2 aClass29_Sub2_2;

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
	private final int anInt9971;

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
	private final int anInt9979;

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "I")
	private final int anInt9978;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
	private final int anInt9973;

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
	private final int anInt9976;

	@OriginalMember(owner = "client!uw", name = "u", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_43;

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
	private final int anInt9975;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!vf;IIIIII)V")
	public Class185_Sub1_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9971 = arg1;
		this.anInt9979 = arg6;
		this.anInt9978 = arg3;
		this.anInt9973 = arg4;
		this.anInt9976 = arg2;
		this.aClass100_Sub3_43 = arg0;
		this.anInt9975 = arg5;
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)Lclient!dka;")
	@Override
	public Class29_Sub2 method8477() {
		if (this.aClass29_Sub2_2 == null) {
			Static590.anIntArray533[5] = this.anInt9979;
			@Pc(25) Interface7 local25 = this.aClass100_Sub3_43.anInterface7_12;
			Static590.anIntArray533[2] = this.anInt9978;
			Static590.anIntArray533[1] = this.anInt9976;
			Static590.anIntArray533[4] = this.anInt9975;
			Static590.anIntArray533[3] = this.anInt9973;
			Static590.anIntArray533[0] = this.anInt9971;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local25.method7421(Static590.anIntArray533[local56])) {
					return null;
				}
				@Pc(77) Class44 local77 = local25.method7423(Static590.anIntArray533[local56]);
				@Pc(85) int local85 = local77.aBoolean62 ? 64 : 128;
				if (local54 < local85) {
					local54 = local85;
				}
				if (local77.aByte21 > 0) {
					local52 = true;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static445.anIntArrayArray43[local105] = local25.method7424(local54, false, local54, Static590.anIntArray533[local105], 1.0F);
			}
			this.aClass29_Sub2_2 = new Class29_Sub2(this.aClass100_Sub3_43, 6407, local54, local52, Static445.anIntArrayArray43);
		}
		return this.aClass29_Sub2_2;
	}
}
