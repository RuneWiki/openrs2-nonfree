import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class249 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!uj;")
	private Class2 aClass2_238;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!ar;")
	private Class14 aClass14_46;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class249() {
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ar;)V")
	public Class249(@OriginalArg(0) Class14 arg0) {
		this.aClass14_46 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!ar;)V")
	public void method5440(@OriginalArg(1) Class14 arg0) {
		this.aClass14_46 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lclient!uj;")
	public Class2 method5441() {
		@Pc(8) Class2 local8 = this.aClass14_46.aClass2_17.aClass2_261;
		if (this.aClass14_46.aClass2_17 == local8) {
			this.aClass2_238 = null;
			return null;
		} else {
			this.aClass2_238 = local8.aClass2_261;
			return local8;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Lclient!uj;")
	public Class2 method5444() {
		@Pc(11) Class2 local11 = this.aClass2_238;
		if (this.aClass14_46.aClass2_17 == local11) {
			this.aClass2_238 = null;
			return null;
		} else {
			this.aClass2_238 = local11.aClass2_261;
			return local11;
		}
	}
}
