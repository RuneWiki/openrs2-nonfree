import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class336 {

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!pl;")
	public Class161_Sub3 aClass161_Sub3_1 = null;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "[Lclient!sb;")
	public Class161_Sub1[] aClass161_Sub1Array4 = null;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!pl;")
	public Class161_Sub3 aClass161_Sub3_2 = null;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "[Lclient!sb;")
	public Class161_Sub1[] aClass161_Sub1Array3 = null;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Lclient!pl;")
	public Class161_Sub3 aClass161_Sub3_3 = null;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Z")
	public final boolean aBoolean650;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class336(@OriginalArg(0) Class144_Sub3 arg0) {
		this.aBoolean650 = arg0.aBoolean566;
		Static564.method8091(arg0);
		if (this.aBoolean650) {
			@Pc(111) byte[] local111 = Static351.method9354(false, Static174.anObject3);
			this.aClass161_Sub3_2 = new Class161_Sub3(arg0, 6410, 128, 128, 16, local111, 6410);
			@Pc(128) byte[] local128 = Static351.method9354(false, Static470.anObject18);
			this.aClass161_Sub3_1 = new Class161_Sub3(arg0, 6410, 128, 128, 16, local128, 6410);
			@Pc(143) Class320 local143 = arg0.aClass320_1;
			if (local143.method7901()) {
				local111 = Static351.method9354(false, Static663.anObject21);
				this.aClass161_Sub3_3 = new Class161_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(173) Class161_Sub3 local173 = new Class161_Sub3(arg0, 6409, 128, 128, 16, local111, 6409);
				if (local143.method7904(local173, this.aClass161_Sub3_3, 2.0F)) {
					this.aClass161_Sub3_3.method9174();
				} else {
					this.aClass161_Sub3_3.method9167();
					this.aClass161_Sub3_3 = null;
				}
				local173.method9167();
			}
		} else {
			this.aClass161_Sub1Array3 = new Class161_Sub1[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(43) byte[] local43 = Static264.method4388(local32 * 128 * 256, Static174.anObject3);
				this.aClass161_Sub1Array3[local32] = new Class161_Sub1(arg0, 3553, 6410, 128, 128, true, local43, 6410, false);
			}
			this.aClass161_Sub1Array4 = new Class161_Sub1[16];
			for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
				@Pc(82) byte[] local82 = Static264.method4388(local71 * 2 * 16384, Static470.anObject18);
				this.aClass161_Sub1Array4[local71] = new Class161_Sub1(arg0, 3553, 6410, 128, 128, true, local82, 6410, false);
			}
		}
	}
}
