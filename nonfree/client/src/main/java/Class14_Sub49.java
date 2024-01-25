import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class Class14_Sub49 extends Class14 {

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	public int anInt10326;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	private Class14_Sub49() {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!dka;)I")
	public abstract int method8836(@OriginalArg(0) Class14_Sub1_Sub2 arg0);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "()V")
	public abstract void method8837();
}
