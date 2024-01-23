import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "[[Lclient!gj;")
	public static Class4_Sub14[][] aClass4_Sub14ArrayArray1;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public static int anInt863 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method689(@OriginalArg(0) Class98 arg0) {
		Static121.anInt2643 = arg0.method2376("p11_full");
		Static148.anInt3010 = arg0.method2376("p12_full");
		Static17.anInt373 = arg0.method2376("b12_full");
		Static148.anInt2996 = arg0.method2376("mapfunction");
		Static223.anInt4439 = arg0.method2376("hitmarks");
		Static65.anInt1224 = arg0.method2376("hitbar_default");
		Static219.anInt4341 = arg0.method2376("headicons_pk");
		Static298.anInt5541 = arg0.method2376("headicons_prayer");
		Static205.anInt4001 = arg0.method2376("hint_headicons");
		Static21.anInt4304 = arg0.method2376("hint_mapmarkers");
		Static24.anInt438 = arg0.method2376("mapflag");
		Static46.anInt911 = arg0.method2376("cross");
		Static46.anInt916 = arg0.method2376("mapdots");
		Static2.anInt17 = arg0.method2376("scrollbar");
		Static174.anInt3436 = arg0.method2376("name_icons");
		Static149.anInt3031 = arg0.method2376("floorshadows");
		Static53.anInt1064 = arg0.method2376("compass");
		Static152.anInt3087 = arg0.method2376("hint_mapedge");
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public static void method691(@OriginalArg(0) int arg0) {
		Static150.anIntArray278 = new int[arg0];
		Static16.anIntArray33 = new int[arg0];
		Static255.anIntArray434 = new int[arg0];
		Static120.anIntArray238 = new int[arg0];
		Static127.anIntArray244 = new int[arg0];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!lk;")
	public static RuntimeException_Sub1 method693(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString104 = local12.aString104 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	public static void method694() {
		aClass4_Sub14ArrayArray1 = null;
	}
}
