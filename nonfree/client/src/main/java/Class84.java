import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class84 implements Runnable {

	@OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class4 local5 = Static89.aClass4_9;
				@Pc(12) Class1_Sub13 local12;
				synchronized (Static89.aClass4_9) {
					local12 = (Class1_Sub13) Static89.aClass4_9.method174();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static24.method517(100L);
					local25 = Static39.anObject1;
					synchronized (Static39.anObject1) {
						if (Static98.anInt2845 <= 1) {
							Static98.anInt2845 = 0;
							Static39.anObject1.notifyAll();
							return;
						}
						Static98.anInt2845--;
					}
				} else {
					if (local12.anInt2284 == 0) {
						local12.aClass9_1.method373(local12.aByteArray33, local12.aByteArray33.length, (int) local12.aLong147);
						local5 = Static89.aClass4_9;
						synchronized (Static89.aClass4_9) {
							local12.method3499();
						}
					} else if (local12.anInt2284 == 1) {
						local12.aByteArray33 = local12.aClass9_1.method377((int) local12.aLong147);
						local5 = Static89.aClass4_9;
						synchronized (Static89.aClass4_9) {
							Static36.aClass4_3.method179(local12);
						}
					}
					local25 = Static39.anObject1;
					synchronized (Static39.anObject1) {
						if (Static98.anInt2845 <= 1) {
							Static98.anInt2845 = 0;
							Static39.anObject1.notifyAll();
							return;
						}
						Static98.anInt2845 = 600;
					}
				}
			}
		} catch (@Pc(135) Exception local135) {
			Static141.method2762(local135, null);
		}
	}
}
