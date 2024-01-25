import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class98 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "J")
	public final long aLong70;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public final int anInt2591;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public final int anInt2586;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class98(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong70 = arg4;
		this.aString57 = arg3;
		this.anInt2591 = arg0;
		this.aString56 = arg1;
		this.anInt2586 = arg2;
	}
}
