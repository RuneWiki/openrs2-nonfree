import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!de;")
	public static AudioThread aClass18_1;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "Lclient!tb;")
	public static FileStream aClass71_3;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "[Lclient!hb;")
	public static Pix8[] aClass4_Sub1_Sub2_Sub3Array9;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!wc;")
	public static HashTable aClass81_14 = new HashTable(4096);

	@OriginalMember(owner = "client!t", name = "n", descriptor = "I")
	public static int anInt2733 = 0;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!ec;")
	public static JagString aClass22_811 = Static60.method1113("null");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBZZZ)Lclient!ga;")
	public static Js5Provider method1771(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) FileStream local10 = null;
		if (Static38.aClass79_1 != null) {
			local10 = new FileStream(arg0, Static38.aClass79_1, Static98.aClass79Array1[arg0], 1000000);
		}
		return new Js5Provider(local10, aClass71_3, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!f;B)V")
	public static void method1772(@OriginalArg(0) IfType arg0) {
		if (arg0.anInt789 == Static26.anInt924) {
			Static122.aBooleanArray7[arg0.anInt782] = true;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method1773() {
		if (Static33.aClass44_1 != null) {
			@Pc(3) JavaKeyboardProvider local3 = Static33.aClass44_1;
			synchronized (Static33.aClass44_1) {
				Static33.aClass44_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public static void method1774() {
		aClass18_1 = null;
		aClass81_14 = null;
		anIntArray303 = null;
		aClass4_Sub1_Sub2_Sub3Array9 = null;
		aClass22_811 = null;
		aClass71_3 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!gf;")
	public static PixMap method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("AwtPixMap");
			@Pc(18) PixMap local18 = (PixMap) local14.getDeclaredConstructor().newInstance();
			local18.method580(arg0, arg1, arg2);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) BufferedPixMap local31 = new BufferedPixMap();
			local31.method580(arg0, arg1, arg2);
			return local31;
		}
	}
}
