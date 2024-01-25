import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "Z")
	public final boolean aBoolean218;

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "Z")
	public final boolean aBoolean217;

	@OriginalMember(owner = "client!hda", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString36;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
	public final int anInt3163;

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
	public final int anInt3166;

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
	public final int anInt3167;

	@OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
	public final int anInt3164;

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
	public int anInt3161;

	@OriginalMember(owner = "client!hda", name = "r", descriptor = "J")
	public final long aLong150;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub24(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString35 = arg1;
		this.aBoolean218 = arg8;
		this.aBoolean217 = arg9;
		this.aString36 = arg0;
		this.anInt3163 = arg6;
		this.anInt3166 = arg4;
		this.anInt3167 = arg2;
		this.anInt3164 = arg7;
		this.anInt3161 = arg3;
		this.aLong150 = arg5;
	}
}
