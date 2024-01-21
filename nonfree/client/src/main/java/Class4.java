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
				@Pc(5) Class22 local5 = Static72.aClass22_11;
				@Pc(12) Class1_Sub9 local12;
				synchronized (Static72.aClass22_11) {
					local12 = (Class1_Sub9) Static72.aClass22_11.method515();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static9.method179(100L);
					local81 = Static61.anObject2;
					synchronized (Static61.anObject2) {
						if (Static63.anInt1531 <= 1) {
							Static63.anInt1531 = 0;
							Static61.anObject2.notifyAll();
							return;
						}
						Static63.anInt1531--;
					}
				} else {
					if (local12.anInt1408 == 0) {
						local12.aClass8_2.method174((int) local12.aLong83, local12.aByteArray16, local12.aByteArray16.length);
						local5 = Static72.aClass22_11;
						synchronized (Static72.aClass22_11) {
							local12.method1825();
						}
					} else if (local12.anInt1408 == 1) {
						local12.aByteArray16 = local12.aClass8_2.method176((int) local12.aLong83);
						local5 = Static72.aClass22_11;
						synchronized (Static72.aClass22_11) {
							Static16.aClass22_4.method512(local12);
						}
					}
					local81 = Static61.anObject2;
					synchronized (Static61.anObject2) {
						if (Static63.anInt1531 <= 1) {
							Static63.anInt1531 = 0;
							Static61.anObject2.notifyAll();
							return;
						}
						Static63.anInt1531 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static95.method1687(null, local131);
		}
	}
}
