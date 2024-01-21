import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class50 local5 = Static96.aClass50_14;
				@Pc(12) Class1_Sub12 local12;
				synchronized (Static96.aClass50_14) {
					local12 = (Class1_Sub12) Static96.aClass50_14.method1151();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static117.method2058(100L);
					local25 = Static28.anObject6;
					synchronized (Static28.anObject6) {
						if (Static31.anInt801 <= 1) {
							Static31.anInt801 = 0;
							Static28.anObject6.notifyAll();
							return;
						}
						Static31.anInt801--;
					}
				} else {
					if (local12.anInt2329 == 0) {
						local12.aClass16_4.method363(local12.aByteArray26.length, (int) local12.aLong87, local12.aByteArray26);
						local5 = Static96.aClass50_14;
						synchronized (Static96.aClass50_14) {
							local12.method2076();
						}
					} else if (local12.anInt2329 == 1) {
						local12.aByteArray26 = local12.aClass16_4.method362((int) local12.aLong87);
						local5 = Static96.aClass50_14;
						synchronized (Static96.aClass50_14) {
							Static84.aClass50_9.method1142(local12);
						}
					}
					local25 = Static28.anObject6;
					synchronized (Static28.anObject6) {
						if (Static31.anInt801 <= 1) {
							Static31.anInt801 = 0;
							Static28.anObject6.notifyAll();
							return;
						}
						Static31.anInt801 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static99.method1601(local131, null);
		}
	}
}
