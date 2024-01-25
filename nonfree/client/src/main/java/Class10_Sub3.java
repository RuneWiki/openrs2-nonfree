import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
	public int anInt5909;

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "S")
	public short aShort81;

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "B")
	public final byte aByte63;

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
	public int anInt5908;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "Z")
	public final boolean aBoolean412;

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "B")
	public byte aByte64;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
	public int anInt5907;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "S")
	public short aShort80;

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
	public int anInt5910;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class10_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort81 = (short) arg7;
		this.aByte63 = arg9;
		this.anInt5908 = (short) arg3;
		this.aShort82 = (short) arg6;
		this.aShort83 = (short) arg4;
		this.aBoolean412 = arg8;
		this.aByte64 = (byte) arg0;
		this.anInt5907 = (short) arg2;
		this.aShort80 = (short) arg5;
		this.anInt5910 = (short) arg1;
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)I")
	public abstract int method5345();

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
	public void method5347() {
	}
}
