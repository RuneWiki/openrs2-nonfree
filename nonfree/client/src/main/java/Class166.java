import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class166 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Lclient!s;")
	private Class7 aClass7_176;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!fi;")
	private Class74 aClass74_33;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class166() {
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!fi;)V")
	public Class166(@OriginalArg(0) Class74 arg0) {
		this.aClass74_33 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZLclient!fi;)V")
	public void method4261(@OriginalArg(1) Class74 arg0) {
		this.aClass74_33 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Lclient!s;")
	public Class7 method4263() {
		@Pc(8) Class7 local8 = this.aClass74_33.aClass7_72.aClass7_247;
		if (this.aClass74_33.aClass7_72 == local8) {
			this.aClass7_176 = null;
			return null;
		} else {
			this.aClass7_176 = local8.aClass7_247;
			return local8;
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Lclient!s;")
	public Class7 method4266() {
		@Pc(6) Class7 local6 = this.aClass7_176;
		if (this.aClass74_33.aClass7_72 == local6) {
			this.aClass7_176 = null;
			return null;
		} else {
			this.aClass7_176 = local6.aClass7_247;
			return local6;
		}
	}
}
