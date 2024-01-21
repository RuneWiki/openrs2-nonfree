import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class73 implements Runnable {

	@OriginalMember(owner = "client!te", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class82 local5 = Static2.aClass82_1;
				@Pc(12) Class4_Sub20 local12;
				synchronized (Static2.aClass82_1) {
					local12 = (Class4_Sub20) Static2.aClass82_1.method2025();
				}
				@Pc(83) Object local83;
				if (local12 == null) {
					Static46.method889(100L);
					local83 = Static76.anObject3;
					synchronized (Static76.anObject3) {
						if (Static123.anInt3084 <= 1) {
							Static123.anInt3084 = 0;
							Static76.anObject3.notifyAll();
							return;
						}
						Static123.anInt3084--;
					}
				} else {
					if (local12.anInt2897 == 0) {
						local12.aClass71_4.method1799((int) local12.aLong99, local12.aByteArray42.length, local12.aByteArray42);
						local5 = Static2.aClass82_1;
						synchronized (Static2.aClass82_1) {
							local12.method1999();
						}
					} else if (local12.anInt2897 == 1) {
						local12.aByteArray42 = local12.aClass71_4.method1797((int) local12.aLong99);
						local5 = Static2.aClass82_1;
						synchronized (Static2.aClass82_1) {
							Static134.aClass82_15.method2028(local12);
						}
					}
					local83 = Static76.anObject3;
					synchronized (Static76.anObject3) {
						if (Static123.anInt3084 <= 1) {
							Static123.anInt3084 = 0;
							Static76.anObject3.notifyAll();
							return;
						}
						Static123.anInt3084 = 600;
					}
				}
			}
		} catch (@Pc(135) Exception local135) {
			Static91.method1588(local135, null);
		}
	}
}
