import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class188 {

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public int anInt5378 = Static372.method5271();

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Ljava/lang/String;")
	public String aString46;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public int anInt5380;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public int anInt5377;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	public int anInt5379;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public int anInt5376;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		this.aString48 = arg3;
		this.aString46 = arg4;
		this.anInt5380 = arg0;
		this.anInt5377 = arg1;
		this.aString45 = arg6;
		this.anInt5379 = arg5;
		this.aString47 = arg2;
		this.anInt5376 = Static277.anInt2834;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public void method4481(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		this.anInt5378 = Static372.method5271();
		this.anInt5380 = arg6;
		this.aString45 = arg2;
		this.anInt5379 = arg1;
		this.aString48 = arg5;
		this.aString46 = arg0;
		this.anInt5377 = arg3;
		this.anInt5376 = Static277.anInt2834;
		this.aString47 = arg4;
	}
}
