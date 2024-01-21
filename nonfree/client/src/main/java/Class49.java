import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class49 implements Runnable {

	@OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class65 local5 = Static59.aClass65_45;
				@Pc(12) Class3_Sub13 local12;
				synchronized (Static59.aClass65_45) {
					local12 = (Class3_Sub13) Static59.aClass65_45.method1958();
				}
				@Pc(80) Object local80;
				if (local12 == null) {
					Static40.method783(100L);
					local80 = Static18.anObject1;
					synchronized (Static18.anObject1) {
						if (Static16.anInt419 <= 1) {
							Static16.anInt419 = 0;
							Static18.anObject1.notifyAll();
							return;
						}
						Static16.anInt419--;
					}
				} else {
					if (local12.anInt2070 == 0) {
						local12.aClass12_4.method266(local12.aByteArray21.length, (int) local12.aLong100, local12.aByteArray21);
						local5 = Static59.aClass65_45;
						synchronized (Static59.aClass65_45) {
							local12.method2201();
						}
					} else if (local12.anInt2070 == 1) {
						local12.aByteArray21 = local12.aClass12_4.method270((int) local12.aLong100);
						local5 = Static59.aClass65_45;
						synchronized (Static59.aClass65_45) {
							Static23.aClass65_34.method1955(local12);
						}
					}
					local80 = Static18.anObject1;
					synchronized (Static18.anObject1) {
						if (Static16.anInt419 <= 1) {
							Static16.anInt419 = 0;
							Static18.anObject1.notifyAll();
							return;
						}
						Static16.anInt419 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static38.method768(local128, null);
		}
	}
}
