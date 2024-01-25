import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public class Class18 implements Interface12 {

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "Lclient!f;")
	protected Class39 aClass39_2;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "Lclient!qga;")
	protected final Class178 aClass178_2;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "Lclient!pl;")
	private final Class259 aClass259_12;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!pl;Lclient!qga;)V")
	public Class18(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class178 arg1) {
		this.aClass178_2 = arg1;
		this.aClass259_12 = arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7015() {
		return this.aClass259_12.method5988(this.aClass178_2.anInt4794);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	@Override
	public final void method7014() {
		this.aClass39_2 = Static152.method2474(this.aClass259_12, this.aClass178_2.anInt4794);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7013() {
		@Pc(16) int local16 = this.aClass178_2.aClass62_8.method1173(Static26.anInt651, this.aClass39_2.A()) + this.aClass178_2.anInt4798;
		@Pc(30) int local30 = this.aClass178_2.aClass279_7.method6456(Static554.anInt9119, this.aClass39_2.ca()) + this.aClass178_2.anInt4797;
		this.aClass39_2.method7851(local16, local30);
	}
}
