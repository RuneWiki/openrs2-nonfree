import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class134 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public int anInt3815 = Static337.method5140();

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public int anInt3812;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/lang/String;")
	public String aString73;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public int anInt3811;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/lang/String;")
	public String aString74;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString76;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public int anInt3810;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public int anInt3816;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Ljava/lang/String;")
	public String aString75;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt3812 = arg1;
		this.aString73 = arg3;
		this.anInt3811 = arg0;
		this.aString74 = arg7;
		this.aString76 = arg5;
		this.aString77 = arg2;
		this.anInt3810 = Static306.anInt6122;
		this.anInt3816 = arg6;
		this.aString75 = arg4;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public void method3003(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt3815 = Static337.method5140();
		this.anInt3810 = Static306.anInt6122;
		this.anInt3812 = arg5;
		this.aString77 = arg6;
		this.anInt3816 = arg1;
		this.aString73 = arg7;
		this.aString74 = arg0;
		this.anInt3811 = arg4;
		this.aString75 = arg2;
		this.aString76 = arg3;
	}
}
