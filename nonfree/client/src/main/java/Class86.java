import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class86 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!ge;")
	private Class83 aClass83_22 = new Class83(64);

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!ci;")
	private final Class38 aClass38_28;

	static {
		new Class21("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class86(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_28 = arg2;
		if (this.aClass38_28 != null) {
			@Pc(20) int local20 = this.aClass38_28.method1035() - 1;
			this.aClass38_28.method1032(local20);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public void method2410() {
		@Pc(10) Class83 local10 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method2346();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	public void method2412() {
		@Pc(2) Class83 local2 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method2345(5);
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	public void method2416() {
		@Pc(6) Class83 local6 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method2336();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V")
	public void method2417(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method2346();
			this.aClass83_22 = new Class83(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)Lclient!qq;")
	public Class211 method2418(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_22;
		@Pc(16) Class211 local16;
		synchronized (this.aClass83_22) {
			local16 = (Class211) this.aClass83_22.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class38 local35 = this.aClass38_28;
		@Pc(48) byte[] local48;
		synchronized (this.aClass38_28) {
			local48 = this.aClass38_28.method1039(Static242.method4024(arg0), Static464.method6290(arg0));
		}
		local16 = new Class211();
		if (local48 != null) {
			local16.method4953(new Class4_Sub20(local48));
		}
		@Pc(70) Class83 local70 = this.aClass83_22;
		synchronized (this.aClass83_22) {
			this.aClass83_22.method2337(local16, (long) arg0);
			return local16;
		}
	}
}
