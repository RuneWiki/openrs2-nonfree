import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class206 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!mo;")
	private Class160 aClass160_43 = new Class160(64);

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "Lclient!mo;")
	public Class160 aClass160_44 = new Class160(64);

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!nl;")
	private final Class171 aClass171_76;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "Lclient!nl;")
	public final Class171 aClass171_77;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;Lclient!nl;)V")
	public Class206(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_76 = arg2;
		this.aClass171_77 = arg3;
		this.aClass171_76.method3750(34);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method4412() {
		@Pc(2) Class160 local2 = this.aClass160_43;
		synchronized (this.aClass160_43) {
			this.aClass160_43.method3595();
		}
		local2 = this.aClass160_44;
		synchronized (this.aClass160_44) {
			this.aClass160_44.method3595();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!qe;")
	public Class199 method4414(@OriginalArg(1) int arg0) {
		@Pc(11) Class160 local11 = this.aClass160_43;
		@Pc(21) Class199 local21;
		synchronized (this.aClass160_43) {
			local21 = (Class199) this.aClass160_43.method3599((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass171_76.method3745(34, arg0);
		local21 = new Class199();
		local21.aClass206_89 = this;
		if (local38 != null) {
			local21.method4210(new Class2_Sub16(local38));
		}
		@Pc(57) Class160 local57 = this.aClass160_43;
		synchronized (this.aClass160_43) {
			this.aClass160_43.method3602((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
	public void method4417() {
		@Pc(2) Class160 local2 = this.aClass160_43;
		synchronized (this.aClass160_43) {
			this.aClass160_43.method3606(5);
		}
		local2 = this.aClass160_44;
		synchronized (this.aClass160_44) {
			this.aClass160_44.method3606(5);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZI)V")
	public void method4419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass160_43 = new Class160(arg0);
		this.aClass160_44 = new Class160(arg1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public void method4421() {
		@Pc(2) Class160 local2 = this.aClass160_43;
		synchronized (this.aClass160_43) {
			this.aClass160_43.method3605();
		}
		local2 = this.aClass160_44;
		synchronized (this.aClass160_44) {
			this.aClass160_44.method3605();
		}
	}
}
