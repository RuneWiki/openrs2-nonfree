import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class59 implements Runnable {

	@OriginalMember(owner = "client!qb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class10 local5 = Static19.aClass10_4;
				@Pc(12) Class5_Sub14 local12;
				synchronized (Static19.aClass10_4) {
					local12 = (Class5_Sub14) Static19.aClass10_4.method230();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static17.method318(100L);
					local81 = Static61.anObject2;
					synchronized (Static61.anObject2) {
						if (Static21.anInt696 <= 1) {
							Static21.anInt696 = 0;
							Static61.anObject2.notifyAll();
							return;
						}
						Static21.anInt696--;
					}
				} else {
					if (local12.anInt1841 == 0) {
						local12.aClass68_3.method1898((int) local12.aLong146, local12.aByteArray26, local12.aByteArray26.length);
						local5 = Static19.aClass10_4;
						synchronized (Static19.aClass10_4) {
							local12.method2144();
						}
					} else if (local12.anInt1841 == 1) {
						local12.aByteArray26 = local12.aClass68_3.method1899((int) local12.aLong146);
						local5 = Static19.aClass10_4;
						synchronized (Static19.aClass10_4) {
							Static61.aClass10_8.method234(local12);
						}
					}
					local81 = Static61.anObject2;
					synchronized (Static61.anObject2) {
						if (Static21.anInt696 <= 1) {
							Static21.anInt696 = 0;
							Static61.anObject2.notifyAll();
							return;
						}
						Static21.anInt696 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static53.method1609(null, local131);
		}
	}
}
