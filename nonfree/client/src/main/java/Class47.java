import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class47 {

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
	public final int anInt1027;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString6;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	public final int anInt1026;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString5;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "J")
	public final long aLong41;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.anInt1027 = arg2;
		this.aString6 = arg3;
		this.anInt1026 = arg0;
		this.aString5 = arg1;
		this.aLong41 = arg4;
	}
}
