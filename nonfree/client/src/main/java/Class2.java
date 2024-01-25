import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public int anInt11 = Static621.method8394();

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt13;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt12 = arg0;
		this.aString2 = arg4;
		this.aString5 = arg5;
		this.aString4 = arg7;
		this.aString1 = arg3;
		this.aString3 = arg2;
		this.anInt13 = Static122.anInt2190;
		this.anInt9 = arg6;
		this.anInt10 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;)V")
	public void method26(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt11 = Static621.method8394();
		this.aString3 = arg2;
		this.aString4 = arg0;
		this.aString2 = arg1;
		this.anInt12 = arg4;
		this.anInt13 = Static122.anInt2190;
		this.anInt9 = arg5;
		this.aString5 = arg6;
		this.anInt10 = arg3;
		this.aString1 = arg7;
	}
}
