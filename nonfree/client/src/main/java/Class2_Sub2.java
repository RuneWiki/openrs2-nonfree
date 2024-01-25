import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
	public int anInt6469;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	public int anInt6464;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "S")
	public short aShort84;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public int anInt6466;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Z")
	public final boolean aBoolean565;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public int anInt6465;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt6464 = (short) arg2;
		this.aShort85 = (short) arg4;
		this.aShort84 = (short) arg6;
		this.aShort82 = (short) arg7;
		this.aByte73 = (byte) arg0;
		this.anInt6466 = (short) arg3;
		this.aBoolean565 = arg8;
		this.anInt6465 = (short) arg1;
		this.aByte72 = arg9;
		this.aShort83 = (short) arg5;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	public void method5415() {
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)I")
	public abstract int method5416();
}
