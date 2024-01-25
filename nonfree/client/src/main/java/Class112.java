import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class112 {

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "Lclient!jw;")
	private Class183 aClass183_13;

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "Lclient!rc;")
	private Class4 aClass4_83;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
	private int anInt3385 = 0;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
	private Class112() {
	}

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class112(@OriginalArg(0) Class183 arg0) {
		this.aClass183_13 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)Lclient!rc;")
	public Class4 method3093() {
		this.anInt3385 = 0;
		return this.method3094();
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)Lclient!rc;")
	public Class4 method3094() {
		@Pc(23) Class4 local23;
		if (this.anInt3385 > 0 && this.aClass4_83 != this.aClass183_13.aClass4Array1[this.anInt3385 - 1]) {
			local23 = this.aClass4_83;
			this.aClass4_83 = local23.aClass4_287;
			return local23;
		}
		while (this.anInt3385 < this.aClass183_13.anInt5057) {
			local23 = this.aClass183_13.aClass4Array1[this.anInt3385++].aClass4_287;
			if (this.aClass183_13.aClass4Array1[this.anInt3385 - 1] != local23) {
				this.aClass4_83 = local23.aClass4_287;
				return local23;
			}
		}
		return null;
	}
}
