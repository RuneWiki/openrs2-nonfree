import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class149 {

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "Lclient!mo;")
	private final Class160 aClass160_31 = new Class160(256);

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!nl;")
	private final Class171 aClass171_49;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class149(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_49 = arg2;
		this.aClass171_49.method3750(26);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public void method3330() {
		@Pc(11) Class160 local11 = this.aClass160_31;
		synchronized (this.aClass160_31) {
			this.aClass160_31.method3595();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)V")
	public void method3331() {
		@Pc(2) Class160 local2 = this.aClass160_31;
		synchronized (this.aClass160_31) {
			this.aClass160_31.method3606(5);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public void method3333() {
		@Pc(6) Class160 local6 = this.aClass160_31;
		synchronized (this.aClass160_31) {
			this.aClass160_31.method3605();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Lclient!sh;")
	public Class2_Sub10_Sub15 method3334(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_31;
		@Pc(18) Class2_Sub10_Sub15 local18;
		synchronized (this.aClass160_31) {
			local18 = (Class2_Sub10_Sub15) this.aClass160_31.method3599((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(37) byte[] local37 = this.aClass171_49.method3745(26, arg0);
		local18 = new Class2_Sub10_Sub15();
		if (local37 != null) {
			local18.method4584(new Class2_Sub16(local37));
		}
		@Pc(53) Class160 local53 = this.aClass160_31;
		synchronized (this.aClass160_31) {
			this.aClass160_31.method3602((long) arg0, local18);
			return local18;
		}
	}
}
