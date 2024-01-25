import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Z")
	public boolean aBoolean343 = false;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	protected int anInt4181;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	protected int anInt4182;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	protected final int anInt4183;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4181 = arg0;
		this.anInt4182 = arg2;
		this.aBoolean343 = arg4;
		this.aBoolean344 = arg3;
		this.anInt4183 = arg1;
	}
}
