import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class95 implements Runnable {

	@OriginalMember(owner = "client!ui", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class87 local5 = Static12.aClass87_6;
				@Pc(12) Class1_Sub25 local12;
				synchronized (Static12.aClass87_6) {
					local12 = (Class1_Sub25) Static12.aClass87_6.method2827();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static75.method3577(100L);
					local25 = Static119.anObject1;
					synchronized (Static119.anObject1) {
						if (Static52.anInt1336 <= 1) {
							Static52.anInt1336 = 0;
							Static119.anObject1.notifyAll();
							return;
						}
						Static52.anInt1336--;
					}
				} else {
					if (local12.anInt4438 == 0) {
						local12.aClass6_4.method184(local12.aByteArray55.length, local12.aByteArray55, (int) local12.aLong149);
						local5 = Static12.aClass87_6;
						synchronized (Static12.aClass87_6) {
							local12.method3563();
						}
					} else if (local12.anInt4438 == 1) {
						local12.aByteArray55 = local12.aClass6_4.method189((int) local12.aLong149);
						local5 = Static12.aClass87_6;
						synchronized (Static12.aClass87_6) {
							Static87.aClass87_14.method2823(local12);
						}
					}
					local25 = Static119.anObject1;
					synchronized (Static119.anObject1) {
						if (Static52.anInt1336 <= 1) {
							Static52.anInt1336 = 0;
							Static119.anObject1.notifyAll();
							return;
						}
						Static52.anInt1336 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static151.method2591(null, local130);
		}
	}
}
