import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class329 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!hda;")
	public final Class143 aClass143_8 = new Class143();

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Z")
	public boolean aBoolean671 = false;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Z)V")
	public Class329(@OriginalArg(0) boolean arg0) {
		this.aBoolean671 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public void method7691() {
		while (true) {
			@Pc(13) Class11_Sub10 local13 = (Class11_Sub10) this.aClass143_8.method3534();
			if (local13 == null) {
				return;
			}
			local13.method8372();
			Static186.method3340(local13);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!vw;)V")
	public void method7693(@OriginalArg(1) Class11_Sub10 arg0) {
		@Pc(6) Class11_Sub1 local6 = arg0.aClass11_Sub1_3;
		@Pc(15) boolean local15 = true;
		@Pc(18) Class11_Sub7[] local18 = arg0.aClass11_Sub7Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			if (local18[local20].aBoolean391) {
				local15 = false;
				break;
			}
		}
		if (local15) {
			return;
		}
		@Pc(46) Class11_Sub10 local46;
		if (this.aBoolean671) {
			for (local46 = (Class11_Sub10) this.aClass143_8.method3536(); local46 != null; local46 = (Class11_Sub10) this.aClass143_8.method3528()) {
				if (local46.aClass11_Sub1_3 == local6) {
					local46.method8372();
					Static186.method3340(local46);
				}
			}
		}
		for (local46 = (Class11_Sub10) this.aClass143_8.method3536(); local46 != null; local46 = (Class11_Sub10) this.aClass143_8.method3528()) {
			if (local46.aClass11_Sub1_3.anInt9928 <= local6.anInt9928) {
				Static486.method6978(arg0, local46);
				return;
			}
		}
		this.aClass143_8.method3529(arg0);
	}
}
