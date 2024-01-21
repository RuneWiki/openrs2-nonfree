import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!mb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class5 local5 = Static28.aClass5_22;
				@Pc(12) Class3_Sub20 local12;
				synchronized (Static28.aClass5_22) {
					local12 = (Class3_Sub20) Static28.aClass5_22.method92();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static126.method2277(100L);
					local25 = Static52.anObject3;
					synchronized (Static52.anObject3) {
						if (Static97.anInt2770 <= 1) {
							Static97.anInt2770 = 0;
							Static52.anObject3.notifyAll();
							return;
						}
						Static97.anInt2770--;
					}
				} else {
					if (local12.anInt2997 == 0) {
						local12.aClass13_4.method319(local12.aByteArray79, local12.aByteArray79.length, (int) local12.aLong107);
						local5 = Static28.aClass5_22;
						synchronized (Static28.aClass5_22) {
							local12.method2264();
						}
					} else if (local12.anInt2997 == 1) {
						local12.aByteArray79 = local12.aClass13_4.method313((int) local12.aLong107);
						local5 = Static28.aClass5_22;
						synchronized (Static28.aClass5_22) {
							Static16.aClass5_6.method87(local12);
						}
					}
					local25 = Static52.anObject3;
					synchronized (Static52.anObject3) {
						if (Static97.anInt2770 <= 1) {
							Static97.anInt2770 = 0;
							Static52.anObject3.notifyAll();
							return;
						}
						Static97.anInt2770 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static87.method1031(local131, null);
		}
	}
}
