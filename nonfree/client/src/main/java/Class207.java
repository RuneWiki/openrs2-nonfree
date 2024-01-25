import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class207 {

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString47;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
	public final int anInt6308;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString46;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "J")
	public final long aLong188;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public final int anInt6309;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString47 = arg1;
		this.anInt6308 = arg2;
		this.aString46 = arg3;
		this.aLong188 = arg4;
		this.anInt6309 = arg0;
	}
}
