import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class31 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lclient!ls;")
	private Interface14[] anInterface14Array1 = null;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!fl;")
	public Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[Lclient!ls;")
	public Interface14[] anInterface14Array2 = null;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!fl;")
	public Interface6 anInterface6_2 = null;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_2;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class31(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass100_Sub1_2 = arg0;
		this.aBoolean40 = this.aClass100_Sub1_2.aBoolean454;
		if (this.aBoolean40 && !this.aClass100_Sub1_2.method4810(Static5.aClass88_1, Static47.aClass42_4)) {
			this.aBoolean40 = false;
		}
		if (this.aBoolean40 || this.aClass100_Sub1_2.method4794(Static47.aClass42_4, Static5.aClass88_1)) {
			Static89.method7258();
			if (this.aBoolean40) {
				@Pc(130) byte[] local130 = Static583.method7909(false, Static62.anObject10);
				this.anInterface6_1 = this.aClass100_Sub1_2.method4776(local130, Static5.aClass88_1);
				@Pc(146) byte[] local146 = Static583.method7909(false, Static402.anObject37);
				this.aClass100_Sub1_2.method4776(local146, Static5.aClass88_1);
			} else {
				this.anInterface14Array2 = new Interface14[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(70) byte[] local70 = Static216.method3476(local58 * 256 * 128, Static62.anObject10);
					this.anInterface14Array2[local58] = this.aClass100_Sub1_2.method4869(local70, 128, 128, Static5.aClass88_1, true);
				}
				this.anInterface14Array1 = new Interface14[16];
				for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
					@Pc(107) byte[] local107 = Static216.method3476(local95 * 128 * 256, Static402.anObject37);
					this.anInterface14Array1[local95] = this.aClass100_Sub1_2.method4869(local107, 128, 128, Static5.aClass88_1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z")
	public boolean method544() {
		if (this.anInterface6_2 == null) {
			@Pc(22) byte[] local22;
			if (Static54.anObject9 == null) {
				local22 = Static450.method6450(16.0F, 0.5F, 0.6F, 4.0F, new Class4_Sub1(419684), 4.0F);
				Static54.anObject9 = Static276.method3094(local22);
			}
			local22 = Static583.method7909(false, Static54.anObject9);
			@Pc(38) byte[] local38 = new byte[local22.length * 4];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
				@Pc(50) int local50 = local42 * 128 * 128;
				@Pc(52) int local52 = local50;
				for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
					@Pc(63) int local63 = local52 + local54 * 128;
					@Pc(73) int local73 = (local54 - 1 & 0x7F) * 128 + local52;
					@Pc(83) int local83 = local52 + (local54 + 1 & 0x7F) * 128;
					for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
						@Pc(104) float local104 = (float) ((local22[local73 + local85] & 0xFF) - (local22[local85 + local83] & 0xFF));
						@Pc(131) float local131 = (float) ((local22[local63 + (local85 - 1 & 0x7F)] & 0xFF) - (local22[(local85 + 1 & 0x7F) + local63] & 0xFF));
						@Pc(146) float local146 = (float) (128.0D / Math.sqrt((double) (local131 * local131 + local104 * local104 + 16384.0F)));
						local38[local40++] = (byte) (local131 * local146 + 127.0F);
						local38[local40++] = (byte) (local146 * 128.0F + 127.0F);
						local38[local40++] = (byte) (local146 * local104 + 127.0F);
						local38[local40++] = local22[local50++];
					}
				}
			}
			this.anInterface6_2 = this.aClass100_Sub1_2.method4776(local38, Static356.aClass88_11);
		}
		return this.anInterface6_2 != null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Z")
	public boolean method545() {
		if (this.aBoolean40) {
			return this.anInterface6_1 != null;
		} else {
			return this.anInterface14Array2 != null;
		}
	}
}
