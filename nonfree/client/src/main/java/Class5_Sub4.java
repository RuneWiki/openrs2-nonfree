import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "J")
	public final long aLong24;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
	public int anInt785;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
	public final int anInt784;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
	public final int anInt781;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString47;

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
	public final int anInt790;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class5_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aLong24 = arg4;
		this.aString48 = arg1;
		this.anInt785 = arg3;
		this.anInt784 = arg2;
		this.anInt781 = arg6;
		this.aString47 = arg0;
		this.anInt790 = arg5;
	}
}
