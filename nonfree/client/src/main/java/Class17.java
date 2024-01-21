import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class17 implements Runnable {

	@OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class61 local5 = Static33.aClass61_5;
				@Pc(12) Class4_Sub23 local12;
				synchronized (Static33.aClass61_5) {
					local12 = (Class4_Sub23) Static33.aClass61_5.method1628();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static125.method2177(100L);
					local25 = Static36.anObject3;
					synchronized (Static36.anObject3) {
						if (Static108.anInt2702 <= 1) {
							Static108.anInt2702 = 0;
							Static36.anObject3.notifyAll();
							return;
						}
						Static108.anInt2702--;
					}
				} else {
					if (local12.anInt3043 == 0) {
						local12.aClass75_4.method2016(local12.aByteArray34, local12.aByteArray34.length, (int) local12.aLong155);
						local5 = Static33.aClass61_5;
						synchronized (Static33.aClass61_5) {
							local12.method2189();
						}
					} else if (local12.anInt3043 == 1) {
						local12.aByteArray34 = local12.aClass75_4.method2018((int) local12.aLong155);
						local5 = Static33.aClass61_5;
						synchronized (Static33.aClass61_5) {
							Static47.aClass61_7.method1635(local12);
						}
					}
					local25 = Static36.anObject3;
					synchronized (Static36.anObject3) {
						if (Static108.anInt2702 <= 1) {
							Static108.anInt2702 = 0;
							Static36.anObject3.notifyAll();
							return;
						}
						Static108.anInt2702 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static77.method1294(local128, null);
		}
	}
}
