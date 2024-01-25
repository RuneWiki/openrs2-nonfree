import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public abstract class Class184 implements Interface15 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!afa;")
	protected final Class10 aClass10_4;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!afa;)V")
	protected Class184(@OriginalArg(0) Class10 arg0) {
		this.aClass10_4 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method6565() {
		@Pc(18) int local18 = this.aClass10_4.aClass277_10.method6409(Static282.anInt4679, this.aClass10_4.anInt7621) + this.aClass10_4.anInt7622;
		@Pc(33) int local33 = this.aClass10_4.aClass137_13.method2982(Static381.anInt6587, this.aClass10_4.anInt7623) + this.aClass10_4.anInt7626;
		this.method6570(local18, local33);
		this.method6569(local18, local33);
		Static408.aClass56_4.method7866(this.aClass10_4.anInt7621 / 2 + local18, -1, Static351.aString76, this.aClass10_4.anInt7623 / 2 + local33 + 4, this.aClass10_4.anInt7624);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZII)V")
	protected abstract void method6569(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method6570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Z")
	public abstract boolean method6566();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public abstract void method6567();
}
