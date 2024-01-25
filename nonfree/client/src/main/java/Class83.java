import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class83 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Lclient!tba;")
	private Class323 aClass323_11;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "Lclient!dfa;")
	private Class2 aClass2_67;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
	private int anInt2398 = 0;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	private Class83() {
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!tba;)V")
	public Class83(@OriginalArg(0) Class323 arg0) {
		this.aClass323_11 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)Lclient!dfa;")
	public Class2 method2014() {
		this.anInt2398 = 0;
		return this.method2015();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)Lclient!dfa;")
	public Class2 method2015() {
		@Pc(23) Class2 local23;
		if (this.anInt2398 > 0 && this.aClass323_11.aClass2Array1[this.anInt2398 - 1] != this.aClass2_67) {
			local23 = this.aClass2_67;
			this.aClass2_67 = local23.aClass2_300;
			return local23;
		}
		while (this.anInt2398 < this.aClass323_11.anInt8680) {
			local23 = this.aClass323_11.aClass2Array1[this.anInt2398++].aClass2_300;
			if (this.aClass323_11.aClass2Array1[this.anInt2398 - 1] != local23) {
				this.aClass2_67 = local23.aClass2_300;
				return local23;
			}
		}
		return null;
	}
}
