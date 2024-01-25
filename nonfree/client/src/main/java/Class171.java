import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class171 {

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Lclient!kba;")
	private Class163 aClass163_31;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "Lclient!gda;")
	private Class6 aClass6_182;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class171() {
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!kba;)V")
	public Class171(@OriginalArg(0) Class163 arg0) {
		this.aClass163_31 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lclient!gda;")
	public Class6 method5091() {
		@Pc(11) Class6 local11 = this.aClass6_182;
		if (this.aClass163_31.aClass6_178 == local11) {
			this.aClass6_182 = null;
			return null;
		} else {
			this.aClass6_182 = local11.aClass6_300;
			return local11;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Lclient!gda;")
	public Class6 method5092() {
		@Pc(13) Class6 local13 = this.aClass163_31.aClass6_178.aClass6_300;
		if (local13 == this.aClass163_31.aClass6_178) {
			this.aClass6_182 = null;
			return null;
		} else {
			this.aClass6_182 = local13.aClass6_300;
			return local13;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLclient!kba;)V")
	public void method5093(@OriginalArg(1) Class163 arg0) {
		this.aClass163_31 = arg0;
	}
}
