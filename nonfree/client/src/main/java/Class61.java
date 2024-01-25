import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public final class Class61 {

	@OriginalMember(owner = "client!cja", name = "h", descriptor = "J")
	public final long aLong44;

	@OriginalMember(owner = "client!cja", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "I")
	public final int anInt1399;

	@OriginalMember(owner = "client!cja", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString12;

	@OriginalMember(owner = "client!cja", name = "c", descriptor = "I")
	public final int anInt1400;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aLong44 = arg4;
		this.aString11 = arg1;
		this.anInt1399 = arg0;
		this.aString12 = arg3;
		this.anInt1400 = arg2;
	}
}
