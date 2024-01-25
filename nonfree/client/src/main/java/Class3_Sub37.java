import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public int anInt7067;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class3_Sub37() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	public abstract void method6024();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ak;)I")
	public abstract int method6025(@OriginalArg(0) Class3_Sub6_Sub1 arg0);
}
