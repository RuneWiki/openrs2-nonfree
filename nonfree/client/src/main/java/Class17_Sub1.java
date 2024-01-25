import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	public int anInt5110;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "S")
	public short aShort76;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
	public int anInt5112;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "B")
	public final byte aByte50;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	public int anInt5109;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Z")
	public final boolean aBoolean499;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "S")
	public short aShort74;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "S")
	public short aShort77;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
	public int anInt5108;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort76 = (short) arg7;
		this.anInt5112 = (short) arg2;
		this.aByte50 = arg9;
		this.anInt5109 = (short) arg1;
		this.aShort75 = (short) arg4;
		this.aByte51 = (byte) arg0;
		this.aBoolean499 = arg8;
		this.aShort74 = (short) arg5;
		this.aShort77 = (short) arg6;
		this.anInt5108 = (short) arg3;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
	public void method4487() {
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)I")
	public abstract int method4490();
}
