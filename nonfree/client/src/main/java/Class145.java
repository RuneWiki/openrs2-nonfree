import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class145 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "Lclient!tq;")
	private Class2 aClass2_115;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lclient!mp;")
	private Class222 aClass222_13;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
	private int anInt4332 = 0;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V")
	private Class145() {
	}

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!mp;)V")
	public Class145(@OriginalArg(0) Class222 arg0) {
		this.aClass222_13 = arg0;
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)Lclient!tq;")
	public Class2 method3599() {
		@Pc(23) Class2 local23;
		if (this.anInt4332 > 0 && this.aClass222_13.aClass2Array1[this.anInt4332 - 1] != this.aClass2_115) {
			local23 = this.aClass2_115;
			this.aClass2_115 = local23.aClass2_300;
			return local23;
		}
		while (this.anInt4332 < this.aClass222_13.anInt6499) {
			local23 = this.aClass222_13.aClass2Array1[this.anInt4332++].aClass2_300;
			if (local23 != this.aClass222_13.aClass2Array1[this.anInt4332 - 1]) {
				this.aClass2_115 = local23.aClass2_300;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Lclient!tq;")
	public Class2 method3600() {
		this.anInt4332 = 0;
		return this.method3599();
	}
}
