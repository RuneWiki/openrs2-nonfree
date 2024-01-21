import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class50 implements Runnable {

	@OriginalMember(owner = "client!m", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class13 local5 = Static9.aClass13_4;
				@Pc(12) Class2_Sub19 local12;
				synchronized (Static9.aClass13_4) {
					local12 = (Class2_Sub19) Static9.aClass13_4.method270();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static81.method1325(100L);
					local25 = Static10.anObject65;
					synchronized (Static10.anObject65) {
						if (Static119.anInt1927 <= 1) {
							Static119.anInt1927 = 0;
							Static10.anObject65.notifyAll();
							return;
						}
						Static119.anInt1927--;
					}
				} else {
					if (local12.anInt2511 == 0) {
						local12.aClass24_3.method608(local12.aByteArray36, local12.aByteArray36.length, (int) local12.aLong100);
						local5 = Static9.aClass13_4;
						synchronized (Static9.aClass13_4) {
							local12.method2053();
						}
					} else if (local12.anInt2511 == 1) {
						local12.aByteArray36 = local12.aClass24_3.method609((int) local12.aLong100);
						local5 = Static9.aClass13_4;
						synchronized (Static9.aClass13_4) {
							Static72.aClass13_11.method263(local12);
						}
					}
					local25 = Static10.anObject65;
					synchronized (Static10.anObject65) {
						if (Static119.anInt1927 <= 1) {
							Static119.anInt1927 = 0;
							Static10.anObject65.notifyAll();
							return;
						}
						Static119.anInt1927 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static93.method1535(null, local130);
		}
	}
}
