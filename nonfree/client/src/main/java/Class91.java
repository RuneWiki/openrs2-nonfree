import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class91 implements Runnable {

	@OriginalMember(owner = "client!ok", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class120 local5 = Static192.aClass120_19;
				@Pc(12) Class1_Sub3 local12;
				synchronized (Static192.aClass120_19) {
					local12 = (Class1_Sub3) Static192.aClass120_19.method3564();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static148.method2431(100L);
					local25 = Static113.anObject1;
					synchronized (Static113.anObject1) {
						if (Static98.anInt2145 <= 1) {
							Static98.anInt2145 = 0;
							Static113.anObject1.notifyAll();
							return;
						}
						Static98.anInt2145--;
					}
				} else {
					if (local12.anInt254 == 0) {
						local12.aClass73_1.method2096((int) local12.aLong177, local12.aByteArray1, local12.aByteArray1.length);
						local5 = Static192.aClass120_19;
						synchronized (Static192.aClass120_19) {
							local12.method3735();
						}
					} else if (local12.anInt254 == 1) {
						local12.aByteArray1 = local12.aClass73_1.method2092((int) local12.aLong177);
						local5 = Static192.aClass120_19;
						synchronized (Static192.aClass120_19) {
							Static212.aClass120_21.method3567(local12);
						}
					}
					local25 = Static113.anObject1;
					synchronized (Static113.anObject1) {
						if (Static98.anInt2145 <= 1) {
							Static98.anInt2145 = 0;
							Static113.anObject1.notifyAll();
							return;
						}
						Static98.anInt2145 = 600;
					}
				}
			}
		} catch (@Pc(129) Exception local129) {
			Static81.method1384(local129, null);
		}
	}
}
