import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class237 {

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString59;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public final int anInt6600;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public final int anInt6599;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "J")
	public final long aLong182;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString59 = arg3;
		this.anInt6600 = arg0;
		this.anInt6599 = arg2;
		this.aLong182 = arg4;
		this.aString58 = arg1;
	}
}
