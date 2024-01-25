import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class90 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "Lclient!mf;")
	private Class163 aClass163_25;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Lclient!es;")
	private Class10 aClass10_102;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class90() {
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!mf;)V")
	public Class90(@OriginalArg(0) Class163 arg0) {
		this.aClass163_25 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!mf;)V")
	public void method2296(@OriginalArg(1) Class163 arg0) {
		this.aClass163_25 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lclient!es;")
	public Class10 method2297() {
		@Pc(8) Class10 local8 = this.aClass163_25.aClass10_149.aClass10_263;
		if (local8 == this.aClass163_25.aClass10_149) {
			this.aClass10_102 = null;
			return null;
		} else {
			this.aClass10_102 = local8.aClass10_263;
			return local8;
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)Lclient!es;")
	public Class10 method2299() {
		@Pc(11) Class10 local11 = this.aClass10_102;
		if (this.aClass163_25.aClass10_149 == local11) {
			this.aClass10_102 = null;
			return null;
		} else {
			this.aClass10_102 = local11.aClass10_263;
			return local11;
		}
	}
}
