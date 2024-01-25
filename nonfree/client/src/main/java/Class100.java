import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class100 {

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Lclient!du;")
	private Class81 aClass81_20;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!pb;")
	private Class5 aClass5_71;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
	private int anInt2211 = 0;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	private Class100() {
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!du;)V")
	public Class100(@OriginalArg(0) Class81 arg0) {
		this.aClass81_20 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Lclient!pb;")
	public Class5 method1995() {
		@Pc(25) Class5 local25;
		if (this.anInt2211 > 0 && this.aClass81_20.aClass5Array1[this.anInt2211 - 1] != this.aClass5_71) {
			local25 = this.aClass5_71;
			this.aClass5_71 = local25.aClass5_299;
			return local25;
		}
		while (this.aClass81_20.anInt1733 > this.anInt2211) {
			local25 = this.aClass81_20.aClass5Array1[this.anInt2211++].aClass5_299;
			if (local25 != this.aClass81_20.aClass5Array1[this.anInt2211 - 1]) {
				this.aClass5_71 = local25.aClass5_299;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Lclient!pb;")
	public Class5 method1996() {
		this.anInt2211 = 0;
		return this.method1995();
	}
}
