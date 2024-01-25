import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!gca", name = "Y", descriptor = "[I")
	public final int[] anIntArray346 = new int[32];

	@OriginalMember(owner = "client!gca", name = "cb", descriptor = "[I")
	public final int[] anIntArray348 = new int[12];

	@OriginalMember(owner = "client!gca", name = "R", descriptor = "[I")
	public final int[] anIntArray345 = new int[Static394.anInt1334 + 8191];

	@OriginalMember(owner = "client!gca", name = "bb", descriptor = "[I")
	public final int[] anIntArray347 = new int[Static394.anInt1334 + 8191];

	@OriginalMember(owner = "client!gca", name = "eb", descriptor = "[I")
	public final int[] anIntArray349 = new int[2200];

	@OriginalMember(owner = "client!gca", name = "hb", descriptor = "[I")
	public final int[] anIntArray351 = new int[12];

	@OriginalMember(owner = "client!gca", name = "fb", descriptor = "[I")
	public final int[] anIntArray350 = new int[Static394.anInt1328];

	@OriginalMember(owner = "client!gca", name = "gb", descriptor = "[[I")
	public final int[][] anIntArrayArray43 = new int[32][512];

	@OriginalMember(owner = "client!gca", name = "jb", descriptor = "[[I")
	public final int[][] anIntArrayArray44 = new int[2200][64];

	@OriginalMember(owner = "client!gca", name = "mb", descriptor = "[[I")
	public final int[][] anIntArrayArray45 = new int[12][Static394.anInt1334 + 8191];

	@OriginalMember(owner = "client!gca", name = "kb", descriptor = "Lclient!ml;")
	public Class227 aClass227_2;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class94_Sub1(@OriginalArg(0) Class66_Sub2 arg0) {
		super(arg0);
		this.aClass227_2 = new Class227(arg0);
		super.aClass9_Sub1_60 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_55 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_54 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_57 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_58 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_53 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_59 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_56 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_51 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
		super.aClass9_Sub1_52 = new Class9_Sub1_Sub2(super.aClass66_Sub2_15);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
	@Override
	public void method5764() {
		this.aClass227_2 = new Class227(super.aClass66_Sub2_15);
	}
}
