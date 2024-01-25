import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class27 {

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Lclient!nu;")
	public Class44_Sub3 aClass44_Sub3_1 = null;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "Lclient!nu;")
	public Class44_Sub3 aClass44_Sub3_2 = null;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "[Lclient!bp;")
	public Class44_Sub1[] aClass44_Sub1Array1 = null;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "[Lclient!bp;")
	public Class44_Sub1[] aClass44_Sub1Array2 = null;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Lclient!nu;")
	public Class44_Sub3 aClass44_Sub3_3 = null;

	@OriginalMember(owner = "client!au", name = "m", descriptor = "Z")
	public final boolean aBoolean31;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class27(@OriginalArg(0) Class75_Sub3 arg0) {
		this.aBoolean31 = arg0.aBoolean496;
		Static619.method8521(arg0);
		if (this.aBoolean31) {
			@Pc(33) byte[] local33 = Static634.method8591(false, Static71.anObject1);
			this.aClass44_Sub3_1 = new Class44_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static634.method8591(false, Static178.anObject22);
			this.aClass44_Sub3_2 = new Class44_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class41 local65 = arg0.aClass41_1;
			if (local65.method563()) {
				local33 = Static634.method8591(false, Static544.anObject23);
				this.aClass44_Sub3_3 = new Class44_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class44_Sub3 local95 = new Class44_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method562(this.aClass44_Sub3_3, local95, 2.0F)) {
					this.aClass44_Sub3_3.method9008();
				} else {
					this.aClass44_Sub3_3.method9005();
					this.aClass44_Sub3_3 = null;
				}
				local95.method9005();
				return;
			}
		} else {
			this.aClass44_Sub1Array1 = new Class44_Sub1[16];
			for (@Pc(131) int local131 = 0; local131 < 16; local131++) {
				@Pc(145) byte[] local145 = Static579.method8064(local131 * 256 * 128, Static71.anObject1);
				this.aClass44_Sub1Array1[local131] = new Class44_Sub1(arg0, 3553, 6410, 128, 128, true, local145, 6410, false);
			}
			this.aClass44_Sub1Array2 = new Class44_Sub1[16];
			for (@Pc(177) int local177 = 0; local177 < 16; local177++) {
				@Pc(189) byte[] local189 = Static579.method8064(local177 * 256 * 128, Static178.anObject22);
				this.aClass44_Sub1Array2[local177] = new Class44_Sub1(arg0, 3553, 6410, 128, 128, true, local189, 6410, false);
			}
		}
	}
}
