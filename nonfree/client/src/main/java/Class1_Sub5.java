import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
	public int anInt6389;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "B")
	public final byte aByte68;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
	public int anInt6390;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
	public int anInt6386;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
	public int anInt6387;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "Z")
	public final boolean aBoolean457;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aByte68 = arg9;
		this.aShort97 = (short) arg6;
		this.aShort95 = (short) arg7;
		this.anInt6390 = (short) arg1;
		this.aShort96 = (short) arg4;
		this.anInt6386 = (short) arg3;
		this.anInt6387 = (short) arg2;
		this.aBoolean457 = arg8;
		this.aShort94 = (short) arg5;
		this.aByte69 = (byte) arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V")
	public void method5537() {
	}

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(B)I")
	public abstract int method5540();
}
