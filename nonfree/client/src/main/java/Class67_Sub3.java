import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class Class67_Sub3 extends Class67 {

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
	public int anInt6311;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	public int anInt6310;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
	public int anInt6313;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "S")
	public short aShort93;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "Z")
	public final boolean aBoolean409;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
	public int anInt6308;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class67_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort91 = (short) arg4;
		this.aByte73 = (byte) arg0;
		this.aByte72 = arg9;
		this.anInt6310 = (short) arg3;
		this.aShort90 = (short) arg6;
		this.anInt6313 = (short) arg2;
		this.aShort93 = (short) arg5;
		this.aShort92 = (short) arg7;
		this.aBoolean409 = arg8;
		this.anInt6308 = (short) arg1;
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V")
	public void method5406() {
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(B)I")
	public abstract int method5408();
}
