import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
	public final int anInt898;

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "Z")
	public final boolean aBoolean60;

	@OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
	public final int anInt897;

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
	public final int anInt896;

	@OriginalMember(owner = "client!bfa", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString6;

	@OriginalMember(owner = "client!bfa", name = "s", descriptor = "I")
	public final int anInt899;

	@OriginalMember(owner = "client!bfa", name = "v", descriptor = "I")
	public int anInt902;

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!bfa", name = "z", descriptor = "Z")
	public final boolean aBoolean61;

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "J")
	public final long aLong30;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub5(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt898 = arg6;
		this.aBoolean60 = arg9;
		this.anInt897 = arg7;
		this.anInt896 = arg4;
		this.aString6 = arg0;
		this.anInt899 = arg2;
		this.anInt902 = arg3;
		this.aString7 = arg1;
		this.aBoolean61 = arg8;
		this.aLong30 = arg5;
	}
}
