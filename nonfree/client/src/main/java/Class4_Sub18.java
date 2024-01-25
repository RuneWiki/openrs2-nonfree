import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public final int anInt3163;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
	public final int anInt3159;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
	public final int anInt3161;

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "Z")
	public final boolean aBoolean249;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Z")
	public final boolean aBoolean248;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
	public int anInt3158;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "J")
	public final long aLong74;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
	public final int anInt3157;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class4_Sub18(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt3163 = arg6;
		this.aString27 = arg0;
		this.anInt3159 = arg2;
		this.aString26 = arg1;
		this.anInt3161 = arg7;
		this.aBoolean249 = arg8;
		this.aBoolean248 = arg9;
		this.anInt3158 = arg3;
		this.aLong74 = arg5;
		this.anInt3157 = arg4;
	}
}
