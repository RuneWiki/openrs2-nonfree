import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class93 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public int anInt3269;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Z")
	public boolean aBoolean251;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public int anInt3272;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public int anInt3274;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public int anInt3276;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public int anInt3277;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public int anInt3275 = 8;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public int anInt3270 = 16777215;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBLclient!bt;)V")
	private void method2668(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt3275 = arg1.method6004();
		} else if (arg0 == 2) {
			this.aBoolean251 = true;
		} else if (arg0 == 3) {
			this.anInt3277 = arg1.method6039();
			this.anInt3272 = arg1.method6039();
			this.anInt3269 = arg1.method6039();
		} else if (arg0 == 4) {
			this.anInt3276 = arg1.method6053();
		} else if (arg0 == 5) {
			this.anInt3274 = arg1.method6004();
		} else if (arg0 == 6) {
			this.anInt3270 = arg1.method6020();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method2669(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method2668(local3, arg0);
		}
	}
}
