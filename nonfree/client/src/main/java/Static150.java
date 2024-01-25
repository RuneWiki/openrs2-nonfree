import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
	public static int anInt4205;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
	public static int anInt4208;

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "Z")
	public static boolean aBoolean306;

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame5;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_85 = new Class265(21, 2);

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "Lclient!di;")
	public static final Class54 aClass54_59 = new Class54(19, 8);

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
	public static int anInt4211 = 0;

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
	public static int anInt4216 = -1;

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "[Lclient!cq;")
	public static final Class2_Sub5_Sub3[] aClass2_Sub5_Sub3Array6 = new Class2_Sub5_Sub3[14];

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_35 = new Class171(10);

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
	public static int anInt4217 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B[BI)I")
	public static int method3424(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static394.method5208(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)V")
	public static void method3425(@OriginalArg(1) int arg0) {
		Static60.anInt1343 = -1;
		Static314.anInt5538 = -1;
		Static133.anInt2851 = arg0;
		Static282.method4106();
	}
}
