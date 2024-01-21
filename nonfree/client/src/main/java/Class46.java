import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class45 local5 = Static37.aClass45_7;
				@Pc(12) Class4_Sub12 local12;
				synchronized (Static37.aClass45_7) {
					local12 = (Class4_Sub12) Static37.aClass45_7.method982();
				}
				@Pc(78) Object local78;
				if (local12 == null) {
					Static103.method1711(100L);
					local78 = Static72.anObject4;
					synchronized (Static72.anObject4) {
						if (Static32.anInt941 <= 1) {
							Static32.anInt941 = 0;
							Static72.anObject4.notifyAll();
							return;
						}
						Static32.anInt941--;
					}
				} else {
					if (local12.anInt1660 == 0) {
						local12.aClass56_31.method1272((int) local12.aLong100, local12.aByteArray15.length, local12.aByteArray15);
						local5 = Static37.aClass45_7;
						synchronized (Static37.aClass45_7) {
							local12.method1989();
						}
					} else if (local12.anInt1660 == 1) {
						local12.aByteArray15 = local12.aClass56_31.method1269((int) local12.aLong100);
						local5 = Static37.aClass45_7;
						synchronized (Static37.aClass45_7) {
							Static24.aClass45_4.method988(local12);
						}
					}
					local78 = Static72.anObject4;
					synchronized (Static72.anObject4) {
						if (Static32.anInt941 <= 1) {
							Static32.anInt941 = 0;
							Static72.anObject4.notifyAll();
							return;
						}
						Static32.anInt941 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static117.method1885(null, local128);
		}
	}
}
