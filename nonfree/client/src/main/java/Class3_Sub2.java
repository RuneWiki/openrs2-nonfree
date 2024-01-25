import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
	public int anInt7209;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	public int anInt7208;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	public int anInt7202;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public int anInt7207;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "Z")
	public final boolean aBoolean460;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort101 = (short) arg4;
		this.aByte104 = arg9;
		this.anInt7208 = arg2;
		this.anInt7202 = arg1;
		this.aByte103 = (byte) arg0;
		this.aShort100 = (short) arg5;
		this.aShort102 = (short) arg6;
		this.anInt7207 = arg3;
		this.aShort99 = (short) arg7;
		this.aBoolean460 = arg8;
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)V")
	public void method5944() {
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)I")
	public abstract int method5947();
}
