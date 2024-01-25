import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt8190;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "B")
	public final byte aByte93;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public int anInt8192;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "B")
	public byte aByte94;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
	public final boolean aBoolean553;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt8189;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt8191;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class47_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aByte93 = arg9;
		this.anInt8192 = arg2;
		this.aByte94 = (byte) arg0;
		this.aShort116 = (short) arg5;
		this.aShort115 = (short) arg4;
		this.aShort114 = (short) arg7;
		this.aBoolean553 = arg8;
		this.anInt8189 = arg1;
		this.aShort117 = (short) arg6;
		this.anInt8191 = arg3;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public void method6952() {
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)I")
	public abstract int method6953();
}
