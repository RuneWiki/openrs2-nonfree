import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class60 implements Runnable {

	@OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class3 local5 = Static5.aClass3_1;
				@Pc(12) Class2_Sub17 local12;
				synchronized (Static5.aClass3_1) {
					local12 = (Class2_Sub17) Static5.aClass3_1.method82();
				}
				@Pc(83) Object local83;
				if (local12 == null) {
					Static85.method1582(100L);
					local83 = Static69.anObject4;
					synchronized (Static69.anObject4) {
						if (Static57.anInt1492 <= 1) {
							Static57.anInt1492 = 0;
							Static69.anObject4.notifyAll();
							return;
						}
						Static57.anInt1492--;
					}
				} else {
					if (local12.anInt2084 == 0) {
						local12.aClass29_4.method732(local12.aByteArray28.length, local12.aByteArray28, (int) local12.aLong100);
						local5 = Static5.aClass3_1;
						synchronized (Static5.aClass3_1) {
							local12.method2209();
						}
					} else if (local12.anInt2084 == 1) {
						local12.aByteArray28 = local12.aClass29_4.method733((int) local12.aLong100);
						local5 = Static5.aClass3_1;
						synchronized (Static5.aClass3_1) {
							Static110.aClass3_11.method75(local12);
						}
					}
					local83 = Static69.anObject4;
					synchronized (Static69.anObject4) {
						if (Static57.anInt1492 <= 1) {
							Static57.anInt1492 = 0;
							Static69.anObject4.notifyAll();
							return;
						}
						Static57.anInt1492 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static92.method1662(local131, null);
		}
	}
}
