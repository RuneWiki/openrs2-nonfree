import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class189 {

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "Lclient!eda;")
	private final Class87 aClass87_121 = new Class87(64);

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "Lclient!eda;")
	public final Class87 aClass87_122 = new Class87(2);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "Lclient!la;")
	public final Class207 aClass207_59;

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "Lclient!la;")
	private final Class207 aClass207_60;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;Lclient!la;)V")
	public Class189(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class207 arg3) {
		this.aClass207_59 = arg3;
		this.aClass207_60 = arg2;
		this.aClass207_60.method4672(33);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
	public void method4424() {
		@Pc(2) Class87 local2 = this.aClass87_121;
		synchronized (this.aClass87_121) {
			this.aClass87_121.method1801();
		}
		@Pc(29) Class87 local29 = this.aClass87_122;
		synchronized (this.aClass87_122) {
			this.aClass87_122.method1801();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
	public void method4425() {
		@Pc(8) Class87 local8 = this.aClass87_121;
		synchronized (this.aClass87_121) {
			this.aClass87_121.method1793(5);
		}
		local8 = this.aClass87_122;
		synchronized (this.aClass87_122) {
			this.aClass87_122.method1793(5);
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
	public void method4427() {
		@Pc(6) Class87 local6 = this.aClass87_121;
		synchronized (this.aClass87_121) {
			this.aClass87_121.method1796();
		}
		local6 = this.aClass87_122;
		synchronized (this.aClass87_122) {
			this.aClass87_122.method1796();
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(II)Lclient!dm;")
	public Class77 method4428(@OriginalArg(0) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_121;
		@Pc(16) Class77 local16;
		synchronized (this.aClass87_121) {
			local16 = (Class77) this.aClass87_121.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_60;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_60) {
			local38 = this.aClass207_60.method4681(33, arg0);
		}
		local16 = new Class77();
		local16.aClass189_1 = this;
		if (local38 != null) {
			local16.method1646(new Class5_Sub22(local38));
		}
		@Pc(68) Class87 local68 = this.aClass87_121;
		synchronized (this.aClass87_121) {
			this.aClass87_121.method1792((long) arg0, local16);
			return local16;
		}
	}
}
