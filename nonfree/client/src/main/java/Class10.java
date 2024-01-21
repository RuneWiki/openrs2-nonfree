import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class10 implements Runnable {

	@OriginalMember(owner = "client!bd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class91 local5 = Static140.aClass91_11;
				@Pc(12) Class5_Sub14 local12;
				synchronized (Static140.aClass91_11) {
					local12 = (Class5_Sub14) Static140.aClass91_11.method2684();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static210.method739(100L);
					local81 = Static46.anObject1;
					synchronized (Static46.anObject1) {
						if (Static47.anInt4217 <= 1) {
							Static47.anInt4217 = 0;
							Static46.anObject1.notifyAll();
							return;
						}
						Static47.anInt4217--;
					}
				} else {
					if (local12.anInt1584 == 0) {
						local12.aClass17_3.method458((int) local12.aLong253, local12.aByteArray20, local12.aByteArray20.length);
						local5 = Static140.aClass91_11;
						synchronized (Static140.aClass91_11) {
							local12.method3207();
						}
					} else if (local12.anInt1584 == 1) {
						local12.aByteArray20 = local12.aClass17_3.method457((int) local12.aLong253);
						local5 = Static140.aClass91_11;
						synchronized (Static140.aClass91_11) {
							Static174.aClass91_16.method2686(local12);
						}
					}
					local81 = Static46.anObject1;
					synchronized (Static46.anObject1) {
						if (Static47.anInt4217 <= 1) {
							Static47.anInt4217 = 0;
							Static46.anObject1.notifyAll();
							return;
						}
						Static47.anInt4217 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static51.method890(local131, null);
		}
	}
}
