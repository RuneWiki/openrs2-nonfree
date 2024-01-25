import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public abstract class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
	public int anInt7067;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public int anInt7064;

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "B")
	public final byte aByte96;

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
	public int anInt7066;

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "S")
	public short aShort106;

	@OriginalMember(owner = "client!tp", name = "s", descriptor = "B")
	public byte aByte97;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
	public int anInt7060;

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "Z")
	public final boolean aBoolean591;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class47_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort105 = (short) arg6;
		this.anInt7064 = arg2;
		this.aByte96 = arg9;
		this.aShort107 = (short) arg5;
		this.anInt7066 = arg3;
		this.aShort106 = (short) arg7;
		this.aByte97 = (byte) arg0;
		this.anInt7060 = arg1;
		this.aShort104 = (short) arg4;
		this.aBoolean591 = arg8;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V")
	public void method5446() {
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(Z)I")
	public abstract int method5447();
}
