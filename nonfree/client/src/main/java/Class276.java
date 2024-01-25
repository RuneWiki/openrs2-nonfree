import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class276 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!vi;")
	private Class332 aClass332_172 = new Class332(128);

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "Lclient!vi;")
	public Class332 aClass332_173 = new Class332(64);

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!pq;")
	private final Class251 aClass251_125;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "Lclient!pq;")
	public final Class251 aClass251_126;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;Lclient!pq;)V")
	public Class276(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_125 = arg2;
		this.aClass251_126 = arg3;
		this.aClass251_125.method5849(36);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	public void method6394() {
		@Pc(2) Class332 local2 = this.aClass332_172;
		synchronized (this.aClass332_172) {
			this.aClass332_172.method7497(5);
		}
		local2 = this.aClass332_173;
		synchronized (this.aClass332_173) {
			this.aClass332_173.method7497(5);
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public void method6395() {
		@Pc(6) Class332 local6 = this.aClass332_172;
		synchronized (this.aClass332_172) {
			this.aClass332_172.method7512();
		}
		local6 = this.aClass332_173;
		synchronized (this.aClass332_173) {
			this.aClass332_173.method7512();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)Lclient!lb;")
	public Class179 method6396(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_172;
		@Pc(16) Class179 local16;
		synchronized (this.aClass332_172) {
			local16 = (Class179) this.aClass332_172.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_125;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_125) {
			local38 = this.aClass251_125.method5860(36, arg0);
		}
		local16 = new Class179();
		local16.anInt4576 = arg0;
		local16.aClass276_1 = this;
		if (local38 != null) {
			local16.method3965(new Class6_Sub14(local38));
		}
		local16.method3967();
		@Pc(74) Class332 local74 = this.aClass332_172;
		synchronized (this.aClass332_172) {
			this.aClass332_172.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)V")
	public void method6397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass332_172 = new Class332(arg0);
		this.aClass332_173 = new Class332(arg1);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
	public void method6399() {
		@Pc(2) Class332 local2 = this.aClass332_172;
		synchronized (this.aClass332_172) {
			this.aClass332_172.method7510();
		}
		local2 = this.aClass332_173;
		synchronized (this.aClass332_173) {
			this.aClass332_173.method7510();
		}
	}
}
