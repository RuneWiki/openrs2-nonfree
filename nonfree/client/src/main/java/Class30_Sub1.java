import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
	public int anInt9419;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	public int anInt9422;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
	public int anInt9418;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
	public int anInt9416;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "Z")
	public final boolean aBoolean665;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "B")
	public final byte aByte100;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "S")
	public short aShort113;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt9422 = arg2;
		this.aByte99 = (byte) arg0;
		this.aShort115 = (short) arg4;
		this.anInt9418 = arg1;
		this.anInt9416 = arg3;
		this.aShort114 = (short) arg7;
		this.aShort112 = (short) arg6;
		this.aBoolean665 = arg8;
		this.aByte100 = arg9;
		this.aShort113 = (short) arg5;
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V")
	public void method7813() {
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)I")
	public abstract int method7815();
}
