import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class357 {

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Lclient!wfa;")
	private Class3_Sub4 aClass3_Sub4_63 = new Class3_Sub4();

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!ak;")
	private final Class15 aClass15_14 = new Class15();

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
	private final int anInt9795;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	private int anInt9797;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "Lclient!qp;")
	private final Class280 aClass280_46;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V")
	public Class357(@OriginalArg(0) int arg0) {
		this.anInt9795 = arg0;
		this.anInt9797 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass280_46 = new Class280(local19);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public void method8389() {
		this.aClass15_14.method903();
		this.aClass280_46.method7100();
		this.aClass3_Sub4_63 = new Class3_Sub4();
		this.anInt9797 = this.anInt9795;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(JB)Lclient!wfa;")
	public Class3_Sub4 method8390(@OriginalArg(0) long arg0) {
		@Pc(18) Class3_Sub4 local18 = (Class3_Sub4) this.aClass280_46.method7107(arg0);
		if (local18 != null) {
			this.aClass15_14.method901(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(JLclient!wfa;B)V")
	public void method8392(@OriginalArg(0) long arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (this.anInt9797 == 0) {
			@Pc(22) Class3_Sub4 local22 = this.aClass15_14.method902();
			local22.method8769();
			local22.method8732();
			if (local22 == this.aClass3_Sub4_63) {
				local22 = this.aClass15_14.method902();
				local22.method8769();
				local22.method8732();
			}
		} else {
			this.anInt9797--;
		}
		this.aClass280_46.method7109(arg1, arg0);
		this.aClass15_14.method901(arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(JI)V")
	public void method8394(@OriginalArg(0) long arg0) {
		@Pc(14) Class3_Sub4 local14 = (Class3_Sub4) this.aClass280_46.method7107(arg0);
		if (local14 != null) {
			local14.method8769();
			local14.method8732();
			this.anInt9797++;
		}
	}
}
