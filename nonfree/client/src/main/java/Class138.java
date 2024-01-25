import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class138 {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!kt;")
	public Class145 aClass145_2;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	public int anInt3552;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	private int anInt3554;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public int anInt3561;

	static {
		new Class231("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)Lclient!fd;")
	public synchronized Class77 method3185() {
		@Pc(19) Class77 local19 = (Class77) this.aClass145_2.aClass220_28.method4990((long) this.anInt3554);
		if (local19 != null) {
			return local19;
		}
		local19 = Static455.method1703(this.aClass145_2.aClass158_47, this.anInt3554, 0);
		if (local19 != null) {
			this.aClass145_2.aClass220_28.method4996(local19, (long) this.anInt3554);
		}
		return local19;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!ha;)V")
	public void method3186(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3111();
			if (local17 == 0) {
				return;
			}
			this.method3189(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ha;BI)V")
	private void method3189(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3554 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt3552 = arg0.method3111();
			this.anInt3561 = arg0.method3111();
		}
	}
}
