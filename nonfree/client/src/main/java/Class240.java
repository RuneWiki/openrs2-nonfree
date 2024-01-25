import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class240 {

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "Lclient!bu;")
	public Class35_Sub1 aClass35_Sub1_1 = null;

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "Lclient!bu;")
	public Class35_Sub1 aClass35_Sub1_2 = null;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "[Lclient!qw;")
	public Class35_Sub3[] aClass35_Sub3Array2 = null;

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "[Lclient!qw;")
	public Class35_Sub3[] aClass35_Sub3Array3 = null;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "Lclient!bu;")
	public Class35_Sub1 aClass35_Sub1_3 = null;

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "Z")
	public final boolean aBoolean444;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class240(@OriginalArg(0) Class121_Sub3 arg0) {
		this.aBoolean444 = arg0.aBoolean472;
		Static482.method6686(arg0);
		if (this.aBoolean444) {
			@Pc(33) byte[] local33 = Static143.method6505(Static476.anObject26, false);
			this.aClass35_Sub1_2 = new Class35_Sub1(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static143.method6505(Static448.anObject25, false);
			this.aClass35_Sub1_1 = new Class35_Sub1(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class54 local65 = arg0.aClass54_1;
			if (local65.method887()) {
				local33 = Static143.method6505(Static109.anObject30, false);
				this.aClass35_Sub1_3 = new Class35_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(95) Class35_Sub1 local95 = new Class35_Sub1(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method886(local95, 2.0F, this.aClass35_Sub1_3)) {
					this.aClass35_Sub1_3.method5332();
				} else {
					this.aClass35_Sub1_3.method5325();
					this.aClass35_Sub1_3 = null;
				}
				local95.method5325();
				return;
			}
		} else {
			this.aClass35_Sub3Array3 = new Class35_Sub3[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static369.method5425(local127 * 2 * 128 * 128, Static476.anObject26);
				this.aClass35_Sub3Array3[local127] = new Class35_Sub3(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass35_Sub3Array2 = new Class35_Sub3[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(179) byte[] local179 = Static369.method5425(2 * 16384 * local167, Static448.anObject25);
				this.aClass35_Sub3Array2[local167] = new Class35_Sub3(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
