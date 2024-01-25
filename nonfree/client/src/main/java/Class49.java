import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class49 {

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "J")
	public final long aLong47;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	public final int anInt1929;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public final int anInt1928;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString8 = arg3;
		this.aLong47 = arg4;
		this.aString9 = arg1;
		this.anInt1929 = arg2;
		this.anInt1928 = arg0;
	}
}
