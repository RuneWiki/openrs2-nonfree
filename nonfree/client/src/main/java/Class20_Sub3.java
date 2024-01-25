import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public abstract class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
	public int anInt6617;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "B")
	public byte aByte89;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
	public int anInt6616;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Z")
	public final boolean aBoolean543;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public int anInt6615;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "S")
	public short aShort86;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public int anInt6613;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class20_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aByte88 = arg9;
		this.aByte89 = (byte) arg0;
		this.aShort87 = (short) arg5;
		this.anInt6616 = arg3;
		this.aBoolean543 = arg8;
		this.aShort88 = (short) arg6;
		this.anInt6615 = arg2;
		this.aShort86 = (short) arg7;
		this.anInt6613 = arg1;
		this.aShort85 = (short) arg4;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	public void method5096() {
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)I")
	public abstract int method5097();
}
