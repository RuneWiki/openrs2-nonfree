import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class69 implements Runnable {

	@OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class51 local5 = Static18.aClass51_5;
				@Pc(12) Class3_Sub9 local12;
				synchronized (Static18.aClass51_5) {
					local12 = (Class3_Sub9) Static18.aClass51_5.method1316();
				}
				@Pc(78) Object local78;
				if (local12 == null) {
					Static74.method1220(100L);
					local78 = Static5.anObject1;
					synchronized (Static5.anObject1) {
						if (Static32.anInt922 <= 1) {
							Static32.anInt922 = 0;
							Static5.anObject1.notifyAll();
							return;
						}
						Static32.anInt922--;
					}
				} else {
					if (local12.anInt1958 == 0) {
						local12.aClass8_2.method197(local12.aByteArray14, (int) local12.aLong85, local12.aByteArray14.length);
						local5 = Static18.aClass51_5;
						synchronized (Static18.aClass51_5) {
							local12.method1966();
						}
					} else if (local12.anInt1958 == 1) {
						local12.aByteArray14 = local12.aClass8_2.method199((int) local12.aLong85);
						local5 = Static18.aClass51_5;
						synchronized (Static18.aClass51_5) {
							Static23.aClass51_7.method1303(local12);
						}
					}
					local78 = Static5.anObject1;
					synchronized (Static5.anObject1) {
						if (Static32.anInt922 <= 1) {
							Static32.anInt922 = 0;
							Static5.anObject1.notifyAll();
							return;
						}
						Static32.anInt922 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static69.method1187(local128, null);
		}
	}
}
