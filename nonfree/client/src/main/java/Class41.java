import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class8 local5 = Static45.aClass8_3;
				@Pc(12) Class2_Sub5 local12;
				synchronized (Static45.aClass8_3) {
					local12 = (Class2_Sub5) Static45.aClass8_3.method175();
				}
				@Pc(80) Object local80;
				if (local12 == null) {
					Static68.method1173(100L);
					local80 = Static61.anObject3;
					synchronized (Static61.anObject3) {
						if (Static47.anInt1243 <= 1) {
							Static47.anInt1243 = 0;
							Static61.anObject3.notifyAll();
							return;
						}
						Static47.anInt1243--;
					}
				} else {
					if (local12.anInt814 == 0) {
						local12.aClass10_1.method228((int) local12.aLong89, local12.aByteArray8.length, local12.aByteArray8);
						local5 = Static45.aClass8_3;
						synchronized (Static45.aClass8_3) {
							local12.method2073();
						}
					} else if (local12.anInt814 == 1) {
						local12.aByteArray8 = local12.aClass10_1.method224((int) local12.aLong89);
						local5 = Static45.aClass8_3;
						synchronized (Static45.aClass8_3) {
							Static106.aClass8_9.method187(local12);
						}
					}
					local80 = Static61.anObject3;
					synchronized (Static61.anObject3) {
						if (Static47.anInt1243 <= 1) {
							Static47.anInt1243 = 0;
							Static61.anObject3.notifyAll();
							return;
						}
						Static47.anInt1243 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static90.method1648(local130, null);
		}
	}
}
