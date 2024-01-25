import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class29_Sub10 extends Class29 {

	@OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
	private final int anInt4176;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
	private final int anInt4175;

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
	private final int anInt4173;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
	private final int anInt4170;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub10(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt4176 = arg0.method2028(-14795);
		this.anInt4175 = arg0.method2048(255);
		this.anInt4173 = arg0.method2048(255);
		this.anInt4170 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static606.method7781(false, this.anInt4173, this.anInt4176, this.anInt4175, this.anInt4170, 0);
	}
}
