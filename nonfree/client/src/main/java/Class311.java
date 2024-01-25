import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class311 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Lclient!rea;")
	private Class283 aClass283_1;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!om;")
	private final Class246 aClass246_228;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!om;")
	private final Class246 aClass246_229;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!om;Lclient!om;)V")
	public Class311(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1) {
		this.aClass246_228 = arg1;
		this.aClass246_229 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!kd;)Lclient!cca;")
	public Interface4 method6621(@OriginalArg(1) Interface14 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(19) Class260 local19 = arg0.method6943();
		if (local19 == Static501.aClass260_11) {
			return new Class317((Class21) arg0);
		} else if (local19 == Static347.aClass260_4) {
			return new Class365(this.method6623(), (Class218) arg0);
		} else if (Static543.aClass260_12 == local19) {
			return new Class50(this.aClass246_229, (Class91) arg0);
		} else if (local19 == Static395.aClass260_10) {
			return new Class50_Sub1(this.aClass246_229, (Class91_Sub1) arg0);
		} else if (Static360.aClass260_6 == local19) {
			return new Class222_Sub1(this.aClass246_229, this.aClass246_228, (Class94_Sub2) arg0);
		} else if (Static415.aClass260_13 == local19) {
			return new Class222_Sub3(this.aClass246_229, this.aClass246_228, (Class94_Sub3) arg0);
		} else if (local19 == Static595.aClass260_14) {
			return new Class222_Sub2(this.aClass246_229, this.aClass246_228, (Class94_Sub1) arg0);
		} else if (local19 == Static9.aClass260_1) {
			return new Class245(this.aClass246_229, this.aClass246_228, (Class322) arg0);
		} else if (Static351.aClass260_5 == local19) {
			return new Class159(this.aClass246_229, (Class120) arg0);
		} else if (Static78.aClass260_3 == local19) {
			return new Class222_Sub2_Sub1(this.aClass246_229, this.aClass246_228, (Class94_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)Lclient!rea;")
	private Class283 method6623() {
		if (this.aClass283_1 == null) {
			this.aClass283_1 = new Class283();
		}
		return this.aClass283_1;
	}
}
