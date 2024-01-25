import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class138 {

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	public final int anInt4341;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "J")
	public final long aLong85;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public final int anInt4340;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString49;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt4341 = arg0;
		this.aLong85 = arg4;
		this.aString48 = arg1;
		this.anInt4340 = arg2;
		this.aString49 = arg3;
	}
}
