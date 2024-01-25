import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class4_Sub39 extends Class4 {

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
	public int anInt5716;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
	public final int anInt5718;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "J")
	public final long aLong184;

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
	public final int anInt5722;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
	public final int anInt5717;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class4_Sub39(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aString59 = arg1;
		this.anInt5716 = arg3;
		this.anInt5718 = arg6;
		this.aLong184 = arg4;
		this.anInt5722 = arg5;
		this.anInt5717 = arg2;
		this.aString60 = arg0;
	}
}
