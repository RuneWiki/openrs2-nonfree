import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class17_Sub1_Sub1 extends Class17_Sub1 {

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!vea;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private final int anInt477;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private final int anInt484;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private final int anInt480;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private final int anInt478;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private final int anInt482;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private final int anInt474;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_3;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!sv;IIIIII)V")
	public Class17_Sub1_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt477 = arg2;
		this.anInt484 = arg6;
		this.anInt480 = arg5;
		this.anInt478 = arg3;
		this.anInt482 = arg4;
		this.anInt474 = arg1;
		this.aClass121_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lclient!vea;")
	@Override
	public Interface22 method395() {
		if (this.anInterface22_1 == null) {
			@Pc(20) Interface7 local20 = this.aClass121_Sub2_3.anInterface7_14;
			Static435.anIntArray596[3] = this.anInt482;
			Static435.anIntArray596[2] = this.anInt478;
			Static435.anIntArray596[1] = this.anInt477;
			Static435.anIntArray596[5] = this.anInt484;
			Static435.anIntArray596[0] = this.anInt474;
			Static435.anIntArray596[4] = this.anInt480;
			@Pc(52) byte local52 = 0;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local20.method5207(Static435.anIntArray596[local56])) {
					return null;
				}
				@Pc(74) Class76 local74 = local20.method5209(Static435.anIntArray596[local56]);
				@Pc(81) int local81 = local74.aBoolean105 ? 64 : 128;
				if (local74.aByte18 > 0) {
					local52 = 1;
				}
				if (local54 < local81) {
					local54 = local81;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static402.anIntArrayArray71[local100] = local20.method5208(false, 1.0F, local54, local54, Static435.anIntArray596[local100]);
			}
			this.anInterface22_1 = this.aClass121_Sub2_3.method7288(local52 != 0, local54, Static402.anIntArrayArray71);
		}
		return this.anInterface22_1;
	}
}
