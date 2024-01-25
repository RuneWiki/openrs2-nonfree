import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!en", name = "m", descriptor = "Z")
	public final boolean aBoolean173;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "I")
	public int anInt2182;

	@OriginalMember(owner = "client!en", name = "r", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString13;

	@OriginalMember(owner = "client!en", name = "n", descriptor = "I")
	public final int anInt2181;

	@OriginalMember(owner = "client!en", name = "o", descriptor = "Z")
	public final boolean aBoolean174;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "I")
	public final int anInt2183;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "I")
	public final int anInt2180;

	@OriginalMember(owner = "client!en", name = "x", descriptor = "I")
	public final int anInt2185;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "J")
	public final long aLong76;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub14(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean173 = arg8;
		this.anInt2182 = arg3;
		this.aString12 = arg1;
		this.aString13 = arg0;
		this.anInt2181 = arg6;
		this.aBoolean174 = arg9;
		this.anInt2183 = arg4;
		this.anInt2180 = arg7;
		this.anInt2185 = arg2;
		this.aLong76 = arg5;
	}
}
