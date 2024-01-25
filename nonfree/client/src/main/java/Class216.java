import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class216 {

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
	public final int anInt5947;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public final int anInt5946;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "J")
	public final long aLong168;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class216(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt5947 = arg0;
		this.anInt5946 = arg2;
		this.aLong168 = arg4;
		this.aString79 = arg1;
		this.aString78 = arg3;
	}
}
