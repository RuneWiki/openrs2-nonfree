import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class6_Sub32 extends Class6 {

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString208;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
	public final int anInt4927;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "Ljava/lang/String;")
	public String aString209;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
	public final int anInt4929;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	public final int anInt4931;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "J")
	public final long aLong156;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
	public int anInt4932;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class6_Sub32(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aString208 = arg0;
		this.anInt4927 = arg2;
		this.aString209 = arg1;
		this.anInt4929 = arg6;
		this.anInt4931 = arg5;
		this.aLong156 = arg4;
		this.anInt4932 = arg3;
	}
}
