import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class4 implements Runnable {

	@OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class58 local5 = Static63.aClass58_8;
				@Pc(12) Class2_Sub12 local12;
				synchronized (Static63.aClass58_8) {
					local12 = (Class2_Sub12) Static63.aClass58_8.method1285();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static62.method1070(100L);
					local25 = Static49.anObject1;
					synchronized (Static49.anObject1) {
						if (Static89.anInt2163 <= 1) {
							Static89.anInt2163 = 0;
							Static49.anObject1.notifyAll();
							return;
						}
						Static89.anInt2163--;
					}
				} else {
					if (local12.anInt1981 == 0) {
						local12.aClass60_4.method1325(local12.aByteArray28.length, (int) local12.aLong91, local12.aByteArray28);
						local5 = Static63.aClass58_8;
						synchronized (Static63.aClass58_8) {
							local12.method1961();
						}
					} else if (local12.anInt1981 == 1) {
						local12.aByteArray28 = local12.aClass60_4.method1326((int) local12.aLong91);
						local5 = Static63.aClass58_8;
						synchronized (Static63.aClass58_8) {
							Static30.aClass58_2.method1294(local12);
						}
					}
					local25 = Static49.anObject1;
					synchronized (Static49.anObject1) {
						if (Static89.anInt2163 <= 1) {
							Static89.anInt2163 = 0;
							Static49.anObject1.notifyAll();
							return;
						}
						Static89.anInt2163 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static53.method953(null, local133);
		}
	}
}
