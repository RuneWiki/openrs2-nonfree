import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class64 {

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!ea;")
	private Class7 aClass7_66;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	private int anInt1766 = 0;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Lclient!mt;")
	private final Class164 aClass164_10;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!mt;)V")
	public Class64(@OriginalArg(0) Class164 arg0) {
		this.aClass164_10 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Lclient!ea;")
	public Class7 method1553() {
		this.anInt1766 = 0;
		return this.method1555();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Lclient!ea;")
	public Class7 method1555() {
		@Pc(31) Class7 local31;
		if (this.anInt1766 > 0 && this.aClass7_66 != this.aClass164_10.aClass7Array1[this.anInt1766 - 1]) {
			local31 = this.aClass7_66;
			this.aClass7_66 = local31.aClass7_262;
			return local31;
		}
		while (this.aClass164_10.anInt4401 > this.anInt1766) {
			local31 = this.aClass164_10.aClass7Array1[this.anInt1766++].aClass7_262;
			if (local31 != this.aClass164_10.aClass7Array1[this.anInt1766 - 1]) {
				this.aClass7_66 = local31.aClass7_262;
				return local31;
			}
		}
		return null;
	}
}
