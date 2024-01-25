import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public int anInt6636;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt6631;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "S")
	public short aShort93;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public int anInt6632;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "Z")
	public final boolean aBoolean575;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	public int anInt6633;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort90 = (short) arg7;
		this.aShort92 = (short) arg4;
		this.anInt6631 = (short) arg1;
		this.aByte76 = arg9;
		this.aShort93 = (short) arg6;
		this.anInt6632 = (short) arg3;
		this.aShort91 = (short) arg5;
		this.aByte75 = (byte) arg0;
		this.aBoolean575 = arg8;
		this.anInt6633 = (short) arg2;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)I")
	public abstract int method5902();

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	public void method5905() {
	}
}
