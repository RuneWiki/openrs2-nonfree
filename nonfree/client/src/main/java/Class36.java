import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!i", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class20 local5 = Static88.aClass20_10;
				@Pc(12) Class3_Sub6 local12;
				synchronized (Static88.aClass20_10) {
					local12 = (Class3_Sub6) Static88.aClass20_10.method308();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static104.method1701(100L);
					local25 = Static101.anObject4;
					synchronized (Static101.anObject4) {
						if (Static39.anInt1073 <= 1) {
							Static39.anInt1073 = 0;
							Static101.anObject4.notifyAll();
							return;
						}
						Static39.anInt1073--;
					}
				} else {
					if (local12.anInt1199 == 0) {
						local12.aClass62_1.method1396(local12.aByteArray15, (int) local12.aLong88, local12.aByteArray15.length);
						local5 = Static88.aClass20_10;
						synchronized (Static88.aClass20_10) {
							local12.method1930();
						}
					} else if (local12.anInt1199 == 1) {
						local12.aByteArray15 = local12.aClass62_1.method1400((int) local12.aLong88);
						local5 = Static88.aClass20_10;
						synchronized (Static88.aClass20_10) {
							Static104.aClass20_11.method304(local12);
						}
					}
					local25 = Static101.anObject4;
					synchronized (Static101.anObject4) {
						if (Static39.anInt1073 <= 1) {
							Static39.anInt1073 = 0;
							Static101.anObject4.notifyAll();
							return;
						}
						Static39.anInt1073 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static101.method1675(local128, null);
		}
	}
}
