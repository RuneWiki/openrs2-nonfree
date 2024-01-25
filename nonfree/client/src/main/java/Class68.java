import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class68 {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "Lclient!cja;")
	private Class62 aClass62_10;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "Lclient!wk;")
	private Class3 aClass3_71;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
	private int anInt1994 = 0;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	private Class68() {
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!cja;)V")
	public Class68(@OriginalArg(0) Class62 arg0) {
		this.aClass62_10 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Lclient!wk;")
	public Class3 method1844() {
		this.anInt1994 = 0;
		return this.method1845();
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)Lclient!wk;")
	public Class3 method1845() {
		@Pc(25) Class3 local25;
		if (this.anInt1994 > 0 && this.aClass3_71 != this.aClass62_10.aClass3Array1[this.anInt1994 - 1]) {
			local25 = this.aClass3_71;
			this.aClass3_71 = local25.aClass3_337;
			return local25;
		}
		while (this.anInt1994 < this.aClass62_10.anInt1761) {
			local25 = this.aClass62_10.aClass3Array1[this.anInt1994++].aClass3_337;
			if (this.aClass62_10.aClass3Array1[this.anInt1994 - 1] != local25) {
				this.aClass3_71 = local25.aClass3_337;
				return local25;
			}
		}
		return null;
	}
}
