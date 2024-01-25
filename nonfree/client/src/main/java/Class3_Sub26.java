import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
	public final int anInt4280;

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
	public final int anInt4282;

	static {
		new Class175("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(II)V")
	public Class3_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4280 = arg1;
		this.anInt4282 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)I")
	public int method3484() {
		return this.anInt4282 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(ZI)Z")
	public boolean method3485(@OriginalArg(1) int arg0) {
		return (this.anInt4282 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)Z")
	public boolean method3486() {
		return (this.anInt4282 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)I")
	public int method3487() {
		return Static337.method4902(this.anInt4282);
	}

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "(I)Z")
	public boolean method3488() {
		return (this.anInt4282 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)Z")
	public boolean method3490() {
		return (this.anInt4282 >> 22 & 0x1) != 0;
	}
}
