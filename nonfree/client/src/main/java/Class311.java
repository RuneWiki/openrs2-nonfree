import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class311 {

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
	public int anInt9331;

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
	public int anInt9332;

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
	public int anInt9333;

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "I")
	public int anInt9335;

	@OriginalMember(owner = "client!tga", name = "i", descriptor = "Z")
	public boolean aBoolean784;

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
	public int anInt9340;

	@OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
	public int anInt9338 = 16777215;

	@OriginalMember(owner = "client!tga", name = "f", descriptor = "I")
	public int anInt9336 = 8;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!fd;)V")
	public void method7577(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6538();
			if (local11 == 0) {
				return;
			}
			this.method7579(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!fd;IB)V")
	private void method7579(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9336 = arg0.method6535();
		} else if (arg1 == 2) {
			this.aBoolean784 = true;
		} else if (arg1 == 3) {
			this.anInt9332 = arg0.method6525();
			this.anInt9331 = arg0.method6525();
			this.anInt9340 = arg0.method6525();
		} else if (arg1 == 4) {
			this.anInt9335 = arg0.method6538();
		} else if (arg1 == 5) {
			this.anInt9333 = arg0.method6535();
		} else if (arg1 == 6) {
			this.anInt9338 = arg0.method6506();
		}
	}
}
