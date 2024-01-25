import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class15 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	public final int anInt307;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public final int anInt308;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "J")
	public final long aLong12;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt307 = arg0;
		this.anInt308 = arg2;
		this.aString2 = arg1;
		this.aString3 = arg3;
		this.aLong12 = arg4;
	}
}
