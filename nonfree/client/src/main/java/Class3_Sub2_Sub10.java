import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "I")
	private int anInt6850;

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
	private int anInt6852;

	@OriginalMember(owner = "client!oba", name = "u", descriptor = "I")
	private int anInt6854;

	@OriginalMember(owner = "client!oba", name = "v", descriptor = "I")
	private int anInt6855;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		this.anInt6850 = arg0.method7895();
		this.anInt6854 = arg0.method7895();
		this.anInt6852 = arg0.method7954();
		this.anInt6855 = arg0.method7954();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.method7734(this.anInt6850, this.anInt6852, this.anInt6855, this.anInt6854);
	}
}
