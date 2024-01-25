import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class75 {

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Lclient!kh;")
	private final Class134 aClass134_16 = new Class134(64);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!ul;")
	private final Class246 aClass246_67;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class75(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_67 = arg2;
		this.aClass246_67.method5492(32);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public void method1986() {
		@Pc(10) Class134 local10 = this.aClass134_16;
		synchronized (this.aClass134_16) {
			this.aClass134_16.method3272();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public void method1987() {
		@Pc(8) Class134 local8 = this.aClass134_16;
		synchronized (this.aClass134_16) {
			this.aClass134_16.method3267();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Lclient!bf;")
	public Class21 method1988(@OriginalArg(0) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_16;
		@Pc(16) Class21 local16;
		synchronized (this.aClass134_16) {
			local16 = (Class21) this.aClass134_16.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_67;
		@Pc(40) byte[] local40;
		synchronized (this.aClass246_67) {
			local40 = this.aClass246_67.method5477(32, arg0);
		}
		local16 = new Class21();
		if (local40 != null) {
			local16.method572(new Class1_Sub5(local40));
		}
		@Pc(62) Class134 local62 = this.aClass134_16;
		synchronized (this.aClass134_16) {
			this.aClass134_16.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	public void method1991() {
		@Pc(6) Class134 local6 = this.aClass134_16;
		synchronized (this.aClass134_16) {
			this.aClass134_16.method3270(5);
		}
	}
}
