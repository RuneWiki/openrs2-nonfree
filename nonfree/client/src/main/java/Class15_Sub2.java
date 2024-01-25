import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
	public int anInt8914;

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
	public int anInt8915;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
	public int anInt8913;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
	public int anInt8911;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "Z")
	public final boolean aBoolean577;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "B")
	public byte aByte98;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt8915 = arg2;
		this.aShort117 = (short) arg7;
		this.anInt8913 = arg3;
		this.anInt8911 = arg1;
		this.aBoolean577 = arg8;
		this.aShort114 = (short) arg6;
		this.aShort115 = (short) arg5;
		this.aByte98 = (byte) arg0;
		this.aByte97 = arg9;
		this.aShort116 = (short) arg4;
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V")
	public void method7122() {
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I")
	public abstract int method7123();
}
