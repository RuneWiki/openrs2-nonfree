import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
	private int anInt6273 = 1;

	@OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
	private int anInt6276 = 0;

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
	private int anInt6278 = 0;

	static {
		new Class96("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6278 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt6276 = arg0.method4548();
		} else if (arg1 == 3) {
			this.anInt6273 = arg0.method4548();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(19) int local19 = Static285.anIntArray17[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static410.anInt7198; local27++) {
				@Pc(33) int local33 = Static400.anIntArray525[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(50) int local50;
				if (this.anInt6278 == 0) {
					local50 = this.anInt6273 * (local33 - local19);
				} else {
					@Pc(63) int local63 = local39 * local39 + local25 * local25 >> 12;
					local50 = (int) (Math.sqrt((double) ((float) local63 / 4096.0F)) * 4096.0D);
					local50 = (int) ((double) (local50 * this.anInt6273) * 3.141592653589793D);
				}
				local50 -= local50 & 0xFFFFF000;
				if (this.anInt6276 == 0) {
					local50 = Static129.anIntArray174[local50 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6276 == 2) {
					local50 -= 2048;
					if (local50 < 0) {
						local50 = -local50;
					}
					local50 = 2048 - local50 << 1;
				}
				local11[local27] = local50;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		Static4.method126();
	}
}
