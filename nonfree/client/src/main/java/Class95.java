import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class95 implements Runnable {

	@OriginalMember(owner = "client!te", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class19 local5 = Static96.aClass19_11;
				@Pc(12) Class2_Sub17 local12;
				synchronized (Static96.aClass19_11) {
					local12 = (Class2_Sub17) Static96.aClass19_11.method691();
				}
				@Pc(83) Object local83;
				if (local12 == null) {
					Static119.method2069(100L);
					local83 = Static167.anObject4;
					synchronized (Static167.anObject4) {
						if (Static104.anInt2409 <= 1) {
							Static104.anInt2409 = 0;
							Static167.anObject4.notifyAll();
							return;
						}
						Static104.anInt2409--;
					}
				} else {
					if (local12.anInt2536 == 0) {
						local12.aClass8_3.method295((int) local12.aLong149, local12.aByteArray24, local12.aByteArray24.length);
						local5 = Static96.aClass19_11;
						synchronized (Static96.aClass19_11) {
							local12.method3254();
						}
					} else if (local12.anInt2536 == 1) {
						local12.aByteArray24 = local12.aClass8_3.method299((int) local12.aLong149);
						local5 = Static96.aClass19_11;
						synchronized (Static96.aClass19_11) {
							Static66.aClass19_5.method684(local12);
						}
					}
					local83 = Static167.anObject4;
					synchronized (Static167.anObject4) {
						if (Static104.anInt2409 <= 1) {
							Static104.anInt2409 = 0;
							Static167.anObject4.notifyAll();
							return;
						}
						Static104.anInt2409 = 600;
					}
				}
			}
		} catch (@Pc(135) Exception local135) {
			Static188.method2856(null, local135);
		}
	}
}
