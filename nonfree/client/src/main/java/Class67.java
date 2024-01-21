import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class67 implements Runnable {

	@OriginalMember(owner = "client!pd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class82 local5 = Static64.aClass82_5;
				@Pc(12) Class1_Sub18 local12;
				synchronized (Static64.aClass82_5) {
					local12 = (Class1_Sub18) Static64.aClass82_5.method2849();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static181.method2982(100L);
					local25 = Static85.anObject4;
					synchronized (Static85.anObject4) {
						if (Static62.anInt2604 <= 1) {
							Static62.anInt2604 = 0;
							Static85.anObject4.notifyAll();
							return;
						}
						Static62.anInt2604--;
					}
				} else {
					if (local12.anInt3531 == 0) {
						local12.aClass28_3.method1441(local12.aByteArray32, local12.aByteArray32.length, (int) local12.aLong158);
						local5 = Static64.aClass82_5;
						synchronized (Static64.aClass82_5) {
							local12.method3056();
						}
					} else if (local12.anInt3531 == 1) {
						local12.aByteArray32 = local12.aClass28_3.method1444((int) local12.aLong158);
						local5 = Static64.aClass82_5;
						synchronized (Static64.aClass82_5) {
							Static15.aClass82_2.method2853(local12);
						}
					}
					local25 = Static85.anObject4;
					synchronized (Static85.anObject4) {
						if (Static62.anInt2604 <= 1) {
							Static62.anInt2604 = 0;
							Static85.anObject4.notifyAll();
							return;
						}
						Static62.anInt2604 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static154.method2661(null, local128);
		}
	}
}
