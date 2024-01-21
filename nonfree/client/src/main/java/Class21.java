import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class21 implements Runnable {

	@OriginalMember(owner = "client!dh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class72 local5 = Static124.aClass72_39;
				@Pc(12) Class3_Sub19 local12;
				synchronized (Static124.aClass72_39) {
					local12 = (Class3_Sub19) Static124.aClass72_39.method2401();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static166.method2609(100L);
					local25 = Static79.anObject3;
					synchronized (Static79.anObject3) {
						if (Static29.anInt759 <= 1) {
							Static29.anInt759 = 0;
							Static79.anObject3.notifyAll();
							return;
						}
						Static29.anInt759--;
					}
				} else {
					if (local12.anInt3102 == 0) {
						local12.aClass43_4.method1293(local12.aByteArray35, (int) local12.aLong183, local12.aByteArray35.length);
						local5 = Static124.aClass72_39;
						synchronized (Static124.aClass72_39) {
							local12.method2783();
						}
					} else if (local12.anInt3102 == 1) {
						local12.aByteArray35 = local12.aClass43_4.method1298((int) local12.aLong183);
						local5 = Static124.aClass72_39;
						synchronized (Static124.aClass72_39) {
							Static107.aClass72_34.method2404(local12);
						}
					}
					local25 = Static79.anObject3;
					synchronized (Static79.anObject3) {
						if (Static29.anInt759 <= 1) {
							Static29.anInt759 = 0;
							Static79.anObject3.notifyAll();
							return;
						}
						Static29.anInt759 = 600;
					}
				}
			}
		} catch (@Pc(132) Exception local132) {
			Static29.method571(local132, null);
		}
	}
}
