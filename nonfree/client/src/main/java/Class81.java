import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class31 local5 = Static1.aClass31_4;
				@Pc(12) Class1_Sub3 local12;
				synchronized (Static1.aClass31_4) {
					local12 = (Class1_Sub3) Static1.aClass31_4.method1000();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static96.method1616(100L);
					local25 = Static49.anObject1;
					synchronized (Static49.anObject1) {
						if (Static45.anInt1257 <= 1) {
							Static45.anInt1257 = 0;
							Static49.anObject1.notifyAll();
							return;
						}
						Static45.anInt1257--;
					}
				} else {
					if (local12.anInt151 == 0) {
						local12.aClass61_1.method1566(local12.aByteArray6.length, (int) local12.aLong98, local12.aByteArray6);
						local5 = Static1.aClass31_4;
						synchronized (Static1.aClass31_4) {
							local12.method2128();
						}
					} else if (local12.anInt151 == 1) {
						local12.aByteArray6 = local12.aClass61_1.method1572((int) local12.aLong98);
						local5 = Static1.aClass31_4;
						synchronized (Static1.aClass31_4) {
							Static90.aClass31_49.method1005(local12);
						}
					}
					local25 = Static49.anObject1;
					synchronized (Static49.anObject1) {
						if (Static45.anInt1257 <= 1) {
							Static45.anInt1257 = 0;
							Static49.anObject1.notifyAll();
							return;
						}
						Static45.anInt1257 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static95.method2004(null, local131);
		}
	}
}
