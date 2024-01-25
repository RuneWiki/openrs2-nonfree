import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class337 {

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!au;")
	private final Class21 aClass21_85 = new Class21(256);

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!fa;")
	private final Interface9 anInterface9_11;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_21;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!um;Lclient!fa;)V")
	public Class337(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) Interface9 arg1) {
		this.anInterface9_11 = arg1;
		this.aClass162_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lclient!fj;")
	public Interface11 method7039(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass21_85.method324((long) arg0);
		if (local10 != null) {
			return (Interface11) local10;
		} else if (this.anInterface9_11.method1073(arg0)) {
			@Pc(34) Class291 local34 = this.anInterface9_11.method1074(arg0);
			@Pc(43) int local43 = local34.aBoolean602 ? 64 : this.aClass162_Sub1_21.anInt4591;
			@Pc(80) Interface11 local80;
			if (local34.aBoolean596 && this.aClass162_Sub1_21.method6880()) {
				@Pc(62) float[] local62 = this.anInterface9_11.method1072(local43, 0.7F, arg0, local43);
				local80 = this.aClass162_Sub1_21.method3861(local43, local43, local62, local34.aByte99 != 0, Static225.aClass366_3);
			} else {
				@Pc(112) int[] local112 = !local34.aBoolean599 && Static134.method1812(local34.aByte96) ? this.anInterface9_11.method1076(0.7F, local43, true, local43, arg0) : this.anInterface9_11.method1075(local43, local43, 0.7F, arg0);
				local80 = this.aClass162_Sub1_21.method3904(local43, local43, local34.aByte99 != 0, local112);
			}
			local80.method7639(local34.aBoolean597, local34.aBoolean600);
			this.aClass21_85.method317(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
	public void method7041() {
		this.aClass21_85.method323(5);
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
	public void method7042() {
		this.aClass21_85.method313();
	}
}
