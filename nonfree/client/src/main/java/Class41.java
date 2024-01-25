import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class41 {

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Lclient!h;")
	private final Class125 aClass125_5 = new Class125(64);

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "Lclient!h;")
	private final Class125 aClass125_6 = new Class125(100);

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "Lclient!an;")
	private final Class16 aClass16_6;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;Lclient!an;Lclient!an;)V")
	public Class41(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) Class16 arg4) {
		this.aClass16_6 = arg2;
		if (this.aClass16_6 != null) {
			@Pc(26) int local26 = this.aClass16_6.method407() - 1;
			this.aClass16_6.method399(local26);
		}
		Static336.method5382(arg3, arg4);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IZ)V")
	public void method908() {
		@Pc(2) Class125 local2 = this.aClass125_5;
		synchronized (this.aClass125_5) {
			this.aClass125_5.method3447(5);
		}
		local2 = this.aClass125_6;
		synchronized (this.aClass125_6) {
			this.aClass125_6.method3447(5);
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(IZ)Lclient!nv;")
	public Class12_Sub4_Sub13 method910(@OriginalArg(0) int arg0) {
		@Pc(11) Class125 local11 = this.aClass125_6;
		@Pc(21) Class12_Sub4_Sub13 local21;
		synchronized (this.aClass125_6) {
			local21 = (Class12_Sub4_Sub13) this.aClass125_6.method3446((long) arg0);
			if (local21 == null) {
				local21 = new Class12_Sub4_Sub13(arg0);
				this.aClass125_6.method3437(local21, (long) arg0);
			}
		}
		synchronized (local21) {
			return local21.method5405() ? local21 : null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)Lclient!dba;")
	public Class64 method911(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_5;
		@Pc(16) Class64 local16;
		synchronized (this.aClass125_5) {
			local16 = (Class64) this.aClass125_5.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class16 local37 = this.aClass16_6;
		@Pc(52) byte[] local52;
		synchronized (this.aClass16_6) {
			local52 = this.aClass16_6.method408(Static93.method2000(arg0), Static502.method7461(arg0));
		}
		local16 = new Class64();
		local16.aClass41_2 = this;
		local16.anInt1971 = arg0;
		if (local52 != null) {
			local16.method1827(new Class12_Sub8(local52));
		}
		local16.method1832();
		@Pc(85) Class125 local85 = this.aClass125_5;
		synchronized (this.aClass125_5) {
			this.aClass125_5.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
	public void method912() {
		@Pc(2) Class125 local2 = this.aClass125_5;
		synchronized (this.aClass125_5) {
			this.aClass125_5.method3442();
		}
		local2 = this.aClass125_6;
		synchronized (this.aClass125_6) {
			this.aClass125_6.method3442();
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
	public void method913() {
		@Pc(2) Class125 local2 = this.aClass125_5;
		synchronized (this.aClass125_5) {
			this.aClass125_5.method3440();
		}
		local2 = this.aClass125_6;
		synchronized (this.aClass125_6) {
			this.aClass125_6.method3440();
		}
	}
}
