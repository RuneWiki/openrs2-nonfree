import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class120 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!jf;")
	public Interface15 anInterface15_1 = null;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[Lclient!fj;")
	private Interface11[] anInterface11Array2 = null;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!jf;")
	public Interface15 anInterface15_2 = null;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lclient!fj;")
	public Interface11[] anInterface11Array1 = null;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_7;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Z")
	public boolean aBoolean180;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class120(@OriginalArg(0) Class162_Sub1 arg0) {
		this.aClass162_Sub1_7 = arg0;
		this.aBoolean180 = this.aClass162_Sub1_7.aBoolean349;
		if (this.aBoolean180 && !this.aClass162_Sub1_7.method3886(Static42.aClass35_4, Static4.aClass366_1)) {
			this.aBoolean180 = false;
		}
		if (this.aBoolean180 || this.aClass162_Sub1_7.method3847(Static4.aClass366_1, Static42.aClass35_4)) {
			Static80.method1232();
			if (this.aBoolean180) {
				@Pc(128) byte[] local128 = Static479.method6201(false, Static460.anObject18);
				this.anInterface15_1 = this.aClass162_Sub1_7.method3874(Static4.aClass366_1, local128);
				@Pc(144) byte[] local144 = Static479.method6201(false, Static489.anObject19);
				this.aClass162_Sub1_7.method3874(Static4.aClass366_1, local144);
			} else {
				this.anInterface11Array1 = new Interface11[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(70) byte[] local70 = Static501.method6524(local58 * 128 * 256, Static460.anObject18);
					this.anInterface11Array1[local58] = this.aClass162_Sub1_7.method3863(local70, 128, true, Static4.aClass366_1, 128);
				}
				this.anInterface11Array2 = new Interface11[16];
				for (@Pc(93) int local93 = 0; local93 < 16; local93++) {
					@Pc(105) byte[] local105 = Static501.method6524(local93 * 128 * 256, Static489.anObject19);
					this.anInterface11Array2[local93] = this.aClass162_Sub1_7.method3863(local105, 128, true, Static4.aClass366_1, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
	public boolean method2152() {
		if (this.aBoolean180) {
			return this.anInterface15_1 != null;
		} else {
			return this.anInterface11Array1 != null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Z")
	public boolean method2153() {
		if (this.anInterface15_2 == null) {
			@Pc(29) byte[] local29;
			if (Static378.anObject16 == null) {
				local29 = Static63.method1085(0.5F, 4.0F, 4.0F, 16.0F, new Class43_Sub1(419684), 0.6F);
				Static378.anObject16 = Static144.method1989(local29);
			}
			local29 = Static479.method6201(false, Static378.anObject16);
			@Pc(45) byte[] local45 = new byte[local29.length * 4];
			@Pc(47) int local47 = 0;
			for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
				@Pc(57) int local57 = local49 * 128 * 128;
				@Pc(59) int local59 = local57;
				for (@Pc(61) int local61 = 0; local61 < 128; local61++) {
					@Pc(69) int local69 = local61 * 128 + local59;
					@Pc(79) int local79 = (local61 - 1 & 0x7F) * 128 + local59;
					@Pc(89) int local89 = (local61 + 1 & 0x7F) * 128 + local59;
					for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
						@Pc(111) float local111 = (float) ((local29[local79 + local91] & 0xFF) - (local29[local91 + local89] & 0xFF));
						@Pc(138) float local138 = (float) ((local29[local69 + (local91 - 1 & 0x7F)] & 0xFF) - (local29[local69 + (local91 + 1 & 0x7F)] & 0xFF));
						@Pc(153) float local153 = (float) (128.0D / Math.sqrt((double) (local111 * local111 + local138 * local138 + 16384.0F)));
						local45[local47++] = (byte) (local153 * local138 + 127.0F);
						local45[local47++] = (byte) (local153 * 128.0F + 127.0F);
						local45[local47++] = (byte) (local111 * local153 + 127.0F);
						local45[local47++] = local29[local57++];
					}
				}
			}
			this.anInterface15_2 = this.aClass162_Sub1_7.method3874(Static225.aClass366_3, local45);
		}
		return this.anInterface15_2 != null;
	}
}
