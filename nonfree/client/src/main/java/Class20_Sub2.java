import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Z")
	public boolean aBoolean405 = false;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	protected final int anInt5040;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	protected int anInt5039;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	protected int anInt5044;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class20_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5040 = arg1;
		this.anInt5039 = arg0;
		this.aBoolean406 = arg3;
		this.aBoolean405 = arg4;
		this.anInt5044 = arg2;
	}
}
