import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public int anInt878;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	public abstract void method700();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!gk;)I")
	public abstract int method701(@OriginalArg(0) Class4_Sub9_Sub4 arg0);
}
