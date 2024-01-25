import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class114 {

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
	public int anInt3031 = Static376.method5592();

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	public int anInt3034;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public int anInt3032;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	public int anInt3033;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
	public int anInt3037;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString25 = arg3;
		this.aString27 = arg5;
		this.aString26 = arg2;
		this.anInt3034 = arg1;
		this.anInt3032 = arg6;
		this.anInt3033 = arg0;
		this.aString24 = arg7;
		this.anInt3037 = Static565.anInt8921;
		this.aString23 = arg4;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public void method2834(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt3031 = Static376.method5592();
		this.aString23 = arg0;
		this.aString24 = arg6;
		this.anInt3034 = arg5;
		this.anInt3032 = arg2;
		this.aString27 = arg7;
		this.aString25 = arg1;
		this.aString26 = arg3;
		this.anInt3033 = arg4;
		this.anInt3037 = Static565.anInt8921;
	}
}
