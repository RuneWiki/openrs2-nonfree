import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class12_Sub1_Sub3 extends Class12_Sub1 {

	@OriginalMember(owner = "client!br", name = "K", descriptor = "I")
	private int anInt888 = 20;

	@OriginalMember(owner = "client!br", name = "I", descriptor = "I")
	private int anInt886 = 0;

	@OriginalMember(owner = "client!br", name = "N", descriptor = "I")
	private int anInt891 = 0;

	@OriginalMember(owner = "client!br", name = "P", descriptor = "I")
	private int anInt892 = 1365;

	static {
		new Class88(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt892 = arg0.method5199();
		} else if (arg1 == 1) {
			this.anInt888 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt891 = arg0.method5199();
		} else if (arg1 == 3) {
			this.anInt886 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			for (@Pc(24) int local24 = 0; local24 < Static357.anInt6670; local24++) {
				@Pc(38) int local38 = this.anInt891 + (Static347.anIntArray455[local24] << 12) / this.anInt892;
				@Pc(50) int local50 = this.anInt886 + (Static353.anIntArray458[arg0] << 12) / this.anInt892;
				@Pc(56) int local56 = local38;
				@Pc(58) int local58 = local50;
				@Pc(64) int local64 = local38 * local38 >> 12;
				@Pc(70) int local70 = local50 * local50 >> 12;
				@Pc(72) int local72 = 0;
				while (local64 + local70 < 16384 && this.anInt888 > local72) {
					local58 = local50 + (local58 * local56 >> 12) * 2;
					local56 = local64 + local38 - local70;
					local72++;
					local64 = local56 * local56 >> 12;
					local70 = local58 * local58 >> 12;
				}
				local18[local24] = this.anInt888 - 1 <= local72 ? 0 : (local72 << 12) / this.anInt888;
			}
		}
		return local18;
	}
}
