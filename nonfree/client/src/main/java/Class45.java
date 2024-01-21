import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class46 local5 = Static53.aClass46_4;
				@Pc(12) Class2_Sub7 local12;
				synchronized (Static53.aClass46_4) {
					local12 = (Class2_Sub7) Static53.aClass46_4.method1435();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static72.method1367(100L);
					local25 = Static5.anObject1;
					synchronized (Static5.anObject1) {
						if (Static7.anInt1203 <= 1) {
							Static7.anInt1203 = 0;
							Static5.anObject1.notifyAll();
							return;
						}
						Static7.anInt1203--;
					}
				} else {
					if (local12.anInt1640 == 0) {
						local12.aClass57_2.method1583(local12.aByteArray12, local12.aByteArray12.length, (int) local12.aLong96);
						local5 = Static53.aClass46_4;
						synchronized (Static53.aClass46_4) {
							local12.method1820();
						}
					} else if (local12.anInt1640 == 1) {
						local12.aByteArray12 = local12.aClass57_2.method1581((int) local12.aLong96);
						local5 = Static53.aClass46_4;
						synchronized (Static53.aClass46_4) {
							Static79.aClass46_8.method1437(local12);
						}
					}
					local25 = Static5.anObject1;
					synchronized (Static5.anObject1) {
						if (Static7.anInt1203 <= 1) {
							Static7.anInt1203 = 0;
							Static5.anObject1.notifyAll();
							return;
						}
						Static7.anInt1203 = 600;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static10.method1681(null, local133);
		}
	}
}
