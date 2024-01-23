import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class144 {

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!ni;")
	private Class4 aClass4_159;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	private int anInt4288 = 0;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!ic;")
	private Class85 aClass85_20;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class144(@OriginalArg(0) Class85 arg0) {
		this.aClass85_20 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!ni;")
	public Class4 method3577() {
		this.anInt4288 = 0;
		return this.method3581();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lclient!ni;")
	public Class4 method3581() {
		@Pc(25) Class4 local25;
		if (this.anInt4288 > 0 && this.aClass85_20.aClass4Array1[this.anInt4288 - 1] != this.aClass4_159) {
			local25 = this.aClass4_159;
			this.aClass4_159 = local25.aClass4_235;
			return local25;
		}
		do {
			if (this.anInt4288 >= this.aClass85_20.anInt2336) {
				return null;
			}
			local25 = this.aClass85_20.aClass4Array1[this.anInt4288++].aClass4_235;
		} while (this.aClass85_20.aClass4Array1[this.anInt4288 - 1] == local25);
		this.aClass4_159 = local25.aClass4_235;
		return local25;
	}
}
