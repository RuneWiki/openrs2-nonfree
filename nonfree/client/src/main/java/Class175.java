import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class175 {

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "Lclient!qj;")
	private final Class295 aClass295_18 = new Class295(64);

	@OriginalMember(owner = "client!jda", name = "l", descriptor = "Lclient!qj;")
	public final Class295 aClass295_19 = new Class295(2);

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "Lclient!uq;")
	public final Class362 aClass362_55;

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "Lclient!uq;")
	private final Class362 aClass362_56;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;Lclient!uq;)V")
	public Class175(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Class362 arg3) {
		this.aClass362_55 = arg3;
		this.aClass362_56 = arg2;
		this.aClass362_56.method8355(33);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V")
	public void method4023() {
		@Pc(2) Class295 local2 = this.aClass295_18;
		synchronized (this.aClass295_18) {
			this.aClass295_18.method6462(5);
		}
		local2 = this.aClass295_19;
		synchronized (this.aClass295_19) {
			this.aClass295_19.method6462(5);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
	public void method4024() {
		@Pc(2) Class295 local2 = this.aClass295_18;
		synchronized (this.aClass295_18) {
			this.aClass295_18.method6464();
		}
		local2 = this.aClass295_19;
		synchronized (this.aClass295_19) {
			this.aClass295_19.method6464();
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)Lclient!cia;")
	public Class56 method4026(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_18;
		@Pc(16) Class56 local16;
		synchronized (this.aClass295_18) {
			local16 = (Class56) this.aClass295_18.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_56;
		@Pc(40) byte[] local40;
		synchronized (this.aClass362_56) {
			local40 = this.aClass362_56.method8368(33, arg0);
		}
		local16 = new Class56();
		local16.aClass175_1 = this;
		if (local40 != null) {
			local16.method1317(new Class3_Sub4(local40));
		}
		@Pc(65) Class295 local65 = this.aClass295_18;
		synchronized (this.aClass295_18) {
			this.aClass295_18.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
	public void method4028() {
		@Pc(6) Class295 local6 = this.aClass295_18;
		synchronized (this.aClass295_18) {
			this.aClass295_18.method6474();
		}
		local6 = this.aClass295_19;
		synchronized (this.aClass295_19) {
			this.aClass295_19.method6474();
		}
	}
}
