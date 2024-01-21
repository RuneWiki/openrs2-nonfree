import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!gh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class70 local5 = Static118.aClass70_14;
				@Pc(12) Class3_Sub12 local12;
				synchronized (Static118.aClass70_14) {
					local12 = (Class3_Sub12) Static118.aClass70_14.method1953();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static135.method2059(100L);
					local81 = Static56.anObject2;
					synchronized (Static56.anObject2) {
						if (Static149.anInt3347 <= 1) {
							Static149.anInt3347 = 0;
							Static56.anObject2.notifyAll();
							return;
						}
						Static149.anInt3347--;
					}
				} else {
					if (local12.anInt1546 == 0) {
						local12.aClass53_3.method1492(local12.aByteArray12, (int) local12.aLong154, local12.aByteArray12.length);
						local5 = Static118.aClass70_14;
						synchronized (Static118.aClass70_14) {
							local12.method3159();
						}
					} else if (local12.anInt1546 == 1) {
						local12.aByteArray12 = local12.aClass53_3.method1488((int) local12.aLong154);
						local5 = Static118.aClass70_14;
						synchronized (Static118.aClass70_14) {
							Static122.aClass70_16.method1958(local12);
						}
					}
					local81 = Static56.anObject2;
					synchronized (Static56.anObject2) {
						if (Static149.anInt3347 <= 1) {
							Static149.anInt3347 = 0;
							Static56.anObject2.notifyAll();
							return;
						}
						Static149.anInt3347 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static67.method1005(local131, null);
		}
	}
}
