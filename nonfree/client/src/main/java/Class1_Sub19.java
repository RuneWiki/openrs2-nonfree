import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "Z")
	public final boolean aBoolean275;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	public int anInt2416;

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
	public final int anInt2419;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
	public final int anInt2418;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
	public final int anInt2417;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString32;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "J")
	public final long aLong74;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "Z")
	public final boolean aBoolean274;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
	public final int anInt2421;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub19(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString31 = arg1;
		this.aBoolean275 = arg8;
		this.anInt2416 = arg3;
		this.anInt2419 = arg6;
		this.anInt2418 = arg2;
		this.anInt2417 = arg4;
		this.aString32 = arg0;
		this.aLong74 = arg5;
		this.aBoolean274 = arg9;
		this.anInt2421 = arg7;
	}
}
