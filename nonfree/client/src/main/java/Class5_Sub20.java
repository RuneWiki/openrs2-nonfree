import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	public int anInt2094;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "J")
	public final long aLong73;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString14;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "I")
	public final int anInt2096;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "I")
	public final int anInt2092;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "I")
	public final int anInt2093;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class5_Sub20(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2094 = arg3;
		this.aString13 = arg1;
		this.aLong73 = arg4;
		this.aString14 = arg0;
		this.anInt2096 = arg2;
		this.anInt2092 = arg6;
		this.anInt2093 = arg5;
	}
}
