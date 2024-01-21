import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class59 implements Runnable {

	@OriginalMember(owner = "client!ta", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class24 local5 = Static44.aClass24_37;
				@Pc(12) Class3_Sub11 local12;
				synchronized (Static44.aClass24_37) {
					local12 = (Class3_Sub11) Static44.aClass24_37.method534();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static24.method505(100L);
					local81 = Static76.anObject2;
					synchronized (Static76.anObject2) {
						if (Static48.anInt1375 <= 1) {
							Static48.anInt1375 = 0;
							Static76.anObject2.notifyAll();
							return;
						}
						Static48.anInt1375--;
					}
				} else {
					if (local12.anInt2177 == 0) {
						local12.aClass46_4.method1177(local12.aByteArray19.length, local12.aByteArray19, (int) local12.aLong81);
						local5 = Static44.aClass24_37;
						synchronized (Static44.aClass24_37) {
							local12.method1852();
						}
					} else if (local12.anInt2177 == 1) {
						local12.aByteArray19 = local12.aClass46_4.method1179((int) local12.aLong81);
						local5 = Static44.aClass24_37;
						synchronized (Static44.aClass24_37) {
							Static38.aClass24_35.method535(local12);
						}
					}
					local81 = Static76.anObject2;
					synchronized (Static76.anObject2) {
						if (Static48.anInt1375 <= 1) {
							Static48.anInt1375 = 0;
							Static76.anObject2.notifyAll();
							return;
						}
						Static48.anInt1375 = 600;
					}
				}
			}
		} catch (@Pc(129) Exception local129) {
			Static72.method1184(null, local129);
		}
	}
}
