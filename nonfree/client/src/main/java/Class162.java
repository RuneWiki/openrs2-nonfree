import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class162 {

	@OriginalMember(owner = "client!is", name = "c", descriptor = "I")
	public final int anInt4277;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString38;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString39;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "J")
	public final long aLong120;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "I")
	public final int anInt4278;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class162(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt4277 = arg2;
		this.aString38 = arg1;
		this.aString39 = arg3;
		this.aLong120 = arg4;
		this.anInt4278 = arg0;
	}
}
