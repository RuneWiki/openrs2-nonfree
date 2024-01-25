import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class44 {

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Lclient!v;")
	private Class14_Sub2 aClass14_Sub2_11;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Lclient!oga;")
	private Class269 aClass269_22;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	private Class44() {
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!oga;)V")
	public Class44(@OriginalArg(0) Class269 arg0) {
		this.aClass269_22 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)Lclient!v;")
	public Class14_Sub2 method805() {
		@Pc(8) Class14_Sub2 local8 = this.aClass269_22.aClass14_Sub2_42.aClass14_Sub2_67;
		if (local8 == this.aClass269_22.aClass14_Sub2_42) {
			this.aClass14_Sub2_11 = null;
			return null;
		} else {
			this.aClass14_Sub2_11 = local8.aClass14_Sub2_67;
			return local8;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)Lclient!v;")
	public Class14_Sub2 method808() {
		@Pc(12) Class14_Sub2 local12 = this.aClass14_Sub2_11;
		if (this.aClass269_22.aClass14_Sub2_42 == local12) {
			this.aClass14_Sub2_11 = null;
			return null;
		} else {
			this.aClass14_Sub2_11 = local12.aClass14_Sub2_67;
			return local12;
		}
	}
}
