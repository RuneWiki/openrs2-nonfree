import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "Z")
	public boolean aBoolean852 = false;

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
	protected final int anInt10402;

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
	protected int anInt10396;

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
	protected int anInt10403;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aShort128 = (short) arg3;
		this.anInt10402 = arg1;
		this.aBoolean852 = arg5;
		this.anInt10396 = arg2;
		this.anInt10403 = arg0;
	}
}
