import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class318 {

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "[Lclient!mca;")
	private Interface12[] anInterface12Array1 = null;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!qw;")
	public Interface19 anInterface19_1 = null;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Lclient!qw;")
	public Interface19 anInterface19_2 = null;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "[Lclient!mca;")
	public Interface12[] anInterface12Array2 = null;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_20;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Z")
	public boolean aBoolean589;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!rr;)V")
	public Class318(@OriginalArg(0) Class31_Sub1 arg0) {
		this.aClass31_Sub1_20 = arg0;
		this.aBoolean589 = this.aClass31_Sub1_20.aBoolean614;
		if (this.aBoolean589 && !this.aClass31_Sub1_20.method7147(Static201.aClass245_12, Static331.aClass204_13)) {
			this.aBoolean589 = false;
		}
		if (this.aBoolean589 || this.aClass31_Sub1_20.method7080(Static331.aClass204_13, Static201.aClass245_12)) {
			Static491.method6619();
			if (this.aBoolean589) {
				@Pc(130) byte[] local130 = Static193.method3393(false, Static154.anObject9);
				this.anInterface19_2 = this.aClass31_Sub1_20.method7152(Static201.aClass245_12, local130);
				@Pc(146) byte[] local146 = Static193.method3393(false, Static21.anObject1);
				this.aClass31_Sub1_20.method7152(Static201.aClass245_12, local146);
			} else {
				this.anInterface12Array2 = new Interface12[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(70) byte[] local70 = Static544.method7462(Static154.anObject9, local58 * 256 * 128);
					this.anInterface12Array2[local58] = this.aClass31_Sub1_20.method7087(local70, true, Static201.aClass245_12, 128, 128);
				}
				this.anInterface12Array1 = new Interface12[16];
				for (@Pc(93) int local93 = 0; local93 < 16; local93++) {
					@Pc(105) byte[] local105 = Static544.method7462(Static21.anObject1, local93 * 256 * 128);
					this.anInterface12Array1[local93] = this.aClass31_Sub1_20.method7087(local105, true, Static201.aClass245_12, 128, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z")
	public boolean method6940() {
		if (this.aBoolean589) {
			return this.anInterface19_2 != null;
		} else {
			return this.anInterface12Array2 != null;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Z")
	public boolean method6941() {
		if (this.anInterface19_1 == null) {
			@Pc(27) byte[] local27;
			if (Static191.anObject11 == null) {
				local27 = Static56.method1377(new Class267_Sub1(419684), 16.0F, 4.0F, 0.5F, 0.6F, 4.0F);
				Static191.anObject11 = Static342.method4996(local27);
			}
			local27 = Static193.method3393(false, Static191.anObject11);
			@Pc(43) byte[] local43 = new byte[local27.length * 4];
			@Pc(45) int local45 = 0;
			for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
				@Pc(55) int local55 = local47 * 128 * 128;
				@Pc(57) int local57 = local55;
				for (@Pc(59) int local59 = 0; local59 < 128; local59++) {
					@Pc(68) int local68 = local57 + local59 * 128;
					@Pc(78) int local78 = (local59 - 1 & 0x7F) * 128 + local57;
					@Pc(88) int local88 = (local59 + 1 & 0x7F) * 128 + local57;
					for (@Pc(90) int local90 = 0; local90 < 128; local90++) {
						@Pc(111) float local111 = (float) ((local27[local90 + local78] & 0xFF) - (local27[local88 + local90] & 0xFF));
						@Pc(137) float local137 = (float) ((local27[local68 + (local90 - 1 & 0x7F)] & 0xFF) - (local27[local68 + (local90 + 1 & 0x7F)] & 0xFF));
						@Pc(152) float local152 = (float) (128.0D / Math.sqrt((double) (local137 * local137 + local111 * local111 + 16384.0F)));
						local43[local45++] = (byte) (local152 * local137 + 127.0F);
						local43[local45++] = (byte) (local152 * 128.0F + 127.0F);
						local43[local45++] = (byte) (local152 * local111 + 127.0F);
						local43[local45++] = local27[local55++];
					}
				}
			}
			this.anInterface19_1 = this.aClass31_Sub1_20.method7152(Static18.aClass245_3, local43);
		}
		return this.anInterface19_1 != null;
	}
}
