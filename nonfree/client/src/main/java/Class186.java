import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class186 {

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!fi;")
	private Class1 aClass1_198;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!at;")
	private Class17 aClass17_56;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class186() {
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!at;)V")
	public Class186(@OriginalArg(0) Class17 arg0) {
		this.aClass17_56 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lclient!fi;")
	public Class1 method4292() {
		@Pc(13) Class1 local13 = this.aClass17_56.aClass1_15.aClass1_243;
		if (this.aClass17_56.aClass1_15 == local13) {
			this.aClass1_198 = null;
			return null;
		} else {
			this.aClass1_198 = local13.aClass1_243;
			return local13;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!at;)V")
	public void method4293(@OriginalArg(1) Class17 arg0) {
		this.aClass17_56 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lclient!fi;")
	public Class1 method4295() {
		@Pc(12) Class1 local12 = this.aClass1_198;
		if (local12 == this.aClass17_56.aClass1_15) {
			this.aClass1_198 = null;
			return null;
		} else {
			this.aClass1_198 = local12.aClass1_243;
			return local12;
		}
	}
}
