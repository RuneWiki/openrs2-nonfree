import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public final class Class18 {

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
	public final int anInt680;

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "J")
	public final long aLong7;

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString6;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
	public final int anInt679;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString5 = arg1;
		this.anInt680 = arg2;
		this.aLong7 = arg4;
		this.aString6 = arg3;
		this.anInt679 = arg0;
	}
}
