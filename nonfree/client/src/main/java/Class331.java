import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class331 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "[Lclient!pm;")
	private Interface17[] anInterface17Array1 = null;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "[Lclient!pm;")
	public Interface17[] anInterface17Array2 = null;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Lclient!n;")
	public Interface14 anInterface14_1 = null;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "Lclient!n;")
	public Interface14 anInterface14_2 = null;

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_20;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class331(@OriginalArg(0) Class45_Sub2 arg0) {
		this.aClass45_Sub2_20 = arg0;
		this.aBoolean638 = this.aClass45_Sub2_20.aBoolean409;
		if (this.aBoolean638 && !this.aClass45_Sub2_20.method5016(Static471.aClass298_15, Static386.aClass314_16)) {
			this.aBoolean638 = false;
		}
		if (this.aBoolean638 || this.aClass45_Sub2_20.method4955(Static471.aClass298_15, Static386.aClass314_16)) {
			Static176.method3085();
			if (this.aBoolean638) {
				@Pc(57) byte[] local57 = Static73.method1566(false, Static383.anObject15);
				this.anInterface14_2 = this.aClass45_Sub2_20.method4972(local57, Static386.aClass314_16);
				@Pc(73) byte[] local73 = Static73.method1566(false, Static468.anObject19);
				this.aClass45_Sub2_20.method4972(local73, Static386.aClass314_16);
			} else {
				this.anInterface17Array2 = new Interface17[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(100) byte[] local100 = Static442.method6191(local90 * 32768, Static383.anObject15);
					this.anInterface17Array2[local90] = this.aClass45_Sub2_20.method5013(128, local100, 128, Static386.aClass314_16, true);
				}
				this.anInterface17Array1 = new Interface17[16];
				for (@Pc(123) int local123 = 0; local123 < 16; local123++) {
					@Pc(137) byte[] local137 = Static442.method6191(2 * 128 * local123 * 128, Static468.anObject19);
					this.anInterface17Array1[local123] = this.aClass45_Sub2_20.method5013(128, local137, 128, Static386.aClass314_16, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)Z")
	public boolean method6941() {
		if (this.aBoolean638) {
			return this.anInterface14_2 != null;
		} else {
			return this.anInterface17Array2 != null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)Z")
	public boolean method6942() {
		if (this.anInterface14_1 == null) {
			@Pc(27) byte[] local27;
			if (Static570.anObject20 == null) {
				local27 = Static282.method4209(4.0F, new Class182_Sub1(419684), 4.0F, 16.0F, 0.6F, 0.5F);
				Static570.anObject20 = Static258.method6206(local27);
			}
			local27 = Static73.method1566(false, Static570.anObject20);
			@Pc(43) byte[] local43 = new byte[local27.length * 4];
			@Pc(45) int local45 = 0;
			for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
				@Pc(53) int local53 = local47 * 16384;
				@Pc(55) int local55 = local53;
				for (@Pc(57) int local57 = 0; local57 < 128; local57++) {
					@Pc(65) int local65 = local55 + local57 * 128;
					@Pc(75) int local75 = local55 + (local57 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = (local57 + 1 & 0x7F) * 128 + local55;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(108) float local108 = (float) ((local27[local75 + local87] & 0xFF) - (local27[local85 + local87] & 0xFF));
						@Pc(136) float local136 = (float) ((local27[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local27[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(151) float local151 = (float) (128.0D / Math.sqrt((double) (local136 * local136 + local108 * local108 + 16384.0F)));
						local43[local45++] = (byte) (local136 * local151 + 127.0F);
						local43[local45++] = (byte) (local151 * 128.0F + 127.0F);
						local43[local45++] = (byte) (local151 * local108 + 127.0F);
						local43[local45++] = local27[local53++];
					}
				}
			}
			this.anInterface14_1 = this.aClass45_Sub2_20.method4972(local43, Static469.aClass314_11);
		}
		return this.anInterface14_1 != null;
	}
}
