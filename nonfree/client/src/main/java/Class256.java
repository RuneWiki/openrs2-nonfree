import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class256 {

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	public int anInt6761;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "Lclient!lga;")
	private final Class207 aClass207_41 = new Class207(64);

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!lga;")
	public final Class207 aClass207_42 = new Class207(60);

	@OriginalMember(owner = "client!om", name = "o", descriptor = "Lclient!sea;")
	private final Class308 aClass308_134;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Lclient!sea;")
	public final Class308 aClass308_133;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;Lclient!sea;)V")
	public Class256(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) Class308 arg3) {
		this.aClass308_134 = arg2;
		this.aClass308_133 = arg3;
		@Pc(26) int local26 = this.aClass308_134.method6564() - 1;
		this.aClass308_134.method6568(local26);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lclient!hga;")
	public Class134 method5466(@OriginalArg(0) int arg0) {
		@Pc(11) Class207 local11 = this.aClass207_41;
		@Pc(21) Class134 local21;
		synchronized (this.aClass207_41) {
			local21 = (Class134) this.aClass207_41.method4390((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class308 local34 = this.aClass308_134;
		@Pc(47) byte[] local47;
		synchronized (this.aClass308_134) {
			local47 = this.aClass308_134.method6569(Static277.method4021(arg0), Static29.method571(arg0));
		}
		local21 = new Class134();
		local21.anInt3770 = arg0;
		local21.aClass256_1 = this;
		if (local47 != null) {
			local21.method3063(new Class1_Sub3(local47));
		}
		@Pc(77) Class207 local77 = this.aClass207_41;
		synchronized (this.aClass207_41) {
			this.aClass207_41.method4391((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)V")
	public void method5467() {
		@Pc(6) Class207 local6 = this.aClass207_41;
		synchronized (this.aClass207_41) {
			this.aClass207_41.method4397(5);
		}
		local6 = this.aClass207_42;
		synchronized (this.aClass207_42) {
			this.aClass207_42.method4397(5);
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V")
	public void method5470(@OriginalArg(1) int arg0) {
		this.anInt6761 = arg0;
		@Pc(9) Class207 local9 = this.aClass207_42;
		synchronized (this.aClass207_42) {
			this.aClass207_42.method4392();
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public void method5472() {
		@Pc(2) Class207 local2 = this.aClass207_41;
		synchronized (this.aClass207_41) {
			this.aClass207_41.method4398();
		}
		local2 = this.aClass207_42;
		synchronized (this.aClass207_42) {
			this.aClass207_42.method4398();
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	public void method5473() {
		@Pc(6) Class207 local6 = this.aClass207_41;
		synchronized (this.aClass207_41) {
			this.aClass207_41.method4392();
		}
		local6 = this.aClass207_42;
		synchronized (this.aClass207_42) {
			this.aClass207_42.method4392();
		}
	}
}
