import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class5_Sub41 extends Class5 {

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "Z")
	public final boolean aBoolean458;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "J")
	public final long aLong215;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
	public final int anInt6818;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	public final int anInt6820;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
	public int anInt6815;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public final int anInt6816;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Z")
	public final boolean aBoolean457;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
	public final int anInt6819;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class5_Sub41(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString72 = arg1;
		this.aBoolean458 = arg9;
		this.aLong215 = arg5;
		this.anInt6818 = arg6;
		this.anInt6820 = arg4;
		this.anInt6815 = arg3;
		this.anInt6816 = arg2;
		this.aBoolean457 = arg8;
		this.anInt6819 = arg7;
		this.aString71 = arg0;
	}
}
