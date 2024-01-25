import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class187 {

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "[I")
	public static final int[] anIntArray458;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public int anInt5729;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	public int anInt5730;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	public int anInt5731;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public int anInt5733;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	public int anInt5734;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	public int anInt5735;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
	public int anInt5737;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
	public int anInt5738;

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
	public int anInt5739;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public int anInt5732 = -1;

	static {
		new Class159("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
		anIntArray458 = new int[32];
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray458[local12] = local10 - 1;
			local10 += local10;
		}
	}
}
