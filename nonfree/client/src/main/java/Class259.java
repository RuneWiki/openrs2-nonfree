import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class259 {

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
	public int anInt7457 = Static265.method4053();

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Ljava/lang/String;")
	public String aString197;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Ljava/lang/String;")
	public String aString199;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	public int anInt7458;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public int anInt7456;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	public int anInt7460;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Ljava/lang/String;")
	public String aString198;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Ljava/lang/String;")
	public String aString196;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Ljava/lang/String;")
	public String aString200;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
	public int anInt7459;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		this.aString197 = arg2;
		this.aString199 = arg5;
		this.anInt7458 = Static397.anInt6998;
		this.anInt7456 = arg6;
		this.anInt7460 = arg1;
		this.aString198 = arg4;
		this.aString196 = arg3;
		this.aString200 = arg7;
		this.anInt7459 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public void method5816(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		this.anInt7457 = Static265.method4053();
		this.anInt7459 = arg6;
		this.aString198 = arg7;
		this.anInt7456 = arg3;
		this.aString196 = arg2;
		this.aString200 = arg5;
		this.anInt7458 = Static397.anInt6998;
		this.anInt7460 = arg1;
		this.aString199 = arg0;
		this.aString197 = arg4;
	}
}
