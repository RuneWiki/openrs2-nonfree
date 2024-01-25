import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class Class19 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Lclient!qo;")
	protected final Class20_Sub3 aClass20_Sub3_42;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class19(@OriginalArg(0) Class20_Sub3 arg0) {
		this.aClass20_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public abstract void method9161();

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZ)V")
	public abstract void method9162(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
	public abstract void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Z")
	public abstract boolean method9165();

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZB)V")
	public abstract void method9167(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!ud;BI)V")
	public abstract void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1);
}
