import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
	public static final int[] anIntArray424 = new int[256];

	static {
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(18) int local18 = local15;
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				if ((local18 & 0x1) == 1) {
					local18 = local18 >>> 1 ^ 0xEDB88320;
				} else {
					local18 >>>= 0x1;
				}
			}
			anIntArray424[local15] = local18;
		}
	}

	@OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) Class67 local5 = Static99.aClass67_5;
				@Pc(12) Class2_Sub18 local12;
				synchronized (Static99.aClass67_5) {
					local12 = (Class2_Sub18) Static99.aClass67_5.method2848();
				}
				@Pc(81) Object local81;
				if (local12 == null) {
					Static85.method1993(100L);
					local81 = Static111.anObject4;
					synchronized (Static111.anObject4) {
						if (Static141.anInt3696 <= 1) {
							Static141.anInt3696 = 0;
							Static111.anObject4.notifyAll();
							return;
						}
						Static141.anInt3696--;
					}
				} else {
					if (local12.anInt3789 == 0) {
						local12.aClass69_4.method2945(local12.aByteArray43.length, local12.aByteArray43, (int) local12.aLong151);
						local5 = Static99.aClass67_5;
						synchronized (Static99.aClass67_5) {
							local12.method3556();
						}
					} else if (local12.anInt3789 == 1) {
						local12.aByteArray43 = local12.aClass69_4.method2946((int) local12.aLong151);
						local5 = Static99.aClass67_5;
						synchronized (Static99.aClass67_5) {
							Static127.aClass67_8.method2843(local12);
						}
					}
					local81 = Static111.anObject4;
					synchronized (Static111.anObject4) {
						if (Static141.anInt3696 <= 1) {
							Static141.anInt3696 = 0;
							Static111.anObject4.notifyAll();
							return;
						}
						Static141.anInt3696 = 600;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static153.method2973(null, local131);
		}
	}
}
