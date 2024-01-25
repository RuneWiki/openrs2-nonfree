import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class Class10 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public final int anInt10956;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt10956 = arg0.method5272();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Z")
	public boolean method9145() {
		return true;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public abstract void method9146();
}
