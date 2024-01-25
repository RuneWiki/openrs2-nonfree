import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "o", descriptor = "Lclient!eda;")
	private final Class87 aClass87_1 = new Class87(256);

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "Lclient!la;")
	private final Class207 aClass207_1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class2(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_1 = arg2;
		this.aClass207_1.method4672(26);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	public void method21() {
		@Pc(2) Class87 local2 = this.aClass87_1;
		synchronized (this.aClass87_1) {
			this.aClass87_1.method1801();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
	public void method25() {
		@Pc(6) Class87 local6 = this.aClass87_1;
		synchronized (this.aClass87_1) {
			this.aClass87_1.method1796();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)Lclient!er;")
	public Class5_Sub5_Sub6 method26(@OriginalArg(0) int arg0) {
		@Pc(12) Class87 local12 = this.aClass87_1;
		@Pc(22) Class5_Sub5_Sub6 local22;
		synchronized (this.aClass87_1) {
			local22 = (Class5_Sub5_Sub6) this.aClass87_1.method1805((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class207 local35 = this.aClass207_1;
		@Pc(44) byte[] local44;
		synchronized (this.aClass207_1) {
			local44 = this.aClass207_1.method4681(26, arg0);
		}
		local22 = new Class5_Sub5_Sub6();
		if (local44 != null) {
			local22.method2003(new Class5_Sub22(local44));
		}
		@Pc(66) Class87 local66 = this.aClass87_1;
		synchronized (this.aClass87_1) {
			this.aClass87_1.method1792((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)V")
	public void method28() {
		@Pc(2) Class87 local2 = this.aClass87_1;
		synchronized (this.aClass87_1) {
			this.aClass87_1.method1793(5);
		}
	}
}
