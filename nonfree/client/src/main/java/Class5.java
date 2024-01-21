import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class49 local5 = Static127.aClass49_14;
				@Pc(12) Class8_Sub10 local12;
				synchronized (Static127.aClass49_14) {
					local12 = (Class8_Sub10) Static127.aClass49_14.method1107();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static107.method1511(100L);
					local25 = Static60.anObject4;
					synchronized (Static60.anObject4) {
						if (Static73.anInt1778 <= 1) {
							Static73.anInt1778 = 0;
							Static60.anObject4.notifyAll();
							return;
						}
						Static73.anInt1778--;
					}
				} else {
					if (local12.anInt1311 == 0) {
						local12.aClass61_2.method1359(local12.aByteArray17.length, (int) local12.aLong102, local12.aByteArray17);
						local5 = Static127.aClass49_14;
						synchronized (Static127.aClass49_14) {
							local12.method2013();
						}
					} else if (local12.anInt1311 == 1) {
						local12.aByteArray17 = local12.aClass61_2.method1361((int) local12.aLong102);
						local5 = Static127.aClass49_14;
						synchronized (Static127.aClass49_14) {
							Static113.aClass49_10.method1114(local12);
						}
					}
					local25 = Static60.anObject4;
					synchronized (Static60.anObject4) {
						if (Static73.anInt1778 <= 1) {
							Static73.anInt1778 = 0;
							Static60.anObject4.notifyAll();
							return;
						}
						Static73.anInt1778 = 600;
					}
				}
			}
		} catch (@Pc(130) Exception local130) {
			Static79.method1133(local130, null);
		}
	}
}
