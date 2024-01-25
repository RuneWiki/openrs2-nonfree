import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class89_Sub1_Sub2 extends Class89_Sub1 {

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "Lclient!nm;")
	private Class21_Sub4 aClass21_Sub4_2;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
	private final int anInt4640;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_25;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	private final int anInt4636;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
	private final int anInt4637;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
	private final int anInt4634;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
	private final int anInt4639;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
	private final int anInt4635;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!qg;IIIIII)V")
	public Class89_Sub1_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4640 = arg1;
		this.aClass121_Sub2_25 = arg0;
		this.anInt4636 = arg5;
		this.anInt4637 = arg2;
		this.anInt4634 = arg3;
		this.anInt4639 = arg6;
		this.anInt4635 = arg4;
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(Z)Lclient!nm;")
	@Override
	public Class21_Sub4 method3813() {
		if (this.aClass21_Sub4_2 == null) {
			@Pc(17) Interface5 local17 = this.aClass121_Sub2_25.anInterface5_16;
			Static92.anIntArray88[2] = this.anInt4634;
			Static92.anIntArray88[4] = this.anInt4636;
			Static92.anIntArray88[5] = this.anInt4639;
			Static92.anIntArray88[1] = this.anInt4637;
			Static92.anIntArray88[3] = this.anInt4635;
			Static92.anIntArray88[0] = this.anInt4640;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method3922(Static92.anIntArray88[local53])) {
					return null;
				}
				@Pc(71) Class132 local71 = local17.method3920(Static92.anIntArray88[local53]);
				@Pc(78) int local78 = local71.aBoolean282 ? 64 : 128;
				if (local71.aByte39 > 0) {
					local49 = 1;
				}
				if (local78 > local51) {
					local51 = local78;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static200.anIntArrayArray23[local97] = local17.method3923(Static92.anIntArray88[local97], false, 1.0F, local51, local51);
			}
			this.aClass21_Sub4_2 = new Class21_Sub4(this.aClass121_Sub2_25, 6407, local51, local49 != 0, Static200.anIntArrayArray23);
		}
		return this.aClass21_Sub4_2;
	}
}
