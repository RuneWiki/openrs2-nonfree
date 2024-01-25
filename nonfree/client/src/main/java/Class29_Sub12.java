import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public abstract class Class29_Sub12 extends Class29 {

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
	protected final int anInt6808;

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "I")
	protected final int anInt6809;

	@OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
	protected final int anInt6807;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub12(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt6808 = arg0.method2028(-14795);
		this.anInt6809 = arg0.method2028(-14795);
		this.anInt6807 = arg0.method2048(255);
	}
}
