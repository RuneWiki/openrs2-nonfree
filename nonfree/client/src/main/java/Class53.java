import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int anInt1986 = 0;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!o;")
	public static Class40 aClass40_571 = Static12.method257("Importing maps )2 ");

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_573 = Static12.method257("Error connecting to server)3");

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!o;")
	public static Class40 aClass40_572 = Static12.method257(" @lre@");

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public static int anInt1989 = 0;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_574 = Static12.method257("Cabbage");

	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	public static int anInt1994 = -1;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "Lclient!o;")
	public static Class40 aClass40_575 = Static12.method257("Login attempts exceeded)3");

	@OriginalMember(owner = "client!s", name = "run", descriptor = "()V", line = 60)
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class44 local5 = Class18_Sub1.aClass44_2;
				@Pc(12) Class2_Sub9 local12;
				synchronized (Class18_Sub1.aClass44_2) {
					local12 = (Class2_Sub9) Class18_Sub1.aClass44_2.method1224();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static86.method1494(100L);
					local25 = Class5.anObject2;
					synchronized (Class5.anObject2) {
						if (Class41.anInt1801 <= 1) {
							Class41.anInt1801 = 0;
							Class5.anObject2.notifyAll();
							return;
						}
						Class41.anInt1801--;
					}
				} else {
					if (local12.anInt1189 == 0) {
						local12.aClass11_3.method259(local12.aByteArray13.length, (int) local12.aLong152, local12.aByteArray13);
						local5 = Class18_Sub1.aClass44_2;
						synchronized (Class18_Sub1.aClass44_2) {
							local12.method1677();
						}
					} else if (local12.anInt1189 == 1) {
						local12.aByteArray13 = local12.aClass11_3.method261((int) local12.aLong152);
						local5 = Class18_Sub1.aClass44_2;
						synchronized (Class18_Sub1.aClass44_2) {
							Class2_Sub2_Sub1.aClass44_1.method1221(local12);
						}
					}
					local25 = Class5.anObject2;
					synchronized (Class5.anObject2) {
						if (Class41.anInt1801 <= 1) {
							Class41.anInt1801 = 0;
							Class5.anObject2.notifyAll();
							return;
						}
						Class41.anInt1801 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static36.method727(null, local128);
		}
	}
}
