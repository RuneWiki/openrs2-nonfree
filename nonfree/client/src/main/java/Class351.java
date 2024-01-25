import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class351 {

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "Lclient!lga;")
	private final Class207 aClass207_59 = new Class207(64);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "Lclient!sea;")
	private final Class308 aClass308_186;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class351(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_186 = arg2;
		this.aClass308_186.method6568(31);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public void method7553() {
		@Pc(2) Class207 local2 = this.aClass207_59;
		synchronized (this.aClass207_59) {
			this.aClass207_59.method4398();
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
	public void method7558() {
		@Pc(6) Class207 local6 = this.aClass207_59;
		synchronized (this.aClass207_59) {
			this.aClass207_59.method4392();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI)Lclient!ul;")
	public Class336 method7559(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_59;
		@Pc(16) Class336 local16;
		synchronized (this.aClass207_59) {
			local16 = (Class336) this.aClass207_59.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class308 local34 = this.aClass308_186;
		@Pc(43) byte[] local43;
		synchronized (this.aClass308_186) {
			local43 = this.aClass308_186.method6569(31, arg0);
		}
		local16 = new Class336();
		if (local43 != null) {
			local16.method7294(new Class1_Sub3(local43));
		}
		@Pc(65) Class207 local65 = this.aClass207_59;
		synchronized (this.aClass207_59) {
			this.aClass207_59.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public void method7560() {
		@Pc(6) Class207 local6 = this.aClass207_59;
		synchronized (this.aClass207_59) {
			this.aClass207_59.method4397(5);
		}
	}
}
