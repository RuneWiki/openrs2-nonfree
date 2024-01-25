import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public int anInt6731;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public int anInt6729;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Z")
	public final boolean aBoolean497;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "B")
	public byte aByte79;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public int anInt6726;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "S")
	public short aShort93;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public int anInt6727;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt6729 = (short) arg1;
		this.aBoolean497 = arg8;
		this.aByte79 = (byte) arg0;
		this.aByte78 = arg9;
		this.aShort91 = (short) arg7;
		this.aShort94 = (short) arg4;
		this.anInt6726 = (short) arg3;
		this.aShort92 = (short) arg5;
		this.aShort93 = (short) arg6;
		this.anInt6727 = (short) arg2;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)I")
	public abstract int method5877();

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)V")
	public void method5879() {
	}
}
