import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class123 {

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
	public int anInt2965;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!mq;")
	private Class154 aClass154_20 = new Class154(64);

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Lclient!mq;")
	public final Class154 aClass154_21 = new Class154(500);

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "Lclient!mq;")
	public final Class154 aClass154_22 = new Class154(30);

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "Lclient!mq;")
	public final Class154 aClass154_23 = new Class154(50);

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!fc;")
	private final Class71 aClass71_39;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	public final int anInt2962;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!fc;")
	public final Class71 aClass71_38;

	static {
		new Class221("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!dk;IZLclient!fc;Lclient!fc;)V")
	public Class123(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class71 arg3, @OriginalArg(4) Class71 arg4) {
		this.aClass71_39 = arg3;
		this.aBoolean217 = arg2;
		this.anInt2962 = arg1;
		this.aClass71_38 = arg4;
		if (this.aClass71_39 != null) {
			@Pc(50) int local50 = this.aClass71_39.method1553() - 1;
			this.aClass71_39.method1580(local50);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public void method2697() {
		@Pc(2) Class154 local2 = this.aClass154_20;
		synchronized (this.aClass154_20) {
			this.aClass154_20.method3748();
		}
		local2 = this.aClass154_21;
		synchronized (this.aClass154_21) {
			this.aClass154_21.method3748();
		}
		local2 = this.aClass154_22;
		synchronized (this.aClass154_22) {
			this.aClass154_22.method3748();
		}
		local2 = this.aClass154_23;
		synchronized (this.aClass154_23) {
			this.aClass154_23.method3748();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public void method2699() {
		@Pc(2) Class154 local2 = this.aClass154_20;
		synchronized (this.aClass154_20) {
			this.aClass154_20.method3746();
		}
		local2 = this.aClass154_21;
		synchronized (this.aClass154_21) {
			this.aClass154_21.method3746();
		}
		local2 = this.aClass154_22;
		synchronized (this.aClass154_22) {
			this.aClass154_22.method3746();
		}
		local2 = this.aClass154_23;
		synchronized (this.aClass154_23) {
			this.aClass154_23.method3746();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
	public void method2700(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean217 != arg0) {
			this.aBoolean217 = arg0;
			this.method2697();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
	public void method2701(@OriginalArg(1) int arg0) {
		this.anInt2965 = arg0;
		@Pc(9) Class154 local9 = this.aClass154_21;
		synchronized (this.aClass154_21) {
			this.aClass154_21.method3748();
		}
		local9 = this.aClass154_22;
		synchronized (this.aClass154_22) {
			this.aClass154_22.method3748();
		}
		local9 = this.aClass154_23;
		synchronized (this.aClass154_23) {
			this.aClass154_23.method3748();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IZ)Lclient!cj;")
	public Class34 method2703(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_20;
		@Pc(16) Class34 local16;
		synchronized (this.aClass154_20) {
			local16 = (Class34) this.aClass154_20.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass71_39.method1555(Static123.method2247(arg0), Static34.method767(arg0));
		local16 = new Class34();
		local16.anInt802 = arg0;
		local16.aClass123_4 = this;
		if (local37 != null) {
			local16.method832(new Class2_Sub13(local37));
		}
		local16.method824();
		if (!this.aBoolean217 && local16.aBoolean64) {
			local16.anIntArray120 = null;
			local16.aStringArray6 = null;
		}
		if (local16.aBoolean67) {
			local16.aBoolean66 = false;
			local16.anInt780 = 0;
		}
		@Pc(89) Class154 local89 = this.aClass154_20;
		synchronized (this.aClass154_20) {
			this.aClass154_20.method3745((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
	public void method2704(@OriginalArg(0) int arg0) {
		this.aClass154_20 = new Class154(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)V")
	public void method2705() {
		@Pc(12) Class154 local12 = this.aClass154_20;
		synchronized (this.aClass154_20) {
			this.aClass154_20.method3758(5);
		}
		local12 = this.aClass154_21;
		synchronized (this.aClass154_21) {
			this.aClass154_21.method3758(5);
		}
		local12 = this.aClass154_22;
		synchronized (this.aClass154_22) {
			this.aClass154_22.method3758(5);
		}
		local12 = this.aClass154_23;
		synchronized (this.aClass154_23) {
			this.aClass154_23.method3758(5);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BZ)V")
	public void method2710(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean218 != arg0) {
			this.aBoolean218 = arg0;
			this.method2697();
		}
	}
}
