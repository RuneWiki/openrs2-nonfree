import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!s", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class38 local5 = Static43.aClass38_8;
				@Pc(12) Class1_Sub18 local12;
				synchronized (Static43.aClass38_8) {
					local12 = (Class1_Sub18) Static43.aClass38_8.method1034();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static109.method2037(100L);
					local25 = Static1.anObject1;
					synchronized (Static1.anObject1) {
						if (Static27.anInt890 <= 1) {
							Static27.anInt890 = 0;
							Static1.anObject1.notifyAll();
							return;
						}
						Static27.anInt890--;
					}
				} else {
					if (local12.anInt2222 == 0) {
						local12.aClass33_1.method951(local12.aByteArray38, local12.aByteArray38.length, (int) local12.aLong162);
						local5 = Static43.aClass38_8;
						synchronized (Static43.aClass38_8) {
							local12.method2039();
						}
					} else if (local12.anInt2222 == 1) {
						local12.aByteArray38 = local12.aClass33_1.method952((int) local12.aLong162);
						local5 = Static43.aClass38_8;
						synchronized (Static43.aClass38_8) {
							Static60.aClass38_11.method1046(local12);
						}
					}
					local25 = Static1.anObject1;
					synchronized (Static1.anObject1) {
						if (Static27.anInt890 <= 1) {
							Static27.anInt890 = 0;
							Static1.anObject1.notifyAll();
							return;
						}
						Static27.anInt890 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static65.method1115(null, local128);
		}
	}
}
