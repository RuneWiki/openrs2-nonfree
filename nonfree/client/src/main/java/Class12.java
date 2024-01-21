import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class12 implements Runnable {

	@OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class53 local5 = Static8.aClass53_4;
				@Pc(12) Class1_Sub19 local12;
				synchronized (Static8.aClass53_4) {
					local12 = (Class1_Sub19) Static8.aClass53_4.method1442();
				}
				@Pc(78) Object local78;
				if (local12 == null) {
					Static70.method1226(100L);
					local78 = Static123.anObject3;
					synchronized (Static123.anObject3) {
						if (Static50.anInt1250 <= 1) {
							Static50.anInt1250 = 0;
							Static123.anObject3.notifyAll();
							return;
						}
						Static50.anInt1250--;
					}
				} else {
					if (local12.anInt2528 == 0) {
						local12.aClass70_3.method1883(local12.aByteArray34.length, local12.aByteArray34, (int) local12.aLong95);
						local5 = Static8.aClass53_4;
						synchronized (Static8.aClass53_4) {
							local12.method2220();
						}
					} else if (local12.anInt2528 == 1) {
						local12.aByteArray34 = local12.aClass70_3.method1881((int) local12.aLong95);
						local5 = Static8.aClass53_4;
						synchronized (Static8.aClass53_4) {
							Static127.aClass53_18.method1449(local12);
						}
					}
					local78 = Static123.anObject3;
					synchronized (Static123.anObject3) {
						if (Static50.anInt1250 <= 1) {
							Static50.anInt1250 = 0;
							Static123.anObject3.notifyAll();
							return;
						}
						Static50.anInt1250 = 600;
					}
				}
			}
		} catch (@Pc(126) Exception local126) {
			Static122.method2173(local126, null);
		}
	}
}
