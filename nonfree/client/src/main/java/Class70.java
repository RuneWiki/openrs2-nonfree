import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public class Class70 implements Interface15 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "Lclient!xa;")
	protected Class4 aClass4_17;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "Lclient!pq;")
	private final Class251 aClass251_98;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!pu;")
	protected final Class253 aClass253_2;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!pq;Lclient!pu;)V")
	public Class70(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class253 arg1) {
		this.aClass251_98 = arg0;
		this.aClass253_2 = arg1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	@Override
	public final void method6567() {
		this.aClass4_17 = Static96.method1502(this.aClass251_98.method5855(this.aClass253_2.anInt8137));
		this.method6565();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method6566() {
		return this.aClass251_98.method5859(this.aClass253_2.anInt8137);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6565() {
		@Pc(26) int local26 = this.aClass253_2.aClass277_11.method6409(Static282.anInt4679, this.aClass4_17.AA()) + this.aClass253_2.anInt8132;
		@Pc(40) int local40 = this.aClass253_2.aClass137_14.method2982(Static381.anInt6587, this.aClass4_17.a()) + this.aClass253_2.anInt8135;
		this.aClass4_17.method6514(local26, local40);
	}
}
