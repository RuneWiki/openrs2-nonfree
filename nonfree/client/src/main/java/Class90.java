import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class90 implements Runnable {

	@OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class10 local5 = Static155.aClass10_87;
				@Pc(12) Class3_Sub17 local12;
				synchronized (Static155.aClass10_87) {
					local12 = (Class3_Sub17) Static155.aClass10_87.method267();
				}
				@Pc(78) Object local78;
				if (local12 == null) {
					Static119.method1720(100L);
					local78 = Static80.anObject3;
					synchronized (Static80.anObject3) {
						if (Static111.anInt2254 <= 1) {
							Static111.anInt2254 = 0;
							Static80.anObject3.notifyAll();
							return;
						}
						Static111.anInt2254--;
					}
				} else {
					if (local12.anInt2109 == 0) {
						local12.aClass18_2.method473((int) local12.aLong147, local12.aByteArray17, local12.aByteArray17.length);
						local5 = Static155.aClass10_87;
						synchronized (Static155.aClass10_87) {
							local12.method3320();
						}
					} else if (local12.anInt2109 == 1) {
						local12.aByteArray17 = local12.aClass18_2.method471((int) local12.aLong147);
						local5 = Static155.aClass10_87;
						synchronized (Static155.aClass10_87) {
							Static102.aClass10_58.method261(local12);
						}
					}
					local78 = Static80.anObject3;
					synchronized (Static80.anObject3) {
						if (Static111.anInt2254 <= 1) {
							Static111.anInt2254 = 0;
							Static80.anObject3.notifyAll();
							return;
						}
						Static111.anInt2254 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static208.method1860(null, local130);
		}
	}
}
