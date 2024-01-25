import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
	public int anInt6676;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	public int anInt6673;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "B")
	public byte aByte93;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
	public int anInt6677;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "Z")
	public final boolean aBoolean450;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
	public int anInt6675;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort96 = (short) arg7;
		this.anInt6673 = arg2;
		this.aByte94 = arg9;
		this.aByte93 = (byte) arg0;
		this.anInt6677 = arg3;
		this.aShort97 = (short) arg4;
		this.aShort98 = (short) arg5;
		this.aBoolean450 = arg8;
		this.aShort95 = (short) arg6;
		this.anInt6675 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)I")
	public abstract int method5503();

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
	public void method5505() {
	}
}
