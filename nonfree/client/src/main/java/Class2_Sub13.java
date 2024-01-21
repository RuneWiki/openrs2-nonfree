import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!w", name = "W", descriptor = "[I")
	public static int[] anIntArray349 = new int[32];

	@OriginalMember(owner = "client!w", name = "y", descriptor = "I")
	public int anInt2798;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	public int anInt2799;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "Lclient!w;")
	public Class2_Sub13 aClass2_Sub13_1;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "I")
	public int anInt2803;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "Lclient!fa;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Lclient!eb;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "Lclient!bc;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "I")
	public int anInt2805;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Lclient!fc;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!w", name = "O", descriptor = "Lclient!ob;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "Lclient!kc;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!w", name = "S", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!w", name = "T", descriptor = "I")
	public int anInt2807;

	@OriginalMember(owner = "client!w", name = "V", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "[Lclient!de;")
	public final Class16[] aClass16Array3 = new Class16[5];

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	public int anInt2802 = 0;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "[I")
	public final int[] anIntArray348 = new int[5];

	@OriginalMember(owner = "client!w", name = "R", descriptor = "I")
	public final int anInt2806;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public int anInt2797;

	@OriginalMember(owner = "client!w", name = "U", descriptor = "I")
	public final int anInt2808;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "I")
	public final int anInt2804;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray349[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V")
	public Class2_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2806 = arg1;
		this.anInt2808 = this.anInt2797 = arg0;
		this.anInt2804 = arg2;
	}
}
