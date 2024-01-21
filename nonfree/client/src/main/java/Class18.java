import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class18 implements Runnable {

	@OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class56 local5 = Static102.aClass56_10;
				@Pc(12) Class1_Sub25 local12;
				synchronized (Static102.aClass56_10) {
					local12 = (Class1_Sub25) Static102.aClass56_10.method1853();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static35.method583(100L);
					local25 = Static110.anObject1;
					synchronized (Static110.anObject1) {
						if (Static60.anInt4358 <= 1) {
							Static60.anInt4358 = 0;
							Static110.anObject1.notifyAll();
							return;
						}
						Static60.anInt4358--;
					}
				} else {
					if (local12.anInt4202 == 0) {
						local12.aClass27_6.method717(local12.aByteArray47.length, local12.aByteArray47, (int) local12.aLong140);
						local5 = Static102.aClass56_10;
						synchronized (Static102.aClass56_10) {
							local12.method3141();
						}
					} else if (local12.anInt4202 == 1) {
						local12.aByteArray47 = local12.aClass27_6.method715((int) local12.aLong140);
						local5 = Static102.aClass56_10;
						synchronized (Static102.aClass56_10) {
							Static47.aClass56_4.method1856(local12);
						}
					}
					local25 = Static110.anObject1;
					synchronized (Static110.anObject1) {
						if (Static60.anInt4358 <= 1) {
							Static60.anInt4358 = 0;
							Static110.anObject1.notifyAll();
							return;
						}
						Static60.anInt4358 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static153.method2616(null, local133);
		}
	}
}
