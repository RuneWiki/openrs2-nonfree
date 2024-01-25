import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class366 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Lclient!vv;")
	private Class367 aClass367_2;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!ni;")
	private final Class223 aClass223_140;

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "Lclient!ni;")
	private final Class223 aClass223_141;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;)V")
	public Class366(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1) {
		this.aClass223_140 = arg0;
		this.aClass223_141 = arg1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Lclient!vv;")
	private Class367 method8467() {
		if (this.aClass367_2 == null) {
			this.aClass367_2 = new Class367();
		}
		return this.aClass367_2;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLclient!tda;)Lclient!rea;")
	public Interface21 method8469(@OriginalArg(1) Interface25 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class129 local11 = arg0.method8540();
		if (Static180.aClass129_5 == local11) {
			return new Class150((Class177) arg0);
		} else if (local11 == Static622.aClass129_10) {
			return new Class340(this.method8467(), (Class66) arg0);
		} else if (local11 == Static493.aClass129_7) {
			return new Class151(this.aClass223_140, (Class72) arg0);
		} else if (Static17.aClass129_2 == local11) {
			return new Class151_Sub1(this.aClass223_140, (Class72_Sub1) arg0);
		} else if (local11 == Static98.aClass129_4) {
			return new Class30_Sub2(this.aClass223_140, this.aClass223_141, (Class109_Sub3) arg0);
		} else if (Static264.aClass129_6 == local11) {
			return new Class30_Sub3(this.aClass223_140, this.aClass223_141, (Class109_Sub2) arg0);
		} else if (local11 == Static540.aClass129_9) {
			return new Class30_Sub1(this.aClass223_140, this.aClass223_141, (Class109_Sub1) arg0);
		} else if (Static535.aClass129_8 == local11) {
			return new Class28(this.aClass223_140, this.aClass223_141, (Class322) arg0);
		} else if (Static8.aClass129_1 == local11) {
			return new Class11(this.aClass223_140, (Class371) arg0);
		} else if (local11 == Static40.aClass129_3) {
			return new Class30_Sub1_Sub1(this.aClass223_140, this.aClass223_141, (Class109_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
