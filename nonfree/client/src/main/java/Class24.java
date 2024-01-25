import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class24 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
	public int anInt811;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!lf;II)V")
	private void method564(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt817 = arg0.method3401();
		} else if (arg1 == 2) {
			this.anInt814 = arg0.method3440();
			this.anInt811 = arg0.method3440();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BILclient!lf;)V")
	public void method565(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method3440();
			if (local9 == 0) {
				return;
			}
			this.method564(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lclient!k;")
	public Class110 method567() {
		@Pc(17) Class110 local17 = (Class110) Static52.aClass198_47.method5210((long) this.anInt817);
		if (local17 != null) {
			return local17;
		}
		local17 = Static362.method3098(Static239.aClass193_83, this.anInt817, 0);
		if (local17 != null) {
			Static52.aClass198_47.method5201(local17, (long) this.anInt817);
		}
		return local17;
	}
}
