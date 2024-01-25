import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
	public int anInt7324;

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "Z")
	public final boolean aBoolean621;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	public final int anInt7316;

	@OriginalMember(owner = "client!oi", name = "E", descriptor = "Z")
	public final boolean aBoolean622;

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
	public final int anInt7323;

	@OriginalMember(owner = "client!oi", name = "D", descriptor = "J")
	public final long aLong191;

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString87;

	@OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
	public final int anInt7326;

	@OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
	public final int anInt7325;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class3_Sub40(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt7324 = arg3;
		this.aString88 = arg1;
		this.aBoolean621 = arg9;
		this.anInt7316 = arg4;
		this.aBoolean622 = arg8;
		this.anInt7323 = arg2;
		this.aLong191 = arg5;
		this.aString87 = arg0;
		this.anInt7326 = arg6;
		this.anInt7325 = arg7;
	}
}
