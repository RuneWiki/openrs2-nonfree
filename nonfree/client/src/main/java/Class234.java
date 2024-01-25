import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class234 {

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "Lclient!wq;")
	private final Class391 aClass391_32 = new Class391(64);

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lclient!la;")
	private final Class208 aClass208_85;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class234(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_85 = arg2;
		if (this.aClass208_85 != null) {
			this.aClass208_85.method5005(54);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
	public void method5394() {
		@Pc(6) Class391 local6 = this.aClass391_32;
		synchronized (this.aClass391_32) {
			this.aClass391_32.method9286();
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)Lclient!nba;")
	public Class245 method5395(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_32;
		@Pc(16) Class245 local16;
		synchronized (this.aClass391_32) {
			local16 = (Class245) this.aClass391_32.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) Class208 local39 = this.aClass208_85;
		@Pc(48) byte[] local48;
		synchronized (this.aClass208_85) {
			local48 = this.aClass208_85.method4991(54, arg0, -125);
		}
		local16 = new Class245();
		if (local48 != null) {
			local16.method5625(new Class5_Sub23(local48));
		}
		@Pc(72) Class391 local72 = this.aClass391_32;
		synchronized (this.aClass391_32) {
			this.aClass391_32.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
	public void method5398() {
		@Pc(14) Class391 local14 = this.aClass391_32;
		synchronized (this.aClass391_32) {
			this.aClass391_32.method9276(0);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZI)V")
	public void method5399() {
		@Pc(6) Class391 local6 = this.aClass391_32;
		synchronized (this.aClass391_32) {
			this.aClass391_32.method9274(5);
		}
	}
}
