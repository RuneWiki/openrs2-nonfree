import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class61_Sub1 extends Class61 {

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
	private final int anInt1683;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
	private final int anInt1674;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	private final int anInt1679;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
	private final int anInt1682;

	static {
		new Class198("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIII)V")
	public Class61_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1683 = arg1;
		this.anInt1674 = arg0;
		this.anInt1679 = arg2;
		this.anInt1682 = arg3;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
	@Override
	public void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1674 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1679 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt1683 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt1682 >> 12;
		Static74.method1084(super.anInt5305, local39, local24, super.anInt5306, local17, local10, super.anInt5307);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IBI)V")
	@Override
	public void method4110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1674 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt1679 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt1683 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt1682 >> 12;
		Static276.method3433(local10, local24, local17, local35, super.anInt5307);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
