import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class20 implements Runnable {

	@OriginalMember(owner = "client!ch", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class108 local5 = Static201.aClass108_17;
				@Pc(12) Class2_Sub13 local12;
				synchronized (Static201.aClass108_17) {
					local12 = (Class2_Sub13) Static201.aClass108_17.method3322();
				}
				@Pc(83) Object local83;
				if (local12 == null) {
					Static19.method344(100L);
					local83 = Static30.anObject1;
					synchronized (Static30.anObject1) {
						if (Static199.anInt4469 <= 1) {
							Static199.anInt4469 = 0;
							Static30.anObject1.notifyAll();
							return;
						}
						Static199.anInt4469--;
					}
				} else {
					if (local12.anInt2044 == 0) {
						local12.aClass96_3.method3074(local12.aByteArray27, (int) local12.aLong150, local12.aByteArray27.length);
						local5 = Static201.aClass108_17;
						synchronized (Static201.aClass108_17) {
							local12.method3314();
						}
					} else if (local12.anInt2044 == 1) {
						local12.aByteArray27 = local12.aClass96_3.method3073((int) local12.aLong150);
						local5 = Static201.aClass108_17;
						synchronized (Static201.aClass108_17) {
							Static116.aClass108_10.method3334(local12);
						}
					}
					local83 = Static30.anObject1;
					synchronized (Static30.anObject1) {
						if (Static199.anInt4469 <= 1) {
							Static199.anInt4469 = 0;
							Static30.anObject1.notifyAll();
							return;
						}
						Static199.anInt4469 = 600;
					}
				}
			}
		} catch (@Pc(135) Exception local135) {
			Static196.method3064(null, local135);
		}
	}
}
