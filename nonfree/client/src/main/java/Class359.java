import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class359 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public int anInt9340 = Static101.method1868();

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	public int anInt9346;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public int anInt9339;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public int anInt9342;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public int anInt9341;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString92 = arg5;
		this.aString89 = arg4;
		this.aString90 = arg3;
		this.anInt9346 = arg1;
		this.anInt9339 = arg0;
		this.anInt9342 = Static506.anInt8251;
		this.aString88 = arg7;
		this.aString91 = arg2;
		this.anInt9341 = arg6;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)V")
	public void method7759(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt9340 = Static101.method1868();
		this.aString89 = arg5;
		this.anInt9341 = arg2;
		this.aString88 = arg7;
		this.anInt9342 = Static506.anInt8251;
		this.anInt9346 = arg0;
		this.anInt9339 = arg3;
		this.aString90 = arg1;
		this.aString92 = arg6;
		this.aString91 = arg4;
	}
}
