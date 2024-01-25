import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	public int anInt7342;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Z")
	public final boolean aBoolean518;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
	public int anInt7341;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
	public int anInt7343;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
	public int anInt7339;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class8_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aBoolean518 = arg8;
		this.aShort98 = (short) arg7;
		this.aShort99 = (short) arg6;
		this.anInt7341 = arg2;
		this.anInt7343 = arg3;
		this.aShort100 = (short) arg4;
		this.aByte98 = arg9;
		this.aShort101 = (short) arg5;
		this.aByte99 = (byte) arg0;
		this.anInt7339 = arg1;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)I")
	public abstract int method5882();

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
	public void method5884() {
	}
}
