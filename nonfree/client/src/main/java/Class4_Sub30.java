import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class4_Sub30 extends Class4 {

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	public final int anInt4614;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "J")
	public final long aLong136;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	public final int anInt4620;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public final int anInt4617;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	public final int anInt4616;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Z")
	public final boolean aBoolean344;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public int anInt4615;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Z")
	public final boolean aBoolean345;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class4_Sub30(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt4614 = arg6;
		this.aLong136 = arg5;
		this.anInt4620 = arg4;
		this.anInt4617 = arg7;
		this.aString39 = arg1;
		this.anInt4616 = arg2;
		this.aBoolean344 = arg9;
		this.anInt4615 = arg3;
		this.aString40 = arg0;
		this.aBoolean345 = arg8;
	}
}
