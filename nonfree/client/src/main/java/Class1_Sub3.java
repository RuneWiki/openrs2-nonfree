import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	protected final int anInt4622;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	protected int anInt4621;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	protected int anInt4623;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4622 = arg1;
		this.aBoolean344 = arg4;
		this.aBoolean345 = arg3;
		this.anInt4621 = arg2;
		this.anInt4623 = arg0;
	}
}
