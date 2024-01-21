import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!hg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class11 local5 = Static166.aClass11_15;
				@Pc(12) Class4_Sub19 local12;
				synchronized (Static166.aClass11_15) {
					local12 = (Class4_Sub19) Static166.aClass11_15.method274();
				}
				@Pc(80) Object local80;
				if (local12 == null) {
					Static52.method1025(100L);
					local80 = Static124.anObject2;
					synchronized (Static124.anObject2) {
						if (Static28.anInt746 <= 1) {
							Static28.anInt746 = 0;
							Static124.anObject2.notifyAll();
							return;
						}
						Static28.anInt746--;
					}
				} else {
					if (local12.anInt3183 == 0) {
						local12.aClass52_2.method1897(local12.aByteArray37, local12.aByteArray37.length, (int) local12.aLong148);
						local5 = Static166.aClass11_15;
						synchronized (Static166.aClass11_15) {
							local12.method3173();
						}
					} else if (local12.anInt3183 == 1) {
						local12.aByteArray37 = local12.aClass52_2.method1893((int) local12.aLong148);
						local5 = Static166.aClass11_15;
						synchronized (Static166.aClass11_15) {
							Static183.aClass11_8.method272(local12);
						}
					}
					local80 = Static124.anObject2;
					synchronized (Static124.anObject2) {
						if (Static28.anInt746 <= 1) {
							Static28.anInt746 = 0;
							Static124.anObject2.notifyAll();
							return;
						}
						Static28.anInt746 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static146.method2485(null, local130);
		}
	}
}
