import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class359 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public final int anInt9152;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString112;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public final int anInt9153;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString113;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "J")
	public final long aLong266;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class359(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt9152 = arg0;
		this.aString112 = arg3;
		this.anInt9153 = arg2;
		this.aString113 = arg1;
		this.aLong266 = arg4;
	}
}
