import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "S")
	public short aShort93;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "I")
	public int anInt6728;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public int anInt6722;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Z")
	public final boolean aBoolean553;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	public int anInt6726;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort92 = (short) arg7;
		this.aShort93 = (short) arg5;
		this.anInt6728 = (short) arg1;
		this.anInt6722 = (short) arg2;
		this.aByte74 = arg9;
		this.aShort91 = (short) arg6;
		this.aByte73 = (byte) arg0;
		this.aBoolean553 = arg8;
		this.aShort94 = (short) arg4;
		this.anInt6726 = (short) arg3;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
	public void method5828() {
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)I")
	public abstract int method5829();
}
