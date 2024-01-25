import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class212 {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[Lclient!it;")
	public static final Class149[] aClass149Array1 = new Class149[5];

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public int anInt6050;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!h;")
	private final Class125 aClass125_46 = new Class125(64);

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!h;")
	public final Class125 aClass125_47 = new Class125(30);

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!an;")
	private final Class16 aClass16_80;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!an;")
	public final Class16 aClass16_79;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass149Array1.length; local4++) {
			aClass149Array1[local4] = new Class149();
		}
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;Lclient!an;)V")
	public Class212(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3) {
		this.aClass16_80 = arg2;
		this.aClass16_79 = arg3;
		@Pc(26) int local26 = this.aClass16_80.method407() - 1;
		this.aClass16_80.method399(local26);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void method5061() {
		@Pc(14) Class125 local14 = this.aClass125_46;
		synchronized (this.aClass125_46) {
			this.aClass125_46.method3442();
		}
		local14 = this.aClass125_47;
		synchronized (this.aClass125_47) {
			this.aClass125_47.method3442();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lclient!ce;")
	public Class50 method5063(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_46;
		@Pc(16) Class50 local16;
		synchronized (this.aClass125_46) {
			local16 = (Class50) this.aClass125_46.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_80;
		@Pc(42) byte[] local42;
		synchronized (this.aClass16_80) {
			local42 = this.aClass16_80.method408(Static496.method5621(arg0), Static330.method5269(arg0));
		}
		local16 = new Class50();
		local16.aClass212_1 = this;
		local16.anInt1443 = arg0;
		if (local42 != null) {
			local16.method1437(new Class12_Sub8(local42));
		}
		@Pc(76) Class125 local76 = this.aClass125_46;
		synchronized (this.aClass125_46) {
			this.aClass125_46.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public void method5065() {
		@Pc(2) Class125 local2 = this.aClass125_46;
		synchronized (this.aClass125_46) {
			this.aClass125_46.method3440();
		}
		local2 = this.aClass125_47;
		synchronized (this.aClass125_47) {
			this.aClass125_47.method3440();
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	public void method5066() {
		@Pc(2) Class125 local2 = this.aClass125_46;
		synchronized (this.aClass125_46) {
			this.aClass125_46.method3447(5);
		}
		local2 = this.aClass125_47;
		synchronized (this.aClass125_47) {
			this.aClass125_47.method3447(5);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V")
	public void method5067(@OriginalArg(1) int arg0) {
		this.anInt6050 = arg0;
		@Pc(14) Class125 local14 = this.aClass125_47;
		synchronized (this.aClass125_47) {
			this.aClass125_47.method3440();
		}
	}
}
