import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class43 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!jg;")
	private Class1 aClass1_71;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
	private int anInt1928 = 0;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!vd;")
	private Class140 aClass140_5;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class43(@OriginalArg(0) Class140 arg0) {
		this.aClass140_5 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Lclient!jg;")
	public Class1 method1365() {
		this.anInt1928 = 0;
		return this.method1368();
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Lclient!jg;")
	public Class1 method1368() {
		@Pc(32) Class1 local32;
		if (this.anInt1928 > 0 && this.aClass1_71 != this.aClass140_5.aClass1Array1[this.anInt1928 - 1]) {
			local32 = this.aClass1_71;
			this.aClass1_71 = local32.aClass1_213;
			return local32;
		}
		while (this.aClass140_5.anInt5276 > this.anInt1928) {
			local32 = this.aClass140_5.aClass1Array1[this.anInt1928++].aClass1_213;
			if (this.aClass140_5.aClass1Array1[this.anInt1928 - 1] != local32) {
				this.aClass1_71 = local32.aClass1_213;
				return local32;
			}
		}
		return null;
	}
}
