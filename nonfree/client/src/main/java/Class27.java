import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class27 implements Runnable {

	@OriginalMember(owner = "client!ff", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class1 local5 = Static109.aClass1_10;
				@Pc(12) Class6_Sub5 local12;
				synchronized (Static109.aClass1_10) {
					local12 = (Class6_Sub5) Static109.aClass1_10.method3();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static53.method2063(100L);
					local25 = Static99.anObject4;
					synchronized (Static99.anObject4) {
						if (Static25.anInt849 <= 1) {
							Static25.anInt849 = 0;
							Static99.anObject4.notifyAll();
							return;
						}
						Static25.anInt849--;
					}
				} else {
					if (local12.anInt846 == 0) {
						local12.aClass53_3.method1443(local12.aByteArray9.length, local12.aByteArray9, (int) local12.aLong91);
						local5 = Static109.aClass1_10;
						synchronized (Static109.aClass1_10) {
							local12.method2123();
						}
					} else if (local12.anInt846 == 1) {
						local12.aByteArray9 = local12.aClass53_3.method1442((int) local12.aLong91);
						local5 = Static109.aClass1_10;
						synchronized (Static109.aClass1_10) {
							Static109.aClass1_9.method10(local12);
						}
					}
					local25 = Static99.anObject4;
					synchronized (Static99.anObject4) {
						if (Static25.anInt849 <= 1) {
							Static25.anInt849 = 0;
							Static99.anObject4.notifyAll();
							return;
						}
						Static25.anInt849 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static92.method1674(local130, null);
		}
	}
}
