import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class37 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!kn;")
	private Class116 aClass116_5;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "Lclient!ge;")
	private Class4 aClass4_52;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class37() {
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!kn;)V")
	public Class37(@OriginalArg(0) Class116 arg0) {
		this.aClass116_5 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!kn;)V")
	public void method1015(@OriginalArg(1) Class116 arg0) {
		this.aClass116_5 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Lclient!ge;")
	public Class4 method1016() {
		@Pc(13) Class4 local13 = this.aClass116_5.aClass4_121.aClass4_252;
		if (local13 == this.aClass116_5.aClass4_121) {
			this.aClass4_52 = null;
			return null;
		} else {
			this.aClass4_52 = local13.aClass4_252;
			return local13;
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)Lclient!ge;")
	public Class4 method1018() {
		@Pc(6) Class4 local6 = this.aClass4_52;
		if (local6 == this.aClass116_5.aClass4_121) {
			this.aClass4_52 = null;
			return null;
		} else {
			this.aClass4_52 = local6.aClass4_252;
			return local6;
		}
	}
}
