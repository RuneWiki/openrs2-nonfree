import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class49 implements Runnable {

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class3 local5 = Static90.aClass3_6;
				@Pc(12) Class6_Sub8 local12;
				synchronized (Static90.aClass3_6) {
					local12 = (Class6_Sub8) Static90.aClass3_6.method31();
				}
				@Pc(78) Object local78;
				if (local12 == null) {
					Static58.method1193(100L);
					local78 = Static3.anObject1;
					synchronized (Static3.anObject1) {
						if (Static24.anInt1065 <= 1) {
							Static24.anInt1065 = 0;
							Static3.anObject1.notifyAll();
							return;
						}
						Static24.anInt1065--;
					}
				} else {
					if (local12.anInt1568 == 0) {
						local12.aClass32_2.method980(local12.aByteArray7.length, local12.aByteArray7, (int) local12.aLong114);
						local5 = Static90.aClass3_6;
						synchronized (Static90.aClass3_6) {
							local12.method2083();
						}
					} else if (local12.anInt1568 == 1) {
						local12.aByteArray7 = local12.aClass32_2.method981((int) local12.aLong114);
						local5 = Static90.aClass3_6;
						synchronized (Static90.aClass3_6) {
							Static93.aClass3_7.method23(local12);
						}
					}
					local78 = Static3.anObject1;
					synchronized (Static3.anObject1) {
						if (Static24.anInt1065 <= 1) {
							Static24.anInt1065 = 0;
							Static3.anObject1.notifyAll();
							return;
						}
						Static24.anInt1065 = 600;
					}
				}
			}
		} catch (@Pc(126) Exception local126) {
			Static15.method544(null, local126);
		}
	}
}
