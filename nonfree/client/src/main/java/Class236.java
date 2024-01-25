import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class236 {

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	public final int anInt6355;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "J")
	public final long aLong197;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString89;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString88;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public final int anInt6354;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt6355 = arg2;
		this.aLong197 = arg4;
		this.aString89 = arg3;
		this.aString88 = arg1;
		this.anInt6354 = arg0;
	}
}
