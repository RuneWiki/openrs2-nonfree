import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class196 {

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!mo;")
	private final Class160 aClass160_41 = new Class160(64);

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!nl;")
	public final Class171 aClass171_73;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!nl;")
	private final Class171 aClass171_72;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;Lclient!nl;)V")
	public Class196(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_73 = arg3;
		this.aClass171_72 = arg2;
		this.aClass171_72.method3750(3);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	public void method4165() {
		@Pc(6) Class160 local6 = this.aClass160_41;
		synchronized (this.aClass160_41) {
			this.aClass160_41.method3605();
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
	public void method4166() {
		@Pc(12) Class160 local12 = this.aClass160_41;
		synchronized (this.aClass160_41) {
			this.aClass160_41.method3595();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)Lclient!sl;")
	public Class217 method4167(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_41;
		@Pc(18) Class217 local18;
		synchronized (this.aClass160_41) {
			local18 = (Class217) this.aClass160_41.method3599((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass171_72.method3745(3, arg0);
		local18 = new Class217();
		local18.aClass196_2 = this;
		if (local35 != null) {
			local18.method4650(new Class2_Sub16(local35));
		}
		@Pc(54) Class160 local54 = this.aClass160_41;
		synchronized (this.aClass160_41) {
			this.aClass160_41.method3602((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)V")
	public void method4168() {
		@Pc(6) Class160 local6 = this.aClass160_41;
		synchronized (this.aClass160_41) {
			this.aClass160_41.method3606(5);
		}
	}
}
