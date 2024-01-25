import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class250 {

	@OriginalMember(owner = "client!no", name = "d", descriptor = "[Lclient!rm;")
	public Interface20[] anInterface20Array1 = null;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "[Lclient!rm;")
	private Interface20[] anInterface20Array2 = null;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lclient!uc;")
	public Interface23 anInterface23_1 = null;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "Lclient!uc;")
	public Interface23 anInterface23_2 = null;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_10;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
	public boolean aBoolean449;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class250(@OriginalArg(0) Class133_Sub1 arg0) {
		this.aClass133_Sub1_10 = arg0;
		this.aBoolean449 = this.aClass133_Sub1_10.aBoolean477;
		if (this.aBoolean449 && !this.aClass133_Sub1_10.method6283(Static9.aClass223_2, Static20.aClass19_4)) {
			this.aBoolean449 = false;
		}
		if (this.aBoolean449 || this.aClass133_Sub1_10.method6263(Static20.aClass19_4, Static9.aClass223_2)) {
			Static569.method8254();
			if (this.aBoolean449) {
				@Pc(134) byte[] local134 = Static549.method8014(Static139.anObject3, false);
				this.anInterface23_2 = this.aClass133_Sub1_10.method6270(local134, Static9.aClass223_2);
				@Pc(150) byte[] local150 = Static549.method8014(Static289.anObject13, false);
				this.aClass133_Sub1_10.method6270(local150, Static9.aClass223_2);
			} else {
				this.anInterface20Array1 = new Interface20[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(70) byte[] local70 = Static514.method7639(local58 * 128 * 256, Static139.anObject3);
					this.anInterface20Array1[local58] = this.aClass133_Sub1_10.method6257(local70, 128, true, Static9.aClass223_2, 128);
				}
				this.anInterface20Array2 = new Interface20[16];
				for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
					@Pc(109) byte[] local109 = Static514.method7639(2 * 128 * local95 * 128, Static289.anObject13);
					this.anInterface20Array2[local95] = this.aClass133_Sub1_10.method6257(local109, 128, true, Static9.aClass223_2, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)Z")
	public boolean method5557() {
		if (this.anInterface23_1 == null) {
			@Pc(22) byte[] local22;
			if (Static442.anObject20 == null) {
				local22 = Static445.method6720(16.0F, 4.0F, new Class136_Sub1(419684), 0.5F, 4.0F, 0.6F);
				Static442.anObject20 = Static179.method2720(local22);
			}
			local22 = Static549.method8014(Static442.anObject20, false);
			@Pc(38) byte[] local38 = new byte[local22.length * 4];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
				@Pc(50) int local50 = local42 * 128 * 128;
				@Pc(52) int local52 = local50;
				for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
					@Pc(62) int local62 = local52 + local54 * 128;
					@Pc(72) int local72 = local52 + (local54 - 1 & 0x7F) * 128;
					@Pc(82) int local82 = (local54 + 1 & 0x7F) * 128 + local52;
					for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
						@Pc(104) float local104 = (float) ((local22[local84 + local72] & 0xFF) - (local22[local84 + local82] & 0xFF));
						@Pc(130) float local130 = (float) ((local22[(local84 - 1 & 0x7F) + local62] & 0xFF) - (local22[local62 + (local84 + 1 & 0x7F)] & 0xFF));
						@Pc(145) float local145 = (float) (128.0D / Math.sqrt((double) (local104 * local104 + local130 * local130 + 16384.0F)));
						local38[local40++] = (byte) (local130 * local145 + 127.0F);
						local38[local40++] = (byte) (local145 * 128.0F + 127.0F);
						local38[local40++] = (byte) (local145 * local104 + 127.0F);
						local38[local40++] = local22[local50++];
					}
				}
			}
			this.anInterface23_1 = this.aClass133_Sub1_10.method6270(local38, Static576.aClass223_16);
		}
		return this.anInterface23_1 != null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)Z")
	public boolean method5558() {
		if (this.aBoolean449) {
			return this.anInterface23_2 != null;
		} else {
			return this.anInterface20Array1 != null;
		}
	}
}
