import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
	public static final int[] anIntArray476 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "[S")
	public static final short[] aShortArray127 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_63 = new Class98(50);

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public int anInt6766;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Z")
	public final boolean aBoolean463;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public int anInt6768;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "B")
	public final byte aByte77;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public int anInt6769;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	public int anInt6770;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 54)
	protected Class11_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort104 = (short) arg5;
		this.aShort103 = (short) arg4;
		this.aByte78 = (byte) arg0;
		this.aBoolean463 = arg8;
		this.aShort102 = (short) arg7;
		this.aShort101 = (short) arg6;
		this.anInt6768 = (short) arg1;
		this.aByte77 = arg9;
		this.anInt6769 = (short) arg2;
		this.anInt6770 = (short) arg3;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 3)
	public void method6079() {
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)I")
	public abstract int method6081();
}
