import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class307 {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	public int anInt8084 = Static586.method5385();

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Ljava/lang/String;")
	public String aString81;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	public int anInt8086;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public int anInt8085;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
	public int anInt8087;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public int anInt8088;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "Ljava/lang/String;")
	public String aString80;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Ljava/lang/String;")
	public String aString79;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Ljava/lang/String;")
	public String aString78;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString81 = arg7;
		this.anInt8086 = arg1;
		this.anInt8085 = arg6;
		this.anInt8087 = arg0;
		this.anInt8088 = Static301.anInt5197;
		this.aString80 = arg4;
		this.aString79 = arg3;
		this.aString78 = arg2;
		this.aString82 = arg5;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;I)V")
	public void method6514(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		this.anInt8084 = Static586.method5385();
		this.anInt8086 = arg0;
		this.aString78 = arg6;
		this.anInt8088 = Static301.anInt5197;
		this.aString81 = arg3;
		this.aString80 = arg1;
		this.aString79 = arg4;
		this.anInt8085 = arg2;
		this.aString82 = arg5;
		this.anInt8087 = arg7;
	}
}
