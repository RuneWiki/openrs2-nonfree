import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
	public final int anInt6573;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
	public final int anInt6572;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "[Z")
	public final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "[I")
	public final int[] anIntArray470;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "[I")
	public final int[] anIntArray471;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray52;

	static {
		new Class175("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6573 = arg0;
		@Pc(9) Class3_Sub2 local9 = new Class3_Sub2(arg1);
		this.anInt6572 = local9.method6053();
		this.aBooleanArray20 = new boolean[this.anInt6572];
		this.anIntArray470 = new int[this.anInt6572];
		this.anIntArray471 = new int[this.anInt6572];
		this.anIntArrayArray52 = new int[this.anInt6572][];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6572; local36++) {
			this.anIntArray471[local36] = local9.method6053();
		}
		for (@Pc(51) int local51 = 0; local51 < this.anInt6572; local51++) {
			this.aBooleanArray20[local51] = local9.method6053() == 1;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt6572; local77++) {
			this.anIntArray470[local77] = local9.method6004();
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt6572; local92++) {
			this.anIntArrayArray52[local92] = new int[local9.method6053()];
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt6572; local108++) {
			for (@Pc(111) int local111 = 0; local111 < this.anIntArrayArray52[local108].length; local111++) {
				this.anIntArrayArray52[local108][local111] = local9.method6053();
			}
		}
	}
}
