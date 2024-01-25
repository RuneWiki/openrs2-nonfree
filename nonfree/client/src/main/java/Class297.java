import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class297 {

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString115;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public final int anInt8435;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "J")
	public final long aLong251;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	public final int anInt8434;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString114;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class297(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString115 = arg3;
		this.anInt8435 = arg2;
		this.aLong251 = arg4;
		this.anInt8434 = arg0;
		this.aString114 = arg1;
	}
}
