import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!ci", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class20 local5 = Static164.aClass20_18;
				@Pc(12) Class1_Sub23 local12;
				synchronized (Static164.aClass20_18) {
					local12 = (Class1_Sub23) Static164.aClass20_18.method467();
				}
				@Pc(78) Object local78;
				if (local12 == null) {
					Static199.method3292(100L);
					local78 = Static45.anObject1;
					synchronized (Static45.anObject1) {
						if (Static147.anInt2989 <= 1) {
							Static147.anInt2989 = 0;
							Static45.anObject1.notifyAll();
							return;
						}
						Static147.anInt2989--;
					}
				} else {
					if (local12.anInt3194 == 0) {
						local12.aClass83_1.method2607(local12.aByteArray45, (int) local12.aLong251, local12.aByteArray45.length);
						local5 = Static164.aClass20_18;
						synchronized (Static164.aClass20_18) {
							local12.method3414();
						}
					} else if (local12.anInt3194 == 1) {
						local12.aByteArray45 = local12.aClass83_1.method2606((int) local12.aLong251);
						local5 = Static164.aClass20_18;
						synchronized (Static164.aClass20_18) {
							Static101.aClass20_10.method466(local12);
						}
					}
					local78 = Static45.anObject1;
					synchronized (Static45.anObject1) {
						if (Static147.anInt2989 <= 1) {
							Static147.anInt2989 = 0;
							Static45.anObject1.notifyAll();
							return;
						}
						Static147.anInt2989 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static61.method998(local130, null);
		}
	}
}
