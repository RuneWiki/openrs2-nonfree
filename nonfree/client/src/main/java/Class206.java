import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class206 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	public int anInt6256;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "I")
	public int anInt6257;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	public int anInt6258;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	public int anInt6259;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	public int anInt6261;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "I")
	public int anInt6263;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "I")
	public int anInt6265;

	@OriginalMember(owner = "client!un", name = "l", descriptor = "Lclient!un;")
	public Class206 aClass206_2;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "I")
	public int anInt6267;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	public int anInt6268;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	public final int anInt6262;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public final int anInt6260;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "I")
	public final int anInt6266;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "I")
	public final int anInt6264;

	static {
		new Class34("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIB)V")
	public Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6262 = arg1;
		this.aByte72 = arg4;
		this.anInt6260 = arg2;
		this.anInt6266 = arg0;
		this.anInt6264 = arg3;
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!un;I)V")
	public Class206(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1) {
		this.aClass206_2 = arg0;
		this.anInt6264 = this.aClass206_2.anInt6264 + arg1;
		this.anInt6260 = this.aClass206_2.anInt6260 + arg1;
		this.aByte72 = this.aClass206_2.aByte72;
		this.anInt6262 = arg1 + this.aClass206_2.anInt6262;
		this.anInt6266 = this.aClass206_2.anInt6266;
	}
}
