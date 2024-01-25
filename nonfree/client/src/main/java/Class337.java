import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class337 {

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Lclient!vi;")
	private final Class332 aClass332_199 = new Class332(256);

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Lclient!pq;")
	private final Class251 aClass251_153;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class337(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_153 = arg2;
		this.aClass251_153.method5849(26);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	public void method7579() {
		@Pc(2) Class332 local2 = this.aClass332_199;
		synchronized (this.aClass332_199) {
			this.aClass332_199.method7510();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	public void method7580() {
		@Pc(8) Class332 local8 = this.aClass332_199;
		synchronized (this.aClass332_199) {
			this.aClass332_199.method7512();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lclient!wv;")
	public Class6_Sub1_Sub18 method7581(@OriginalArg(1) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_199;
		@Pc(16) Class6_Sub1_Sub18 local16;
		synchronized (this.aClass332_199) {
			local16 = (Class6_Sub1_Sub18) this.aClass332_199.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_153;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_153) {
			local38 = this.aClass251_153.method5860(26, arg0);
		}
		local16 = new Class6_Sub1_Sub18();
		if (local38 != null) {
			local16.method7861(new Class6_Sub14(local38));
		}
		@Pc(60) Class332 local60 = this.aClass332_199;
		synchronized (this.aClass332_199) {
			this.aClass332_199.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V")
	public void method7585() {
		@Pc(10) Class332 local10 = this.aClass332_199;
		synchronized (this.aClass332_199) {
			this.aClass332_199.method7497(5);
		}
	}
}
