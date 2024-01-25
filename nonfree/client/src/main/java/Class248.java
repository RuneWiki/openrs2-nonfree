import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class248 {

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public final int anInt7649;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "J")
	public final long aLong183;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString85;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public final int anInt7652;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class248(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt7649 = arg2;
		this.aLong183 = arg4;
		this.aString86 = arg3;
		this.aString85 = arg1;
		this.anInt7652 = arg0;
	}
}
