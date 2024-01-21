import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!ka", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class2 local5 = Static7.aClass2_2;
				@Pc(12) Class1_Sub15 local12;
				synchronized (Static7.aClass2_2) {
					local12 = (Class1_Sub15) Static7.aClass2_2.method22();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static53.method1782(100L);
					local25 = Static30.anObject2;
					synchronized (Static30.anObject2) {
						if (Static127.anInt2946 <= 1) {
							Static127.anInt2946 = 0;
							Static30.anObject2.notifyAll();
							return;
						}
						Static127.anInt2946--;
					}
				} else {
					if (local12.anInt2097 == 0) {
						local12.aClass70_3.method1694(local12.aByteArray22.length, local12.aByteArray22, (int) local12.aLong184);
						local5 = Static7.aClass2_2;
						synchronized (Static7.aClass2_2) {
							local12.method2024();
						}
					} else if (local12.anInt2097 == 1) {
						local12.aByteArray22 = local12.aClass70_3.method1692((int) local12.aLong184);
						local5 = Static7.aClass2_2;
						synchronized (Static7.aClass2_2) {
							Static26.aClass2_4.method33(local12);
						}
					}
					local25 = Static30.anObject2;
					synchronized (Static30.anObject2) {
						if (Static127.anInt2946 <= 1) {
							Static127.anInt2946 = 0;
							Static30.anObject2.notifyAll();
							return;
						}
						Static127.anInt2946 = 600;
					}
				}
			}
		} catch (@Pc(132) Exception local132) {
			Static120.method1980(null, local132);
		}
	}
}
