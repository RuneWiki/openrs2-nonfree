import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!br", name = "Y", descriptor = "[I")
	public final int[] anIntArray89 = new int[12];

	@OriginalMember(owner = "client!br", name = "bb", descriptor = "[[I")
	public final int[][] anIntArrayArray4 = new int[2200][64];

	@OriginalMember(owner = "client!br", name = "gb", descriptor = "[I")
	public final int[] anIntArray92 = new int[Static136.anInt9338];

	@OriginalMember(owner = "client!br", name = "lb", descriptor = "[I")
	public final int[] lb = new int[32];

	@OriginalMember(owner = "client!br", name = "hb", descriptor = "[I")
	public final int[] anIntArray93 = new int[12];

	@OriginalMember(owner = "client!br", name = "ab", descriptor = "[I")
	public final int[] anIntArray90 = new int[Static136.anInt9343 + 8191];

	@OriginalMember(owner = "client!br", name = "cb", descriptor = "[[I")
	public final int[][] anIntArrayArray5 = new int[12][Static136.anInt9343 + 8191];

	@OriginalMember(owner = "client!br", name = "mb", descriptor = "[[I")
	public final int[][] anIntArrayArray6 = new int[32][512];

	@OriginalMember(owner = "client!br", name = "nb", descriptor = "[I")
	public final int[] anIntArray94 = new int[2200];

	@OriginalMember(owner = "client!br", name = "eb", descriptor = "[I")
	public final int[] anIntArray91 = new int[Static136.anInt9343 + 8191];

	@OriginalMember(owner = "client!br", name = "jb", descriptor = "Lclient!jf;")
	public Class153 aClass153_1;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!fv;)V")
	public Class38_Sub1(@OriginalArg(0) Class90_Sub2 arg0) {
		super(arg0);
		this.aClass153_1 = new Class153(arg0);
		super.aClass24_Sub1_46 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_50 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_43 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_42 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_48 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_44 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_47 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_41 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_45 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
		super.aClass24_Sub1_49 = new Class24_Sub1_Sub2(super.aClass90_Sub2_13);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	@Override
	public void method5973() {
		this.aClass153_1 = new Class153(super.aClass90_Sub2_13);
	}
}
