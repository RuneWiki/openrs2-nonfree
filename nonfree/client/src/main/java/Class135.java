import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class135 {

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!iv;")
	public Class8_Sub4 aClass8_Sub4_1 = null;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "Lclient!iv;")
	public Class8_Sub4 aClass8_Sub4_2 = null;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "[Lclient!ah;")
	public Class8_Sub1[] aClass8_Sub1Array1 = null;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!iv;")
	public Class8_Sub4 aClass8_Sub4_3 = null;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[Lclient!ah;")
	public Class8_Sub1[] aClass8_Sub1Array2 = null;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Z")
	public final boolean aBoolean251;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class135(@OriginalArg(0) Class106_Sub2 arg0) {
		this.aBoolean251 = arg0.aBoolean217;
		Static63.method1229(arg0);
		if (this.aBoolean251) {
			@Pc(106) byte[] local106 = Static408.method5555(Static201.anObject10, false);
			this.aClass8_Sub4_2 = new Class8_Sub4(arg0, 6410, 128, 128, 16, local106, 6410);
			@Pc(123) byte[] local123 = Static408.method5555(Static433.anObject19, false);
			this.aClass8_Sub4_1 = new Class8_Sub4(arg0, 6410, 128, 128, 16, local123, 6410);
			@Pc(138) Class110 local138 = arg0.aClass110_1;
			if (local138.method2637()) {
				local106 = Static408.method5555(Static24.anObject1, false);
				this.aClass8_Sub4_3 = new Class8_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(168) Class8_Sub4 local168 = new Class8_Sub4(arg0, 6409, 128, 128, 16, local106, 6409);
				if (local138.method2636(local168, this.aClass8_Sub4_3, 2.0F)) {
					this.aClass8_Sub4_3.method3070();
				} else {
					this.aClass8_Sub4_3.method3074();
					this.aClass8_Sub4_3 = null;
				}
				local168.method3074();
			}
		} else {
			this.aClass8_Sub1Array2 = new Class8_Sub1[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(43) byte[] local43 = Static193.method3127(2 * 16384 * local32, Static201.anObject10);
				this.aClass8_Sub1Array2[local32] = new Class8_Sub1(arg0, 3553, 6410, 128, 128, true, local43, 6410, false);
			}
			this.aClass8_Sub1Array1 = new Class8_Sub1[16];
			for (@Pc(69) int local69 = 0; local69 < 16; local69++) {
				@Pc(80) byte[] local80 = Static193.method3127(local69 * 128 * 256, Static433.anObject19);
				this.aClass8_Sub1Array1[local69] = new Class8_Sub1(arg0, 3553, 6410, 128, 128, true, local80, 6410, false);
			}
		}
	}
}
