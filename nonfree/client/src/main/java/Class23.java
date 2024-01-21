import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!fa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class13 local5 = Static19.aClass13_17;
				@Pc(12) Class2_Sub19 local12;
				synchronized (Static19.aClass13_17) {
					local12 = (Class2_Sub19) Static19.aClass13_17.method415();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static80.method1260(100L);
					local25 = Static52.anObject1;
					synchronized (Static52.anObject1) {
						if (Static77.anInt1675 <= 1) {
							Static77.anInt1675 = 0;
							Static52.anObject1.notifyAll();
							return;
						}
						Static77.anInt1675--;
					}
				} else {
					if (local12.anInt2409 == 0) {
						local12.aClass77_4.method1765((int) local12.aLong96, local12.aByteArray29, local12.aByteArray29.length);
						local5 = Static19.aClass13_17;
						synchronized (Static19.aClass13_17) {
							local12.method1930();
						}
					} else if (local12.anInt2409 == 1) {
						local12.aByteArray29 = local12.aClass77_4.method1762((int) local12.aLong96);
						local5 = Static19.aClass13_17;
						synchronized (Static19.aClass13_17) {
							Static63.aClass13_38.method418(local12);
						}
					}
					local25 = Static52.anObject1;
					synchronized (Static52.anObject1) {
						if (Static77.anInt1675 <= 1) {
							Static77.anInt1675 = 0;
							Static52.anObject1.notifyAll();
							return;
						}
						Static77.anInt1675 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static29.method518(null, local130);
		}
	}
}
