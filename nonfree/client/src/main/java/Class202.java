import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class202 {

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "[Lclient!ec;")
	private Interface7[] anInterface7Array1 = null;

	@OriginalMember(owner = "client!lja", name = "c", descriptor = "Lclient!oo;")
	public Interface21 anInterface21_1 = null;

	@OriginalMember(owner = "client!lja", name = "d", descriptor = "[Lclient!ec;")
	public Interface7[] anInterface7Array2 = null;

	@OriginalMember(owner = "client!lja", name = "i", descriptor = "Lclient!oo;")
	public Interface21 anInterface21_2 = null;

	@OriginalMember(owner = "client!lja", name = "g", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_14;

	@OriginalMember(owner = "client!lja", name = "n", descriptor = "Z")
	public boolean aBoolean412;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class202(@OriginalArg(0) Class13_Sub1 arg0) {
		this.aClass13_Sub1_14 = arg0;
		this.aBoolean412 = this.aClass13_Sub1_14.aBoolean660;
		if (this.aBoolean412 && !this.aClass13_Sub1_14.method7448(Static338.aClass327_13, Static246.aClass152_10)) {
			this.aBoolean412 = false;
		}
		if (this.aBoolean412 || this.aClass13_Sub1_14.method7425(Static338.aClass327_13, Static246.aClass152_10)) {
			Static251.method4146();
			if (this.aBoolean412) {
				@Pc(57) byte[] local57 = Static289.method4549(Static491.anObject14, false);
				this.anInterface21_2 = this.aClass13_Sub1_14.method7447(Static338.aClass327_13, local57);
				@Pc(73) byte[] local73 = Static289.method4549(Static475.anObject13, false);
				this.aClass13_Sub1_14.method7447(Static338.aClass327_13, local73);
			} else {
				this.anInterface7Array2 = new Interface7[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(102) byte[] local102 = Static434.method6202(local90 * 16384 * 2, Static491.anObject14);
					this.anInterface7Array2[local90] = this.aClass13_Sub1_14.method7446(local102, 128, 128, true, Static338.aClass327_13);
				}
				this.anInterface7Array1 = new Interface7[16];
				for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
					@Pc(139) byte[] local139 = Static434.method6202(local127 * 128 * 256, Static475.anObject13);
					this.anInterface7Array1[local127] = this.aClass13_Sub1_14.method7446(local139, 128, 128, true, Static338.aClass327_13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)Z")
	public boolean method5174() {
		if (this.aBoolean412) {
			return this.anInterface21_2 != null;
		} else {
			return this.anInterface7Array2 != null;
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)Z")
	public boolean method5176() {
		if (this.anInterface21_1 == null) {
			@Pc(22) byte[] local22;
			if (Static426.anObject10 == null) {
				local22 = Static668.method9228(0.6F, 4.0F, 4.0F, 0.5F, 16.0F, new Class126_Sub1(419684));
				Static426.anObject10 = Static540.method7762(local22);
			}
			local22 = Static289.method4549(Static426.anObject10, false);
			@Pc(38) byte[] local38 = new byte[local22.length * 4];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
				@Pc(48) int local48 = local42 * 16384;
				@Pc(50) int local50 = local48;
				for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
					@Pc(60) int local60 = local52 * 128 + local50;
					@Pc(71) int local71 = local50 + (local52 - 1 & 0x7F) * 128;
					@Pc(82) int local82 = local50 + (local52 + 1 & 0x7F) * 128;
					for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
						@Pc(104) float local104 = (float) ((local22[local71 + local84] & 0xFF) - (local22[local84 + local82] & 0xFF));
						@Pc(131) float local131 = (float) ((local22[local60 + (local84 - 1 & 0x7F)] & 0xFF) - (local22[local60 + (local84 + 1 & 0x7F)] & 0xFF));
						@Pc(146) float local146 = (float) (128.0D / Math.sqrt((double) (local104 * local104 + local131 * local131 + 16384.0F)));
						local38[local40++] = (byte) (int) (local131 * local146 + 127.0F);
						local38[local40++] = (byte) (int) (local146 * 128.0F + 127.0F);
						local38[local40++] = (byte) (int) (local146 * local104 + 127.0F);
						local38[local40++] = local22[local48++];
					}
				}
			}
			this.anInterface21_1 = this.aClass13_Sub1_14.method7447(Static419.aClass327_2, local38);
		}
		return this.anInterface21_1 != null;
	}
}
