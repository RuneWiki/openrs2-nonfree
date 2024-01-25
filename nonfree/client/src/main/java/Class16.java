import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class16 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!eea;")
	private Class82 aClass82_1;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!jn;")
	private final Class176 aClass176_9;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!jn;")
	private final Class176 aClass176_8;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;)V")
	public Class16(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1) {
		this.aClass176_9 = arg0;
		this.aClass176_8 = arg1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Lclient!eea;")
	private Class82 method190() {
		if (this.aClass82_1 == null) {
			this.aClass82_1 = new Class82();
		}
		return this.aClass82_1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!wba;I)Lclient!d;")
	public Interface7 method192(@OriginalArg(0) Interface23 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) Class307 local16 = arg0.method8175();
		if (Static134.aClass307_4 == local16) {
			return new Class304((Class344) arg0);
		} else if (local16 == Static31.aClass307_1) {
			return new Class310(this.method190(), (Class85) arg0);
		} else if (local16 == Static196.aClass307_5) {
			return new Class235(this.aClass176_9, (Class194) arg0);
		} else if (local16 == Static479.aClass307_13) {
			return new Class235_Sub1(this.aClass176_9, (Class194_Sub1) arg0);
		} else if (Static115.aClass307_3 == local16) {
			return new Class45_Sub1(this.aClass176_9, this.aClass176_8, (Class108_Sub3) arg0);
		} else if (Static325.aClass307_14 == local16) {
			return new Class45_Sub3(this.aClass176_9, this.aClass176_8, (Class108_Sub2) arg0);
		} else if (Static283.aClass307_15 == local16) {
			return new Class45_Sub2(this.aClass176_9, this.aClass176_8, (Class108_Sub1) arg0);
		} else if (local16 == Static268.aClass307_6) {
			return new Class206(this.aClass176_9, this.aClass176_8, (Class294) arg0);
		} else if (Static397.aClass307_11 == local16) {
			return new Class72(this.aClass176_9, (Class186) arg0);
		} else if (local16 == Static74.aClass307_2) {
			return new Class45_Sub2_Sub1(this.aClass176_9, this.aClass176_8, (Class108_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
