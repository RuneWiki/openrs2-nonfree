import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class153 {

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "Lclient!nw;")
	private Class259 aClass259_2;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!uq;")
	private final Class362 aClass362_49;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "Lclient!uq;")
	private final Class362 aClass362_50;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;)V")
	public Class153(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1) {
		this.aClass362_49 = arg1;
		this.aClass362_50 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Lclient!nw;")
	private Class259 method3509() {
		if (this.aClass259_2 == null) {
			this.aClass259_2 = new Class259();
		}
		return this.aClass259_2;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!vq;)Lclient!ku;")
	public Interface16 method3510(@OriginalArg(1) Interface26 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class108 local11 = arg0.method7808();
		if (local11 == Static119.aClass108_5) {
			return new Class60((Class294) arg0);
		} else if (local11 == Static119.aClass108_4) {
			return new Class128(this.method3509(), (Class82) arg0);
		} else if (local11 == Static542.aClass108_11) {
			return new Class156(this.aClass362_50, (Class89) arg0);
		} else if (Static158.aClass108_6 == local11) {
			return new Class156_Sub1(this.aClass362_50, (Class89_Sub1) arg0);
		} else if (Static360.aClass108_8 == local11) {
			return new Class138_Sub3(this.aClass362_50, this.aClass362_49, (Class21_Sub2) arg0);
		} else if (local11 == Static289.aClass108_7) {
			return new Class138_Sub2(this.aClass362_50, this.aClass362_49, (Class21_Sub3) arg0);
		} else if (Static27.aClass108_3 == local11) {
			return new Class138_Sub1(this.aClass362_50, this.aClass362_49, (Class21_Sub1) arg0);
		} else if (Static634.aClass108_10 == local11) {
			return new Class337(this.aClass362_50, this.aClass362_49, (Class88) arg0);
		} else if (Static616.aClass108_12 == local11) {
			return new Class357(this.aClass362_50, (Class98) arg0);
		} else if (local11 == Static370.aClass108_9) {
			return new Class138_Sub1_Sub1(this.aClass362_50, this.aClass362_49, (Class21_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
