import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "client!le", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class105 local5 = Static28.aClass105_4;
				@Pc(12) Class1_Sub12 local12;
				synchronized (Static28.aClass105_4) {
					local12 = (Class1_Sub12) Static28.aClass105_4.method3120();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static186.method3115(100L);
					local25 = Static197.anObject6;
					synchronized (Static197.anObject6) {
						if (Static190.anInt4106 <= 1) {
							Static190.anInt4106 = 0;
							Static197.anObject6.notifyAll();
							return;
						}
						Static190.anInt4106--;
					}
				} else {
					if (local12.anInt1479 == 0) {
						local12.aClass100_32.method3042((int) local12.aLong170, local12.aByteArray15, local12.aByteArray15.length);
						local5 = Static28.aClass105_4;
						synchronized (Static28.aClass105_4) {
							local12.method3758();
						}
					} else if (local12.anInt1479 == 1) {
						local12.aByteArray15 = local12.aClass100_32.method3047((int) local12.aLong170);
						local5 = Static28.aClass105_4;
						synchronized (Static28.aClass105_4) {
							Static211.aClass105_22.method3119(local12);
						}
					}
					local25 = Static197.anObject6;
					synchronized (Static197.anObject6) {
						if (Static190.anInt4106 <= 1) {
							Static190.anInt4106 = 0;
							Static197.anObject6.notifyAll();
							return;
						}
						Static190.anInt4106 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static34.method595(null, local131);
		}
	}
}
