import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class83 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class59 local5 = Static161.aClass59_13;
				@Pc(12) Class3_Sub20 local12;
				synchronized (Static161.aClass59_13) {
					local12 = (Class3_Sub20) Static161.aClass59_13.method1731();
				}
				@Pc(80) Object local80;
				if (local12 == null) {
					Static35.method627(100L);
					local80 = Static29.anObject3;
					synchronized (Static29.anObject3) {
						if (Static147.anInt3355 <= 1) {
							Static147.anInt3355 = 0;
							Static29.anObject3.notifyAll();
							return;
						}
						Static147.anInt3355--;
					}
				} else {
					if (local12.anInt3200 == 0) {
						local12.aClass30_3.method1002(local12.aByteArray39, local12.aByteArray39.length, (int) local12.aLong143);
						local5 = Static161.aClass59_13;
						synchronized (Static161.aClass59_13) {
							local12.method2900();
						}
					} else if (local12.anInt3200 == 1) {
						local12.aByteArray39 = local12.aClass30_3.method1004((int) local12.aLong143);
						local5 = Static161.aClass59_13;
						synchronized (Static161.aClass59_13) {
							Static146.aClass59_9.method1730(local12);
						}
					}
					local80 = Static29.anObject3;
					synchronized (Static29.anObject3) {
						if (Static147.anInt3355 <= 1) {
							Static147.anInt3355 = 0;
							Static29.anObject3.notifyAll();
							return;
						}
						Static147.anInt3355 = 600;
					}
				}
			}
		} catch (@Pc(132) Exception local132) {
			Static124.method2117(null, local132);
		}
	}
}
