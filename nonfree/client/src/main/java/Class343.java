import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class343 {

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public int anInt9033 = 64;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public int anInt9028 = 2;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
	public int anInt9031 = 64;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public int anInt9030 = 1;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Z")
	public boolean aBoolean605 = false;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	public int anInt9034 = -1;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Z")
	public boolean aBoolean604 = false;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BILclient!ika;)V")
	public void method7658(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method2048(255);
			if (local17 == 0) {
				return;
			}
			this.method7659(arg1, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ika;III)V")
	private void method7659(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt9034 = arg0.method2028(-14795);
			if (this.anInt9034 == 65535) {
				this.anInt9034 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt9031 = arg0.method2028(-14795) + 1;
			this.anInt9033 = arg0.method2028(-14795) + 1;
		} else if (arg1 == 3) {
			arg0.method2022();
		} else if (arg1 == 4) {
			this.anInt9028 = arg0.method2048(255);
		} else if (arg1 == 5) {
			this.anInt9030 = arg0.method2048(255);
		} else if (arg1 == 6) {
			this.aBoolean604 = true;
		} else if (arg1 == 7) {
			this.aBoolean605 = true;
		}
	}
}
