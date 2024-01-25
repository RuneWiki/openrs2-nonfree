import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!js", name = "l", descriptor = "I")
	public static int anInt4796;

	@OriginalMember(owner = "client!js", name = "k", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_94 = new Class225(67, 0);

	@OriginalMember(owner = "client!js", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger12 = new BigInteger("f2d831d6dd857d5aa21ff6f0885b0d8fb4c6c19387a99cef317802d20412f21a34160e20301adb8b1ddf33ba955740d142270485a91b9b9a7a9a08329e8a579020abaf99ac4202f5173901638d38e2b0d6619d97fb59c6b43ec7221e60f64465c39f787fc0ee00e0cd6ce2a9b426d2476ba0dbfc5b1759f3bfe162b8790415dfbdee03ad20c69fa895f9af5a3d93438879b8576ae2aaf856eb1d25aa7d567ac324659aed06442d6fbe7738cda9cbb5428cf0250ef2fcbd1063c1096604c0ac2126693697638cbe21fa9caf08ab023b114c5a5b488a1321e5abb73a0fddfc6b9e5ae986b2b571b045c8cd18b34b07859096fafc4fe0494b4b3e4c5501c24019081ba2153d04829d42fd46a934b47429a3ff93ef8c04e3a098c823ccdfe4de646602fb46bb1b6bd2fb495f3aade07acd987a36368ee2f3917a39a80d9e86582dda3690b60fd7b321b77055dc30936ac21ceb586292cf01f7d4a6bfca7e08ce1967bb2e1c25fda5804964845f0867fe9555cd09913c864c4eab48cc116a1c3f0659c447505fa3dbe0ba59d9077a27b6f70a0f38082967e01ff22dbdb6fb7b87a3da2e20e4834b1e06cf0e78b7ac0625c004dd93d337a7256b27b7578ab5cd3408cb5932e624e18b8c4078c6b8ba403220c5e78e64668a5d0afe0d5e23900b57eef12d772e21191395ccdb12ffae6b138bb3b86008da6320fe6e388de0743763911d", 16);

	@OriginalMember(owner = "client!js", name = "u", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_95 = new Class225(90, 10);

	@OriginalMember(owner = "client!js", name = "s", descriptor = "[Lclient!dv;")
	public static Class88_Sub1[] aClass88_Sub1Array2 = new Class88_Sub1[0];

	@OriginalMember(owner = "client!js", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[128][128];

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!et;Z)V")
	public static void method4357(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(20) int local20 = arg0.method8581(-17416);
			if (local20 == 0) {
				Static154.anInt2554 = arg0.method8575();
				Static173.anInt2989 = arg0.method8575();
			} else if (local20 == 255) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIB)Z")
	public static boolean method4358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static180.method5443(arg0, arg1) || Static400.method5898(arg0, arg1);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V")
	public static void method4359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg3 >= Static8.anInt99 && arg1 + arg3 <= Static14.anInt206 && Static617.anInt9501 <= arg0 - arg3 && arg3 + arg0 <= Static519.anInt8267) {
			Static309.method4314(arg0, arg3, arg1, arg2, -4862);
		} else {
			Static415.method6539(arg3, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IBLclient!eu;)V")
	public static void method4362(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1);
		if (arg1 == null) {
			Static209.method2954();
		}
		Static479.aClass70_2.method9357();
		Static577.method8037(arg1);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZIIII)Lclient!to;")
	public static Class358 method4363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(33) long local33 = (long) arg1 << 48 & 0xFFFFL << 48 | 0xFFFFL << 32 & (long) arg0 << 32 | ((long) arg2 & 0xFFFFL) << 16 | (long) arg3 & 0xFFFFL;
		@Pc(39) Class358 local39 = (Class358) Static253.aClass85_29.method1737(local33);
		if (local39 == null) {
			local39 = Static120.aClass232_1.method5474(arg2, arg0, arg3, Static271.aClass25_1, arg1);
			Static253.aClass85_29.method1745(local33, 16383, local39);
		}
		return local39;
	}
}
