import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class170_Sub2 extends Class170 implements Interface1 {

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	private int anInt7043;

	static {
		new Class175("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!gk;I[BIZ)V")
	public Class170_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7043 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([BBII)V")
	@Override
	public void method5470(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5468(arg0, arg1);
		this.anInt7043 = 5123;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I")
	@Override
	public int method5472() {
		return super.anInt7039;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)J")
	@Override
	public long method5469() {
		return 0L;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	@Override
	public int method5471() {
		return this.anInt7043;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
	@Override
	protected void method5466() {
		super.aClass75_Sub2_42.method2410(this);
	}
}
