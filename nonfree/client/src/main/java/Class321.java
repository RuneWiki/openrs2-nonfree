import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class321 {

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
	private int anInt9031;

	@OriginalMember(owner = "client!tga", name = "f", descriptor = "Lclient!qda;")
	public Class273 aClass273_2;

	@OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
	public int anInt9032;

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
	public int anInt9037;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!ud;BI)V")
	private void method7599(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9031 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt9037 = arg0.method6904();
			this.anInt9032 = arg0.method6904();
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!ud;B)V")
	public void method7603(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6904();
			if (local13 == 0) {
				return;
			}
			this.method7599(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Lclient!fw;")
	public synchronized Class120 method7604() {
		@Pc(18) Class120 local18 = (Class120) this.aClass273_2.aClass233_41.method5669((long) this.anInt9031);
		if (local18 != null) {
			return local18;
		}
		local18 = Static647.method3070(this.aClass273_2.aClass97_114, this.anInt9031, 0);
		if (local18 != null) {
			this.aClass273_2.aClass233_41.method5662(local18, (long) this.anInt9031);
		}
		return local18;
	}
}
