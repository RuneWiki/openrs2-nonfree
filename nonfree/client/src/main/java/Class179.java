import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class179 {

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "Lclient!ii;")
	public Interface10 anInterface10_1 = null;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "[Lclient!w;")
	public Interface27[] anInterface27Array1 = null;

	@OriginalMember(owner = "client!jga", name = "i", descriptor = "[Lclient!w;")
	private Interface27[] anInterface27Array2 = null;

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "Lclient!ii;")
	public Interface10 anInterface10_2 = null;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_11;

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "Z")
	public boolean aBoolean463;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!gd;)V")
	public Class179(@OriginalArg(0) Class65_Sub2 arg0) {
		this.aClass65_Sub2_11 = arg0;
		this.aBoolean463 = this.aClass65_Sub2_11.aBoolean445;
		if (this.aBoolean463 && !this.aClass65_Sub2_11.method4424(Static120.aClass89_7, Static676.aClass339_17)) {
			this.aBoolean463 = false;
		}
		if (this.aBoolean463 || this.aClass65_Sub2_11.method4359(Static676.aClass339_17, Static120.aClass89_7)) {
			Static36.method529();
			if (this.aBoolean463) {
				@Pc(128) byte[] local128 = Static549.method7639(Static284.anObject10, false);
				this.anInterface10_1 = this.aClass65_Sub2_11.method4350(Static676.aClass339_17, local128);
				@Pc(144) byte[] local144 = Static549.method7639(Static48.anObject24, false);
				this.aClass65_Sub2_11.method4350(Static676.aClass339_17, local144);
			} else {
				this.anInterface27Array1 = new Interface27[16];
				for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
					@Pc(67) byte[] local67 = Static68.method933(Static284.anObject10, local56 * 256 * 128);
					this.anInterface27Array1[local56] = this.aClass65_Sub2_11.method4422(128, local67, 128, Static676.aClass339_17, true);
				}
				this.anInterface27Array2 = new Interface27[16];
				for (@Pc(92) int local92 = 0; local92 < 16; local92++) {
					@Pc(103) byte[] local103 = Static68.method933(Static48.anObject24, 256 * 128 * local92);
					this.anInterface27Array2[local92] = this.aClass65_Sub2_11.method4422(128, local103, 128, Static676.aClass339_17, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Z")
	public boolean method4541() {
		if (this.aBoolean463) {
			return this.anInterface10_1 != null;
		} else {
			return this.anInterface27Array1 != null;
		}
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)Z")
	public boolean method4544() {
		if (this.anInterface10_2 == null) {
			@Pc(22) byte[] local22;
			if (Static423.anObject12 == null) {
				local22 = Static86.method1838(16.0F, 0.5F, 0.6F, 4.0F, new Class34_Sub1(419684), 4.0F);
				Static423.anObject12 = Static249.method3855(local22);
			}
			local22 = Static549.method7639(Static423.anObject12, false);
			@Pc(38) byte[] local38 = new byte[local22.length * 4];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
				@Pc(50) int local50 = local42 * 128 * 128;
				@Pc(52) int local52 = local50;
				for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
					@Pc(62) int local62 = local54 * 128 + local52;
					@Pc(73) int local73 = local52 + (local54 - 1 & 0x7F) * 128;
					@Pc(83) int local83 = (local54 + 1 & 0x7F) * 128 + local52;
					for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
						@Pc(105) float local105 = (float) ((local22[local85 + local73] & 0xFF) - (local22[local85 + local83] & 0xFF));
						@Pc(132) float local132 = (float) ((local22[local62 + (local85 - 1 & 0x7F)] & 0xFF) - (local22[(local85 + 1 & 0x7F) + local62] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + local105 * local105 + 16384.0F)));
						local38[local40++] = (byte) (int) (local147 * local132 + 127.0F);
						local38[local40++] = (byte) (int) (local147 * 128.0F + 127.0F);
						local38[local40++] = (byte) (int) (local105 * local147 + 127.0F);
						local38[local40++] = local22[local50++];
					}
				}
			}
			this.anInterface10_2 = this.aClass65_Sub2_11.method4350(Static435.aClass339_15, local38);
		}
		return this.anInterface10_2 != null;
	}
}
