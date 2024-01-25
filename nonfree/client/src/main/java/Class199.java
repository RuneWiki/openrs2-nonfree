import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class199 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!de;")
	private Class69 aClass69_29 = new Class69(64);

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!nd;")
	private final Class238 aClass238_133;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class199(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_133 = arg2;
		if (this.aClass238_133 != null) {
			@Pc(20) int local20 = this.aClass238_133.method5569() - 1;
			this.aClass238_133.method5592(local20);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lclient!bk;")
	public Class38 method4578(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_29;
		@Pc(16) Class38 local16;
		synchronized (this.aClass69_29) {
			local16 = (Class38) this.aClass69_29.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_133;
		@Pc(42) byte[] local42;
		synchronized (this.aClass238_133) {
			local42 = this.aClass238_133.method5567(Static40.method911(arg0), Static76.method1643(arg0));
		}
		local16 = new Class38();
		if (local42 != null) {
			local16.method1176(new Class2_Sub17(local42));
		}
		@Pc(71) Class69 local71 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public void method4580() {
		@Pc(2) Class69 local2 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1904();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
	public void method4581(@OriginalArg(1) int arg0) {
		@Pc(2) Class69 local2 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1905();
			this.aClass69_29 = new Class69(arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V")
	public void method4582() {
		@Pc(2) Class69 local2 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1910(5);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	public void method4583() {
		@Pc(6) Class69 local6 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1905();
		}
	}
}
