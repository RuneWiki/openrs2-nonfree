import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class18 {

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "Lclient!uj;")
	private Class2 aClass2_15;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	private int anInt350 = 0;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "Lclient!ew;")
	private final Class72 aClass72_3;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!ew;)V")
	public Class18(@OriginalArg(0) Class72 arg0) {
		this.aClass72_3 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Lclient!uj;")
	public Class2 method266() {
		this.anInt350 = 0;
		return this.method269();
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Lclient!uj;")
	public Class2 method269() {
		@Pc(26) Class2 local26;
		if (this.anInt350 > 0 && this.aClass2_15 != this.aClass72_3.aClass2Array1[this.anInt350 - 1]) {
			local26 = this.aClass2_15;
			this.aClass2_15 = local26.aClass2_264;
			return local26;
		}
		while (this.anInt350 < this.aClass72_3.anInt2018) {
			local26 = this.aClass72_3.aClass2Array1[this.anInt350++].aClass2_264;
			if (local26 != this.aClass72_3.aClass2Array1[this.anInt350 - 1]) {
				this.aClass2_15 = local26.aClass2_264;
				return local26;
			}
		}
		return null;
	}
}
