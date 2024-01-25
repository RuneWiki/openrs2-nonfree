import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class249 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Lclient!is;")
	public Class3_Sub4 aClass3_Sub4_1 = null;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[Lclient!fo;")
	public Class3_Sub2[] aClass3_Sub2Array3 = null;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "Lclient!is;")
	public Class3_Sub4 aClass3_Sub4_3 = null;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "[Lclient!fo;")
	public Class3_Sub2[] aClass3_Sub2Array4 = null;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!is;")
	public Class3_Sub4 aClass3_Sub4_2 = null;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "Z")
	public final boolean aBoolean456;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class249(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aBoolean456 = arg0.aBoolean253;
		Static441.method5821(arg0);
		if (this.aBoolean456) {
			@Pc(112) byte[] local112 = Static418.method5565(Static400.anObject9, false);
			this.aClass3_Sub4_3 = new Class3_Sub4(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static418.method5565(Static197.anObject6, false);
			this.aClass3_Sub4_1 = new Class3_Sub4(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class147 local144 = arg0.aClass147_1;
			if (local144.method3380()) {
				local112 = Static418.method5565(Static224.anObject7, false);
				this.aClass3_Sub4_2 = new Class3_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(174) Class3_Sub4 local174 = new Class3_Sub4(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method3379(this.aClass3_Sub4_2, 2.0F, local174)) {
					this.aClass3_Sub4_2.method4148();
				} else {
					this.aClass3_Sub4_2.method4152();
					this.aClass3_Sub4_2 = null;
				}
				local174.method4152();
			}
		} else {
			this.aClass3_Sub2Array3 = new Class3_Sub2[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(43) byte[] local43 = Static263.method3889(Static400.anObject9, local32 * 2 * 16384);
				this.aClass3_Sub2Array3[local32] = new Class3_Sub2(arg0, 3553, 6410, 128, 128, true, local43, 6410, false);
			}
			this.aClass3_Sub2Array4 = new Class3_Sub2[16];
			for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
				@Pc(84) byte[] local84 = Static263.method3889(Static197.anObject6, 2 * 128 * local71 * 128);
				this.aClass3_Sub2Array4[local71] = new Class3_Sub2(arg0, 3553, 6410, 128, 128, true, local84, 6410, false);
			}
		}
	}
}
