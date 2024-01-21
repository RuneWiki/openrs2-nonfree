import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class58 local5 = Static55.aClass58_30;
				@Pc(12) Class5_Sub9 local12;
				synchronized (Static55.aClass58_30) {
					local12 = (Class5_Sub9) Static55.aClass58_30.method1669();
				}
				@Pc(80) Object local80;
				if (local12 == null) {
					Static118.method1893(100L);
					local80 = Static77.anObject4;
					synchronized (Static77.anObject4) {
						if (Static32.anInt954 <= 1) {
							Static32.anInt954 = 0;
							Static77.anObject4.notifyAll();
							return;
						}
						Static32.anInt954--;
					}
				} else {
					if (local12.anInt946 == 0) {
						local12.aClass40_1.method1015(local12.aByteArray18.length, (int) local12.aLong100, local12.aByteArray18);
						local5 = Static55.aClass58_30;
						synchronized (Static55.aClass58_30) {
							local12.method2189();
						}
					} else if (local12.anInt946 == 1) {
						local12.aByteArray18 = local12.aClass40_1.method1009((int) local12.aLong100);
						local5 = Static55.aClass58_30;
						synchronized (Static55.aClass58_30) {
							Static133.aClass58_76.method1663(local12);
						}
					}
					local80 = Static77.anObject4;
					synchronized (Static77.anObject4) {
						if (Static32.anInt954 <= 1) {
							Static32.anInt954 = 0;
							Static77.anObject4.notifyAll();
							return;
						}
						Static32.anInt954 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static21.method462(null, local130);
		}
	}
}
