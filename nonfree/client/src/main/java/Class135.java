import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class135 {

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!dea;")
	private Class68 aClass68_31;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!ik;")
	private Class12 aClass12_115;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	private int anInt4276 = 0;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	private Class135() {
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!dea;)V")
	public Class135(@OriginalArg(0) Class68 arg0) {
		this.aClass68_31 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)Lclient!ik;")
	public Class12 method3650() {
		this.anInt4276 = 0;
		return this.method3654();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Lclient!ik;")
	public Class12 method3654() {
		@Pc(23) Class12 local23;
		if (this.anInt4276 > 0 && this.aClass68_31.aClass12Array1[this.anInt4276 - 1] != this.aClass12_115) {
			local23 = this.aClass12_115;
			this.aClass12_115 = local23.aClass12_283;
			return local23;
		}
		while (this.anInt4276 < this.aClass68_31.anInt2073) {
			local23 = this.aClass68_31.aClass12Array1[this.anInt4276++].aClass12_283;
			if (local23 != this.aClass68_31.aClass12Array1[this.anInt4276 - 1]) {
				this.aClass12_115 = local23.aClass12_283;
				return local23;
			}
		}
		return null;
	}
}
