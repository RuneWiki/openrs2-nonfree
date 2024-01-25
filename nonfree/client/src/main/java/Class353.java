import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class353 {

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "Lclient!pfa;")
	public Class77_Sub2 aClass77_Sub2_1 = null;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!pfa;")
	public Class77_Sub2 aClass77_Sub2_2 = null;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "[Lclient!saa;")
	public Class77_Sub1[] aClass77_Sub1Array4 = null;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "[Lclient!saa;")
	public Class77_Sub1[] aClass77_Sub1Array3 = null;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!pfa;")
	public Class77_Sub2 aClass77_Sub2_3 = null;

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "Z")
	public final boolean aBoolean708;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class353(@OriginalArg(0) Class44_Sub3 arg0) {
		this.aBoolean708 = arg0.aBoolean398;
		Static307.method5246(arg0);
		if (this.aBoolean708) {
			@Pc(112) byte[] local112 = Static501.method5647(Static190.anObject10, false);
			this.aClass77_Sub2_1 = new Class77_Sub2(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static501.method5647(Static181.anObject9, false);
			this.aClass77_Sub2_2 = new Class77_Sub2(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class251 local144 = arg0.aClass251_1;
			if (local144.method6100()) {
				local112 = Static501.method5647(Static286.anObject15, false);
				this.aClass77_Sub2_3 = new Class77_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(174) Class77_Sub2 local174 = new Class77_Sub2(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method6099(2.0F, local174, this.aClass77_Sub2_3)) {
					this.aClass77_Sub2_3.method7067();
				} else {
					this.aClass77_Sub2_3.method7069();
					this.aClass77_Sub2_3 = null;
				}
				local174.method7069();
			}
		} else {
			this.aClass77_Sub1Array4 = new Class77_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static155.method2874(local34 * 256 * 128, Static190.anObject10);
				this.aClass77_Sub1Array4[local34] = new Class77_Sub1(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass77_Sub1Array3 = new Class77_Sub1[16];
			for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
				@Pc(86) byte[] local86 = Static155.method2874(128 * 128 * local72 * 2, Static181.anObject9);
				this.aClass77_Sub1Array3[local72] = new Class77_Sub1(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
