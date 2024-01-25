import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class123 {

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "Lclient!ol;")
	private Class6 aClass6_107;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	private int anInt3051 = 0;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "Lclient!ke;")
	private final Class137 aClass137_16;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!ke;)V")
	public Class123(@OriginalArg(0) Class137 arg0) {
		this.aClass137_16 = arg0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Lclient!ol;")
	public Class6 method2751() {
		this.anInt3051 = 0;
		return this.method2752();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)Lclient!ol;")
	public Class6 method2752() {
		@Pc(28) Class6 local28;
		if (this.anInt3051 > 0 && this.aClass6_107 != this.aClass137_16.aClass6Array1[this.anInt3051 - 1]) {
			local28 = this.aClass6_107;
			this.aClass6_107 = local28.aClass6_252;
			return local28;
		}
		while (this.aClass137_16.anInt3544 > this.anInt3051) {
			local28 = this.aClass137_16.aClass6Array1[this.anInt3051++].aClass6_252;
			if (local28 != this.aClass137_16.aClass6Array1[this.anInt3051 - 1]) {
				this.aClass6_107 = local28.aClass6_252;
				return local28;
			}
		}
		return null;
	}
}
