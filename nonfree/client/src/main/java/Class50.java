import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class50 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	public int anInt1317 = Static480.method6620();

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	public int anInt1320;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public int anInt1316;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public int anInt1322;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	public int anInt1318;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		this.anInt1320 = arg0;
		this.anInt1316 = arg5;
		this.aString10 = arg3;
		this.anInt1322 = Static436.anInt6850;
		this.aString8 = arg4;
		this.anInt1318 = arg1;
		this.aString11 = arg2;
		this.aString9 = arg6;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;BLjava/lang/String;Ljava/lang/String;)V")
	public void method1245(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		this.anInt1317 = Static480.method6620();
		this.anInt1320 = arg2;
		this.anInt1322 = Static436.anInt6850;
		this.aString11 = arg4;
		this.anInt1318 = arg1;
		this.aString10 = arg5;
		this.aString8 = arg6;
		this.aString9 = arg0;
		this.anInt1316 = arg3;
	}
}
