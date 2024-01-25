import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class232 {

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
	public int anInt6339 = Static200.method3613();

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!oca", name = "h", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
	public int anInt6337;

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
	public int anInt6342;

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
	public int anInt6340;

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt6343 = arg6;
		this.aString52 = arg7;
		this.anInt6337 = arg1;
		this.aString49 = arg5;
		this.aString50 = arg4;
		this.anInt6342 = arg0;
		this.anInt6340 = Static312.anInt5688;
		this.aString48 = arg3;
		this.aString51 = arg2;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;IZILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public void method5428(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt6339 = Static200.method3613();
		this.anInt6342 = arg2;
		this.anInt6343 = arg1;
		this.aString51 = arg6;
		this.aString50 = arg7;
		this.aString48 = arg3;
		this.anInt6340 = Static312.anInt5688;
		this.anInt6337 = arg4;
		this.aString49 = arg0;
		this.aString52 = arg5;
	}
}
