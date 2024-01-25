import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public class Class41 implements Interface16 {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!hu;")
	protected Class21 aClass21_6;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_54;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!lk;")
	protected final Class196 aClass196_2;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!oh;Lclient!lk;)V")
	public Class41(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass237_54 = arg0;
		this.aClass196_2 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8623() {
		return this.aClass237_54.method6296(this.aClass196_2.anInt9132);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8622() {
		@Pc(28) int local28 = this.aClass196_2.aClass173_11.method4706(Static328.anInt9768, this.aClass21_6.method5779()) + this.aClass196_2.anInt9127;
		@Pc(42) int local42 = this.aClass196_2.aClass60_10.method2078(Static594.anInt10159, this.aClass21_6.method5785()) + this.aClass196_2.anInt9129;
		this.aClass21_6.method5796(local28, local42);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	@Override
	public final void method8624() {
		this.aClass21_6 = Static269.method4648(this.aClass237_54, this.aClass196_2.anInt9132);
	}
}
