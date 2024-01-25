import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class19 {

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString7;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "J")
	public final long aLong21;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString6;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "I")
	public final int anInt741;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public final int anInt738;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString7 = arg3;
		this.aLong21 = arg4;
		this.aString6 = arg1;
		this.anInt741 = arg2;
		this.anInt738 = arg0;
	}
}
