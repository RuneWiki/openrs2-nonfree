import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class303 {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!nga;")
	private final Class233 aClass233_49 = new Class233(64);

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!nga;")
	private final Class233 aClass233_50 = new Class233(100);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!eq;")
	private final Class97 aClass97_129;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;Lclient!eq;Lclient!eq;)V")
	public Class303(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(4) Class97 arg4) {
		this.aClass97_129 = arg2;
		if (this.aClass97_129 != null) {
			@Pc(26) int local26 = this.aClass97_129.method2546() - 1;
			this.aClass97_129.method2569(local26);
		}
		Static489.method6999(arg3, arg4);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lclient!hn;")
	public Class149 method7201(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_49;
		@Pc(16) Class149 local16;
		synchronized (this.aClass233_49) {
			local16 = (Class149) this.aClass233_49.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_129;
		@Pc(42) byte[] local42;
		synchronized (this.aClass97_129) {
			local42 = this.aClass97_129.method2545(Static86.method1554(arg0), Static409.method6284(arg0));
		}
		local16 = new Class149();
		local16.anInt4520 = arg0;
		local16.aClass303_2 = this;
		if (local42 != null) {
			local16.method3738(new Class2_Sub34(local42));
		}
		local16.method3736();
		@Pc(75) Class233 local75 = this.aClass233_49;
		synchronized (this.aClass233_49) {
			this.aClass233_49.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public void method7203() {
		@Pc(2) Class233 local2 = this.aClass233_49;
		synchronized (this.aClass233_49) {
			this.aClass233_49.method5663();
		}
		local2 = this.aClass233_50;
		synchronized (this.aClass233_50) {
			this.aClass233_50.method5663();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
	public void method7204() {
		@Pc(14) Class233 local14 = this.aClass233_49;
		synchronized (this.aClass233_49) {
			this.aClass233_49.method5664(5);
		}
		local14 = this.aClass233_50;
		synchronized (this.aClass233_50) {
			this.aClass233_50.method5664(5);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public void method7205() {
		@Pc(2) Class233 local2 = this.aClass233_49;
		synchronized (this.aClass233_49) {
			this.aClass233_49.method5665();
		}
		local2 = this.aClass233_50;
		synchronized (this.aClass233_50) {
			this.aClass233_50.method5665();
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)Lclient!eca;")
	public Class2_Sub5_Sub5 method7206(@OriginalArg(0) int arg0) {
		@Pc(14) Class233 local14 = this.aClass233_50;
		synchronized (this.aClass233_50) {
			@Pc(24) Class2_Sub5_Sub5 local24 = (Class2_Sub5_Sub5) this.aClass233_50.method5669((long) arg0);
			if (local24 == null) {
				local24 = new Class2_Sub5_Sub5(arg0);
				this.aClass233_50.method5662(local24, (long) arg0);
			}
			return local24.method1833() ? local24 : null;
		}
	}
}
