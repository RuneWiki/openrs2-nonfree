import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class74 {

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
	public int anInt1941;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!mq;")
	private final Class154 aClass154_7 = new Class154(64);

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Lclient!mq;")
	public final Class154 aClass154_8 = new Class154(30);

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Lclient!fc;")
	public final Class71 aClass71_21;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "Lclient!fc;")
	private final Class71 aClass71_22;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;Lclient!fc;)V")
	public Class74(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class71 arg3) {
		this.aClass71_21 = arg3;
		this.aClass71_22 = arg2;
		@Pc(26) int local26 = this.aClass71_22.method1553() - 1;
		this.aClass71_22.method1580(local26);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)V")
	public void method1764(@OriginalArg(0) int arg0) {
		this.anInt1941 = arg0;
		@Pc(9) Class154 local9 = this.aClass154_8;
		synchronized (this.aClass154_8) {
			this.aClass154_8.method3748();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)V")
	public void method1765() {
		@Pc(14) Class154 local14 = this.aClass154_7;
		synchronized (this.aClass154_7) {
			this.aClass154_7.method3758(5);
		}
		local14 = this.aClass154_8;
		synchronized (this.aClass154_8) {
			this.aClass154_8.method3758(5);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public void method1767() {
		@Pc(11) Class154 local11 = this.aClass154_7;
		synchronized (this.aClass154_7) {
			this.aClass154_7.method3746();
		}
		local11 = this.aClass154_8;
		synchronized (this.aClass154_8) {
			this.aClass154_8.method3746();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(IB)Lclient!tl;")
	public Class220 method1772(@OriginalArg(0) int arg0) {
		@Pc(14) Class154 local14 = this.aClass154_7;
		@Pc(24) Class220 local24;
		synchronized (this.aClass154_7) {
			local24 = (Class220) this.aClass154_7.method3751((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass71_22.method1555(Static303.method4754(arg0), Static340.method5225(arg0));
		local24 = new Class220();
		local24.anInt6027 = arg0;
		local24.aClass74_2 = this;
		if (local45 != null) {
			local24.method5228(new Class2_Sub13(local45));
		}
		@Pc(67) Class154 local67 = this.aClass154_7;
		synchronized (this.aClass154_7) {
			this.aClass154_7.method3745((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	public void method1773() {
		@Pc(2) Class154 local2 = this.aClass154_7;
		synchronized (this.aClass154_7) {
			this.aClass154_7.method3748();
		}
		local2 = this.aClass154_8;
		synchronized (this.aClass154_8) {
			this.aClass154_8.method3748();
		}
	}
}
