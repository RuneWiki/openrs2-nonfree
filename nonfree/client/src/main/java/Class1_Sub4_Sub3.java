import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!at", name = "K", descriptor = "I")
	private int anInt403 = 0;

	@OriginalMember(owner = "client!at", name = "J", descriptor = "I")
	private int anInt402 = 0;

	@OriginalMember(owner = "client!at", name = "M", descriptor = "I")
	private int anInt405 = 1;

	static {
		new Class119(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
		new Class119("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt403 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt402 = arg0.method5337();
		} else if (arg1 == 3) {
			this.anInt405 = arg0.method5337();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(19) int local19 = Static419.anIntArray472[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static395.anInt6592; local27++) {
				@Pc(33) int local33 = Static119.anIntArray146[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(49) int local49;
				if (this.anInt403 == 0) {
					local49 = (local33 - local19) * this.anInt405;
				} else {
					@Pc(61) int local61 = local39 * local39 + local25 * local25 >> 12;
					local49 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local49 = (int) ((double) (local49 * this.anInt405) * 3.141592653589793D);
				}
				local49 -= local49 & 0xFFFFF000;
				if (this.anInt402 == 0) {
					local49 = Static289.anIntArray328[local49 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt402 == 2) {
					local49 -= 2048;
					if (local49 < 0) {
						local49 = -local49;
					}
					local49 = 2048 - local49 << 1;
				}
				local11[local27] = local49;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		Static431.method5702();
	}
}
