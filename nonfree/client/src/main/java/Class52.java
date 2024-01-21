import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class52 implements Runnable {

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class34 local5 = Static41.aClass34_21;
				@Pc(12) Class2_Sub9 local12;
				synchronized (Static41.aClass34_21) {
					local12 = (Class2_Sub9) Static41.aClass34_21.method872();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static51.method1782(100L);
					local25 = Static39.anObject4;
					synchronized (Static39.anObject4) {
						if (Static31.anInt1813 <= 1) {
							Static31.anInt1813 = 0;
							Static39.anObject4.notifyAll();
							return;
						}
						Static31.anInt1813--;
					}
				} else {
					if (local12.anInt1926 == 0) {
						local12.aClass42_1.method1159(local12.aByteArray17.length, local12.aByteArray17, (int) local12.aLong82);
						local5 = Static41.aClass34_21;
						synchronized (Static41.aClass34_21) {
							local12.method2045();
						}
					} else if (local12.anInt1926 == 1) {
						local12.aByteArray17 = local12.aClass42_1.method1157((int) local12.aLong82);
						local5 = Static41.aClass34_21;
						synchronized (Static41.aClass34_21) {
							Static100.aClass34_52.method876(local12);
						}
					}
					local25 = Static39.anObject4;
					synchronized (Static39.anObject4) {
						if (Static31.anInt1813 <= 1) {
							Static31.anInt1813 = 0;
							Static39.anObject4.notifyAll();
							return;
						}
						Static31.anInt1813 = 600;
					}
				}
			}
		} catch (@Pc(126) Exception local126) {
			Static108.method2075(local126, null);
		}
	}
}
