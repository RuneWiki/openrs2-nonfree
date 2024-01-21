import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class18 implements Runnable {

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class52 local5 = Static89.aClass52_11;
				@Pc(12) Class5_Sub10 local12;
				synchronized (Static89.aClass52_11) {
					local12 = (Class5_Sub10) Static89.aClass52_11.method1358();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static23.method546(100L);
					local81 = Static50.anObject2;
					synchronized (Static50.anObject2) {
						if (Static9.anInt301 <= 1) {
							Static9.anInt301 = 0;
							Static50.anObject2.notifyAll();
							return;
						}
						Static9.anInt301--;
					}
				} else {
					if (local12.anInt1988 == 0) {
						local12.aClass14_3.method423(local12.aByteArray21.length, local12.aByteArray21, (int) local12.aLong118);
						local5 = Static89.aClass52_11;
						synchronized (Static89.aClass52_11) {
							local12.method2002();
						}
					} else if (local12.anInt1988 == 1) {
						local12.aByteArray21 = local12.aClass14_3.method426((int) local12.aLong118);
						local5 = Static89.aClass52_11;
						synchronized (Static89.aClass52_11) {
							Static42.aClass52_5.method1362(local12);
						}
					}
					local81 = Static50.anObject2;
					synchronized (Static50.anObject2) {
						if (Static9.anInt301 <= 1) {
							Static9.anInt301 = 0;
							Static50.anObject2.notifyAll();
							return;
						}
						Static9.anInt301 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static93.method1558(null, local131);
		}
	}
}
