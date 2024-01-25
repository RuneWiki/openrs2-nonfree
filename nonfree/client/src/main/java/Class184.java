import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class184 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "[Lclient!cf;")
	public Interface7[] anInterface7Array1 = null;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!jca;")
	public Interface13 anInterface13_1 = null;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!jca;")
	public Interface13 anInterface13_2 = null;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "[Lclient!cf;")
	private Interface7[] anInterface7Array2 = null;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_12;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "Z")
	public boolean aBoolean386;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class184(@OriginalArg(0) Class75_Sub1 arg0) {
		this.aClass75_Sub1_12 = arg0;
		this.aBoolean386 = this.aClass75_Sub1_12.aBoolean569;
		if (this.aBoolean386 && !this.aClass75_Sub1_12.method6819(Static487.aClass155_62, Static435.aClass274_13)) {
			this.aBoolean386 = false;
		}
		if (this.aBoolean386 || this.aClass75_Sub1_12.method6786(Static435.aClass274_13, Static487.aClass155_62)) {
			Static511.method7382();
			if (this.aBoolean386) {
				@Pc(142) byte[] local142 = Static634.method8591(false, Static411.anObject18);
				this.anInterface13_1 = this.aClass75_Sub1_12.method6849(Static487.aClass155_62, local142);
				@Pc(158) byte[] local158 = Static634.method8591(false, Static180.anObject13);
				this.aClass75_Sub1_12.method6849(Static487.aClass155_62, local158);
			} else {
				this.anInterface7Array1 = new Interface7[16];
				for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
					@Pc(77) byte[] local77 = Static579.method8064(local63 * 256 * 128, Static411.anObject18);
					this.anInterface7Array1[local63] = this.aClass75_Sub1_12.method6825(128, true, local77, Static487.aClass155_62, 128);
				}
				this.anInterface7Array2 = new Interface7[16];
				for (@Pc(104) int local104 = 0; local104 < 16; local104++) {
					@Pc(116) byte[] local116 = Static579.method8064(local104 * 16384 * 2, Static180.anObject13);
					this.anInterface7Array2[local104] = this.aClass75_Sub1_12.method6825(128, true, local116, Static487.aClass155_62, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z")
	public boolean method4632() {
		if (this.aBoolean386) {
			return this.anInterface13_1 != null;
		} else {
			return this.anInterface7Array1 != null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z")
	public boolean method4635() {
		if (this.anInterface13_2 == null) {
			@Pc(35) byte[] local35;
			if (Static96.anObject2 == null) {
				local35 = Static599.method5107(0.5F, new Class11_Sub1(419684), 16.0F, 4.0F, 4.0F, 0.6F);
				Static96.anObject2 = Static263.method4529(local35);
			}
			local35 = Static634.method8591(false, Static96.anObject2);
			@Pc(51) byte[] local51 = new byte[local35.length * 4];
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 16; local55++) {
				@Pc(63) int local63 = 128 * 128 * local55;
				@Pc(65) int local65 = local63;
				for (@Pc(67) int local67 = 0; local67 < 128; local67++) {
					@Pc(75) int local75 = local67 * 128 + local65;
					@Pc(85) int local85 = (local67 - 1 & 0x7F) * 128 + local65;
					@Pc(95) int local95 = local65 + (local67 + 1 & 0x7F) * 128;
					for (@Pc(97) int local97 = 0; local97 < 128; local97++) {
						@Pc(116) float local116 = (float) ((local35[local97 + local85] & 0xFF) - (local35[local97 + local95] & 0xFF));
						@Pc(142) float local142 = (float) ((local35[(local97 - 1 & 0x7F) + local75] & 0xFF) - (local35[local75 + (local97 + 1 & 0x7F)] & 0xFF));
						@Pc(157) float local157 = (float) (128.0D / Math.sqrt((double) (local116 * local116 + local142 * local142 + 16384.0F)));
						local51[local53++] = (byte) (int) (local142 * local157 + 127.0F);
						local51[local53++] = (byte) (int) (local157 * 128.0F + 127.0F);
						local51[local53++] = (byte) (int) (local116 * local157 + 127.0F);
						local51[local53++] = local35[local63++];
					}
				}
			}
			this.anInterface13_2 = this.aClass75_Sub1_12.method6849(Static432.aClass155_45, local51);
		}
		return this.anInterface13_2 != null;
	}
}
