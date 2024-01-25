import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
	public int anInt6796;

	@OriginalMember(owner = "client!mt", name = "A", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
	public int anInt6797;

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
	public int anInt6798;

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "Z")
	public final boolean aBoolean479;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
	public int anInt6800;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort97 = (short) arg5;
		this.aShort94 = (short) arg7;
		this.aByte74 = arg9;
		this.anInt6797 = (short) arg2;
		this.anInt6798 = (short) arg3;
		this.aShort95 = (short) arg4;
		this.aShort96 = (short) arg6;
		this.aByte73 = (byte) arg0;
		this.aBoolean479 = arg8;
		this.anInt6800 = (short) arg1;
	}

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "(I)I")
	public abstract int method5894();

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "(I)V")
	public void method5898() {
	}
}
