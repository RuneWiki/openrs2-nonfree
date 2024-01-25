import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class189 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "[Lclient!bj;")
	public Class20_Sub1[] aClass20_Sub1Array3 = null;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[Lclient!bj;")
	public Class20_Sub1[] aClass20_Sub1Array2 = null;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!wc;")
	public Class20_Sub4 aClass20_Sub4_1 = null;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!wc;")
	public Class20_Sub4 aClass20_Sub4_2 = null;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Z")
	public final boolean aBoolean553;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class189(@OriginalArg(0) Class32_Sub2 arg0) {
		this.aBoolean553 = arg0.aBoolean230;
		Static288.method4922();
		@Pc(24) byte[] local24;
		if (this.aBoolean553) {
			local24 = new byte[524288];
			Static288.aByteBuffer7.get(local24);
			Static288.aByteBuffer7.position(0);
			this.aClass20_Sub4_1 = new Class20_Sub4(arg0, 6410, 128, 128, 16, local24, 6410);
			Static288.aByteBuffer6.get(local24);
			Static288.aByteBuffer6.position(0);
			this.aClass20_Sub4_2 = new Class20_Sub4(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass20_Sub1Array2 = new Class20_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static288.aByteBuffer7.get(local24, 0, 32768);
				this.aClass20_Sub1Array2[local30] = new Class20_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static288.aByteBuffer7.position(0);
			this.aClass20_Sub1Array3 = new Class20_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static288.aByteBuffer6.get(local24, 0, 32768);
				this.aClass20_Sub1Array3[local30] = new Class20_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static288.aByteBuffer6.position(0);
		}
	}
}
