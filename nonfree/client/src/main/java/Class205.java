import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class205 {

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!kh;")
	private final Class134 aClass134_45 = new Class134(128);

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!ul;")
	private final Class246 aClass246_181;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class205(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_181 = arg2;
		this.aClass246_181.method5492(1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public void method4752() {
		@Pc(6) Class134 local6 = this.aClass134_45;
		synchronized (this.aClass134_45) {
			this.aClass134_45.method3272();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public void method4754() {
		@Pc(5) Class134 local5 = this.aClass134_45;
		synchronized (this.aClass134_45) {
			this.aClass134_45.method3267();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)V")
	public void method4755() {
		@Pc(2) Class134 local2 = this.aClass134_45;
		synchronized (this.aClass134_45) {
			this.aClass134_45.method3270(5);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lclient!sd;")
	public Class220 method4757(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_45;
		@Pc(16) Class220 local16;
		synchronized (this.aClass134_45) {
			local16 = (Class220) this.aClass134_45.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_181;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_181) {
			local38 = this.aClass246_181.method5477(1, arg0);
		}
		local16 = new Class220();
		if (local38 != null) {
			local16.method4971(new Class1_Sub5(local38));
		}
		@Pc(60) Class134 local60 = this.aClass134_45;
		synchronized (this.aClass134_45) {
			this.aClass134_45.method3263((long) arg0, local16);
			return local16;
		}
	}
}
