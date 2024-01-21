import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!md", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class70 local5 = Static60.aClass70_16;
				@Pc(12) Class4_Sub6 local12;
				synchronized (Static60.aClass70_16) {
					local12 = (Class4_Sub6) Static60.aClass70_16.method1939();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static13.method278(100L);
					local25 = Static66.anObject5;
					synchronized (Static66.anObject5) {
						if (Static38.anInt965 <= 1) {
							Static38.anInt965 = 0;
							Static66.anObject5.notifyAll();
							return;
						}
						Static38.anInt965--;
					}
				} else {
					if (local12.anInt669 == 0) {
						local12.aClass54_1.method1451(local12.aByteArray27.length, local12.aByteArray27, (int) local12.aLong100);
						local5 = Static60.aClass70_16;
						synchronized (Static60.aClass70_16) {
							local12.method2124();
						}
					} else if (local12.anInt669 == 1) {
						local12.aByteArray27 = local12.aClass54_1.method1457((int) local12.aLong100);
						local5 = Static60.aClass70_16;
						synchronized (Static60.aClass70_16) {
							Static3.aClass70_1.method1931(local12);
						}
					}
					local25 = Static66.anObject5;
					synchronized (Static66.anObject5) {
						if (Static38.anInt965 <= 1) {
							Static38.anInt965 = 0;
							Static66.anObject5.notifyAll();
							return;
						}
						Static38.anInt965 = 600;
					}
				}
			}
		} catch (@Pc(129) Exception local129) {
			Static15.method2092(local129, null);
		}
	}
}
