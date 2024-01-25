import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public final class Class108 {

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "J")
	public final long aLong87;

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
	public final int anInt3958;

	@OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
	public final int anInt3959;

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString38;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString37;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong87 = arg4;
		this.anInt3958 = arg2;
		this.anInt3959 = arg0;
		this.aString38 = arg3;
		this.aString37 = arg1;
	}
}
