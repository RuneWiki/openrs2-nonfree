import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class163 {

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!lh;")
	private final Class151 aClass151_109 = new Class151(16);

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Lclient!hh;")
	private final Class109 aClass109_59;

	static {
		new Class96("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class163(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_59 = arg2;
		this.aClass109_59.method2322(30);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)Lclient!va;")
	public Class250 method3570(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_109;
		@Pc(16) Class250 local16;
		synchronized (this.aClass151_109) {
			local16 = (Class250) this.aClass151_109.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass109_59.method2349(30, arg0);
		local16 = new Class250();
		if (local33 != null) {
			local16.method5653(new Class1_Sub14(local33));
		}
		@Pc(54) Class151 local54 = this.aClass151_109;
		synchronized (this.aClass151_109) {
			this.aClass151_109.method3291((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(IB)V")
	public void method3571() {
		@Pc(2) Class151 local2 = this.aClass151_109;
		synchronized (this.aClass151_109) {
			this.aClass151_109.method3297(5);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public void method3572() {
		@Pc(12) Class151 local12 = this.aClass151_109;
		synchronized (this.aClass151_109) {
			this.aClass151_109.method3299();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public void method3573() {
		@Pc(6) Class151 local6 = this.aClass151_109;
		synchronized (this.aClass151_109) {
			this.aClass151_109.method3298();
		}
	}
}
