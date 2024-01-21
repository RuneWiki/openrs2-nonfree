import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class64 implements Runnable {

	@OriginalMember(owner = "client!pa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class84 local5 = Static25.aClass84_2;
				@Pc(12) Class2_Sub12 local12;
				synchronized (Static25.aClass84_2) {
					local12 = (Class2_Sub12) Static25.aClass84_2.method2694();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static155.method2675(100L);
					local81 = Static135.anObject4;
					synchronized (Static135.anObject4) {
						if (Static121.anInt2816 <= 1) {
							Static121.anInt2816 = 0;
							Static135.anObject4.notifyAll();
							return;
						}
						Static121.anInt2816--;
					}
				} else {
					if (local12.anInt1762 == 0) {
						local12.aClass40_1.method1173((int) local12.aLong241, local12.aByteArray7, local12.aByteArray7.length);
						local5 = Static25.aClass84_2;
						synchronized (Static25.aClass84_2) {
							local12.method2808();
						}
					} else if (local12.anInt1762 == 1) {
						local12.aByteArray7 = local12.aClass40_1.method1174((int) local12.aLong241);
						local5 = Static25.aClass84_2;
						synchronized (Static25.aClass84_2) {
							Static118.aClass84_8.method2701(local12);
						}
					}
					local81 = Static135.anObject4;
					synchronized (Static135.anObject4) {
						if (Static121.anInt2816 <= 1) {
							Static121.anInt2816 = 0;
							Static135.anObject4.notifyAll();
							return;
						}
						Static121.anInt2816 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static97.method1572(local131, null);
		}
	}
}
