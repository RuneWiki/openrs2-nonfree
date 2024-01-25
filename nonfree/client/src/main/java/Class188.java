import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class188 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!mq;")
	private final Class223 aClass223_35 = new Class223(64);

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!jn;")
	private final Class176 aClass176_72;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class188(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_72 = arg2;
		this.aClass176_72.method3999(31);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)Lclient!gf;")
	public Class115 method4461(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_35;
		@Pc(16) Class115 local16;
		synchronized (this.aClass223_35) {
			local16 = (Class115) this.aClass223_35.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_72;
		@Pc(38) byte[] local38;
		synchronized (this.aClass176_72) {
			local38 = this.aClass176_72.method3994(arg0, 31);
		}
		local16 = new Class115();
		if (local38 != null) {
			local16.method2972(new Class4_Sub11(local38));
		}
		@Pc(68) Class223 local68 = this.aClass223_35;
		synchronized (this.aClass223_35) {
			this.aClass223_35.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public void method4462() {
		@Pc(6) Class223 local6 = this.aClass223_35;
		synchronized (this.aClass223_35) {
			this.aClass223_35.method5400();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)V")
	public void method4463() {
		@Pc(6) Class223 local6 = this.aClass223_35;
		synchronized (this.aClass223_35) {
			this.aClass223_35.method5399(5);
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public void method4465() {
		@Pc(6) Class223 local6 = this.aClass223_35;
		synchronized (this.aClass223_35) {
			this.aClass223_35.method5398();
		}
	}
}
