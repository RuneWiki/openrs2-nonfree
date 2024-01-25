import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public final class Class29_Sub16 extends Class29 {

	@OriginalMember(owner = "client!qja", name = "i", descriptor = "Lclient!bc;")
	private Class3_Sub8 aClass3_Sub8_3;

	@OriginalMember(owner = "client!qja", name = "o", descriptor = "I")
	private final int anInt8265;

	@OriginalMember(owner = "client!qja", name = "k", descriptor = "I")
	private final int anInt8264;

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub16(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt8265 = arg0.method2028(-14795);
		this.anInt8264 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9494() {
		if (this.aClass3_Sub8_3 == null) {
			this.aClass3_Sub8_3 = Static729.method1125(Static185.aClass182_50, this.anInt8265, 0);
		}
		if (this.aClass3_Sub8_3 == null) {
			return false;
		} else {
			return Static647.method8506(this.aClass3_Sub8_3);
		}
	}

	@OriginalMember(owner = "client!qja", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static340.method4861(this.anInt8264, this.aClass3_Sub8_3);
	}
}
