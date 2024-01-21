import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class55 implements Runnable {

	@OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class30 local5 = Static139.aClass30_14;
				@Pc(12) Class1_Sub7 local12;
				synchronized (Static139.aClass30_14) {
					local12 = (Class1_Sub7) Static139.aClass30_14.method1115();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static133.method2259(100L);
					local25 = Static163.anObject4;
					synchronized (Static163.anObject4) {
						if (Static13.anInt268 <= 1) {
							Static13.anInt268 = 0;
							Static163.anObject4.notifyAll();
							return;
						}
						Static13.anInt268--;
					}
				} else {
					if (local12.anInt307 == 0) {
						local12.aClass66_1.method2164((int) local12.aLong148, local12.aByteArray1, local12.aByteArray1.length);
						local5 = Static139.aClass30_14;
						synchronized (Static139.aClass30_14) {
							local12.method3134();
						}
					} else if (local12.anInt307 == 1) {
						local12.aByteArray1 = local12.aClass66_1.method2161((int) local12.aLong148);
						local5 = Static139.aClass30_14;
						synchronized (Static139.aClass30_14) {
							Static104.aClass30_13.method1113(local12);
						}
					}
					local25 = Static163.anObject4;
					synchronized (Static163.anObject4) {
						if (Static13.anInt268 <= 1) {
							Static13.anInt268 = 0;
							Static163.anObject4.notifyAll();
							return;
						}
						Static13.anInt268 = 600;
					}
				}
			}
		} catch (@Pc(126) Exception local126) {
			Static5.method115(null, local126);
		}
	}
}
