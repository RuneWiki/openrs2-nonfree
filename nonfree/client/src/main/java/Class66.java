import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!qb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class12 local5 = Static34.aClass12_4;
				@Pc(12) Class2_Sub4 local12;
				synchronized (Static34.aClass12_4) {
					local12 = (Class2_Sub4) Static34.aClass12_4.method384();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static50.method927(100L);
					local81 = Static57.anObject3;
					synchronized (Static57.anObject3) {
						if (Static129.anInt2882 <= 1) {
							Static129.anInt2882 = 0;
							Static57.anObject3.notifyAll();
							return;
						}
						Static129.anInt2882--;
					}
				} else {
					if (local12.anInt496 == 0) {
						local12.aClass83_1.method2522(local12.aByteArray6, local12.aByteArray6.length, (int) local12.aLong139);
						local5 = Static34.aClass12_4;
						synchronized (Static34.aClass12_4) {
							local12.method2705();
						}
					} else if (local12.anInt496 == 1) {
						local12.aByteArray6 = local12.aClass83_1.method2526((int) local12.aLong139);
						local5 = Static34.aClass12_4;
						synchronized (Static34.aClass12_4) {
							Static90.aClass12_7.method382(local12);
						}
					}
					local81 = Static57.anObject3;
					synchronized (Static57.anObject3) {
						if (Static129.anInt2882 <= 1) {
							Static129.anInt2882 = 0;
							Static57.anObject3.notifyAll();
							return;
						}
						Static129.anInt2882 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static165.method2525(null, local131);
		}
	}
}
