import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public int anInt6890;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "B")
	public final byte aByte83;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
	public int anInt6893;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public int anInt6889;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public int anInt6892;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
	public final boolean aBoolean629;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "B")
	public byte aByte82;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort96 = (short) arg6;
		this.aByte83 = arg9;
		this.aShort94 = (short) arg4;
		this.anInt6893 = arg1;
		this.aShort95 = (short) arg7;
		this.anInt6889 = arg2;
		this.aShort97 = (short) arg5;
		this.anInt6892 = arg3;
		this.aBoolean629 = arg8;
		this.aByte82 = (byte) arg0;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
	public abstract int method5342();

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public void method5346() {
	}
}
