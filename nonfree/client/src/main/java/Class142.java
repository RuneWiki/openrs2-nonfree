import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class142 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "Lclient!kh;")
	private final Class134 aClass134_32 = new Class134(16);

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Lclient!ul;")
	private final Class246 aClass246_119;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class142(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_119 = arg2;
		this.aClass246_119.method5492(30);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
	public void method3363() {
		@Pc(6) Class134 local6 = this.aClass134_32;
		synchronized (this.aClass134_32) {
			this.aClass134_32.method3272();
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V")
	public void method3364() {
		@Pc(6) Class134 local6 = this.aClass134_32;
		synchronized (this.aClass134_32) {
			this.aClass134_32.method3267();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IB)V")
	public void method3365() {
		@Pc(14) Class134 local14 = this.aClass134_32;
		synchronized (this.aClass134_32) {
			this.aClass134_32.method3270(5);
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(IB)Lclient!pe;")
	public Class189 method3367(@OriginalArg(0) int arg0) {
		@Pc(11) Class134 local11 = this.aClass134_32;
		@Pc(21) Class189 local21;
		synchronized (this.aClass134_32) {
			local21 = (Class189) this.aClass134_32.method3266((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class246 local34 = this.aClass246_119;
		@Pc(45) byte[] local45;
		synchronized (this.aClass246_119) {
			local45 = this.aClass246_119.method5477(30, arg0);
		}
		local21 = new Class189();
		if (local45 != null) {
			local21.method4325(new Class1_Sub5(local45));
		}
		@Pc(69) Class134 local69 = this.aClass134_32;
		synchronized (this.aClass134_32) {
			this.aClass134_32.method3263((long) arg0, local21);
			return local21;
		}
	}
}
