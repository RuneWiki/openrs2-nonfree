import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
	public int anInt5966;

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "S")
	public short aShort84;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "Z")
	public final boolean aBoolean434;

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
	public int anInt5967;

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
	public int anInt5973;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
	public int anInt5968;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "B")
	public final byte aByte68;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "S")
	public short aShort81;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class22_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort84 = (short) arg7;
		this.aBoolean434 = arg8;
		this.anInt5967 = (short) arg3;
		this.anInt5973 = (short) arg1;
		this.aByte69 = (byte) arg0;
		this.aShort82 = (short) arg5;
		this.anInt5968 = (short) arg2;
		this.aShort83 = (short) arg4;
		this.aByte68 = arg9;
		this.aShort81 = (short) arg6;
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)I")
	public abstract int method5057();

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)V")
	public void method5058() {
	}
}
