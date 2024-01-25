import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class84 {

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "Lclient!eda;")
	private final Class87 aClass87_61 = new Class87(64);

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "Lclient!la;")
	private final Class207 aClass207_26;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class84(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_26 = arg2;
		this.aClass207_26.method4672(31);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public void method1738() {
		@Pc(7) Class87 local7 = this.aClass87_61;
		synchronized (this.aClass87_61) {
			this.aClass87_61.method1801();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)Lclient!lm;")
	public Class215 method1739(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_61;
		@Pc(16) Class215 local16;
		synchronized (this.aClass87_61) {
			local16 = (Class215) this.aClass87_61.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class207 local37 = this.aClass207_26;
		@Pc(46) byte[] local46;
		synchronized (this.aClass207_26) {
			local46 = this.aClass207_26.method4681(31, arg0);
		}
		local16 = new Class215();
		if (local46 != null) {
			local16.method4865(new Class5_Sub22(local46));
		}
		@Pc(68) Class87 local68 = this.aClass87_61;
		synchronized (this.aClass87_61) {
			this.aClass87_61.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	public void method1740() {
		@Pc(2) Class87 local2 = this.aClass87_61;
		synchronized (this.aClass87_61) {
			this.aClass87_61.method1796();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI)V")
	public void method1743() {
		@Pc(2) Class87 local2 = this.aClass87_61;
		synchronized (this.aClass87_61) {
			this.aClass87_61.method1793(5);
		}
	}
}
