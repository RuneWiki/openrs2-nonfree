import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class242 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public final int anInt7297;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "J")
	public final long aLong188;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public final int anInt7296;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString85;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt7297 = arg0;
		this.aLong188 = arg4;
		this.anInt7296 = arg2;
		this.aString86 = arg1;
		this.aString85 = arg3;
	}
}
