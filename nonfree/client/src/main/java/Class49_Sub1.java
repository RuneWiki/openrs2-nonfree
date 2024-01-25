import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	protected final int anInt8033;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
	public final int anInt8034;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	protected int anInt8035;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	protected int anInt8032;

	static {
		new Class306("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIII)V")
	protected Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8033 = arg1;
		this.anInt8034 = arg3;
		this.anInt8035 = arg0;
		this.anInt8032 = arg2;
	}
}
