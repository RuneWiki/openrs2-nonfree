import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class17_Sub2_Sub1 extends Class17_Sub2 {

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "Lclient!cn;")
	private Class35_Sub2 aClass35_Sub2_1;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
	private final int anInt619;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
	private final int anInt626;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	private final int anInt625;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
	private final int anInt623;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	private final int anInt620;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_4;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	private final int anInt621;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!pea;IIIIII)V")
	public Class17_Sub2_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt619 = arg3;
		this.anInt626 = arg1;
		this.anInt625 = arg4;
		this.anInt623 = arg6;
		this.anInt620 = arg2;
		this.aClass121_Sub3_4 = arg0;
		this.anInt621 = arg5;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lclient!cn;")
	@Override
	public Class35_Sub2 method2856() {
		if (this.aClass35_Sub2_1 == null) {
			@Pc(20) Interface7 local20 = this.aClass121_Sub3_4.anInterface7_14;
			Static132.anIntArray294[3] = this.anInt625;
			Static132.anIntArray294[5] = this.anInt623;
			Static132.anIntArray294[4] = this.anInt621;
			Static132.anIntArray294[2] = this.anInt619;
			Static132.anIntArray294[1] = this.anInt620;
			Static132.anIntArray294[0] = this.anInt626;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local20.method5207(Static132.anIntArray294[local56])) {
					return null;
				}
				@Pc(74) Class76 local74 = local20.method5209(Static132.anIntArray294[local56]);
				@Pc(81) int local81 = local74.aBoolean105 ? 64 : 128;
				if (local54 < local81) {
					local54 = local81;
				}
				if (local74.aByte18 > 0) {
					local52 = true;
				}
			}
			for (@Pc(101) int local101 = 0; local101 < 6; local101++) {
				Static109.anIntArrayArray85[local101] = local20.method5208(false, 1.0F, local54, local54, Static132.anIntArray294[local101]);
			}
			this.aClass35_Sub2_1 = new Class35_Sub2(this.aClass121_Sub3_4, 6407, local54, local52, Static109.anIntArrayArray85);
		}
		return this.aClass35_Sub2_1;
	}
}
