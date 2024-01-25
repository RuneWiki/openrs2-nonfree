import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class52 {

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "J")
	public final long aLong40;

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString12;

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
	public final int anInt780;

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
	public final int anInt782;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong40 = arg4;
		this.aString12 = arg1;
		this.aString11 = arg3;
		this.anInt780 = arg0;
		this.anInt782 = arg2;
	}
}
