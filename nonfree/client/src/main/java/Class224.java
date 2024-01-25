import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class224 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[Lclient!kt;")
	public Interface12[] anInterface12Array1 = null;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "Lclient!po;")
	public Interface21 anInterface21_1 = null;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!po;")
	public Interface21 anInterface21_2 = null;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "[Lclient!kt;")
	private Interface12[] anInterface12Array2 = null;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_9;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class224(@OriginalArg(0) Class143_Sub1 arg0) {
		this.aClass143_Sub1_9 = arg0;
		this.aBoolean454 = this.aClass143_Sub1_9.aBoolean530;
		if (this.aBoolean454 && !this.aClass143_Sub1_9.method6363(Static314.aClass206_12, Static368.aClass255_16)) {
			this.aBoolean454 = false;
		}
		if (this.aBoolean454 || this.aClass143_Sub1_9.method6304(Static368.aClass255_16, Static314.aClass206_12)) {
			Static550.method7599();
			if (this.aBoolean454) {
				@Pc(55) byte[] local55 = Static120.method1911(false, Static631.anObject22);
				this.anInterface21_1 = this.aClass143_Sub1_9.method6359(local55, Static368.aClass255_16);
				@Pc(71) byte[] local71 = Static120.method1911(false, Static320.anObject23);
				this.aClass143_Sub1_9.method6359(local71, Static368.aClass255_16);
			} else {
				this.anInterface12Array1 = new Interface12[16];
				for (@Pc(88) int local88 = 0; local88 < 16; local88++) {
					@Pc(99) byte[] local99 = Static507.method7310(Static631.anObject22, local88 * 128 * 256);
					this.anInterface12Array1[local88] = this.aClass143_Sub1_9.method6339(local99, 128, 128, Static368.aClass255_16, true);
				}
				this.anInterface12Array2 = new Interface12[16];
				for (@Pc(124) int local124 = 0; local124 < 16; local124++) {
					@Pc(135) byte[] local135 = Static507.method7310(Static320.anObject23, local124 * 16384 * 2);
					this.anInterface12Array2[local124] = this.aClass143_Sub1_9.method6339(local135, 128, 128, Static368.aClass255_16, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)Z")
	public boolean method5205() {
		if (this.anInterface21_2 == null) {
			@Pc(26) byte[] local26;
			if (Static319.anObject10 == null) {
				local26 = Static59.method5267(4.0F, 0.5F, new Class43_Sub1(419684), 0.6F, 16.0F, 4.0F);
				Static319.anObject10 = Static280.method3887(local26);
			}
			local26 = Static120.method1911(false, Static319.anObject10);
			@Pc(42) byte[] local42 = new byte[local26.length * 4];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
				@Pc(54) int local54 = 128 * 128 * local46;
				@Pc(56) int local56 = local54;
				for (@Pc(58) int local58 = 0; local58 < 128; local58++) {
					@Pc(66) int local66 = local58 * 128 + local56;
					@Pc(76) int local76 = local56 + (local58 - 1 & 0x7F) * 128;
					@Pc(86) int local86 = (local58 + 1 & 0x7F) * 128 + local56;
					for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
						@Pc(108) float local108 = (float) ((local26[local88 + local76] & 0xFF) - (local26[local86 + local88] & 0xFF));
						@Pc(134) float local134 = (float) ((local26[local66 + (local88 - 1 & 0x7F)] & 0xFF) - (local26[local66 + (local88 + 1 & 0x7F)] & 0xFF));
						@Pc(149) float local149 = (float) (128.0D / Math.sqrt((double) (local134 * local134 + local108 * local108 + 16384.0F)));
						local42[local44++] = (byte) (int) (local134 * local149 + 127.0F);
						local42[local44++] = (byte) (int) (local149 * 128.0F + 127.0F);
						local42[local44++] = (byte) (int) (local149 * local108 + 127.0F);
						local42[local44++] = local26[local54++];
					}
				}
			}
			this.anInterface21_2 = this.aClass143_Sub1_9.method6359(local42, Static92.aClass255_3);
		}
		return this.anInterface21_2 != null;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Z")
	public boolean method5207() {
		if (this.aBoolean454) {
			return this.anInterface21_1 != null;
		} else {
			return this.anInterface12Array1 != null;
		}
	}
}
