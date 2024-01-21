import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class43 implements Runnable {

	@OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class52 local5 = Static62.aClass52_8;
				@Pc(12) Class2_Sub9 local12;
				synchronized (Static62.aClass52_8) {
					local12 = (Class2_Sub9) Static62.aClass52_8.method1587();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static34.method698(100L);
					local25 = Static28.anObject2;
					synchronized (Static28.anObject2) {
						if (Static20.anInt625 <= 1) {
							Static20.anInt625 = 0;
							Static28.anObject2.notifyAll();
							return;
						}
						Static20.anInt625--;
					}
				} else {
					if (local12.anInt1142 == 0) {
						local12.aClass5_1.method126(local12.aByteArray36.length, (int) local12.aLong82, local12.aByteArray36);
						local5 = Static62.aClass52_8;
						synchronized (Static62.aClass52_8) {
							local12.method1794();
						}
					} else if (local12.anInt1142 == 1) {
						local12.aByteArray36 = local12.aClass5_1.method130((int) local12.aLong82);
						local5 = Static62.aClass52_8;
						synchronized (Static62.aClass52_8) {
							Static4.aClass52_1.method1593(local12);
						}
					}
					local25 = Static28.anObject2;
					synchronized (Static28.anObject2) {
						if (Static20.anInt625 <= 1) {
							Static20.anInt625 = 0;
							Static28.anObject2.notifyAll();
							return;
						}
						Static20.anInt625 = 600;
					}
				}
			}
		} catch (@Pc(132) Exception local132) {
			Static30.method573(null, local132);
		}
	}
}
