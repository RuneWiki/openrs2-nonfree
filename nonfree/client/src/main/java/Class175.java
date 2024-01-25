import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class175 {

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "[Lclient!vv;")
	public static final Class376[] aClass376Array1 = new Class376[5];

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
	public int anInt4610 = Static29.method654();

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
	public int anInt4612;

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
	public int anInt4611;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
	public int anInt4608;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
	public int anInt4606;

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "Ljava/lang/String;")
	public String aString50;

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass376Array1.length; local6++) {
			aClass376Array1[local6] = new Class376();
		}
	}

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.anInt4612 = arg0;
		this.anInt4611 = arg6;
		this.anInt4608 = Static87.anInt1951;
		this.aString51 = arg5;
		this.anInt4606 = arg1;
		this.aString54 = arg2;
		this.aString53 = arg7;
		this.aString52 = arg4;
		this.aString50 = arg3;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public void method3857(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		this.anInt4610 = Static29.method654();
		this.anInt4612 = arg2;
		this.anInt4611 = arg5;
		this.aString52 = arg7;
		this.aString51 = arg6;
		this.aString50 = arg3;
		this.aString54 = arg0;
		this.anInt4608 = Static87.anInt1951;
		this.aString53 = arg4;
		this.anInt4606 = arg1;
	}
}
