import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class37 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!tl;")
	private final Class227 aClass227_4 = new Class227(256);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!ui;")
	private final Class230 aClass230_14;

	static {
		new Class169("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class37(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_14 = arg2;
		this.aClass230_14.method4956(26);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public void method629() {
		@Pc(6) Class227 local6 = this.aClass227_4;
		synchronized (this.aClass227_4) {
			this.aClass227_4.method4871();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public void method631() {
		@Pc(2) Class227 local2 = this.aClass227_4;
		synchronized (this.aClass227_4) {
			this.aClass227_4.method4858();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)V")
	public void method633() {
		@Pc(12) Class227 local12 = this.aClass227_4;
		synchronized (this.aClass227_4) {
			this.aClass227_4.method4859(5);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!ih;")
	public Class1_Sub6_Sub9 method634(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_4;
		@Pc(18) Class1_Sub6_Sub9 local18;
		synchronized (this.aClass227_4) {
			local18 = (Class1_Sub6_Sub9) this.aClass227_4.method4863((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass230_14.method4985(arg0, 26);
		local18 = new Class1_Sub6_Sub9();
		if (local35 != null) {
			local18.method2316(new Class1_Sub33(local35));
		}
		@Pc(51) Class227 local51 = this.aClass227_4;
		synchronized (this.aClass227_4) {
			this.aClass227_4.method4865(local18, (long) arg0);
			return local18;
		}
	}
}
