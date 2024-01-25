import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class69 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "Lclient!faa;")
	private Class91 aClass91_5;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Lclient!rp;")
	private Class1 aClass1_75;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	private int anInt1772 = 0;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	private Class69() {
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!faa;)V")
	public Class69(@OriginalArg(0) Class91 arg0) {
		this.aClass91_5 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)Lclient!rp;")
	public Class1 method1480() {
		@Pc(25) Class1 local25;
		if (this.anInt1772 > 0 && this.aClass91_5.aClass1Array1[this.anInt1772 - 1] != this.aClass1_75) {
			local25 = this.aClass1_75;
			this.aClass1_75 = local25.aClass1_286;
			return local25;
		}
		while (this.anInt1772 < this.aClass91_5.anInt2585) {
			local25 = this.aClass91_5.aClass1Array1[this.anInt1772++].aClass1_286;
			if (local25 != this.aClass91_5.aClass1Array1[this.anInt1772 - 1]) {
				this.aClass1_75 = local25.aClass1_286;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Lclient!rp;")
	public Class1 method1483() {
		this.anInt1772 = 0;
		return this.method1480();
	}
}
