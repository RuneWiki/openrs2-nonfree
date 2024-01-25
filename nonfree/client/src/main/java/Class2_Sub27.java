import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "Z")
	public final boolean aBoolean322;

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString52;

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
	public int anInt4323;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "Z")
	public final boolean aBoolean321;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
	public final int anInt4325;

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
	public final int anInt4324;

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
	public final int anInt4327;

	@OriginalMember(owner = "client!jw", name = "s", descriptor = "J")
	public final long aLong113;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
	public final int anInt4326;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub27(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean322 = arg8;
		this.aString52 = arg0;
		this.anInt4323 = arg3;
		this.aBoolean321 = arg9;
		this.anInt4325 = arg4;
		this.aString53 = arg1;
		this.anInt4324 = arg7;
		this.anInt4327 = arg6;
		this.aLong113 = arg5;
		this.anInt4326 = arg2;
	}
}
