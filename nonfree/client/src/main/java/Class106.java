import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class106 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!qia;")
	private Class303 aClass303_1;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!bt;")
	private final Class34 aClass34_33;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!bt;")
	private final Class34 aClass34_34;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;)V")
	public Class106(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1) {
		this.aClass34_33 = arg0;
		this.aClass34_34 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!baa;I)Lclient!g;")
	public Interface13 method2550(@OriginalArg(0) Interface3 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(13) Class210 local13 = arg0.method7539();
		if (local13 == Static207.aClass210_17) {
			return new Class37((Class201) arg0);
		} else if (Static340.aClass210_9 == local13) {
			return new Class136(this.method2551(), (Class109) arg0);
		} else if (Static288.aClass210_8 == local13) {
			return new Class108(this.aClass34_33, (Class256) arg0);
		} else if (Static132.aClass210_6 == local13) {
			return new Class108_Sub1(this.aClass34_33, (Class256_Sub1) arg0);
		} else if (Static679.aClass210_19 == local13) {
			return new Class120_Sub3(this.aClass34_33, this.aClass34_34, (Class103_Sub1) arg0);
		} else if (local13 == Static537.aClass210_16) {
			return new Class120_Sub2(this.aClass34_33, this.aClass34_34, (Class103_Sub3) arg0);
		} else if (Static384.aClass210_10 == local13) {
			return new Class120_Sub1(this.aClass34_33, this.aClass34_34, (Class103_Sub2) arg0);
		} else if (local13 == Static488.aClass210_15) {
			return new Class218(this.aClass34_33, this.aClass34_34, (Class166) arg0);
		} else if (Static169.aClass210_7 == local13) {
			return new Class57(this.aClass34_33, (Class346) arg0);
		} else if (local13 == Static45.aClass210_1) {
			return new Class120_Sub1_Sub1(this.aClass34_33, this.aClass34_34, (Class103_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Lclient!qia;")
	private Class303 method2551() {
		if (this.aClass303_1 == null) {
			this.aClass303_1 = new Class303();
		}
		return this.aClass303_1;
	}
}
