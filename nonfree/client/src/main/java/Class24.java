import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class24 {

	@OriginalMember(owner = "client!b", name = "i", descriptor = "[Lclient!ah;")
	public Interface2[] anInterface2Array1 = null;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!fd;")
	public Interface14 anInterface14_1 = null;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!fd;")
	public Interface14 anInterface14_2 = null;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "[Lclient!ah;")
	private Interface2[] anInterface2Array2 = null;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_2;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Z")
	public boolean aBoolean19;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!gca;)V")
	public Class24(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass100_Sub1_2 = arg0;
		this.aBoolean19 = this.aClass100_Sub1_2.aBoolean606;
		if (this.aBoolean19 && !this.aClass100_Sub1_2.method7963(Static266.aClass358_10, Static104.aClass86_8)) {
			this.aBoolean19 = false;
		}
		if (this.aBoolean19 || this.aClass100_Sub1_2.method7885(Static104.aClass86_8, Static266.aClass358_10)) {
			Static458.method6445();
			if (this.aBoolean19) {
				@Pc(142) byte[] local142 = Static553.method7508(Static381.anObject12, false);
				this.anInterface14_2 = this.aClass100_Sub1_2.method7894(local142, Static266.aClass358_10);
				@Pc(158) byte[] local158 = Static553.method7508(Static655.anObject21, false);
				this.aClass100_Sub1_2.method7894(local158, Static266.aClass358_10);
			} else {
				this.anInterface2Array1 = new Interface2[16];
				for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
					@Pc(77) byte[] local77 = Static260.method4253(local63 * 128 * 256, Static381.anObject12);
					this.anInterface2Array1[local63] = this.aClass100_Sub1_2.method7944(local77, 128, Static266.aClass358_10, 128, true);
				}
				this.anInterface2Array2 = new Interface2[16];
				for (@Pc(104) int local104 = 0; local104 < 16; local104++) {
					@Pc(116) byte[] local116 = Static260.method4253(local104 * 128 * 256, Static655.anObject21);
					this.anInterface2Array2[local104] = this.aClass100_Sub1_2.method7944(local116, 128, Static266.aClass358_10, 128, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Z")
	public boolean method393() {
		if (this.aBoolean19) {
			return this.anInterface14_2 != null;
		} else {
			return this.anInterface2Array1 != null;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Z")
	public boolean method397() {
		if (this.anInterface14_1 == null) {
			@Pc(28) byte[] local28;
			if (Static220.anObject8 == null) {
				local28 = Static308.method4794(0.6F, 4.0F, new Class198_Sub1(419684), 4.0F, 16.0F, 0.5F);
				Static220.anObject8 = Static72.method1167(local28);
			}
			local28 = Static553.method7508(Static220.anObject8, false);
			@Pc(44) byte[] local44 = new byte[local28.length * 4];
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
				@Pc(56) int local56 = local48 * 128 * 128;
				@Pc(58) int local58 = local56;
				for (@Pc(60) int local60 = 0; local60 < 128; local60++) {
					@Pc(69) int local69 = local58 + local60 * 128;
					@Pc(79) int local79 = (local60 - 1 & 0x7F) * 128 + local58;
					@Pc(90) int local90 = local58 + (local60 + 1 & 0x7F) * 128;
					for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
						@Pc(112) float local112 = (float) ((local28[local92 + local79] & 0xFF) - (local28[local90 + local92] & 0xFF));
						@Pc(138) float local138 = (float) ((local28[(local92 - 1 & 0x7F) + local69] & 0xFF) - (local28[local69 + (local92 + 1 & 0x7F)] & 0xFF));
						@Pc(153) float local153 = (float) (128.0D / Math.sqrt((double) (local138 * local138 + local112 * local112 + 16384.0F)));
						local44[local46++] = (byte) (int) (local138 * local153 + 127.0F);
						local44[local46++] = (byte) (int) (local153 * 128.0F + 127.0F);
						local44[local46++] = (byte) (int) (local153 * local112 + 127.0F);
						local44[local46++] = local28[local56++];
					}
				}
			}
			this.anInterface14_1 = this.aClass100_Sub1_2.method7894(local44, Static171.aClass358_12);
		}
		return this.anInterface14_1 != null;
	}
}
