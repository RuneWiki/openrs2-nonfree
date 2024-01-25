import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class157 {

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "Lclient!wq;")
	private final Class391 aClass391_21 = new Class391(256);

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "Lclient!la;")
	private final Class208 aClass208_54;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class157(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_54 = arg2;
		this.aClass208_54.method5005(26);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V")
	public void method3085() {
		@Pc(16) Class391 local16 = this.aClass391_21;
		synchronized (this.aClass391_21) {
			this.aClass391_21.method9274(5);
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
	public void method3086(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_21;
		synchronized (this.aClass391_21) {
			this.aClass391_21.method9276(0);
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)Lclient!lu;")
	public Class5_Sub5_Sub16 method3087(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_21;
		@Pc(16) Class5_Sub5_Sub16 local16;
		synchronized (this.aClass391_21) {
			local16 = (Class5_Sub5_Sub16) this.aClass391_21.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_54;
		@Pc(45) byte[] local45;
		synchronized (this.aClass208_54) {
			local45 = this.aClass208_54.method4991(26, arg0, 83);
		}
		local16 = new Class5_Sub5_Sub16();
		if (local45 != null) {
			local16.method5293(new Class5_Sub23(local45));
		}
		@Pc(69) Class391 local69 = this.aClass391_21;
		synchronized (this.aClass391_21) {
			this.aClass391_21.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
	public void method3088() {
		@Pc(2) Class391 local2 = this.aClass391_21;
		synchronized (this.aClass391_21) {
			this.aClass391_21.method9286();
		}
	}
}
