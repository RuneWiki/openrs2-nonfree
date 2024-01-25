import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "Z")
	public boolean aBoolean331 = false;

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "Z")
	public boolean aBoolean330 = false;

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
	protected int anInt4633;

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
	protected final int anInt4636;

	@OriginalMember(owner = "client!jw", name = "s", descriptor = "I")
	protected int anInt4639;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean330 = arg4;
		this.aShort64 = (short) arg3;
		this.anInt4633 = arg0;
		this.anInt4636 = arg1;
		this.aBoolean331 = arg5;
		this.anInt4639 = arg2;
	}
}
