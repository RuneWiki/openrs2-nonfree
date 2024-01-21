import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!ib", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class78 local5 = Static8.aClass78_1;
				@Pc(12) Class4_Sub5 local12;
				synchronized (Static8.aClass78_1) {
					local12 = (Class4_Sub5) Static8.aClass78_1.method1916();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static6.method84(100L);
					local81 = Static99.anObject35;
					synchronized (Static99.anObject35) {
						if (Static97.anInt2247 <= 1) {
							Static97.anInt2247 = 0;
							Static99.anObject35.notifyAll();
							return;
						}
						Static97.anInt2247--;
					}
				} else {
					if (local12.anInt243 == 0) {
						local12.aClass58_1.method1508(local12.aByteArray3.length, (int) local12.aLong99, local12.aByteArray3);
						local5 = Static8.aClass78_1;
						synchronized (Static8.aClass78_1) {
							local12.method2004();
						}
					} else if (local12.anInt243 == 1) {
						local12.aByteArray3 = local12.aClass58_1.method1509((int) local12.aLong99);
						local5 = Static8.aClass78_1;
						synchronized (Static8.aClass78_1) {
							Static12.aClass78_3.method1914(local12);
						}
					}
					local81 = Static99.anObject35;
					synchronized (Static99.anObject35) {
						if (Static97.anInt2247 <= 1) {
							Static97.anInt2247 = 0;
							Static99.anObject35.notifyAll();
							return;
						}
						Static97.anInt2247 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static102.method1593(null, local133);
		}
	}
}
