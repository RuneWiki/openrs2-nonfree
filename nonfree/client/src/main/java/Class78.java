import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class78 implements Runnable {

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class23 local5 = Static69.aClass23_8;
				@Pc(12) Class3_Sub22 local12;
				synchronized (Static69.aClass23_8) {
					local12 = (Class3_Sub22) Static69.aClass23_8.method858();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static65.method1574(100L);
					local81 = Static34.anObject1;
					synchronized (Static34.anObject1) {
						if (Static42.anInt1179 <= 1) {
							Static42.anInt1179 = 0;
							Static34.anObject1.notifyAll();
							return;
						}
						Static42.anInt1179--;
					}
				} else {
					if (local12.anInt3878 == 0) {
						local12.aClass34_4.method1211(local12.aByteArray39, (int) local12.aLong144, local12.aByteArray39.length);
						local5 = Static69.aClass23_8;
						synchronized (Static69.aClass23_8) {
							local12.method3167();
						}
					} else if (local12.anInt3878 == 1) {
						local12.aByteArray39 = local12.aClass34_4.method1214((int) local12.aLong144);
						local5 = Static69.aClass23_8;
						synchronized (Static69.aClass23_8) {
							Static104.aClass23_10.method850(local12);
						}
					}
					local81 = Static34.anObject1;
					synchronized (Static34.anObject1) {
						if (Static42.anInt1179 <= 1) {
							Static42.anInt1179 = 0;
							Static34.anObject1.notifyAll();
							return;
						}
						Static42.anInt1179 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static146.method2791(local131, null);
		}
	}
}
