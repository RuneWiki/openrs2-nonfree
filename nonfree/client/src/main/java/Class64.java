import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class64 {

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "J")
	public final long aLong43;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString20;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	public final int anInt1799;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
	public final int anInt1798;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong43 = arg4;
		this.aString19 = arg3;
		this.aString20 = arg1;
		this.anInt1799 = arg0;
		this.anInt1798 = arg2;
	}
}
