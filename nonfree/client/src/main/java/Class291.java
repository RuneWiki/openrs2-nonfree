import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class291 {

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "Lclient!rk;")
	private Class249 aClass249_69;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "Lclient!jd;")
	private Class2 aClass2_258;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
	public Class291() {
	}

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!rk;)V")
	public Class291(@OriginalArg(0) Class249 arg0) {
		this.aClass249_69 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!rk;I)V")
	public void method7334(@OriginalArg(0) Class249 arg0) {
		this.aClass249_69 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)Lclient!jd;")
	public Class2 method7336() {
		@Pc(8) Class2 local8 = this.aClass249_69.aClass2_224.aClass2_284;
		if (local8 == this.aClass249_69.aClass2_224) {
			this.aClass2_258 = null;
			return null;
		} else {
			this.aClass2_258 = local8.aClass2_284;
			return local8;
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)Lclient!jd;")
	public Class2 method7338() {
		@Pc(11) Class2 local11 = this.aClass2_258;
		if (this.aClass249_69.aClass2_224 == local11) {
			this.aClass2_258 = null;
			return null;
		} else {
			this.aClass2_258 = local11.aClass2_284;
			return local11;
		}
	}
}
