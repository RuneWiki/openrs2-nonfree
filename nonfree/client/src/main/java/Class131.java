import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class131 {

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
	public int anInt3329 = Static664.method5817();

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
	public int anInt3325;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	public int anInt3328;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
	public int anInt3324;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
	public int anInt3327;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "Ljava/lang/String;")
	public String aString38;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString36 = arg2;
		this.aString37 = arg3;
		this.anInt3325 = arg1;
		this.anInt3328 = arg6;
		this.aString39 = arg4;
		this.anInt3324 = arg0;
		this.anInt3327 = Static621.anInt9665;
		this.aString40 = arg5;
		this.aString38 = arg7;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;BLjava/lang/String;ILjava/lang/String;)V")
	public void method2931(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt3329 = Static664.method5817();
		this.anInt3327 = Static621.anInt9665;
		this.aString39 = arg0;
		this.anInt3328 = arg1;
		this.aString40 = arg4;
		this.aString36 = arg7;
		this.anInt3324 = arg6;
		this.aString38 = arg5;
		this.aString37 = arg2;
		this.anInt3325 = arg3;
	}
}
