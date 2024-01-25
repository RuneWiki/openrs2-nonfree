import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public final class Class7_Sub32 extends Class7 {

	@OriginalMember(owner = "client!r", name = "o", descriptor = "I")
	public final int anInt5225;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	public final int anInt5226;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Ljava/lang/String;")
	public String aString330;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "I")
	public final int anInt5227;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public int anInt5229;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "J")
	public final long aLong169;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString331;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class7_Sub32(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5225 = arg6;
		this.anInt5226 = arg5;
		this.aString330 = arg1;
		this.anInt5227 = arg2;
		this.anInt5229 = arg3;
		this.aLong169 = arg4;
		this.aString331 = arg0;
	}
}
