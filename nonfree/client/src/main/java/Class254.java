import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class254 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString157;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
	public final int anInt7845;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString158;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "J")
	public final long aLong186;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
	public final int anInt7849;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString157 = arg1;
		this.anInt7845 = arg2;
		this.aString158 = arg3;
		this.aLong186 = arg4;
		this.anInt7849 = arg0;
	}
}
