import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class9 implements Runnable {

	@OriginalMember(owner = "client!cb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class59 local5 = Static164.aClass59_58;
				@Pc(12) Class1_Sub7 local12;
				synchronized (Static164.aClass59_58) {
					local12 = (Class1_Sub7) Static164.aClass59_58.method2417();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static114.method2304(100L);
					local25 = Static71.anObject3;
					synchronized (Static71.anObject3) {
						if (Static121.anInt3415 <= 1) {
							Static121.anInt3415 = 0;
							Static71.anObject3.notifyAll();
							return;
						}
						Static121.anInt3415--;
					}
				} else {
					if (local12.anInt1089 == 0) {
						local12.aClass69_2.method2688((int) local12.aLong139, local12.aByteArray5, local12.aByteArray5.length);
						local5 = Static164.aClass59_58;
						synchronized (Static164.aClass59_58) {
							local12.method3198();
						}
					} else if (local12.anInt1089 == 1) {
						local12.aByteArray5 = local12.aClass69_2.method2687((int) local12.aLong139);
						local5 = Static164.aClass59_58;
						synchronized (Static164.aClass59_58) {
							Static57.aClass59_27.method2411(local12);
						}
					}
					local25 = Static71.anObject3;
					synchronized (Static71.anObject3) {
						if (Static121.anInt3415 <= 1) {
							Static121.anInt3415 = 0;
							Static71.anObject3.notifyAll();
							return;
						}
						Static121.anInt3415 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static15.method266(null, local133);
		}
	}
}
