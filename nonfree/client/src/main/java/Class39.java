import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class39 implements Runnable {

	@OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class10 local5 = Static2.aClass10_4;
				@Pc(12) Class2_Sub6 local12;
				synchronized (Static2.aClass10_4) {
					local12 = (Class2_Sub6) Static2.aClass10_4.method444();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static27.method564(100L);
					local81 = Static50.anObject1;
					synchronized (Static50.anObject1) {
						if (Static178.anInt4522 <= 1) {
							Static178.anInt4522 = 0;
							Static50.anObject1.notifyAll();
							return;
						}
						Static178.anInt4522--;
					}
				} else {
					if (local12.anInt1169 == 0) {
						local12.aClass64_1.method2163((int) local12.aLong134, local12.aByteArray11, local12.aByteArray11.length);
						local5 = Static2.aClass10_4;
						synchronized (Static2.aClass10_4) {
							local12.method3004();
						}
					} else if (local12.anInt1169 == 1) {
						local12.aByteArray11 = local12.aClass64_1.method2164((int) local12.aLong134);
						local5 = Static2.aClass10_4;
						synchronized (Static2.aClass10_4) {
							Static146.aClass10_85.method448(local12);
						}
					}
					local81 = Static50.anObject1;
					synchronized (Static50.anObject1) {
						if (Static178.anInt4522 <= 1) {
							Static178.anInt4522 = 0;
							Static50.anObject1.notifyAll();
							return;
						}
						Static178.anInt4522 = 600;
					}
				}
			}
		} catch (@Pc(129) Exception local129) {
			Static19.method441(null, local129);
		}
	}
}
