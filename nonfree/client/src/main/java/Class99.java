import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class99 {

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public int anInt2988;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public int anInt2990;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "I")
	private int anInt2994;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IILclient!jg;Z)V")
	private void method2822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub4 arg2) {
		if (arg0 == 1) {
			this.anInt2994 = arg2.method2498();
		} else if (arg0 == 2) {
			this.anInt2990 = arg2.method2548();
			this.anInt2988 = arg2.method2548();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!jg;B)V")
	public void method2823(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub4 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method2548();
			if (local14 == 0) {
				return;
			}
			this.method2822(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Lclient!vp;")
	public Class207 method2826() {
		@Pc(11) Class207 local11 = (Class207) Static259.aClass11_112.method209((long) this.anInt2994);
		if (local11 != null) {
			return local11;
		}
		local11 = Static368.method5811(Static342.aClass143_115, this.anInt2994, 0);
		if (local11 != null) {
			Static259.aClass11_112.method219((long) this.anInt2994, local11);
		}
		return local11;
	}
}
