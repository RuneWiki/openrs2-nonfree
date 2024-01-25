import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	public int anInt6048;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
	public int anInt6045;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "S")
	public short aShort178;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "S")
	public short aShort180;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Z")
	public final boolean aBoolean425;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "S")
	public short aShort179;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "S")
	public short aShort181;

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
	public int anInt6055;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
	public int anInt6053;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.anInt6045 = arg2;
		this.aShort178 = (short) arg7;
		this.aShort180 = (short) arg5;
		this.aBoolean425 = arg8;
		this.aShort179 = (short) arg6;
		this.aShort181 = (short) arg4;
		this.anInt6055 = arg3;
		this.aByte78 = arg9;
		this.anInt6053 = arg1;
		this.aByte77 = (byte) arg0;
	}

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V")
	public void method4826() {
	}

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "(I)I")
	public abstract int method4828();
}
