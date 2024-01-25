import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class155 {

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "J")
	public final long aLong119;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString43;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString42;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public final int anInt4016;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	public final int anInt4015;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class155(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong119 = arg4;
		this.aString43 = arg1;
		this.aString42 = arg3;
		this.anInt4016 = arg0;
		this.anInt4015 = arg2;
	}
}
