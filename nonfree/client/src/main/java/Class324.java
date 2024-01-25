import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class324 {

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "Lclient!faa;")
	private Class3 aClass3_257;

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "Lclient!bc;")
	private Class25 aClass25_41;

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
	private int anInt9593 = 0;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	private Class324() {
	}

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!bc;)V")
	public Class324(@OriginalArg(0) Class25 arg0) {
		this.aClass25_41 = arg0;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)Lclient!faa;")
	public Class3 method7771() {
		this.anInt9593 = 0;
		return this.method7772();
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)Lclient!faa;")
	public Class3 method7772() {
		@Pc(28) Class3 local28;
		if (this.anInt9593 > 0 && this.aClass3_257 != this.aClass25_41.aClass3Array1[this.anInt9593 - 1]) {
			local28 = this.aClass3_257;
			this.aClass3_257 = local28.aClass3_288;
			return local28;
		}
		while (this.aClass25_41.anInt845 > this.anInt9593) {
			local28 = this.aClass25_41.aClass3Array1[this.anInt9593++].aClass3_288;
			if (local28 != this.aClass25_41.aClass3Array1[this.anInt9593 - 1]) {
				this.aClass3_257 = local28.aClass3_288;
				return local28;
			}
		}
		return null;
	}
}
