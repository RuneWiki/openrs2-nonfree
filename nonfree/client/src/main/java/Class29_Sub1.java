import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	private final int anInt1178;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	private final int anInt1180;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Ljava/lang/String;")
	private final String aString12;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private final int anInt1177;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private final int anInt1176;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub1(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt1178 = arg0.method2028(-14795);
		this.anInt1180 = arg0.method2028(-14795);
		this.aString12 = arg0.method2014();
		this.anInt1177 = arg0.method2036();
		this.anInt1176 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static625.method8223(this.anInt1178, Static77.method1633(this.anInt1180, this.anInt1178, Static723.anInt11225), this.anInt1176, this.anInt1177, Static723.anInt11225, this.aString12, this.anInt1180);
	}
}
