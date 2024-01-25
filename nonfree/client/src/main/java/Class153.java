import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class153 {

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public int anInt3946 = Static138.method2731();

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public int anInt3951;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Ljava/lang/String;")
	public String aString38;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public int anInt3947;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	public int anInt3948;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public int anInt3943;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString39 = arg3;
		this.anInt3951 = arg6;
		this.aString37 = arg7;
		this.aString38 = arg5;
		this.anInt3947 = arg1;
		this.anInt3948 = arg0;
		this.aString40 = arg4;
		this.anInt3943 = Static106.anInt2418;
		this.aString41 = arg2;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public void method3530(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.anInt3946 = Static138.method2731();
		this.aString37 = arg1;
		this.aString41 = arg2;
		this.aString38 = arg4;
		this.anInt3948 = arg0;
		this.anInt3947 = arg7;
		this.aString39 = arg3;
		this.aString40 = arg5;
		this.anInt3951 = arg6;
		this.anInt3943 = Static106.anInt2418;
	}
}
