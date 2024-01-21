import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!s", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class44 local5 = Static20.aClass44_2;
				@Pc(12) Class2_Sub9 local12;
				synchronized (Static20.aClass44_2) {
					local12 = (Class2_Sub9) Static20.aClass44_2.method1224();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static94.method1494(100L);
					local25 = Static99.anObject2;
					synchronized (Static99.anObject2) {
						if (Static73.anInt1801 <= 1) {
							Static73.anInt1801 = 0;
							Static99.anObject2.notifyAll();
							return;
						}
						Static73.anInt1801--;
					}
				} else {
					if (local12.anInt1189 == 0) {
						local12.aClass11_3.method259(local12.aByteArray13.length, (int) local12.aLong152, local12.aByteArray13);
						local5 = Static20.aClass44_2;
						synchronized (Static20.aClass44_2) {
							local12.method1677();
						}
					} else if (local12.anInt1189 == 1) {
						local12.aByteArray13 = local12.aClass11_3.method261((int) local12.aLong152);
						local5 = Static20.aClass44_2;
						synchronized (Static20.aClass44_2) {
							Static5.aClass44_1.method1221(local12);
						}
					}
					local25 = Static99.anObject2;
					synchronized (Static99.anObject2) {
						if (Static73.anInt1801 <= 1) {
							Static73.anInt1801 = 0;
							Static99.anObject2.notifyAll();
							return;
						}
						Static73.anInt1801 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static38.method727(null, local128);
		}
	}
}
