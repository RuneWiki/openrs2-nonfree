import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	public int anInt7489;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "Z")
	public final boolean aBoolean484;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	public int anInt7490;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	public int anInt7488;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
	public int anInt7495;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aByte103 = arg9;
		this.aBoolean484 = arg8;
		this.anInt7490 = arg1;
		this.aByte102 = (byte) arg0;
		this.aShort105 = (short) arg5;
		this.aShort104 = (short) arg4;
		this.anInt7488 = arg3;
		this.anInt7495 = arg2;
		this.aShort103 = (short) arg6;
		this.aShort102 = (short) arg7;
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)I")
	public abstract int method5724();

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
	public void method5726() {
	}
}
