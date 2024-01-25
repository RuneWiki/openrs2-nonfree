import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class128 {

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Lclient!gl;")
	private Class4 aClass4_141;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	private int anInt4117 = 0;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!uc;")
	private final Class198 aClass198_24;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!uc;)V")
	public Class128(@OriginalArg(0) Class198 arg0) {
		this.aClass198_24 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Lclient!gl;")
	public Class4 method3461() {
		this.anInt4117 = 0;
		return this.method3462();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)Lclient!gl;")
	public Class4 method3462() {
		@Pc(25) Class4 local25;
		if (this.anInt4117 > 0 && this.aClass198_24.aClass4Array1[this.anInt4117 - 1] != this.aClass4_141) {
			local25 = this.aClass4_141;
			this.aClass4_141 = local25.aClass4_247;
			return local25;
		}
		while (this.aClass198_24.anInt6295 > this.anInt4117) {
			local25 = this.aClass198_24.aClass4Array1[this.anInt4117++].aClass4_247;
			if (this.aClass198_24.aClass4Array1[this.anInt4117 - 1] != local25) {
				this.aClass4_141 = local25.aClass4_247;
				return local25;
			}
		}
		return null;
	}
}
