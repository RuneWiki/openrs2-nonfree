import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public int anInt6829;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Z")
	public final boolean aBoolean490;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	public int anInt6835;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public int anInt6832;

	@OriginalMember(owner = "client!tn", name = "z", descriptor = "B")
	public final byte aByte92;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	public int anInt6833;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "B")
	public byte aByte91;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aBoolean490 = arg8;
		this.anInt6835 = arg3;
		this.aShort92 = (short) arg4;
		this.aShort89 = (short) arg6;
		this.aShort90 = (short) arg7;
		this.anInt6832 = arg2;
		this.aByte92 = arg9;
		this.aShort91 = (short) arg5;
		this.anInt6833 = arg1;
		this.aByte91 = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)I")
	public abstract int method5286();

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "(I)V")
	public void method5288() {
	}
}
