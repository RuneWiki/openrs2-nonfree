import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public final class Class254 {

	@OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
	public int anInt6923 = Static379.method5505();

	@OriginalMember(owner = "client!pfa", name = "n", descriptor = "Ljava/lang/String;")
	public String aString74;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
	public int anInt6915;

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
	public int anInt6921;

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
	public int anInt6916;

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!pfa", name = "m", descriptor = "Ljava/lang/String;")
	public String aString73;

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
	public int anInt6919;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString74 = arg2;
		this.anInt6915 = arg1;
		this.anInt6921 = arg6;
		this.anInt6916 = arg0;
		this.aString70 = arg7;
		this.aString72 = arg4;
		this.aString71 = arg5;
		this.aString73 = arg3;
		this.anInt6919 = Static81.anInt1910;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;)V")
	public void method5686(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(8) String arg7) {
		this.anInt6923 = Static379.method5505();
		this.anInt6921 = arg2;
		this.anInt6919 = Static81.anInt1910;
		this.aString71 = arg0;
		this.anInt6916 = arg1;
		this.aString74 = arg5;
		this.aString73 = arg6;
		this.aString70 = arg3;
		this.aString72 = arg7;
		this.anInt6915 = arg4;
	}
}
