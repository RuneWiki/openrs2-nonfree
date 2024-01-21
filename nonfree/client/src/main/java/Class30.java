import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!jc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class9 local5 = Static12.aClass9_2;
				@Pc(12) Class10_Sub11 local12;
				synchronized (Static12.aClass9_2) {
					local12 = (Class10_Sub11) Static12.aClass9_2.method72();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static93.method1123(100L);
					local25 = Static89.anObject4;
					synchronized (Static89.anObject4) {
						if (Static74.anInt1869 <= 1) {
							Static74.anInt1869 = 0;
							Static89.anObject4.notifyAll();
							return;
						}
						Static74.anInt1869--;
					}
				} else {
					if (local12.anInt2223 == 0) {
						local12.aClass38_3.method845(local12.aByteArray12, (int) local12.aLong81, local12.aByteArray12.length);
						local5 = Static12.aClass9_2;
						synchronized (Static12.aClass9_2) {
							local12.method1654();
						}
					} else if (local12.anInt2223 == 1) {
						local12.aByteArray12 = local12.aClass38_3.method844((int) local12.aLong81);
						local5 = Static12.aClass9_2;
						synchronized (Static12.aClass9_2) {
							Static41.aClass9_5.method79(local12);
						}
					}
					local25 = Static89.anObject4;
					synchronized (Static89.anObject4) {
						if (Static74.anInt1869 <= 1) {
							Static74.anInt1869 = 0;
							Static89.anObject4.notifyAll();
							return;
						}
						Static74.anInt1869 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static99.method1580(null, local133);
		}
	}
}
