import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public abstract class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
	public int anInt5904;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
	public int anInt5905;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "Z")
	public final boolean aBoolean402;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
	public int anInt5907;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	public int anInt5901;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "S")
	public short aShort86;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "B")
	public final byte aByte68;

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt5905 = (short) arg3;
		this.aByte69 = (byte) arg0;
		this.aBoolean402 = arg8;
		this.aShort89 = (short) arg5;
		this.anInt5907 = (short) arg2;
		this.anInt5901 = (short) arg1;
		this.aShort87 = (short) arg6;
		this.aShort86 = (short) arg4;
		this.aByte68 = arg9;
		this.aShort88 = (short) arg7;
	}

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)I")
	public abstract int method5039();

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)V")
	public void method5040() {
	}
}
