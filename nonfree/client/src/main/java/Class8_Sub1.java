import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public int anInt6698;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	public int anInt6697;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	public int anInt6701;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "Z")
	public final boolean aBoolean485;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	public int anInt6702;

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt6697 = (short) arg2;
		this.aShort98 = (short) arg4;
		this.anInt6701 = (short) arg1;
		this.aShort96 = (short) arg5;
		this.aBoolean485 = arg8;
		this.aByte78 = arg9;
		this.aShort97 = (short) arg6;
		this.aByte77 = (byte) arg0;
		this.anInt6702 = (short) arg3;
		this.aShort99 = (short) arg7;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
	public void method5628() {
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I")
	public abstract int method5629();
}
