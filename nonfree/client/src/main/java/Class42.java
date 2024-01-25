import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class42 {

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Lclient!eda;")
	private Class87 aClass87_36 = new Class87(128);

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "Lclient!eda;")
	public Class87 aClass87_37 = new Class87(64);

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Lclient!la;")
	public final Class207 aClass207_14;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "Lclient!la;")
	private final Class207 aClass207_15;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;Lclient!la;)V")
	public Class42(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class207 arg3) {
		this.aClass207_14 = arg3;
		this.aClass207_15 = arg2;
		this.aClass207_15.method4672(36);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Lclient!re;")
	public Class299 method937(@OriginalArg(0) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_36;
		@Pc(16) Class299 local16;
		synchronized (this.aClass87_36) {
			local16 = (Class299) this.aClass87_36.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class207 local37 = this.aClass207_15;
		@Pc(46) byte[] local46;
		synchronized (this.aClass207_15) {
			local46 = this.aClass207_15.method4681(36, arg0);
		}
		local16 = new Class299();
		local16.aClass42_2 = this;
		local16.anInt8144 = arg0;
		if (local46 != null) {
			local16.method7060(new Class5_Sub22(local46));
		}
		local16.method7061();
		@Pc(77) Class87 local77 = this.aClass87_36;
		synchronized (this.aClass87_36) {
			this.aClass87_36.method1792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public void method939() {
		@Pc(6) Class87 local6 = this.aClass87_36;
		synchronized (this.aClass87_36) {
			this.aClass87_36.method1793(5);
		}
		local6 = this.aClass87_37;
		synchronized (this.aClass87_37) {
			this.aClass87_37.method1793(5);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V")
	public void method941() {
		@Pc(14) Class87 local14 = this.aClass87_36;
		synchronized (this.aClass87_36) {
			this.aClass87_36.method1796();
		}
		local14 = this.aClass87_37;
		synchronized (this.aClass87_37) {
			this.aClass87_37.method1796();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public void method943() {
		@Pc(6) Class87 local6 = this.aClass87_36;
		synchronized (this.aClass87_36) {
			this.aClass87_36.method1801();
		}
		local6 = this.aClass87_37;
		synchronized (this.aClass87_37) {
			this.aClass87_37.method1801();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)V")
	public void method944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass87_36 = new Class87(arg1);
		this.aClass87_37 = new Class87(arg0);
	}
}
