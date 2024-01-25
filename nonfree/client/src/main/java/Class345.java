import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class345 {

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "[Lclient!ug;")
	private Interface24[] anInterface24Array2 = null;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "[Lclient!ug;")
	public Interface24[] anInterface24Array1 = null;

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "Lclient!iv;")
	public Interface12 anInterface12_2 = null;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "Lclient!iv;")
	public Interface12 anInterface12_1 = null;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_23;

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Z")
	public boolean aBoolean688;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class345(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_23 = arg0;
		this.aBoolean688 = this.aClass5_Sub1_23.aBoolean465;
		if (this.aBoolean688 && !this.aClass5_Sub1_23.method5619(Static637.aClass376_16, Static118.aClass182_3)) {
			this.aBoolean688 = false;
		}
		if (this.aBoolean688 || this.aClass5_Sub1_23.method5602(Static118.aClass182_3, Static637.aClass376_16)) {
			Static524.method7238();
			if (this.aBoolean688) {
				@Pc(57) byte[] local57 = Static483.method7202(false, Static27.anObject5);
				this.anInterface12_2 = this.aClass5_Sub1_23.method5637(Static118.aClass182_3, local57);
				@Pc(73) byte[] local73 = Static483.method7202(false, Static245.anObject10);
				this.aClass5_Sub1_23.method5637(Static118.aClass182_3, local73);
			} else {
				this.anInterface24Array1 = new Interface24[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(104) byte[] local104 = Static603.method8430(local90 * 128 * 128 * 2, Static27.anObject5);
					this.anInterface24Array1[local90] = this.aClass5_Sub1_23.method5662(128, local104, true, 128, Static118.aClass182_3);
				}
				this.anInterface24Array2 = new Interface24[16];
				for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
					@Pc(139) byte[] local139 = Static603.method8430(local127 * 128 * 256, Static245.anObject10);
					this.anInterface24Array2[local127] = this.aClass5_Sub1_23.method5662(128, local139, true, 128, Static118.aClass182_3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)Z")
	public boolean method8240() {
		if (this.aBoolean688) {
			return this.anInterface12_2 != null;
		} else {
			return this.anInterface24Array1 != null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Z")
	public boolean method8242() {
		if (this.anInterface12_1 == null) {
			@Pc(22) byte[] local22;
			if (Static591.anObject19 == null) {
				local22 = Static569.method8127(4.0F, 0.5F, 0.6F, 4.0F, new Class234_Sub1(419684), 16.0F);
				Static591.anObject19 = Static125.method2479(local22);
			}
			local22 = Static483.method7202(false, Static591.anObject19);
			@Pc(38) byte[] local38 = new byte[local22.length * 4];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
				@Pc(50) int local50 = local42 * 128 * 128;
				@Pc(52) int local52 = local50;
				for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
					@Pc(62) int local62 = local54 * 128 + local52;
					@Pc(73) int local73 = local52 + (local54 - 1 & 0x7F) * 128;
					@Pc(84) int local84 = local52 + (local54 + 1 & 0x7F) * 128;
					for (@Pc(86) int local86 = 0; local86 < 128; local86++) {
						@Pc(105) float local105 = (float) ((local22[local86 + local73] & 0xFF) - (local22[local84 + local86] & 0xFF));
						@Pc(131) float local131 = (float) ((local22[local62 + (local86 - 1 & 0x7F)] & 0xFF) - (local22[(local86 + 1 & 0x7F) + local62] & 0xFF));
						@Pc(146) float local146 = (float) (128.0D / Math.sqrt((double) (local105 * local105 + local131 * local131 + 16384.0F)));
						local38[local40++] = (byte) (local146 * local131 + 127.0F);
						local38[local40++] = (byte) (local146 * 128.0F + 127.0F);
						local38[local40++] = (byte) (local105 * local146 + 127.0F);
						local38[local40++] = local22[local50++];
					}
				}
			}
			this.anInterface12_1 = this.aClass5_Sub1_23.method5637(Static502.aClass182_14, local38);
		}
		return this.anInterface12_1 != null;
	}
}
