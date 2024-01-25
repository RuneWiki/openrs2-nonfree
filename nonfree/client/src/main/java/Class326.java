import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class326 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!fc;")
	private final Class94 aClass94_58 = new Class94(256);

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_21;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!d;")
	private final Interface7 anInterface7_11;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!uv;Lclient!d;)V")
	public Class326(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.aClass5_Sub2_21 = arg0;
		this.anInterface7_11 = arg1;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public void method7734() {
		this.aClass94_58.method2952();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lclient!js;")
	public Interface15 method7736(@OriginalArg(1) int arg0) {
		@Pc(14) Object local14 = this.aClass94_58.method2960((long) arg0);
		if (local14 != null) {
			return (Interface15) local14;
		} else if (this.anInterface7_11.method6928(arg0)) {
			@Pc(39) Class254 local39 = this.anInterface7_11.method6931(arg0);
			@Pc(48) int local48 = local39.aBoolean616 ? 64 : this.aClass5_Sub2_21.anInt4879;
			@Pc(83) Interface15 local83;
			if (local39.aBoolean614 && this.aClass5_Sub2_21.method6131()) {
				@Pc(65) float[] local65 = this.anInterface7_11.method6930(arg0, local48, 0.7F, local48);
				local83 = this.aClass5_Sub2_21.method4069(Static120.aClass178_4, local39.aByte99 != 0, local65, local48, local48);
			} else {
				@Pc(110) int[] local110;
				if (local39.anInt7796 != 2 && Static108.method2479(local39.aByte95)) {
					local110 = this.anInterface7_11.method6929(arg0, local48, 0.7F, true, local48);
				} else {
					local110 = this.anInterface7_11.method6933(local48, arg0, 0.7F, local48);
				}
				local83 = this.aClass5_Sub2_21.method4015(local48, local48, local110, local39.aByte99 != 0);
			}
			local83.method8452(local39.aBoolean619, local39.aBoolean615);
			this.aClass94_58.method2963((long) arg0, local83);
			return local83;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public void method7737() {
		this.aClass94_58.method2958(5);
	}
}
