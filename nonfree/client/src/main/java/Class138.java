import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public final class Class138 {

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
	public int anInt3977 = Static189.method3458();

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "Ljava/lang/String;")
	public String aString38;

	@OriginalMember(owner = "client!hea", name = "j", descriptor = "I")
	public int anInt3974;

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!hea", name = "o", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!hea", name = "q", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
	public int anInt3979;

	@OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
	public int anInt3978;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt3973 = arg1;
		this.aString38 = arg7;
		this.anInt3974 = Static237.anInt7561;
		this.aString36 = arg5;
		this.aString37 = arg2;
		this.aString39 = arg4;
		this.aString40 = arg3;
		this.anInt3979 = arg0;
		this.anInt3978 = arg6;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V")
	public void method3465(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		this.anInt3977 = Static189.method3458();
		this.aString36 = arg3;
		this.anInt3974 = Static237.anInt7561;
		this.aString38 = arg1;
		this.aString37 = arg5;
		this.anInt3978 = arg4;
		this.anInt3973 = arg7;
		this.anInt3979 = arg0;
		this.aString39 = arg2;
		this.aString40 = arg6;
	}
}
