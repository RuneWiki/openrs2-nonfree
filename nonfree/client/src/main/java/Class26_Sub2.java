import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public abstract class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
	public int anInt7385;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!mv", name = "s", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!mv", name = "w", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!mv", name = "v", descriptor = "Z")
	public final boolean aBoolean494;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
	public int anInt7383;

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
	public int anInt7388;

	@OriginalMember(owner = "client!mv", name = "x", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!mv", name = "t", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
	public int anInt7390;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class26_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort102 = (short) arg7;
		this.aByte101 = arg9;
		this.aByte102 = (byte) arg0;
		this.aShort103 = (short) arg6;
		this.aBoolean494 = arg8;
		this.anInt7383 = arg3;
		this.anInt7388 = arg1;
		this.aShort105 = (short) arg4;
		this.aShort104 = (short) arg5;
		this.anInt7390 = arg2;
	}

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V")
	public void method5694() {
	}

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "(I)I")
	public abstract int method5695();
}
