import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class Class24_Sub3 extends Class24 {

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
	public int anInt7093;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Z")
	public final boolean aBoolean468;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "B")
	public byte aByte98;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
	public int anInt7094;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "S")
	public short aShort106;

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
	public int anInt7096;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public int anInt7092;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class24_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort104 = (short) arg7;
		this.aShort107 = (short) arg4;
		this.aByte97 = arg9;
		this.aShort105 = (short) arg6;
		this.aBoolean468 = arg8;
		this.aByte98 = (byte) arg0;
		this.anInt7094 = arg3;
		this.aShort106 = (short) arg5;
		this.anInt7096 = arg2;
		this.anInt7092 = arg1;
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(I)I")
	public abstract int method5579();

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "(I)V")
	public void method5580() {
	}
}
