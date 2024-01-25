import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class370 {

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!rba;")
	private Class5_Sub1 aClass5_Sub1_63 = new Class5_Sub1();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!wca;")
	private final Class388 aClass388_15 = new Class388();

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	private int anInt9985;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	private final int anInt9986;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!qr;")
	private final Class306 aClass306_45;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
	public Class370(@OriginalArg(0) int arg0) {
		this.anInt9985 = arg0;
		this.anInt9986 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass306_45 = new Class306(local19);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IJ)Lclient!rba;")
	public Class5_Sub1 method8484(@OriginalArg(1) long arg0) {
		@Pc(18) Class5_Sub1 local18 = (Class5_Sub1) this.aClass306_45.method6943(arg0);
		if (local18 != null) {
			this.aClass388_15.method9022(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!rba;J)V")
	public void method8485(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt9985 == 0) {
			@Pc(32) Class5_Sub1 local32 = this.aClass388_15.method9029();
			local32.method9222();
			local32.method8955();
			if (local32 == this.aClass5_Sub1_63) {
				local32 = this.aClass388_15.method9029();
				local32.method9222();
				local32.method8955();
			}
		} else {
			this.anInt9985--;
		}
		this.aClass306_45.method6944(arg0, arg1, -12002);
		this.aClass388_15.method9022(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public void method8486() {
		this.aClass388_15.method9021();
		this.aClass306_45.method6936();
		this.aClass5_Sub1_63 = new Class5_Sub1();
		this.anInt9985 = this.anInt9986;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BJ)V")
	public void method8487(@OriginalArg(1) long arg0) {
		@Pc(18) Class5_Sub1 local18 = (Class5_Sub1) this.aClass306_45.method6943(arg0);
		if (local18 != null) {
			local18.method9222();
			local18.method8955();
			this.anInt9985++;
		}
	}
}
