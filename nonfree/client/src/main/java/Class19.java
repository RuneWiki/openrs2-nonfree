import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class19 implements Runnable {

	@OriginalMember(owner = "client!f", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class28 local5 = Static106.aClass28_7;
				@Pc(12) Class3_Sub12 local12;
				synchronized (Static106.aClass28_7) {
					local12 = (Class3_Sub12) Static106.aClass28_7.method884();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static41.method888(100L);
					local81 = Static13.anObject3;
					synchronized (Static13.anObject3) {
						if (Static33.anInt813 <= 1) {
							Static33.anInt813 = 0;
							Static13.anObject3.notifyAll();
							return;
						}
						Static33.anInt813--;
					}
				} else {
					if (local12.anInt2521 == 0) {
						local12.aClass55_4.method1646((int) local12.aLong83, local12.aByteArray21, local12.aByteArray21.length);
						local5 = Static106.aClass28_7;
						synchronized (Static106.aClass28_7) {
							local12.method1883();
						}
					} else if (local12.anInt2521 == 1) {
						local12.aByteArray21 = local12.aClass55_4.method1647((int) local12.aLong83);
						local5 = Static106.aClass28_7;
						synchronized (Static106.aClass28_7) {
							Static99.aClass28_12.method889(local12);
						}
					}
					local81 = Static13.anObject3;
					synchronized (Static13.anObject3) {
						if (Static33.anInt813 <= 1) {
							Static33.anInt813 = 0;
							Static13.anObject3.notifyAll();
							return;
						}
						Static33.anInt813 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static16.method293(null, local131);
		}
	}
}
