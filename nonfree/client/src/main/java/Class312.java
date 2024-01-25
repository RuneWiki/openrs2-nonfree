import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class312 {

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "[Lclient!ada;")
	private Interface1[] anInterface1Array1 = null;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lclient!ch;")
	public Interface7 anInterface7_2 = null;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "[Lclient!ada;")
	public Interface1[] anInterface1Array2 = null;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "Lclient!ch;")
	public Interface7 anInterface7_1 = null;

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_17;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "Z")
	public boolean aBoolean629;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class312(@OriginalArg(0) Class33_Sub2 arg0) {
		this.aClass33_Sub2_17 = arg0;
		this.aBoolean629 = this.aClass33_Sub2_17.aBoolean750;
		if (this.aBoolean629 && !this.aClass33_Sub2_17.method8291(Static592.aClass276_18, Static111.aClass79_7)) {
			this.aBoolean629 = false;
		}
		if (this.aBoolean629 || this.aClass33_Sub2_17.method8165(Static111.aClass79_7, Static592.aClass276_18)) {
			Static182.method2910();
			if (this.aBoolean629) {
				@Pc(57) byte[] local57 = Static418.method5746(Static41.anObject1, false);
				this.anInterface7_2 = this.aClass33_Sub2_17.method8248(local57, Static592.aClass276_18);
				@Pc(73) byte[] local73 = Static418.method5746(Static583.anObject18, false);
				this.aClass33_Sub2_17.method8248(local73, Static592.aClass276_18);
			} else {
				this.anInterface1Array2 = new Interface1[16];
				for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
					@Pc(102) byte[] local102 = Static181.method2896(local90 * 128 * 256, Static41.anObject1);
					this.anInterface1Array2[local90] = this.aClass33_Sub2_17.method8174(128, true, local102, Static592.aClass276_18, 128);
				}
				this.anInterface1Array1 = new Interface1[16];
				for (@Pc(125) int local125 = 0; local125 < 16; local125++) {
					@Pc(137) byte[] local137 = Static181.method2896(local125 * 2 * 16384, Static583.anObject18);
					this.anInterface1Array1[local125] = this.aClass33_Sub2_17.method8174(128, true, local137, Static592.aClass276_18, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)Z")
	public boolean method6974() {
		if (this.aBoolean629) {
			return this.anInterface7_2 != null;
		} else {
			return this.anInterface1Array2 != null;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)Z")
	public boolean method6976() {
		if (this.anInterface7_1 == null) {
			@Pc(27) byte[] local27;
			if (Static443.anObject15 == null) {
				local27 = Static319.method4407(4.0F, 0.5F, 0.6F, new Class107_Sub1(419684), 16.0F, 4.0F);
				Static443.anObject15 = Static621.method8352(local27);
			}
			local27 = Static418.method5746(Static443.anObject15, false);
			@Pc(43) byte[] local43 = new byte[local27.length * 4];
			@Pc(45) int local45 = 0;
			for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
				@Pc(55) int local55 = local47 * 128 * 128;
				@Pc(57) int local57 = local55;
				for (@Pc(59) int local59 = 0; local59 < 128; local59++) {
					@Pc(67) int local67 = local59 * 128 + local57;
					@Pc(78) int local78 = local57 + (local59 - 1 & 0x7F) * 128;
					@Pc(88) int local88 = (local59 + 1 & 0x7F) * 128 + local57;
					for (@Pc(90) int local90 = 0; local90 < 128; local90++) {
						@Pc(110) float local110 = (float) ((local27[local90 + local78] & 0xFF) - (local27[local88 + local90] & 0xFF));
						@Pc(136) float local136 = (float) ((local27[local67 + (local90 - 1 & 0x7F)] & 0xFF) - (local27[(local90 + 1 & 0x7F) + local67] & 0xFF));
						@Pc(151) float local151 = (float) (128.0D / Math.sqrt((double) (local136 * local136 + local110 * local110 + 16384.0F)));
						local43[local45++] = (byte) (int) (local151 * local136 + 127.0F);
						local43[local45++] = (byte) (int) (local151 * 128.0F + 127.0F);
						local43[local45++] = (byte) (int) (local151 * local110 + 127.0F);
						local43[local45++] = local27[local55++];
					}
				}
			}
			this.anInterface7_1 = this.aClass33_Sub2_17.method8248(local43, Static220.aClass276_11);
		}
		return this.anInterface7_1 != null;
	}
}
