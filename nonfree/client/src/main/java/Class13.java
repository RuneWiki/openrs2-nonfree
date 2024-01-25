import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public abstract class Class13 {

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "Lclient!nv;")
	protected final Class16_Sub3 aClass16_Sub3_42;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class13(@OriginalArg(0) Class16_Sub3 arg0) {
		this.aClass16_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	public abstract void method8260();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBI)V")
	public abstract void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!tha;II)V")
	public abstract void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8265();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)V")
	public abstract void method8266(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BZ)V")
	public abstract void method8268(@OriginalArg(1) boolean arg0);
}
