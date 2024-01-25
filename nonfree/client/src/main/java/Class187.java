import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class187 {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!fba;")
	private Class102 aClass102_32 = new Class102(64);

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "Lclient!la;")
	private final Class196 aClass196_54;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class187(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_54 = arg2;
		if (this.aClass196_54 != null) {
			@Pc(20) int local20 = this.aClass196_54.method5125() - 1;
			this.aClass196_54.method5118(local20);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V")
	public void method4658(@OriginalArg(0) int arg0) {
		@Pc(2) Class102 local2 = this.aClass102_32;
		synchronized (this.aClass102_32) {
			this.aClass102_32.method2681();
			this.aClass102_32 = new Class102(arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public void method4659() {
		@Pc(13) Class102 local13 = this.aClass102_32;
		synchronized (this.aClass102_32) {
			this.aClass102_32.method2680();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lclient!jo;")
	public Class176 method4661(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_32;
		@Pc(16) Class176 local16;
		synchronized (this.aClass102_32) {
			local16 = (Class176) this.aClass102_32.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_54;
		@Pc(42) byte[] local42;
		synchronized (this.aClass196_54) {
			local42 = this.aClass196_54.method5102(Static625.method8737(arg0), Static588.method8283(arg0));
		}
		local16 = new Class176();
		if (local42 != null) {
			local16.method4468(new Class3_Sub3(local42));
		}
		@Pc(69) Class102 local69 = this.aClass102_32;
		synchronized (this.aClass102_32) {
			this.aClass102_32.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)V")
	public void method4662() {
		@Pc(8) Class102 local8 = this.aClass102_32;
		synchronized (this.aClass102_32) {
			this.aClass102_32.method2668(5);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	public void method4663() {
		@Pc(11) Class102 local11 = this.aClass102_32;
		synchronized (this.aClass102_32) {
			this.aClass102_32.method2681();
		}
	}
}
