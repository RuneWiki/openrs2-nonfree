import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class172 {

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "Lclient!ica;")
	private Class127 aClass127_32;

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "Lclient!jd;")
	private Class2 aClass2_159;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	private int anInt4937 = 0;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
	private Class172() {
	}

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!ica;)V")
	public Class172(@OriginalArg(0) Class127 arg0) {
		this.aClass127_32 = arg0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Lclient!jd;")
	public Class2 method4300() {
		@Pc(30) Class2 local30;
		if (this.anInt4937 > 0 && this.aClass2_159 != this.aClass127_32.aClass2Array1[this.anInt4937 - 1]) {
			local30 = this.aClass2_159;
			this.aClass2_159 = local30.aClass2_284;
			return local30;
		}
		while (this.aClass127_32.anInt3596 > this.anInt4937) {
			local30 = this.aClass127_32.aClass2Array1[this.anInt4937++].aClass2_284;
			if (local30 != this.aClass127_32.aClass2Array1[this.anInt4937 - 1]) {
				this.aClass2_159 = local30.aClass2_284;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Lclient!jd;")
	public Class2 method4304() {
		this.anInt4937 = 0;
		return this.method4300();
	}
}
