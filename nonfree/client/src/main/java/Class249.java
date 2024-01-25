import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class249 {

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "[Lclient!ch;")
	private Interface3[] anInterface3Array1 = null;

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "Lclient!kj;")
	public Interface15 anInterface15_2 = null;

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "Lclient!kj;")
	public Interface15 anInterface15_1 = null;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "[Lclient!ch;")
	public Interface3[] anInterface3Array2 = null;

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_20;

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "Z")
	public boolean aBoolean522;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class249(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass100_Sub1_20 = arg0;
		this.aBoolean522 = this.aClass100_Sub1_20.aBoolean474;
		if (this.aBoolean522 && !this.aClass100_Sub1_20.method6085(Static409.aClass242_13, Static458.aClass250_12)) {
			this.aBoolean522 = false;
		}
		if (this.aBoolean522 || this.aClass100_Sub1_20.method6050(Static409.aClass242_13, Static458.aClass250_12)) {
			Static356.method5698();
			if (this.aBoolean522) {
				@Pc(130) byte[] local130 = Static589.method8324(false, Static399.anObject18);
				this.anInterface15_1 = this.aClass100_Sub1_20.method6053(local130, Static458.aClass250_12);
				@Pc(146) byte[] local146 = Static589.method8324(false, Static580.anObject22);
				this.aClass100_Sub1_20.method6053(local146, Static458.aClass250_12);
			} else {
				this.anInterface3Array2 = new Interface3[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(68) byte[] local68 = Static175.method3219(local58 * 32768, Static399.anObject18);
					this.anInterface3Array2[local58] = this.aClass100_Sub1_20.method6125(128, true, local68, Static458.aClass250_12, 128);
				}
				this.anInterface3Array1 = new Interface3[16];
				for (@Pc(91) int local91 = 0; local91 < 16; local91++) {
					@Pc(105) byte[] local105 = Static175.method3219(local91 * 128 * 128 * 2, Static580.anObject22);
					this.anInterface3Array1[local91] = this.aClass100_Sub1_20.method6125(128, true, local105, Static458.aClass250_12, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)Z")
	public boolean method6663() {
		if (this.anInterface15_2 == null) {
			@Pc(33) byte[] local33;
			if (Static317.anObject14 == null) {
				local33 = Static586.method8240(0.6F, new Class206_Sub1(419684), 4.0F, 0.5F, 4.0F, 16.0F);
				Static317.anObject14 = Static493.method7391(local33);
			}
			local33 = Static589.method8324(false, Static317.anObject14);
			@Pc(49) byte[] local49 = new byte[local33.length * 4];
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 16; local53++) {
				@Pc(59) int local59 = local53 * 16384;
				@Pc(61) int local61 = local59;
				for (@Pc(63) int local63 = 0; local63 < 128; local63++) {
					@Pc(72) int local72 = local61 + local63 * 128;
					@Pc(83) int local83 = local61 + (local63 - 1 & 0x7F) * 128;
					@Pc(93) int local93 = (local63 + 1 & 0x7F) * 128 + local61;
					for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
						@Pc(116) float local116 = (float) ((local33[local83 + local95] & 0xFF) - (local33[local93 + local95] & 0xFF));
						@Pc(142) float local142 = (float) ((local33[local72 + (local95 - 1 & 0x7F)] & 0xFF) - (local33[(local95 + 1 & 0x7F) + local72] & 0xFF));
						@Pc(157) float local157 = (float) (128.0D / Math.sqrt((double) (local142 * local142 + local116 * local116 + 16384.0F)));
						local49[local51++] = (byte) (int) (local142 * local157 + 127.0F);
						local49[local51++] = (byte) (int) (local157 * 128.0F + 127.0F);
						local49[local51++] = (byte) (int) (local116 * local157 + 127.0F);
						local49[local51++] = local33[local59++];
					}
				}
			}
			this.anInterface15_2 = this.aClass100_Sub1_20.method6053(local49, Static203.aClass250_7);
		}
		return this.anInterface15_2 != null;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)Z")
	public boolean method6665() {
		if (this.aBoolean522) {
			return this.anInterface15_1 != null;
		} else {
			return this.anInterface3Array2 != null;
		}
	}
}
