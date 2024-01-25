import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public int anInt7506;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Z")
	public final boolean aBoolean505;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "B")
	public byte aByte105;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "S")
	public short aShort106;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	public int anInt7501;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public int anInt7502;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public int anInt7500;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "S")
	public short aShort107;

	static {
		new Class60("", 73);
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort105 = (short) arg7;
		this.aShort104 = (short) arg5;
		this.aByte104 = arg9;
		this.aBoolean505 = arg8;
		this.aByte105 = (byte) arg0;
		this.aShort106 = (short) arg6;
		this.anInt7501 = arg2;
		this.anInt7502 = arg3;
		this.anInt7500 = arg1;
		this.aShort107 = (short) arg4;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I")
	public abstract int method6031();

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
	public void method6032() {
	}
}
