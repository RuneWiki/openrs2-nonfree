import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class242 {

	@OriginalMember(owner = "client!np", name = "u", descriptor = "I")
	public int anInt6507;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "Lclient!lga;")
	private final Class207 aClass207_35 = new Class207(64);

	@OriginalMember(owner = "client!np", name = "s", descriptor = "Lclient!lga;")
	public final Class207 aClass207_36 = new Class207(50);

	@OriginalMember(owner = "client!np", name = "t", descriptor = "Lclient!lga;")
	public final Class207 aClass207_37 = new Class207(5);

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Lclient!ci;")
	public final Class42 aClass42_3;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "Z")
	public boolean aBoolean506;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Lclient!sea;")
	private final Class308 aClass308_124;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Lclient!sea;")
	public final Class308 aClass308_125;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!ci;IZLclient!sea;Lclient!sea;)V")
	public Class242(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class308 arg3, @OriginalArg(4) Class308 arg4) {
		this.aClass42_3 = arg0;
		this.aBoolean506 = arg2;
		this.aClass308_124 = arg3;
		this.aClass308_125 = arg4;
		if (this.aClass308_124 != null) {
			@Pc(41) int local41 = this.aClass308_124.method6564() - 1;
			this.aClass308_124.method6568(local41);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public void method5274() {
		@Pc(2) Class207 local2 = this.aClass207_36;
		synchronized (this.aClass207_36) {
			this.aClass207_36.method4392();
		}
		local2 = this.aClass207_37;
		synchronized (this.aClass207_37) {
			this.aClass207_37.method4392();
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
	public void method5275() {
		@Pc(2) Class207 local2 = this.aClass207_35;
		synchronized (this.aClass207_35) {
			this.aClass207_35.method4398();
		}
		local2 = this.aClass207_36;
		synchronized (this.aClass207_36) {
			this.aClass207_36.method4398();
		}
		local2 = this.aClass207_37;
		synchronized (this.aClass207_37) {
			this.aClass207_37.method4398();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public void method5276(@OriginalArg(0) int arg0) {
		this.anInt6507 = arg0;
		@Pc(9) Class207 local9 = this.aClass207_36;
		synchronized (this.aClass207_36) {
			this.aClass207_36.method4392();
		}
		local9 = this.aClass207_37;
		synchronized (this.aClass207_37) {
			this.aClass207_37.method4392();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZB)V")
	public void method5279(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean506) {
			this.aBoolean506 = arg0;
			this.method5282();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V")
	public void method5280() {
		@Pc(2) Class207 local2 = this.aClass207_35;
		synchronized (this.aClass207_35) {
			this.aClass207_35.method4397(5);
		}
		local2 = this.aClass207_36;
		synchronized (this.aClass207_36) {
			this.aClass207_36.method4397(5);
		}
		local2 = this.aClass207_37;
		synchronized (this.aClass207_37) {
			this.aClass207_37.method4397(5);
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(II)Lclient!wa;")
	public Class354 method5281(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_35;
		@Pc(16) Class354 local16;
		synchronized (this.aClass207_35) {
			local16 = (Class354) this.aClass207_35.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_124;
		@Pc(44) byte[] local44;
		synchronized (this.aClass308_124) {
			local44 = this.aClass308_124.method6569(Static568.method7218(arg0), Static313.method4657(arg0));
		}
		local16 = new Class354();
		local16.anInt9402 = arg0;
		local16.aClass242_2 = this;
		if (local44 != null) {
			local16.method7673(new Class1_Sub3(local44));
		}
		local16.method7675();
		@Pc(82) Class207 local82 = this.aClass207_35;
		synchronized (this.aClass207_35) {
			this.aClass207_35.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method5282() {
		@Pc(8) Class207 local8 = this.aClass207_35;
		synchronized (this.aClass207_35) {
			this.aClass207_35.method4392();
		}
		local8 = this.aClass207_36;
		synchronized (this.aClass207_36) {
			this.aClass207_36.method4392();
		}
		local8 = this.aClass207_37;
		synchronized (this.aClass207_37) {
			this.aClass207_37.method4392();
		}
	}
}
