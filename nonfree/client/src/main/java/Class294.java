import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class294 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Lclient!vi;")
	private final Class332 aClass332_178 = new Class332(64);

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "Lclient!pq;")
	private final Class251 aClass251_131;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class294(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_131 = arg2;
		this.aClass251_131.method5849(31);
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
	public void method6539() {
		@Pc(6) Class332 local6 = this.aClass332_178;
		synchronized (this.aClass332_178) {
			this.aClass332_178.method7510();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public void method6540() {
		@Pc(2) Class332 local2 = this.aClass332_178;
		synchronized (this.aClass332_178) {
			this.aClass332_178.method7512();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lclient!kaa;")
	public Class167 method6542(@OriginalArg(1) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_178;
		@Pc(16) Class167 local16;
		synchronized (this.aClass332_178) {
			local16 = (Class167) this.aClass332_178.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_131;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_131) {
			local38 = this.aClass251_131.method5860(31, arg0);
		}
		local16 = new Class167();
		if (local38 != null) {
			local16.method3551(new Class6_Sub14(local38));
		}
		@Pc(60) Class332 local60 = this.aClass332_178;
		synchronized (this.aClass332_178) {
			this.aClass332_178.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)V")
	public void method6544() {
		@Pc(11) Class332 local11 = this.aClass332_178;
		synchronized (this.aClass332_178) {
			this.aClass332_178.method7497(5);
		}
	}
}
