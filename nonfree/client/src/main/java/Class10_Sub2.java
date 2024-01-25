import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	protected final int anInt6403;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	protected final int anInt6404;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	protected final int anInt6402;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub2(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt6403 = arg0.method5272();
		this.anInt6404 = arg0.method5272();
		this.anInt6402 = arg0.method5322(-117);
	}
}
