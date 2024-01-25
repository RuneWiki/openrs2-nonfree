import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public class Class98 implements Interface1 {

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Lclient!mi;")
	protected Class46 aClass46_12;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Lclient!in;")
	private final Class157 aClass157_76;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "Lclient!vr;")
	protected final Class362 aClass362_2;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!in;Lclient!vr;)V")
	public Class98(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class362 arg1) {
		this.aClass157_76 = arg0;
		this.aClass362_2 = arg1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method9232() {
		return this.aClass157_76.method4575(this.aClass362_2.anInt10885);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BZ)V")
	@Override
	public void method9233() {
		@Pc(19) int local19 = this.aClass362_2.aClass309_13.method7817(Static326.anInt6591, this.aClass46_12.method6205()) + this.aClass362_2.anInt10880;
		@Pc(34) int local34 = this.aClass362_2.aClass86_13.method2903(Static467.anInt8715, this.aClass46_12.method6219()) + this.aClass362_2.anInt10881;
		this.aClass46_12.method6213(local19, local34);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	@Override
	public final void method9231() {
		this.aClass46_12 = Static166.method3585(this.aClass362_2.anInt10885, this.aClass157_76);
	}
}
