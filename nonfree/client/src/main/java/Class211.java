import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class211 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "Lclient!tq;")
	private Class2 aClass2_172;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "Lclient!nt;")
	private Class238 aClass238_36;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	public Class211() {
	}

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!nt;)V")
	public Class211(@OriginalArg(0) Class238 arg0) {
		this.aClass238_36 = arg0;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Lclient!tq;")
	public Class2 method5216() {
		@Pc(11) Class2 local11 = this.aClass2_172;
		if (local11 == this.aClass238_36.aClass2_201) {
			this.aClass2_172 = null;
			return null;
		} else {
			this.aClass2_172 = local11.aClass2_300;
			return local11;
		}
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)Lclient!tq;")
	public Class2 method5217() {
		@Pc(13) Class2 local13 = this.aClass238_36.aClass2_201.aClass2_300;
		if (this.aClass238_36.aClass2_201 == local13) {
			this.aClass2_172 = null;
			return null;
		} else {
			this.aClass2_172 = local13.aClass2_300;
			return local13;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLclient!nt;)V")
	public void method5219(@OriginalArg(1) Class238 arg0) {
		this.aClass238_36 = arg0;
	}
}
