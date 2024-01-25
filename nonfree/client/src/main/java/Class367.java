import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class367 {

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "Lclient!vga;")
	public Interface24 anInterface24_1 = null;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "[Lclient!gl;")
	public Interface11[] anInterface11Array1 = null;

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "[Lclient!gl;")
	private Interface11[] anInterface11Array2 = null;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "Lclient!vga;")
	public Interface24 anInterface24_2 = null;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_22;

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "Z")
	public boolean aBoolean714;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class367(@OriginalArg(0) Class16_Sub1 arg0) {
		this.aClass16_Sub1_22 = arg0;
		this.aBoolean714 = this.aClass16_Sub1_22.aBoolean558;
		if (this.aBoolean714 && !this.aClass16_Sub1_22.method6204(Static665.aClass361_16, Static553.aClass330_14)) {
			this.aBoolean714 = false;
		}
		if (this.aBoolean714 || this.aClass16_Sub1_22.method6292(Static553.aClass330_14, Static665.aClass361_16)) {
			Static65.method1545();
			if (this.aBoolean714) {
				@Pc(132) byte[] local132 = Static128.method2246(Static658.anObject19, false);
				this.anInterface24_1 = this.aClass16_Sub1_22.method6298(local132, Static665.aClass361_16);
				@Pc(148) byte[] local148 = Static128.method2246(Static496.anObject17, false);
				this.aClass16_Sub1_22.method6298(local148, Static665.aClass361_16);
			} else {
				this.anInterface11Array1 = new Interface11[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(70) byte[] local70 = Static213.method3377(Static658.anObject19, local58 * 128 * 256);
					this.anInterface11Array1[local58] = this.aClass16_Sub1_22.method6301(Static665.aClass361_16, 128, 128, local70, true);
				}
				this.anInterface11Array2 = new Interface11[16];
				for (@Pc(93) int local93 = 0; local93 < 16; local93++) {
					@Pc(107) byte[] local107 = Static213.method3377(Static496.anObject17, 2 * 128 * local93 * 128);
					this.anInterface11Array2[local93] = this.aClass16_Sub1_22.method6301(Static665.aClass361_16, 128, 128, local107, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)Z")
	public boolean method8226() {
		if (this.anInterface24_2 == null) {
			@Pc(22) byte[] local22;
			if (Static568.anObject18 == null) {
				local22 = Static93.method1880(0.6F, 0.5F, new Class157_Sub1(419684), 4.0F, 4.0F, 16.0F);
				Static568.anObject18 = Static331.method8338(local22);
			}
			local22 = Static128.method2246(Static568.anObject18, false);
			@Pc(38) byte[] local38 = new byte[local22.length * 4];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
				@Pc(50) int local50 = local42 * 128 * 128;
				@Pc(52) int local52 = local50;
				for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
					@Pc(62) int local62 = local52 + local54 * 128;
					@Pc(72) int local72 = (local54 - 1 & 0x7F) * 128 + local52;
					@Pc(83) int local83 = local52 + (local54 + 1 & 0x7F) * 128;
					for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
						@Pc(104) float local104 = (float) ((local22[local85 + local72] & 0xFF) - (local22[local85 + local83] & 0xFF));
						@Pc(130) float local130 = (float) ((local22[(local85 - 1 & 0x7F) + local62] & 0xFF) - (local22[(local85 + 1 & 0x7F) + local62] & 0xFF));
						@Pc(145) float local145 = (float) (128.0D / Math.sqrt((double) (local104 * local104 + local130 * local130 + 16384.0F)));
						local38[local40++] = (byte) (int) (local130 * local145 + 127.0F);
						local38[local40++] = (byte) (int) (local145 * 128.0F + 127.0F);
						local38[local40++] = (byte) (int) (local145 * local104 + 127.0F);
						local38[local40++] = local22[local50++];
					}
				}
			}
			this.anInterface24_2 = this.aClass16_Sub1_22.method6298(local38, Static264.aClass361_8);
		}
		return this.anInterface24_2 != null;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)Z")
	public boolean method8229() {
		if (this.aBoolean714) {
			return this.anInterface24_1 != null;
		} else {
			return this.anInterface11Array1 != null;
		}
	}
}
