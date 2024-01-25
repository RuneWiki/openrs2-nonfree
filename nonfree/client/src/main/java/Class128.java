import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class128 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!nj;")
	private final Class171 aClass171_28 = new Class171(64);

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!mg;")
	private final Class160 aClass160_31;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public final int anInt3521;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class128(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_31 = arg2;
		this.anInt3521 = this.aClass160_31.method3722(19);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Lclient!ob;")
	public Class177 method2886(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_28;
		@Pc(22) Class177 local22;
		synchronized (this.aClass171_28) {
			local22 = (Class177) this.aClass171_28.method3941((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass160_31.method3696(arg0, 19);
		local22 = new Class177();
		if (local39 != null) {
			local22.method4063(new Class2_Sub23(local39));
		}
		@Pc(55) Class171 local55 = this.aClass171_28;
		synchronized (this.aClass171_28) {
			this.aClass171_28.method3940((long) arg0, local22);
			return local22;
		}
	}
}
