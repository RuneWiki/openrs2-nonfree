import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
	public int anInt7661;

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "Z")
	public final boolean aBoolean569;

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "B")
	public byte aByte90;

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "S")
	public short aShort127;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "S")
	public short aShort126;

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "S")
	public short aShort128;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
	public int anInt7659;

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "B")
	public final byte aByte91;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
	public int anInt7660;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
	public int anInt7657;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aBoolean569 = arg8;
		this.aByte90 = (byte) arg0;
		this.aShort127 = (short) arg4;
		this.aShort126 = (short) arg7;
		this.aShort128 = (short) arg6;
		this.anInt7659 = arg3;
		this.aByte91 = arg9;
		this.anInt7660 = arg1;
		this.aShort125 = (short) arg5;
		this.anInt7657 = arg2;
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(B)V")
	public void method6430() {
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "(I)I")
	public abstract int method6432();
}
