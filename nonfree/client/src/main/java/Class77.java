import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class77 {

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString22;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	public final int anInt3030;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "J")
	public final long aLong72;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
	public final int anInt3029;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString22 = arg3;
		this.aString23 = arg1;
		this.anInt3030 = arg0;
		this.aLong72 = arg4;
		this.anInt3029 = arg2;
	}
}
