import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class78 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!jp;")
	private Class1 aClass1_81;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "Lclient!pu;")
	private Class203 aClass203_10;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	public Class78() {
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!pu;)V")
	public Class78(@OriginalArg(0) Class203 arg0) {
		this.aClass203_10 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Lclient!jp;")
	public Class1 method1751() {
		@Pc(6) Class1 local6 = this.aClass1_81;
		if (local6 == this.aClass203_10.aClass1_195) {
			this.aClass1_81 = null;
			return null;
		} else {
			this.aClass1_81 = local6.aClass1_264;
			return local6;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Lclient!jp;")
	public Class1 method1753() {
		@Pc(14) Class1 local14 = this.aClass203_10.aClass1_195.aClass1_264;
		if (local14 == this.aClass203_10.aClass1_195) {
			this.aClass1_81 = null;
			return null;
		} else {
			this.aClass1_81 = local14.aClass1_264;
			return local14;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!pu;)V")
	public void method1754(@OriginalArg(1) Class203 arg0) {
		this.aClass203_10 = arg0;
	}
}
