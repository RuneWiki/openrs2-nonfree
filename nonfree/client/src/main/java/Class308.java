import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class308 {

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	public final int anInt9286;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "J")
	public final long aLong257;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString197;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
	public final int anInt9288;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString196;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class308(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt9286 = arg2;
		this.aLong257 = arg4;
		this.aString197 = arg1;
		this.anInt9288 = arg0;
		this.aString196 = arg3;
	}
}
