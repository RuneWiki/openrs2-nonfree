import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class168 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString59;

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
	public final int anInt5423;

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "J")
	public final long aLong142;

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
	public final int anInt5422;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString59 = arg3;
		this.anInt5423 = arg0;
		this.aString60 = arg1;
		this.aLong142 = arg4;
		this.anInt5422 = arg2;
	}
}
