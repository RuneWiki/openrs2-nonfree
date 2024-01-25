import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class172 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "Lclient!vp;")
	private Class254 aClass254_26;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Lclient!kp;")
	private Class1 aClass1_161;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class172() {
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!vp;)V")
	public Class172(@OriginalArg(0) Class254 arg0) {
		this.aClass254_26 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)Lclient!kp;")
	public Class1 method3434() {
		@Pc(8) Class1 local8 = this.aClass254_26.aClass1_249.aClass1_262;
		if (this.aClass254_26.aClass1_249 == local8) {
			this.aClass1_161 = null;
			return null;
		} else {
			this.aClass1_161 = local8.aClass1_262;
			return local8;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)Lclient!kp;")
	public Class1 method3435() {
		@Pc(11) Class1 local11 = this.aClass1_161;
		if (local11 == this.aClass254_26.aClass1_249) {
			this.aClass1_161 = null;
			return null;
		} else {
			this.aClass1_161 = local11.aClass1_262;
			return local11;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!vp;)V")
	public void method3437(@OriginalArg(1) Class254 arg0) {
		this.aClass254_26 = arg0;
	}
}
