import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class20 {

	@OriginalMember(owner = "client!an", name = "l", descriptor = "I")
	public int anInt297 = Static365.method4250();

	@OriginalMember(owner = "client!an", name = "e", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "I")
	public int anInt292;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString4 = arg7;
		this.anInt295 = arg0;
		this.anInt294 = Static631.anInt10493;
		this.aString6 = arg5;
		this.aString2 = arg3;
		this.aString5 = arg2;
		this.anInt292 = arg1;
		this.aString3 = arg4;
		this.anInt296 = arg6;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IB)V")
	public void method258(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7) {
		this.anInt297 = Static365.method4250();
		this.aString2 = arg1;
		this.aString3 = arg4;
		this.aString6 = arg6;
		this.anInt296 = arg3;
		this.aString5 = arg0;
		this.anInt292 = arg5;
		this.anInt294 = Static631.anInt10493;
		this.aString4 = arg2;
		this.anInt295 = arg7;
	}
}
