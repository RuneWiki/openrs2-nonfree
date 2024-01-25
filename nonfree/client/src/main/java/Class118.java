import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public final class Class118 {

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString20;

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
	public final int anInt3328;

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
	public final int anInt3332;

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "J")
	public final long aLong65;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString20 = arg1;
		this.aString21 = arg3;
		this.anInt3328 = arg2;
		this.anInt3332 = arg0;
		this.aLong65 = arg4;
	}
}
