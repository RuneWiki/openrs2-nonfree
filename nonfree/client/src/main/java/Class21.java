import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class21 {

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!sp;")
	private Class318 aClass318_1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!wu;")
	private final Class384 aClass384_14;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "Lclient!wu;")
	private final Class384 aClass384_15;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;)V")
	public Class21(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1) {
		this.aClass384_14 = arg0;
		this.aClass384_15 = arg1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)Lclient!sp;")
	private Class318 method498() {
		if (this.aClass318_1 == null) {
			this.aClass318_1 = new Class318();
		}
		return this.aClass318_1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!haa;B)Lclient!gb;")
	public Interface12 method499(@OriginalArg(0) Interface13 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class228 local11 = arg0.method8022();
		if (Static588.aClass228_10 == local11) {
			return new Class379((Class135) arg0);
		} else if (local11 == Static146.aClass228_1) {
			return new Class45(this.method498(), (Class226) arg0);
		} else if (Static159.aClass228_2 == local11) {
			return new Class99(this.aClass384_14, (Class129) arg0);
		} else if (local11 == Static599.aClass228_11) {
			return new Class99_Sub1(this.aClass384_14, (Class129_Sub1) arg0);
		} else if (Static509.aClass228_9 == local11) {
			return new Class31_Sub2(this.aClass384_14, this.aClass384_15, (Class96_Sub2) arg0);
		} else if (Static274.aClass228_12 == local11) {
			return new Class31_Sub1(this.aClass384_14, this.aClass384_15, (Class96_Sub3) arg0);
		} else if (Static408.aClass228_7 == local11) {
			return new Class31_Sub3(this.aClass384_14, this.aClass384_15, (Class96_Sub1) arg0);
		} else if (Static472.aClass228_8 == local11) {
			return new Class51(this.aClass384_14, this.aClass384_15, (Class183) arg0);
		} else if (local11 == Static289.aClass228_6) {
			return new Class284(this.aClass384_14, (Class289) arg0);
		} else if (Static639.aClass228_13 == local11) {
			return new Class31_Sub3_Sub1(this.aClass384_14, this.aClass384_15, (Class96_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
