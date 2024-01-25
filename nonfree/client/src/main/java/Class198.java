import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class198 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "Lclient!ih;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_71;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_70;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;)V")
	public Class198(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1) {
		this.aClass251_71 = arg1;
		this.aClass251_70 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Lclient!ih;")
	private Class145 method4689() {
		if (this.aClass145_1 == null) {
			this.aClass145_1 = new Class145();
		}
		return this.aClass145_1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!lba;I)Lclient!es;")
	public Interface7 method4691(@OriginalArg(0) Interface16 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class153 local11 = arg0.method6332();
		if (Static96.aClass153_5 == local11) {
			return new Class344((Class32) arg0);
		} else if (local11 == Static71.aClass153_4) {
			return new Class304(this.method4689(), (Class142) arg0);
		} else if (local11 == Static167.aClass153_7) {
			return new Class104(this.aClass251_70, (Class230) arg0);
		} else if (Static90.aClass153_13 == local11) {
			return new Class104_Sub1(this.aClass251_70, (Class230_Sub1) arg0);
		} else if (local11 == Static558.aClass153_12) {
			return new Class100_Sub3(this.aClass251_70, this.aClass251_71, (Class18_Sub2) arg0);
		} else if (Static422.aClass153_9 == local11) {
			return new Class100_Sub2(this.aClass251_70, this.aClass251_71, (Class18_Sub1) arg0);
		} else if (local11 == Static582.aClass153_14) {
			return new Class100_Sub1(this.aClass251_70, this.aClass251_71, (Class18_Sub3) arg0);
		} else if (Static455.aClass153_10 == local11) {
			return new Class15(this.aClass251_70, this.aClass251_71, (Class205) arg0);
		} else if (Static30.aClass153_3 == local11) {
			return new Class109(this.aClass251_70, (Class285) arg0);
		} else if (Static385.aClass153_8 == local11) {
			return new Class100_Sub1_Sub1(this.aClass251_70, this.aClass251_71, (Class18_Sub3_Sub1) arg0);
		} else {
			return null;
		}
	}
}
