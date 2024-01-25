import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public final class Class90 {

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString46;

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
	public final int anInt2666;

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString45;

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "J")
	public final long aLong101;

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
	public final int anInt2665;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString46 = arg1;
		this.anInt2666 = arg0;
		this.aString45 = arg3;
		this.aLong101 = arg4;
		this.anInt2665 = arg2;
	}
}
