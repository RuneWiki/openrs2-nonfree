import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class284 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
	public int anInt8496 = Static88.method1786();

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
	public int anInt8500 = Static223.anInt4829;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
	public int anInt8498;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
	public int anInt8503;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	public int anInt8497;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Ljava/lang/String;")
	public String aString68;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt8498 = arg0;
		this.anInt8503 = arg1;
		this.aString69 = arg3;
		this.anInt8497 = arg6;
		this.aString72 = arg5;
		this.aString68 = arg7;
		this.aString70 = arg2;
		this.aString71 = arg4;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IBIILjava/lang/String;)V")
	public void method7028(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt8496 = Static88.method1786();
		this.aString68 = arg1;
		this.anInt8497 = arg5;
		this.anInt8500 = Static223.anInt4829;
		this.aString72 = arg2;
		this.anInt8503 = arg6;
		this.anInt8498 = arg4;
		this.aString69 = arg0;
		this.aString70 = arg7;
		this.aString71 = arg3;
	}
}
