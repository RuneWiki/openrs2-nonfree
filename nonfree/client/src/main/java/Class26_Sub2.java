import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
	public int anInt7066;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
	public int anInt7065;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "S")
	public short aShort93;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
	public int anInt7063;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "Z")
	public final boolean aBoolean455;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
	public int anInt7068;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "B")
	public byte aByte95;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class26_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt7065 = arg3;
		this.aShort93 = (short) arg4;
		this.anInt7063 = arg2;
		this.aShort95 = (short) arg7;
		this.aBoolean455 = arg8;
		this.aByte94 = arg9;
		this.anInt7068 = arg1;
		this.aByte95 = (byte) arg0;
		this.aShort94 = (short) arg6;
		this.aShort92 = (short) arg5;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)I")
	public abstract int method5522();

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V")
	public void method5524() {
	}
}
