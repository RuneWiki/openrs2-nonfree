import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class119 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!dd;")
	private Class5 aClass5_103;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "I")
	private int anInt3099 = 0;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "Lclient!vg;")
	private final Class252 aClass252_20;

	static {
		new Class198(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!vg;)V")
	public Class119(@OriginalArg(0) Class252 arg0) {
		this.aClass252_20 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(B)Lclient!dd;")
	public Class5 method2496() {
		@Pc(23) Class5 local23;
		if (this.anInt3099 > 0 && this.aClass252_20.aClass5Array1[this.anInt3099 - 1] != this.aClass5_103) {
			local23 = this.aClass5_103;
			this.aClass5_103 = local23.aClass5_267;
			return local23;
		}
		while (this.anInt3099 < this.aClass252_20.anInt7149) {
			local23 = this.aClass252_20.aClass5Array1[this.anInt3099++].aClass5_267;
			if (local23 != this.aClass252_20.aClass5Array1[this.anInt3099 - 1]) {
				this.aClass5_103 = local23.aClass5_267;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Lclient!dd;")
	public Class5 method2497() {
		this.anInt3099 = 0;
		return this.method2496();
	}
}
