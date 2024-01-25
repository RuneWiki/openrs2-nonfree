import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "Z")
	public final boolean aBoolean116;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public final int anInt1417;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	public final int anInt1422;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
	public final int anInt1420;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Z")
	public final boolean aBoolean117;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "J")
	public final long aLong48;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
	public final int anInt1421;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public int anInt1419;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub11(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean116 = arg9;
		this.anInt1417 = arg7;
		this.anInt1422 = arg4;
		this.anInt1420 = arg2;
		this.aString15 = arg0;
		this.aBoolean117 = arg8;
		this.aLong48 = arg5;
		this.aString16 = arg1;
		this.anInt1421 = arg6;
		this.anInt1419 = arg3;
	}
}
