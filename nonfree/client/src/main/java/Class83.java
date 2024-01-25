import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class83 {

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "Lclient!ds;")
	private Class5 aClass5_67;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "Lclient!pl;")
	private Class273 aClass273_4;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	private int anInt2064 = 0;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	private Class83() {
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!pl;)V")
	public Class83(@OriginalArg(0) Class273 arg0) {
		this.aClass273_4 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lclient!ds;")
	public Class5 method1693() {
		@Pc(27) Class5 local27;
		if (this.anInt2064 > 0 && this.aClass5_67 != this.aClass273_4.aClass5Array1[this.anInt2064 - 1]) {
			local27 = this.aClass5_67;
			this.aClass5_67 = local27.aClass5_300;
			return local27;
		}
		while (this.anInt2064 < this.aClass273_4.anInt7429) {
			local27 = this.aClass273_4.aClass5Array1[this.anInt2064++].aClass5_300;
			if (this.aClass273_4.aClass5Array1[this.anInt2064 - 1] != local27) {
				this.aClass5_67 = local27.aClass5_300;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Lclient!ds;")
	public Class5 method1694() {
		this.anInt2064 = 0;
		return this.method1693();
	}
}
