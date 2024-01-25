import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
	public int anInt9397;

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "Z")
	public final boolean aBoolean788;

	@OriginalMember(owner = "client!mca", name = "p", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
	public int anInt9400;

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
	public int anInt9396;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
	public int anInt9398;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aBoolean788 = arg8;
		this.aByte103 = (byte) arg0;
		this.anInt9400 = arg2;
		this.aShort121 = (short) arg5;
		this.aByte104 = arg9;
		this.aShort122 = (short) arg6;
		this.anInt9396 = arg3;
		this.aShort123 = (short) arg7;
		this.aShort120 = (short) arg4;
		this.anInt9398 = arg1;
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)I")
	public abstract int method7629();

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "(B)V")
	public void method7630() {
	}
}
