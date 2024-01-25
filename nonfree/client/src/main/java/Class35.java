import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class35 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "J")
	public final long aLong30;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString17;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString16;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public final int anInt654;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	public final int anInt653;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong30 = arg4;
		this.aString17 = arg3;
		this.aString16 = arg1;
		this.anInt654 = arg2;
		this.anInt653 = arg0;
	}
}
