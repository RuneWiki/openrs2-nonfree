import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class245 {

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Lclient!lga;")
	private final Class207 aClass207_38 = new Class207(64);

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "Lclient!lga;")
	private final Class207 aClass207_39 = new Class207(100);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "Lclient!sea;")
	private final Class308 aClass308_127;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;Lclient!sea;Lclient!sea;)V")
	public Class245(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) Class308 arg3, @OriginalArg(4) Class308 arg4) {
		this.aClass308_127 = arg2;
		if (this.aClass308_127 != null) {
			@Pc(26) int local26 = this.aClass308_127.method6564() - 1;
			this.aClass308_127.method6568(local26);
		}
		Static347.method5187(arg4, arg3);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)Lclient!ut;")
	public Class1_Sub8_Sub18 method5307(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_39;
		synchronized (this.aClass207_39) {
			@Pc(16) Class1_Sub8_Sub18 local16 = (Class1_Sub8_Sub18) this.aClass207_39.method4390((long) arg0);
			if (local16 == null) {
				local16 = new Class1_Sub8_Sub18(arg0);
				this.aClass207_39.method4391((long) arg0, local16);
			}
			return local16.method7358() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
	public void method5309() {
		@Pc(2) Class207 local2 = this.aClass207_38;
		synchronized (this.aClass207_38) {
			this.aClass207_38.method4392();
		}
		@Pc(29) Class207 local29 = this.aClass207_39;
		synchronized (this.aClass207_39) {
			this.aClass207_39.method4392();
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)V")
	public void method5310() {
		@Pc(2) Class207 local2 = this.aClass207_38;
		synchronized (this.aClass207_38) {
			this.aClass207_38.method4397(5);
		}
		local2 = this.aClass207_39;
		synchronized (this.aClass207_39) {
			this.aClass207_39.method4397(5);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	public void method5311() {
		@Pc(6) Class207 local6 = this.aClass207_38;
		synchronized (this.aClass207_38) {
			this.aClass207_38.method4398();
		}
		local6 = this.aClass207_39;
		synchronized (this.aClass207_39) {
			this.aClass207_39.method4398();
		}
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(II)Lclient!ks;")
	public Class197 method5312(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_38;
		@Pc(16) Class197 local16;
		synchronized (this.aClass207_38) {
			local16 = (Class197) this.aClass207_38.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_127;
		@Pc(42) byte[] local42;
		synchronized (this.aClass308_127) {
			local42 = this.aClass308_127.method6569(Static162.method2690(arg0), Static425.method6078(arg0));
		}
		local16 = new Class197();
		local16.anInt5070 = arg0;
		local16.aClass245_2 = this;
		if (local42 != null) {
			local16.method4039(new Class1_Sub3(local42));
		}
		local16.method4036();
		@Pc(81) Class207 local81 = this.aClass207_38;
		synchronized (this.aClass207_38) {
			this.aClass207_38.method4391((long) arg0, local16);
			return local16;
		}
	}
}
