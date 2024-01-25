import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class305 {

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "J")
	public final long aLong231;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_41;

	static {
		new Class202("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!os;JI)V")
	public Class305(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong231 = arg1;
		this.aClass39_Sub3_41 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub3_41.method5748(this.aLong231);
		super.finalize();
	}
}
