import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!ic", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class65 local5 = Static67.aClass65_4;
				@Pc(12) Class2_Sub7 local12;
				synchronized (Static67.aClass65_4) {
					local12 = (Class2_Sub7) Static67.aClass65_4.method2115();
				}
				@Pc(78) Object local78;
				if (local12 == null) {
					Static176.method2744(100L);
					local78 = Static165.anObject3;
					synchronized (Static165.anObject3) {
						if (Static170.anInt4050 <= 1) {
							Static170.anInt4050 = 0;
							Static165.anObject3.notifyAll();
							return;
						}
						Static170.anInt4050--;
					}
				} else {
					if (local12.anInt972 == 0) {
						local12.aClass32_2.method1283((int) local12.aLong145, local12.aByteArray12, local12.aByteArray12.length);
						local5 = Static67.aClass65_4;
						synchronized (Static67.aClass65_4) {
							local12.method2888();
						}
					} else if (local12.anInt972 == 1) {
						local12.aByteArray12 = local12.aClass32_2.method1285((int) local12.aLong145);
						local5 = Static67.aClass65_4;
						synchronized (Static67.aClass65_4) {
							Static153.aClass65_16.method2116(local12);
						}
					}
					local78 = Static165.anObject3;
					synchronized (Static165.anObject3) {
						if (Static170.anInt4050 <= 1) {
							Static170.anInt4050 = 0;
							Static165.anObject3.notifyAll();
							return;
						}
						Static170.anInt4050 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static178.method2785(null, local128);
		}
	}
}
