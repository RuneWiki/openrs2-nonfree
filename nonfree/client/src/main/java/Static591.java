import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array40;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public static int anInt10305;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!ua;")
	public static final Class354 aClass354_1 = new Class354(0, 3, Static114.aClass79_11);

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!ua;")
	public static final Class354 aClass354_2 = new Class354(1, 3, Static114.aClass79_11);

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!ua;")
	public static final Class354 aClass354_3 = new Class354(2, 4, Static114.aClass79_7);

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!ua;")
	public static final Class354 aClass354_4 = new Class354(3, 1, Static114.aClass79_11);

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!ua;")
	public static final Class354 aClass354_5 = new Class354(4, 2, Static114.aClass79_11);

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!ua;")
	public static final Class354 aClass354_6 = new Class354(5, 3, Static114.aClass79_11);

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!ua;")
	public static final Class354 aClass354_7 = new Class354(6, 4, Static114.aClass79_11);

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public static final int anInt10303 = Static8.method135(16);

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	public static final int anInt10304 = 52;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method8905() {
		for (@Pc(8) Class2_Sub1_Sub19 local8 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7293(); local8 != null; local8 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7298()) {
			if (local8.anInt9806 > 1) {
				local8.anInt9806 = 0;
				Static130.aClass22_11.method470(((Class2_Sub1_Sub13) local8.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67).aLong180, local8);
				local8.aClass279_13.method7297();
			}
		}
		Static488.anInt8750 = 0;
		Static276.anInt5124 = 0;
		Static61.aClass271_6.method7181();
		Static539.aClass335_39.method8353();
		Static112.aClass279_6.method7297();
		Static183.aBoolean305 = false;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!ua;")
	public static Class354 method8906(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass354_1;
		} else if (arg0 == 1) {
			return aClass354_2;
		} else if (arg0 == 2) {
			return aClass354_3;
		} else if (arg0 == 3) {
			return aClass354_4;
		} else if (arg0 == 4) {
			return aClass354_5;
		} else if (arg0 == 5) {
			return aClass354_6;
		} else if (arg0 == 6) {
			return aClass354_7;
		} else {
			return null;
		}
	}
}
