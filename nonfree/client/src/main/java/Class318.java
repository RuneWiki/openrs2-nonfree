import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class318 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!lq;")
	private Class14 aClass14_272;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!jo;")
	private Class187 aClass187_68;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	private int anInt9247 = 0;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	private Class318() {
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!jo;)V")
	public Class318(@OriginalArg(0) Class187 arg0) {
		this.aClass187_68 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Lclient!lq;")
	public Class14 method7646() {
		this.anInt9247 = 0;
		return this.method7648();
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)Lclient!lq;")
	public Class14 method7648() {
		@Pc(20) Class14 local20;
		if (this.anInt9247 > 0 && this.aClass187_68.aClass14Array1[this.anInt9247 - 1] != this.aClass14_272) {
			local20 = this.aClass14_272;
			this.aClass14_272 = local20.aClass14_338;
			return local20;
		}
		while (this.anInt9247 < this.aClass187_68.anInt4883) {
			local20 = this.aClass187_68.aClass14Array1[this.anInt9247++].aClass14_338;
			if (this.aClass187_68.aClass14Array1[this.anInt9247 - 1] != local20) {
				this.aClass14_272 = local20.aClass14_338;
				return local20;
			}
		}
		return null;
	}
}
