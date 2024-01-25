import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class Class29 {

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	public final int anInt11151;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt11151 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Z")
	public boolean method9494() {
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	public abstract void method9495();
}
