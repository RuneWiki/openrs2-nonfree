import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "Z")
	public boolean aBoolean355 = false;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Z")
	public boolean aBoolean356 = false;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	protected int anInt4556;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
	protected int anInt4557;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
	protected final int anInt4555;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class28_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4556 = arg2;
		this.aBoolean356 = arg3;
		this.anInt4557 = arg0;
		this.aBoolean355 = arg4;
		this.anInt4555 = arg1;
	}
}
