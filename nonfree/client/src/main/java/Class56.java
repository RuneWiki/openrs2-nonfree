import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class56 implements Runnable {

	@OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class11 local5 = Static100.aClass11_11;
				@Pc(12) Class3_Sub9 local12;
				synchronized (Static100.aClass11_11) {
					local12 = (Class3_Sub9) Static100.aClass11_11.method189();
				}
				@Pc(83) Object local83;
				if (local12 == null) {
					Static40.method822(100L);
					local83 = Static66.anObject4;
					synchronized (Static66.anObject4) {
						if (Static118.anInt2757 <= 1) {
							Static118.anInt2757 = 0;
							Static66.anObject4.notifyAll();
							return;
						}
						Static118.anInt2757--;
					}
				} else {
					if (local12.anInt1119 == 0) {
						local12.aClass17_1.method394((int) local12.aLong94, local12.aByteArray18, local12.aByteArray18.length);
						local5 = Static100.aClass11_11;
						synchronized (Static100.aClass11_11) {
							local12.method1962();
						}
					} else if (local12.anInt1119 == 1) {
						local12.aByteArray18 = local12.aClass17_1.method393((int) local12.aLong94);
						local5 = Static100.aClass11_11;
						synchronized (Static100.aClass11_11) {
							Static16.aClass11_1.method190(local12);
						}
					}
					local83 = Static66.anObject4;
					synchronized (Static66.anObject4) {
						if (Static118.anInt2757 <= 1) {
							Static118.anInt2757 = 0;
							Static66.anObject4.notifyAll();
							return;
						}
						Static118.anInt2757 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static10.method172(null, local133);
		}
	}
}
