import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class25 implements Runnable {

	@OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class61 local5 = Static108.aClass61_3;
				@Pc(12) Class1_Sub18 local12;
				synchronized (Static108.aClass61_3) {
					local12 = (Class1_Sub18) Static108.aClass61_3.method1748();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static13.method399(100L);
					local25 = Static108.anObject2;
					synchronized (Static108.anObject2) {
						if (Static96.anInt2466 <= 1) {
							Static96.anInt2466 = 0;
							Static108.anObject2.notifyAll();
							return;
						}
						Static96.anInt2466--;
					}
				} else {
					if (local12.anInt2185 == 0) {
						local12.aClass22_12.method558(local12.aByteArray21, local12.aByteArray21.length, (int) local12.aLong130);
						local5 = Static108.aClass61_3;
						synchronized (Static108.aClass61_3) {
							local12.method2050();
						}
					} else if (local12.anInt2185 == 1) {
						local12.aByteArray21 = local12.aClass22_12.method560((int) local12.aLong130);
						local5 = Static108.aClass61_3;
						synchronized (Static108.aClass61_3) {
							Static27.aClass61_7.method1754(local12);
						}
					}
					local25 = Static108.anObject2;
					synchronized (Static108.anObject2) {
						if (Static96.anInt2466 <= 1) {
							Static96.anInt2466 = 0;
							Static108.anObject2.notifyAll();
							return;
						}
						Static96.anInt2466 = 600;
					}
				}
			}
		} catch (@Pc(132) Exception local132) {
			Static93.method1709(local132, null);
		}
	}
}
