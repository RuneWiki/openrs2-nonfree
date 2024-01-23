import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class91 implements Runnable {

	@OriginalMember(owner = "client!tc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class44 local5 = Static202.aClass44_57;
				@Pc(12) Class2_Sub16 local12;
				synchronized (Static202.aClass44_57) {
					local12 = (Class2_Sub16) Static202.aClass44_57.method1359();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static156.method2805(100L);
					local25 = Static95.anObject3;
					synchronized (Static95.anObject3) {
						if (Static146.anInt3306 <= 1) {
							Static146.anInt3306 = 0;
							Static95.anObject3.notifyAll();
							return;
						}
						Static146.anInt3306--;
					}
				} else {
					if (local12.anInt1364 == 0) {
						local12.aClass88_1.method3493(local12.aByteArray22.length, (int) local12.aLong188, local12.aByteArray22);
						local5 = Static202.aClass44_57;
						synchronized (Static202.aClass44_57) {
							local12.method3986();
						}
					} else if (local12.anInt1364 == 1) {
						local12.aByteArray22 = local12.aClass88_1.method3495((int) local12.aLong188);
						local5 = Static202.aClass44_57;
						synchronized (Static202.aClass44_57) {
							Static84.aClass44_18.method1355(local12);
						}
					}
					local25 = Static95.anObject3;
					synchronized (Static95.anObject3) {
						if (Static146.anInt3306 <= 1) {
							Static146.anInt3306 = 0;
							Static95.anObject3.notifyAll();
							return;
						}
						Static146.anInt3306 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static139.method2127(local130, null);
		}
	}
}
