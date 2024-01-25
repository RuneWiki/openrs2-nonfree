import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class Class67_Sub4 extends Class67 {

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
	protected final int anInt5709;

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
	protected int anInt5712;

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
	protected int anInt5706;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class67_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5709 = arg1;
		this.aBoolean365 = arg3;
		this.anInt5712 = arg2;
		this.anInt5706 = arg0;
		this.aBoolean366 = arg4;
	}
}
