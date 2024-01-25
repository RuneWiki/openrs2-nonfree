import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class59 {

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "Lclient!qj;")
	private final Class295 aClass295_4 = new Class295(128);

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "Lclient!uq;")
	private final Class362 aClass362_17;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class59(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_17 = arg2;
		this.aClass362_17.method8355(1);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public void method1323() {
		@Pc(6) Class295 local6 = this.aClass295_4;
		synchronized (this.aClass295_4) {
			this.aClass295_4.method6474();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	public void method1324() {
		@Pc(6) Class295 local6 = this.aClass295_4;
		synchronized (this.aClass295_4) {
			this.aClass295_4.method6462(5);
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
	public void method1326() {
		@Pc(11) Class295 local11 = this.aClass295_4;
		synchronized (this.aClass295_4) {
			this.aClass295_4.method6464();
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)Lclient!co;")
	public Class63 method1328(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_4;
		@Pc(16) Class63 local16;
		synchronized (this.aClass295_4) {
			local16 = (Class63) this.aClass295_4.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_17;
		@Pc(47) byte[] local47;
		synchronized (this.aClass362_17) {
			local47 = this.aClass362_17.method8368(1, arg0);
		}
		local16 = new Class63();
		if (local47 != null) {
			local16.method1495(new Class3_Sub4(local47));
		}
		@Pc(69) Class295 local69 = this.aClass295_4;
		synchronized (this.aClass295_4) {
			this.aClass295_4.method6469((long) arg0, local16);
			return local16;
		}
	}
}
