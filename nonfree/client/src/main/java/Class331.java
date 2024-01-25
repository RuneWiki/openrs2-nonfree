import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class331 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[Lclient!oi;")
	public Interface14[] anInterface14Array1 = null;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "[Lclient!oi;")
	private Interface14[] anInterface14Array2 = null;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!jb;")
	public Interface11 anInterface11_2 = null;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!jb;")
	public Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_22;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Z")
	public boolean aBoolean694;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!hea;)V")
	public Class331(@OriginalArg(0) Class134_Sub1 arg0) {
		this.aClass134_Sub1_22 = arg0;
		this.aBoolean694 = this.aClass134_Sub1_22.aBoolean648;
		if (this.aBoolean694 && !this.aClass134_Sub1_22.method6777(Static194.aClass203_7, Static215.aClass155_10)) {
			this.aBoolean694 = false;
		}
		if (this.aBoolean694 || this.aClass134_Sub1_22.method6820(Static215.aClass155_10, Static194.aClass203_7)) {
			Static88.method1540();
			if (this.aBoolean694) {
				@Pc(57) byte[] local57 = Static437.method6088(false, Static444.anObject13);
				this.anInterface11_2 = this.aClass134_Sub1_22.method6842(local57, Static194.aClass203_7);
				@Pc(73) byte[] local73 = Static437.method6088(false, Static86.anObject1);
				this.aClass134_Sub1_22.method6842(local73, Static194.aClass203_7);
			} else {
				this.anInterface14Array1 = new Interface14[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(102) byte[] local102 = Static364.method4922(Static444.anObject13, local90 * 16384 * 2);
					this.anInterface14Array1[local90] = this.aClass134_Sub1_22.method6753(true, Static194.aClass203_7, 128, local102, 128);
				}
				this.anInterface14Array2 = new Interface14[16];
				for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
					@Pc(141) byte[] local141 = Static364.method4922(Static86.anObject1, local127 * 2 * 128 * 128);
					this.anInterface14Array2[local127] = this.aClass134_Sub1_22.method6753(true, Static194.aClass203_7, 128, local141, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
	public boolean method7301() {
		if (this.anInterface11_1 == null) {
			@Pc(22) byte[] local22;
			if (Static198.anObject10 == null) {
				local22 = Static264.method3793(new Class230_Sub1(419684), 4.0F, 16.0F, 0.6F, 4.0F, 0.5F);
				Static198.anObject10 = Static476.method6489(local22);
			}
			local22 = Static437.method6088(false, Static198.anObject10);
			@Pc(38) byte[] local38 = new byte[local22.length * 4];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
				@Pc(50) int local50 = local42 * 128 * 128;
				@Pc(52) int local52 = local50;
				for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
					@Pc(62) int local62 = local52 + local54 * 128;
					@Pc(72) int local72 = (local54 - 1 & 0x7F) * 128 + local52;
					@Pc(82) int local82 = local52 + (local54 + 1 & 0x7F) * 128;
					for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
						@Pc(104) float local104 = (float) ((local22[local84 + local72] & 0xFF) - (local22[local84 + local82] & 0xFF));
						@Pc(130) float local130 = (float) ((local22[local62 + (local84 - 1 & 0x7F)] & 0xFF) - (local22[local62 + (local84 + 1 & 0x7F)] & 0xFF));
						@Pc(145) float local145 = (float) (128.0D / Math.sqrt((double) (local104 * local104 + local130 * local130 + 16384.0F)));
						local38[local40++] = (byte) (local130 * local145 + 127.0F);
						local38[local40++] = (byte) (local145 * 128.0F + 127.0F);
						local38[local40++] = (byte) (local145 * local104 + 127.0F);
						local38[local40++] = local22[local50++];
					}
				}
			}
			this.anInterface11_1 = this.aClass134_Sub1_22.method6842(local38, Static129.aClass203_5);
		}
		return this.anInterface11_1 != null;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
	public boolean method7305() {
		if (this.aBoolean694) {
			return this.anInterface11_2 != null;
		} else {
			return this.anInterface14Array1 != null;
		}
	}
}
