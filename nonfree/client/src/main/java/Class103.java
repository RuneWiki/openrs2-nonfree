import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class103 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public final int anInt2908;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public final int anInt2911;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString22;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "J")
	public final long aLong70;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt2908 = arg0;
		this.anInt2911 = arg2;
		this.aString22 = arg3;
		this.aString23 = arg1;
		this.aLong70 = arg4;
	}
}
