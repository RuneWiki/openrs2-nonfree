import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	public int anInt8930;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
	public int anInt8929;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	public int anInt8934;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	public int anInt8931;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Z")
	public final boolean aBoolean618;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort116 = (short) arg4;
		this.aByte102 = arg9;
		this.anInt8929 = arg3;
		this.aShort118 = (short) arg5;
		this.anInt8934 = arg1;
		this.aByte101 = (byte) arg0;
		this.anInt8931 = arg2;
		this.aShort115 = (short) arg7;
		this.aShort117 = (short) arg6;
		this.aBoolean618 = arg8;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(Z)I")
	public abstract int method7342();

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public void method7344() {
	}
}
