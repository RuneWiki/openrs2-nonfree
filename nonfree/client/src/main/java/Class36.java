import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class45 local5 = Static48.aClass45_4;
				@Pc(12) Class1_Sub7 local12;
				synchronized (Static48.aClass45_4) {
					local12 = (Class1_Sub7) Static48.aClass45_4.method1299();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static39.method862(100L);
					local25 = Static62.anObject1;
					synchronized (Static62.anObject1) {
						if (Static12.anInt2429 <= 1) {
							Static12.anInt2429 = 0;
							Static62.anObject1.notifyAll();
							return;
						}
						Static12.anInt2429--;
					}
				} else {
					if (local12.anInt1483 == 0) {
						local12.aClass41_1.method1260((int) local12.aLong85, local12.aByteArray8.length, local12.aByteArray8);
						local5 = Static48.aClass45_4;
						synchronized (Static48.aClass45_4) {
							local12.method1913();
						}
					} else if (local12.anInt1483 == 1) {
						local12.aByteArray8 = local12.aClass41_1.method1257((int) local12.aLong85);
						local5 = Static48.aClass45_4;
						synchronized (Static48.aClass45_4) {
							Static39.aClass45_3.method1295(local12);
						}
					}
					local25 = Static62.anObject1;
					synchronized (Static62.anObject1) {
						if (Static12.anInt2429 <= 1) {
							Static12.anInt2429 = 0;
							Static62.anObject1.notifyAll();
							return;
						}
						Static12.anInt2429 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static42.method908(null, local128);
		}
	}
}
