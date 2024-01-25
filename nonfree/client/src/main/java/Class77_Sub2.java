import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!haa", name = "W", descriptor = "[[I")
	public final int[][] anIntArrayArray40 = new int[32][512];

	@OriginalMember(owner = "client!haa", name = "X", descriptor = "[[I")
	public final int[][] anIntArrayArray41 = new int[2200][64];

	@OriginalMember(owner = "client!haa", name = "Z", descriptor = "[I")
	public final int[] anIntArray372 = new int[12];

	@OriginalMember(owner = "client!haa", name = "bb", descriptor = "[I")
	public final int[] anIntArray373 = new int[Static472.anInt5499];

	@OriginalMember(owner = "client!haa", name = "ab", descriptor = "[[I")
	public final int[][] anIntArrayArray42 = new int[12][Static472.anInt5500 + 8191];

	@OriginalMember(owner = "client!haa", name = "cb", descriptor = "[I")
	public final int[] anIntArray374 = new int[2200];

	@OriginalMember(owner = "client!haa", name = "nb", descriptor = "[I")
	public final int[] anIntArray377 = new int[Static472.anInt5500 + 8191];

	@OriginalMember(owner = "client!haa", name = "gb", descriptor = "[I")
	public final int[] anIntArray376 = new int[Static472.anInt5500 + 8191];

	@OriginalMember(owner = "client!haa", name = "ob", descriptor = "[I")
	public final int[] anIntArray378 = new int[32];

	@OriginalMember(owner = "client!haa", name = "fb", descriptor = "[I")
	public final int[] anIntArray375 = new int[12];

	@OriginalMember(owner = "client!haa", name = "eb", descriptor = "Lclient!ce;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!kb;)V")
	public Class77_Sub2(@OriginalArg(0) Class121_Sub1 arg0) {
		super(arg0);
		this.aClass46_1 = new Class46(arg0);
		super.aClass22_Sub1_43 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_44 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_41 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_50 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_46 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_47 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_48 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_45 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_49 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
		super.aClass22_Sub1_42 = new Class22_Sub1_Sub2(super.aClass121_Sub1_10);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	@Override
	public void method2705() {
		this.aClass46_1 = new Class46(super.aClass121_Sub1_10);
	}
}
