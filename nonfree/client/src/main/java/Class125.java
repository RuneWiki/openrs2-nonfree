import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class125 {

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!fc;")
	private final Class77 aClass77_26 = new Class77(64);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Lclient!oi;")
	private final Class185 aClass185_52;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	public final int anInt3423;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class125(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_52 = arg2;
		this.anInt3423 = this.aClass185_52.method4011(19);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)Lclient!nw;")
	public Class178 method2687(@OriginalArg(1) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_26;
		@Pc(16) Class178 local16;
		synchronized (this.aClass77_26) {
			local16 = (Class178) this.aClass77_26.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_52;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_52) {
			local38 = this.aClass185_52.method4002(19, arg0);
		}
		local16 = new Class178();
		if (local38 != null) {
			local16.method3895(new Class1_Sub19(local38));
		}
		@Pc(60) Class77 local60 = this.aClass77_26;
		synchronized (this.aClass77_26) {
			this.aClass77_26.method1396(local16, (long) arg0);
			return local16;
		}
	}
}
