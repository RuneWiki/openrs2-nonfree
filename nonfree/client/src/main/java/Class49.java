import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class49 implements Runnable {

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class37 local5 = Static45.aClass37_8;
				@Pc(12) Class3_Sub15 local12;
				synchronized (Static45.aClass37_8) {
					local12 = (Class3_Sub15) Static45.aClass37_8.method989();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static68.method1266(100L);
					local25 = Static118.anObject4;
					synchronized (Static118.anObject4) {
						if (Static7.anInt375 <= 1) {
							Static7.anInt375 = 0;
							Static118.anObject4.notifyAll();
							return;
						}
						Static7.anInt375--;
					}
				} else {
					if (local12.anInt2514 == 0) {
						local12.aClass80_4.method1961(local12.aByteArray33.length, local12.aByteArray33, (int) local12.aLong94);
						local5 = Static45.aClass37_8;
						synchronized (Static45.aClass37_8) {
							local12.method2055();
						}
					} else if (local12.anInt2514 == 1) {
						local12.aByteArray33 = local12.aClass80_4.method1959((int) local12.aLong94);
						local5 = Static45.aClass37_8;
						synchronized (Static45.aClass37_8) {
							Static16.aClass37_2.method985(local12);
						}
					}
					local25 = Static118.anObject4;
					synchronized (Static118.anObject4) {
						if (Static7.anInt375 <= 1) {
							Static7.anInt375 = 0;
							Static118.anObject4.notifyAll();
							return;
						}
						Static7.anInt375 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static61.method1200(null, local133);
		}
	}
}
