import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public abstract class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
	public int anInt5043;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "Z")
	public final boolean aBoolean417;

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
	public int anInt5050;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
	public int anInt5047;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
	public int anInt5046;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "S")
	public short aShort76;

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "S")
	public short aShort77;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "S")
	public short aShort78;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aBoolean417 = arg8;
		this.anInt5050 = (short) arg1;
		this.anInt5047 = (short) arg3;
		this.anInt5046 = (short) arg2;
		this.aShort76 = (short) arg7;
		this.aByte53 = (byte) arg0;
		this.aShort77 = (short) arg6;
		this.aByte52 = arg9;
		this.aShort75 = (short) arg4;
		this.aShort78 = (short) arg5;
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)V")
	public void method4584() {
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(Z)I")
	public abstract int method4586();
}
