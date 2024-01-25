import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class60 {

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Lclient!ob;")
	private Class3 aClass3_65;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	private int anInt1613 = 0;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Lclient!bo;")
	private final Class24 aClass24_8;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class60(@OriginalArg(0) Class24 arg0) {
		this.aClass24_8 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Lclient!ob;")
	public Class3 method1271() {
		this.anInt1613 = 0;
		return this.method1274();
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)Lclient!ob;")
	public Class3 method1274() {
		@Pc(25) Class3 local25;
		if (this.anInt1613 > 0 && this.aClass24_8.aClass3Array1[this.anInt1613 - 1] != this.aClass3_65) {
			local25 = this.aClass3_65;
			this.aClass3_65 = local25.aClass3_248;
			return local25;
		}
		while (this.anInt1613 < this.aClass24_8.anInt736) {
			local25 = this.aClass24_8.aClass3Array1[this.anInt1613++].aClass3_248;
			if (this.aClass24_8.aClass3Array1[this.anInt1613 - 1] != local25) {
				this.aClass3_65 = local25.aClass3_248;
				return local25;
			}
		}
		return null;
	}
}
