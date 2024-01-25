import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class100 {

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "Lclient!fba;")
	public Class100 aClass100_2;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
	public int anInt2501;

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
	public int anInt2502;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
	public int anInt2504;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public int anInt2505;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
	public int anInt2509;

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
	public int anInt2512;

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
	public int anInt2513;

	@OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
	public final int anInt2508;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
	private final int anInt2507;

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
	public final int anInt2511;

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
	public final int anInt2499;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIB)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2508 = arg1;
		this.aByte44 = arg4;
		this.anInt2507 = arg0;
		this.anInt2511 = arg2;
		this.anInt2499 = arg3;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)Lclient!gda;")
	public Class117 method2132() {
		return Static169.method2432(this.anInt2507);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZII)Lclient!fba;")
	public Class100 method2133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class100(this.anInt2507, arg2, arg0, arg1, this.aByte44);
	}
}
