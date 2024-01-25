import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "Z")
	public boolean aBoolean408 = false;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	protected int anInt5302;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
	protected final int anInt5301;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	protected int anInt5299;

	static {
		new Class44(64);
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5302 = arg0;
		this.anInt5301 = arg1;
		this.aBoolean406 = arg4;
		this.anInt5299 = arg2;
		this.aBoolean408 = arg3;
	}
}
