import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public int anInt9220;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	public int anInt9223;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public int anInt9218;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
	public final boolean aBoolean646;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	public int anInt9222;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class29_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort121 = (short) arg6;
		this.aByte103 = (byte) arg0;
		this.aByte104 = arg9;
		this.aShort122 = (short) arg4;
		this.aShort124 = (short) arg5;
		this.anInt9223 = arg2;
		this.anInt9218 = arg3;
		this.aBoolean646 = arg8;
		this.anInt9222 = arg1;
		this.aShort123 = (short) arg7;
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)I")
	public abstract int method7546();

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public void method7547() {
	}
}
