import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class227 {

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	public int anInt6545 = Static236.method4160();

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public int anInt6543 = Static409.anInt7683;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Ljava/lang/String;")
	public String aString78;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public int anInt6544;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public int anInt6541;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	public int anInt6547;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljava/lang/String;")
	public String aString76;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljava/lang/String;")
	public String aString75;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		this.aString78 = arg6;
		this.anInt6544 = arg5;
		this.aString77 = arg2;
		this.anInt6541 = arg0;
		this.anInt6547 = arg1;
		this.aString76 = arg4;
		this.aString75 = arg3;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public void method5478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		this.anInt6545 = Static236.method4160();
		this.anInt6544 = arg6;
		this.anInt6543 = Static409.anInt7683;
		this.anInt6541 = arg1;
		this.anInt6547 = arg0;
		this.aString76 = arg5;
		this.aString78 = arg4;
		this.aString75 = arg3;
		this.aString77 = arg2;
	}
}
