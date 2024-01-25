import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class300 {

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "Lclient!hc;")
	private Class4_Sub5 aClass4_Sub5_50 = new Class4_Sub5();

	@OriginalMember(owner = "client!qda", name = "n", descriptor = "Lclient!ut;")
	private final Class367 aClass367_10 = new Class367();

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
	private final int anInt7597;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
	private int anInt7598;

	@OriginalMember(owner = "client!qda", name = "m", descriptor = "Lclient!dj;")
	private final Class66 aClass66_35;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V")
	public Class300(@OriginalArg(0) int arg0) {
		this.anInt7597 = arg0;
		this.anInt7598 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass66_35 = new Class66(local19);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(JLclient!hc;Z)V")
	public void method6600(@OriginalArg(0) long arg0, @OriginalArg(1) Class4_Sub5 arg1) {
		if (this.anInt7598 == 0) {
			@Pc(18) Class4_Sub5 local18 = this.aClass367_10.method8311();
			local18.method9000();
			local18.method8990();
			if (local18 == this.aClass4_Sub5_50) {
				local18 = this.aClass367_10.method8311();
				local18.method9000();
				local18.method8990();
			}
		} else {
			this.anInt7598--;
		}
		this.aClass66_35.method1985(arg1, arg0);
		this.aClass367_10.method8310(arg1);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZJ)V")
	public void method6601(@OriginalArg(1) long arg0) {
		@Pc(10) Class4_Sub5 local10 = (Class4_Sub5) this.aClass66_35.method1994(arg0);
		if (local10 != null) {
			local10.method9000();
			local10.method8990();
			this.anInt7598++;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(JI)Lclient!hc;")
	public Class4_Sub5 method6604(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub5 local10 = (Class4_Sub5) this.aClass66_35.method1994(arg0);
		if (local10 != null) {
			this.aClass367_10.method8310(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
	public void method6605() {
		this.aClass367_10.method8305();
		this.aClass66_35.method1988();
		this.aClass4_Sub5_50 = new Class4_Sub5();
		this.anInt7598 = this.anInt7597;
	}
}
