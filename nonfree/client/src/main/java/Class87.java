import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class87 implements Runnable {

	@OriginalMember(owner = "client!w", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class81 local5 = Static47.aClass81_4;
				@Pc(12) Class2_Sub22 local12;
				synchronized (Static47.aClass81_4) {
					local12 = (Class2_Sub22) Static47.aClass81_4.method2682();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static50.method901(100L);
					local81 = Static179.anObject4;
					synchronized (Static179.anObject4) {
						if (Static20.anInt445 <= 1) {
							Static20.anInt445 = 0;
							Static179.anObject4.notifyAll();
							return;
						}
						Static20.anInt445--;
					}
				} else {
					if (local12.anInt2507 == 0) {
						local12.aClass88_2.method2981(local12.aByteArray45, (int) local12.aLong157, local12.aByteArray45.length);
						local5 = Static47.aClass81_4;
						synchronized (Static47.aClass81_4) {
							local12.method3007();
						}
					} else if (local12.anInt2507 == 1) {
						local12.aByteArray45 = local12.aClass88_2.method2979((int) local12.aLong157);
						local5 = Static47.aClass81_4;
						synchronized (Static47.aClass81_4) {
							Static66.aClass81_5.method2683(local12);
						}
					}
					local81 = Static179.anObject4;
					synchronized (Static179.anObject4) {
						if (Static20.anInt445 <= 1) {
							Static20.anInt445 = 0;
							Static179.anObject4.notifyAll();
							return;
						}
						Static20.anInt445 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static8.method1789(null, local131);
		}
	}
}
