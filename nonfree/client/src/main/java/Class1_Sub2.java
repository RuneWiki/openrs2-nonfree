import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public int anInt7555;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "B")
	public final byte aByte100;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	public int anInt7563;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	public int anInt7557;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
	public int anInt7560;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "Z")
	public final boolean aBoolean506;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aByte101 = (byte) arg0;
		this.aByte100 = arg9;
		this.anInt7563 = arg2;
		this.aShort109 = (short) arg5;
		this.anInt7557 = arg3;
		this.aShort107 = (short) arg6;
		this.anInt7560 = arg1;
		this.aBoolean506 = arg8;
		this.aShort110 = (short) arg7;
		this.aShort108 = (short) arg4;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
	public abstract int method6184();

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	public void method6187() {
	}
}
