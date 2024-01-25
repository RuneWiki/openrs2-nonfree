import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
	public int anInt7623;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public int anInt7624;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "S")
	public short aShort106;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
	public int anInt7622;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "B")
	public final byte aByte100;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Z")
	public final boolean aBoolean512;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	public int anInt7626;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class11_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort108 = (short) arg4;
		this.aShort109 = (short) arg6;
		this.anInt7624 = arg2;
		this.aShort106 = (short) arg7;
		this.anInt7622 = arg3;
		this.aByte100 = arg9;
		this.aByte101 = (byte) arg0;
		this.aBoolean512 = arg8;
		this.anInt7626 = arg1;
		this.aShort107 = (short) arg5;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(Z)I")
	public abstract int method6213();

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
	public void method6214() {
	}
}
