import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class202 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "Lclient!em;")
	public Class23_Sub2 aClass23_Sub2_1 = null;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "[Lclient!gu;")
	public Class23_Sub3[] aClass23_Sub3Array4 = null;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "[Lclient!gu;")
	public Class23_Sub3[] aClass23_Sub3Array3 = null;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "Lclient!em;")
	public Class23_Sub2 aClass23_Sub2_2 = null;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "Lclient!em;")
	public Class23_Sub2 aClass23_Sub2_3 = null;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Z")
	public final boolean aBoolean484;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class202(@OriginalArg(0) Class117_Sub1 arg0) {
		this.aBoolean484 = arg0.aBoolean303;
		Static398.method5158(arg0);
		if (this.aBoolean484) {
			@Pc(112) byte[] local112 = Static251.method3543(Static104.anObject2, false);
			this.aClass23_Sub2_3 = new Class23_Sub2(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static251.method3543(Static316.anObject8, false);
			this.aClass23_Sub2_1 = new Class23_Sub2(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class98 local144 = arg0.aClass98_1;
			if (local144.method1766()) {
				local112 = Static251.method3543(Static38.anObject1, false);
				this.aClass23_Sub2_2 = new Class23_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(174) Class23_Sub2 local174 = new Class23_Sub2(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method1763(2.0F, this.aClass23_Sub2_2, local174)) {
					this.aClass23_Sub2_2.method5804();
				} else {
					this.aClass23_Sub2_2.method5800();
					this.aClass23_Sub2_2 = null;
				}
				local174.method5800();
			}
		} else {
			this.aClass23_Sub3Array3 = new Class23_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static447.method5761(2 * 16384 * local34, Static104.anObject2);
				this.aClass23_Sub3Array3[local34] = new Class23_Sub3(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass23_Sub3Array4 = new Class23_Sub3[16];
			for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
				@Pc(86) byte[] local86 = Static447.method5761(local72 * 2 * 128 * 128, Static316.anObject8);
				this.aClass23_Sub3Array4[local72] = new Class23_Sub3(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
