import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class353 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[Lclient!oga;")
	public Interface21[] anInterface21Array1 = null;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!gga;")
	public Interface9 anInterface9_1 = null;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[Lclient!oga;")
	private Interface21[] anInterface21Array2 = null;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!gga;")
	public Interface9 anInterface9_2 = null;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_20;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
	public boolean aBoolean715;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class353(@OriginalArg(0) Class137_Sub1 arg0) {
		this.aClass137_Sub1_20 = arg0;
		this.aBoolean715 = this.aClass137_Sub1_20.aBoolean673;
		if (this.aBoolean715 && !this.aClass137_Sub1_20.method8011(Static47.aClass36_5, Static649.aClass363_17)) {
			this.aBoolean715 = false;
		}
		if (this.aBoolean715 || this.aClass137_Sub1_20.method8087(Static649.aClass363_17, Static47.aClass36_5)) {
			Static126.method2099();
			if (this.aBoolean715) {
				@Pc(57) byte[] local57 = Static9.method53(false, Static137.anObject4);
				this.anInterface9_1 = this.aClass137_Sub1_20.method8082(Static649.aClass363_17, local57);
				@Pc(73) byte[] local73 = Static9.method53(false, Static32.anObject18);
				this.aClass137_Sub1_20.method8082(Static649.aClass363_17, local73);
			} else {
				this.anInterface21Array1 = new Interface21[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(104) byte[] local104 = Static660.method9132(local90 * 128 * 128 * 2, Static137.anObject4);
					this.anInterface21Array1[local90] = this.aClass137_Sub1_20.method8030(128, 128, local104, true, Static649.aClass363_17);
				}
				this.anInterface21Array2 = new Interface21[16];
				for (@Pc(129) int local129 = 0; local129 < 16; local129++) {
					@Pc(143) byte[] local143 = Static660.method9132(2 * 128 * local129 * 128, Static32.anObject18);
					this.anInterface21Array2[local129] = this.aClass137_Sub1_20.method8030(128, 128, local143, true, Static649.aClass363_17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
	public boolean method8486() {
		if (this.aBoolean715) {
			return this.anInterface9_1 != null;
		} else {
			return this.anInterface21Array1 != null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Z")
	public boolean method8489() {
		if (this.anInterface9_2 == null) {
			@Pc(26) byte[] local26;
			if (Static505.anObject17 == null) {
				local26 = Static427.method6301(0.6F, 16.0F, 4.0F, new Class11_Sub1(419684), 4.0F, 0.5F);
				Static505.anObject17 = Static508.method7427(local26);
			}
			local26 = Static9.method53(false, Static505.anObject17);
			@Pc(42) byte[] local42 = new byte[local26.length * 4];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
				@Pc(54) int local54 = local46 * 128 * 128;
				@Pc(56) int local56 = local54;
				for (@Pc(58) int local58 = 0; local58 < 128; local58++) {
					@Pc(66) int local66 = local56 + local58 * 128;
					@Pc(76) int local76 = local56 + (local58 - 1 & 0x7F) * 128;
					@Pc(86) int local86 = (local58 + 1 & 0x7F) * 128 + local56;
					for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
						@Pc(108) float local108 = (float) ((local26[local76 + local88] & 0xFF) - (local26[local86 + local88] & 0xFF));
						@Pc(133) float local133 = (float) ((local26[(local88 - 1 & 0x7F) + local66] & 0xFF) - (local26[local66 + (local88 + 1 & 0x7F)] & 0xFF));
						@Pc(148) float local148 = (float) (128.0D / Math.sqrt((double) (local108 * local108 + local133 * local133 + 16384.0F)));
						local42[local44++] = (byte) (int) (local148 * local133 + 127.0F);
						local42[local44++] = (byte) (int) (local148 * 128.0F + 127.0F);
						local42[local44++] = (byte) (int) (local148 * local108 + 127.0F);
						local42[local44++] = local26[local54++];
					}
				}
			}
			this.anInterface9_2 = this.aClass137_Sub1_20.method8082(Static238.aClass363_4, local42);
		}
		return this.anInterface9_2 != null;
	}
}
