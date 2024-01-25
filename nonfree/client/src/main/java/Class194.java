import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public class Class194 implements Interface7 {

	@OriginalMember(owner = "client!nja", name = "h", descriptor = "Lclient!nf;")
	protected Class102 aClass102_21;

	@OriginalMember(owner = "client!nja", name = "f", descriptor = "Lclient!gj;")
	private final Class143 aClass143_75;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "Lclient!ne;")
	protected final Class218 aClass218_2;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lclient!gj;Lclient!ne;)V")
	public Class194(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class218 arg1) {
		this.aClass143_75 = arg0;
		this.aClass218_2 = arg1;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V")
	@Override
	public final void method7986() {
		this.aClass102_21 = Static188.method3032(this.aClass218_2.anInt6025, this.aClass143_75);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7984() {
		return this.aClass143_75.method3130(this.aClass218_2.anInt6025);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7985() {
		@Pc(25) int local25 = this.aClass218_2.aClass92_8.method2199(Static507.anInt8484, this.aClass102_21.method6951()) + this.aClass218_2.anInt6024;
		@Pc(40) int local40 = this.aClass218_2.aClass65_12.method1786(Static581.anInt9218, this.aClass102_21.method6958()) + this.aClass218_2.anInt6023;
		this.aClass102_21.method6961(local25, local40);
	}
}
