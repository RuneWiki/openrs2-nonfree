import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
	public boolean aBoolean343 = false;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
	protected int anInt4938;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	protected int anInt4936;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	protected final int anInt4934;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aShort74 = (short) arg3;
		this.anInt4938 = arg0;
		this.anInt4936 = arg2;
		this.anInt4934 = arg1;
		this.aBoolean343 = arg5;
	}
}
