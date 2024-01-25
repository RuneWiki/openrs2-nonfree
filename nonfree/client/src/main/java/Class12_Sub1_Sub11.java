import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class12_Sub1_Sub11 extends Class12_Sub1 {

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	private int anInt3327;

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
	private int anInt3330;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
	private int anInt3331 = -1;

	static {
		new Class88("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub11() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public void method7789() {
		super.method7789();
		this.anIntArray282 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3331 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)V")
	@Override
	public void method7799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method7799(arg0, arg1);
		if (this.anInt3331 >= 0 && Static516.anInterface11_13 != null) {
			@Pc(24) int local24 = Static516.anInterface11_13.method6215(this.anInt3331).aBoolean567 ? 64 : 128;
			this.anIntArray282 = Static516.anInterface11_13.method6211(false, this.anInt3331, local24, local24, 1.0F);
			this.anInt3330 = local24;
			this.anInt3327 = local24;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I")
	@Override
	public int method7791() {
		return this.anInt3331;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(41) int local41 = (Static138.anInt3102 == this.anInt3330 ? arg0 : this.anInt3330 * arg0 / Static138.anInt3102) * this.anInt3327;
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(59) int local59;
			@Pc(67) int local67;
			if (this.anInt3327 == Static357.anInt6670) {
				for (local59 = 0; local59 < Static357.anInt6670; local59++) {
					local67 = this.anIntArray282[local41++];
					local53[local59] = (local67 & 0xFF) << 4;
					local49[local59] = local67 >> 4 & 0xFF0;
					local45[local59] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static357.anInt6670; local59++) {
					local67 = this.anInt3327 * local59 / Static357.anInt6670;
					@Pc(115) int local115 = this.anIntArray282[local67 + local41];
					local53[local59] = (local115 & 0xFF) << 4;
					local49[local59] = local115 >> 4 & 0xFF0;
					local45[local59] = local115 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
