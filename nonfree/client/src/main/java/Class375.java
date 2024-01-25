import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class375 {

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	public int anInt10172;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!gv;")
	public Class139 aClass139_4;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	public int anInt10173;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "Z")
	public boolean aBoolean754 = false;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!ha;Z)Lclient!kr;")
	public Class20 method8496(@OriginalArg(0) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(30) long local30 = (long) (arg1.anInt9444 << 19 | this.anInt10173 | arg0 << 16 | (arg2 ? 262144 : 0));
		@Pc(38) Class20 local38 = (Class20) this.aClass139_4.aClass233_21.method5669(local30);
		if (local38 != null) {
			return local38;
		} else if (this.aClass139_4.aClass97_55.method2564(this.anInt10173)) {
			@Pc(60) Class120 local60 = Static647.method3070(this.aClass139_4.aClass97_55, this.anInt10173, 0);
			if (local60 != null) {
				local60.anInt3709 = local60.anInt3708 = local60.anInt3706 = local60.anInt3705 = 0;
				if (arg2) {
					local60.method3076();
				}
				for (@Pc(80) int local80 = 0; local80 < arg0; local80++) {
					local60.method3065();
				}
			}
			local38 = arg1.method7969(local60, true);
			if (local38 != null) {
				this.aClass139_4.aClass233_21.method5662(local38, local30);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!ud;I)V")
	private void method8497(@OriginalArg(1) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10173 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt10172 = arg0.method6870();
		} else if (arg1 == 3) {
			this.aBoolean754 = true;
		} else if (arg1 == 4) {
			this.anInt10173 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Z")
	public boolean method8498() {
		return this.aClass139_4.aClass97_55.method2564(this.anInt10173);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLclient!ud;)V")
	public void method8500(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6904();
			if (local11 == 0) {
				return;
			}
			this.method8497(arg0, local11);
		}
	}
}
