import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "Lclient!oa;")
	public static Class15 aClass15_13;

	@OriginalMember(owner = "client!lga", name = "j", descriptor = "Lclient!kn;")
	public static Class108 aClass108_6;

	@OriginalMember(owner = "client!lga", name = "q", descriptor = "Lclient!ta;")
	public static Class111 aClass111_11;

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "Lclient!uaa;")
	public static final Class320 aClass320_8 = new Class320("LIVE", 0);

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!lga", name = "n", descriptor = "[I")
	public static final int[] anIntArray466 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!lga", name = "o", descriptor = "Lclient!bm;")
	public static final Class32 aClass32_10 = new Class32();

	@OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
	public static final int anInt7260 = 328;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZII)V")
	public static void method6048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(1, arg1);
		local8.method1898();
		local8.anInt1945 = arg0;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!bo;BLclient!bo;)V")
	public static void method6049(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0.aClass3_Sub4_62 != null) {
			arg0.method8309();
		}
		arg0.aClass3_Sub4_62 = arg1;
		arg0.aClass3_Sub4_61 = arg1.aClass3_Sub4_61;
		arg0.aClass3_Sub4_62.aClass3_Sub4_61 = arg0;
		arg0.aClass3_Sub4_61.aClass3_Sub4_62 = arg0;
	}
}
