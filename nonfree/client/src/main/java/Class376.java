import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class376 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Lclient!ak;")
	public Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "[Lclient!oq;")
	public Interface20[] anInterface20Array1 = null;

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "Lclient!ak;")
	public Interface1 anInterface1_2 = null;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "[Lclient!oq;")
	private Interface20[] anInterface20Array2 = null;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_23;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
	public boolean aBoolean762;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ln;)V")
	public Class376(@OriginalArg(0) Class16_Sub1 arg0) {
		this.aClass16_Sub1_23 = arg0;
		this.aBoolean762 = this.aClass16_Sub1_23.aBoolean352;
		if (this.aBoolean762 && !this.aClass16_Sub1_23.method3995(Static627.aClass366_15, Static258.aClass160_9)) {
			this.aBoolean762 = false;
		}
		if (this.aBoolean762 || this.aClass16_Sub1_23.method3874(Static627.aClass366_15, Static258.aClass160_9)) {
			Static146.method3032();
			if (this.aBoolean762) {
				@Pc(130) byte[] local130 = Static565.method3489(Static575.anObject22, false);
				this.anInterface1_2 = this.aClass16_Sub1_23.method3912(local130, Static627.aClass366_15);
				@Pc(146) byte[] local146 = Static565.method3489(Static62.anObject7, false);
				this.aClass16_Sub1_23.method3912(local146, Static627.aClass366_15);
			} else {
				this.anInterface20Array1 = new Interface20[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(70) byte[] local70 = Static584.method8132(2 * 16384 * local58, Static575.anObject22);
					this.anInterface20Array1[local58] = this.aClass16_Sub1_23.method4005(local70, Static627.aClass366_15, 128, 128, true);
				}
				this.anInterface20Array2 = new Interface20[16];
				for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
					@Pc(107) byte[] local107 = Static584.method8132(local95 * 256 * 128, Static62.anObject7);
					this.anInterface20Array2[local95] = this.aClass16_Sub1_23.method4005(local107, Static627.aClass366_15, 128, 128, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Z")
	public boolean method8614() {
		if (this.anInterface1_1 == null) {
			@Pc(22) byte[] local22;
			if (Static298.anObject23 == null) {
				local22 = Static500.method7266(0.6F, 4.0F, 0.5F, 16.0F, new Class58_Sub1(419684), 4.0F);
				Static298.anObject23 = Static550.method8311(local22);
			}
			local22 = Static565.method3489(Static298.anObject23, false);
			@Pc(40) byte[] local40 = new byte[local22.length * 4];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 16; local44++) {
				@Pc(50) int local50 = local44 * 16384;
				@Pc(52) int local52 = local50;
				for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
					@Pc(62) int local62 = local52 + local54 * 128;
					@Pc(72) int local72 = (local54 - 1 & 0x7F) * 128 + local52;
					@Pc(82) int local82 = local52 + (local54 + 1 & 0x7F) * 128;
					for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
						@Pc(104) float local104 = (float) ((local22[local84 + local72] & 0xFF) - (local22[local82 + local84] & 0xFF));
						@Pc(130) float local130 = (float) ((local22[local62 + (local84 - 1 & 0x7F)] & 0xFF) - (local22[(local84 + 1 & 0x7F) + local62] & 0xFF));
						@Pc(145) float local145 = (float) (128.0D / Math.sqrt((double) (local130 * local130 + local104 * local104 + 16384.0F)));
						local40[local42++] = (byte) (local145 * local130 + 127.0F);
						local40[local42++] = (byte) (local145 * 128.0F + 127.0F);
						local40[local42++] = (byte) (local145 * local104 + 127.0F);
						local40[local42++] = local22[local50++];
					}
				}
			}
			this.anInterface1_1 = this.aClass16_Sub1_23.method3912(local40, Static456.aClass366_9);
		}
		return this.anInterface1_1 != null;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
	public boolean method8618() {
		if (this.aBoolean762) {
			return this.anInterface1_2 != null;
		} else {
			return this.anInterface20Array1 != null;
		}
	}
}
