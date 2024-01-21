import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!hb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class91 local5 = Static124.aClass91_11;
				@Pc(12) Class1_Sub25 local12;
				synchronized (Static124.aClass91_11) {
					local12 = (Class1_Sub25) Static124.aClass91_11.method3148();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static135.method2569(100L);
					local25 = Static197.anObject4;
					synchronized (Static197.anObject4) {
						if (Static210.anInt4461 <= 1) {
							Static210.anInt4461 = 0;
							Static197.anObject4.notifyAll();
							return;
						}
						Static210.anInt4461--;
					}
				} else {
					if (local12.anInt4184 == 0) {
						local12.aClass32_4.method1104(local12.aByteArray49, local12.aByteArray49.length, (int) local12.aLong150);
						local5 = Static124.aClass91_11;
						synchronized (Static124.aClass91_11) {
							local12.method3295();
						}
					} else if (local12.anInt4184 == 1) {
						local12.aByteArray49 = local12.aClass32_4.method1105((int) local12.aLong150);
						local5 = Static124.aClass91_11;
						synchronized (Static124.aClass91_11) {
							Static148.aClass91_16.method3151(local12);
						}
					}
					local25 = Static197.anObject4;
					synchronized (Static197.anObject4) {
						if (Static210.anInt4461 <= 1) {
							Static210.anInt4461 = 0;
							Static197.anObject4.notifyAll();
							return;
						}
						Static210.anInt4461 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static107.method1977(local128, null);
		}
	}
}
