import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class223 {

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Lclient!fc;")
	private Class77 aClass77_43 = new Class77(64);

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "Lclient!fc;")
	public Class77 aClass77_44 = new Class77(64);

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "Lclient!oi;")
	private final Class185 aClass185_91;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Lclient!oi;")
	public final Class185 aClass185_92;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;Lclient!oi;)V")
	public Class223(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) Class185 arg3) {
		this.aClass185_91 = arg2;
		this.aClass185_92 = arg3;
		this.aClass185_91.method4011(34);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public void method4703() {
		@Pc(2) Class77 local2 = this.aClass77_43;
		synchronized (this.aClass77_43) {
			this.aClass77_43.method1395();
		}
		local2 = this.aClass77_44;
		synchronized (this.aClass77_44) {
			this.aClass77_44.method1395();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)Lclient!vq;")
	public Class266 method4705(@OriginalArg(1) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_43;
		@Pc(16) Class266 local16;
		synchronized (this.aClass77_43) {
			local16 = (Class266) this.aClass77_43.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_91;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_91) {
			local38 = this.aClass185_91.method4002(34, arg0);
		}
		local16 = new Class266();
		local16.aClass223_4 = this;
		if (local38 != null) {
			local16.method5497(new Class1_Sub19(local38));
		}
		@Pc(63) Class77 local63 = this.aClass77_43;
		synchronized (this.aClass77_43) {
			this.aClass77_43.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	public void method4706() {
		@Pc(6) Class77 local6 = this.aClass77_43;
		synchronized (this.aClass77_43) {
			this.aClass77_43.method1394();
		}
		local6 = this.aClass77_44;
		synchronized (this.aClass77_44) {
			this.aClass77_44.method1394();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public void method4708() {
		@Pc(12) Class77 local12 = this.aClass77_43;
		synchronized (this.aClass77_43) {
			this.aClass77_43.method1386(5);
		}
		local12 = this.aClass77_44;
		synchronized (this.aClass77_44) {
			this.aClass77_44.method1386(5);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZII)V")
	public void method4709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass77_43 = new Class77(arg0);
		this.aClass77_44 = new Class77(arg1);
	}
}
