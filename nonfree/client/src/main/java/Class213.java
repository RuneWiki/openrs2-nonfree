import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class213 {

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!me;")
	public Class20_Sub3 aClass20_Sub3_2 = null;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!me;")
	public Class20_Sub3 aClass20_Sub3_1 = null;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "[Lclient!uo;")
	public Class20_Sub4[] aClass20_Sub4Array3 = null;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "[Lclient!uo;")
	public Class20_Sub4[] aClass20_Sub4Array4 = null;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Z")
	public final boolean aBoolean387;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class213(@OriginalArg(0) Class63_Sub2 arg0) {
		this.aBoolean387 = arg0.aBoolean151;
		Static306.method4477();
		@Pc(24) byte[] local24;
		if (this.aBoolean387) {
			local24 = new byte[524288];
			Static306.aByteBuffer5.get(local24);
			Static306.aByteBuffer5.position(0);
			this.aClass20_Sub3_1 = new Class20_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static306.aByteBuffer6.get(local24);
			Static306.aByteBuffer6.position(0);
			this.aClass20_Sub3_2 = new Class20_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass20_Sub4Array4 = new Class20_Sub4[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static306.aByteBuffer5.get(local24, 0, 32768);
				this.aClass20_Sub4Array4[local30] = new Class20_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static306.aByteBuffer5.position(0);
			this.aClass20_Sub4Array3 = new Class20_Sub4[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static306.aByteBuffer6.get(local24, 0, 32768);
				this.aClass20_Sub4Array3[local30] = new Class20_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static306.aByteBuffer6.position(0);
		}
	}
}
