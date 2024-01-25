import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class300 {

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString90;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "J")
	public final long aLong262;

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString89;

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "I")
	public final int anInt8494;

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
	public final int anInt8491;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class300(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString90 = arg3;
		this.aLong262 = arg4;
		this.aString89 = arg1;
		this.anInt8494 = arg0;
		this.anInt8491 = arg2;
	}
}
