import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class191 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "Lclient!eda;")
	private final Class87 aClass87_123 = new Class87(16);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "Lclient!la;")
	private final Class207 aClass207_61;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class191(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_61 = arg2;
		this.aClass207_61.method4672(30);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)Lclient!tt;")
	public Class340 method4431(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_123;
		@Pc(16) Class340 local16;
		synchronized (this.aClass87_123) {
			local16 = (Class340) this.aClass87_123.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class207 local37 = this.aClass207_61;
		@Pc(46) byte[] local46;
		synchronized (this.aClass207_61) {
			local46 = this.aClass207_61.method4681(30, arg0);
		}
		local16 = new Class340();
		if (local46 != null) {
			local16.method8053(new Class5_Sub22(local46));
		}
		@Pc(68) Class87 local68 = this.aClass87_123;
		synchronized (this.aClass87_123) {
			this.aClass87_123.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)V")
	public void method4432() {
		@Pc(2) Class87 local2 = this.aClass87_123;
		synchronized (this.aClass87_123) {
			this.aClass87_123.method1793(5);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	public void method4433() {
		@Pc(6) Class87 local6 = this.aClass87_123;
		synchronized (this.aClass87_123) {
			this.aClass87_123.method1801();
		}
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V")
	public void method4434() {
		@Pc(10) Class87 local10 = this.aClass87_123;
		synchronized (this.aClass87_123) {
			this.aClass87_123.method1796();
		}
	}
}
