import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class104 implements Runnable {

	@OriginalMember(owner = "client!sd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class75 local5 = Static18.aClass75_2;
				@Pc(12) Class1_Sub26 local12;
				synchronized (Static18.aClass75_2) {
					local12 = (Class1_Sub26) Static18.aClass75_2.method2239();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static204.method3250(100L);
					local25 = Static4.anObject1;
					synchronized (Static4.anObject1) {
						if (Static195.anInt3974 <= 1) {
							Static195.anInt3974 = 0;
							Static4.anObject1.notifyAll();
							return;
						}
						Static195.anInt3974--;
					}
				} else {
					if (local12.anInt4151 == 0) {
						local12.aClass123_6.method3390(local12.aByteArray56, (int) local12.aLong173, local12.aByteArray56.length);
						local5 = Static18.aClass75_2;
						synchronized (Static18.aClass75_2) {
							local12.method3525();
						}
					} else if (local12.anInt4151 == 1) {
						local12.aByteArray56 = local12.aClass123_6.method3391((int) local12.aLong173);
						local5 = Static18.aClass75_2;
						synchronized (Static18.aClass75_2) {
							Static8.aClass75_1.method2240(local12);
						}
					}
					local25 = Static4.anObject1;
					synchronized (Static4.anObject1) {
						if (Static195.anInt3974 <= 1) {
							Static195.anInt3974 = 0;
							Static4.anObject1.notifyAll();
							return;
						}
						Static195.anInt3974 = 600;
					}
				}
			}
		} catch (@Pc(129) Exception local129) {
			Static204.method3249(local129, null);
		}
	}
}
