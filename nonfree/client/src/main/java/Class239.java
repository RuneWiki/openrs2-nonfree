import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class239 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!kh;")
	private final Class134 aClass134_51 = new Class134(64);

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!ul;")
	private final Class246 aClass246_204;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class239(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_204 = arg2;
		if (this.aClass246_204 != null) {
			this.aClass246_204.method5492(35);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method5340() {
		@Pc(2) Class134 local2 = this.aClass134_51;
		synchronized (this.aClass134_51) {
			this.aClass134_51.method3267();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public void method5341() {
		@Pc(2) Class134 local2 = this.aClass134_51;
		synchronized (this.aClass134_51) {
			this.aClass134_51.method3272();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!ds;")
	public Class56 method5342(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_51;
		@Pc(18) Class56 local18;
		synchronized (this.aClass134_51) {
			local18 = (Class56) this.aClass134_51.method3266((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class246 local31 = this.aClass246_204;
		@Pc(49) byte[] local49;
		synchronized (this.aClass246_204) {
			local49 = this.aClass246_204.method5477(35, arg0);
		}
		local18 = new Class56();
		if (local49 != null) {
			local18.method1570(new Class1_Sub5(local49));
		}
		local18.method1571();
		@Pc(74) Class134 local74 = this.aClass134_51;
		synchronized (this.aClass134_51) {
			this.aClass134_51.method3263((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
	public void method5343() {
		@Pc(12) Class134 local12 = this.aClass134_51;
		synchronized (this.aClass134_51) {
			this.aClass134_51.method3270(5);
		}
	}
}
