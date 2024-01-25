import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class340 {

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lclient!lga;")
	private final Class207 aClass207_57 = new Class207(64);

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "Lclient!sea;")
	private final Class308 aClass308_184;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class340(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_184 = arg2;
		this.aClass308_184.method6568(32);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)Lclient!gea;")
	public Class114 method7431(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_57;
		@Pc(16) Class114 local16;
		synchronized (this.aClass207_57) {
			local16 = (Class114) this.aClass207_57.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_184;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_184) {
			local38 = this.aClass308_184.method6569(32, arg0);
		}
		local16 = new Class114();
		if (local38 != null) {
			local16.method2602(new Class1_Sub3(local38));
		}
		@Pc(65) Class207 local65 = this.aClass207_57;
		synchronized (this.aClass207_57) {
			this.aClass207_57.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V")
	public void method7432() {
		@Pc(2) Class207 local2 = this.aClass207_57;
		synchronized (this.aClass207_57) {
			this.aClass207_57.method4392();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V")
	public void method7433() {
		@Pc(6) Class207 local6 = this.aClass207_57;
		synchronized (this.aClass207_57) {
			this.aClass207_57.method4397(5);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
	public void method7436() {
		@Pc(2) Class207 local2 = this.aClass207_57;
		synchronized (this.aClass207_57) {
			this.aClass207_57.method4398();
		}
	}
}
