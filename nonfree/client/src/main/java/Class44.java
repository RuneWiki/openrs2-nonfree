import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class44 implements Runnable {

	@OriginalMember(owner = "client!hh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class19 local5 = Static51.aClass19_8;
				@Pc(12) Class1_Sub24 local12;
				synchronized (Static51.aClass19_8) {
					local12 = (Class1_Sub24) Static51.aClass19_8.method609();
				}
				@Pc(83) Object local83;
				if (local12 == null) {
					Static146.method2494(100L);
					local83 = Static130.anObject4;
					synchronized (Static130.anObject4) {
						if (Static217.anInt4668 <= 1) {
							Static217.anInt4668 = 0;
							Static130.anObject4.notifyAll();
							return;
						}
						Static217.anInt4668--;
					}
				} else {
					if (local12.anInt3600 == 0) {
						local12.aClass90_2.method2856(local12.aByteArray47, (int) local12.aLong150, local12.aByteArray47.length);
						local5 = Static51.aClass19_8;
						synchronized (Static51.aClass19_8) {
							local12.method3530();
						}
					} else if (local12.anInt3600 == 1) {
						local12.aByteArray47 = local12.aClass90_2.method2860((int) local12.aLong150);
						local5 = Static51.aClass19_8;
						synchronized (Static51.aClass19_8) {
							Static102.aClass19_9.method620(local12);
						}
					}
					local83 = Static130.anObject4;
					synchronized (Static130.anObject4) {
						if (Static217.anInt4668 <= 1) {
							Static217.anInt4668 = 0;
							Static130.anObject4.notifyAll();
							return;
						}
						Static217.anInt4668 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static131.method2194(null, local131);
		}
	}
}
