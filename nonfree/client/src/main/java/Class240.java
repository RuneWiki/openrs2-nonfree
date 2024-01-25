import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public final class Class240 {

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString54;

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "J")
	public final long aLong168;

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
	public final int anInt6638;

	@OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
	public final int anInt6640;

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString55;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString54 = arg3;
		this.aLong168 = arg4;
		this.anInt6638 = arg0;
		this.anInt6640 = arg2;
		this.aString55 = arg1;
	}
}
