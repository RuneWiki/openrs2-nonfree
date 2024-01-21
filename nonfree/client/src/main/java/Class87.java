import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class87 implements Runnable {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
	public static final int[] anIntArray315 = new int[4096];

	static {
		for (@Pc(7) int local7 = 0; local7 < 4096; local7++) {
			anIntArray315[local7] = Static7.method1726(local7);
		}
	}

	@OriginalMember(owner = "client!rh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class13 local5 = Static115.aClass13_7;
				@Pc(12) Class2_Sub26 local12;
				synchronized (Static115.aClass13_7) {
					local12 = (Class2_Sub26) Static115.aClass13_7.method303();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static117.method1813(100L);
					local25 = Static118.anObject3;
					synchronized (Static118.anObject3) {
						if (Static214.anInt4479 <= 1) {
							Static214.anInt4479 = 0;
							Static118.anObject3.notifyAll();
							return;
						}
						Static214.anInt4479--;
					}
				} else {
					if (local12.anInt4228 == 0) {
						local12.aClass98_4.method2727((int) local12.aLong148, local12.aByteArray50.length, local12.aByteArray50);
						local5 = Static115.aClass13_7;
						synchronized (Static115.aClass13_7) {
							local12.method3183();
						}
					} else if (local12.anInt4228 == 1) {
						local12.aByteArray50 = local12.aClass98_4.method2722((int) local12.aLong148);
						local5 = Static115.aClass13_7;
						synchronized (Static115.aClass13_7) {
							Static148.aClass13_9.method304(local12);
						}
					}
					local25 = Static118.anObject3;
					synchronized (Static118.anObject3) {
						if (Static214.anInt4479 <= 1) {
							Static214.anInt4479 = 0;
							Static118.anObject3.notifyAll();
							return;
						}
						Static214.anInt4479 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static84.method2582(null, local133);
		}
	}
}
