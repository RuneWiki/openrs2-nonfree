import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class316 {

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "Lclient!efa;")
	private Class90 aClass90_33;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "Lclient!du;")
	private Class2 aClass2_238;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
	private int anInt7839 = 0;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	private Class316() {
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!efa;)V")
	public Class316(@OriginalArg(0) Class90 arg0) {
		this.aClass90_33 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Lclient!du;")
	public Class2 method6325() {
		@Pc(20) Class2 local20;
		if (this.anInt7839 > 0 && this.aClass2_238 != this.aClass90_33.aClass2Array1[this.anInt7839 - 1]) {
			local20 = this.aClass2_238;
			this.aClass2_238 = local20.aClass2_286;
			return local20;
		}
		while (this.anInt7839 < this.aClass90_33.anInt2017) {
			local20 = this.aClass90_33.aClass2Array1[this.anInt7839++].aClass2_286;
			if (local20 != this.aClass90_33.aClass2Array1[this.anInt7839 - 1]) {
				this.aClass2_238 = local20.aClass2_286;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Lclient!du;")
	public Class2 method6328() {
		this.anInt7839 = 0;
		return this.method6325();
	}
}
