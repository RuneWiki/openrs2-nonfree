import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public abstract class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
	public int anInt7139;

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
	public int anInt7140;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "Z")
	public final boolean aBoolean515;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
	public int anInt7137;

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
	public int anInt7141;

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "B")
	public byte aByte98;

	static {
		new Class306(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class49_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort118 = (short) arg7;
		this.aShort116 = (short) arg6;
		this.anInt7140 = arg2;
		this.aShort115 = (short) arg5;
		this.aBoolean515 = arg8;
		this.anInt7137 = arg1;
		this.anInt7141 = arg3;
		this.aShort117 = (short) arg4;
		this.aByte97 = arg9;
		this.aByte98 = (byte) arg0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
	public void method5992() {
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(B)I")
	public abstract int method5994();
}
