import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class238 {

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Lclient!ef;")
	private Class102 aClass102_44;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!me;")
	private Class5 aClass5_202;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class238() {
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class238(@OriginalArg(0) Class102 arg0) {
		this.aClass102_44 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Lclient!me;")
	public Class5 method5463() {
		@Pc(8) Class5 local8 = this.aClass102_44.aClass5_61.aClass5_338;
		if (this.aClass102_44.aClass5_61 == local8) {
			this.aClass5_202 = null;
			return null;
		} else {
			this.aClass5_202 = local8.aClass5_338;
			return local8;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!ef;)V")
	public void method5465(@OriginalArg(1) Class102 arg0) {
		this.aClass102_44 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lclient!me;")
	public Class5 method5466() {
		@Pc(12) Class5 local12 = this.aClass5_202;
		if (local12 == this.aClass102_44.aClass5_61) {
			this.aClass5_202 = null;
			return null;
		} else {
			this.aClass5_202 = local12.aClass5_338;
			return local12;
		}
	}
}
