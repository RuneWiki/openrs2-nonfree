import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class282 {

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	public final int anInt7766;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString91;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "J")
	public final long aLong197;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString90;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
	public final int anInt7767;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class282(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt7766 = arg0;
		this.aString91 = arg3;
		this.aLong197 = arg4;
		this.aString90 = arg1;
		this.anInt7767 = arg2;
	}
}
