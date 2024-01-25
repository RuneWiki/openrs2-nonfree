import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class29_Sub4 extends Class29 {

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	private final int anInt3153;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Ljava/lang/String;")
	private final String aString50;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	private final int anInt3155;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
	private final int anInt3157;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub4(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt3153 = arg0.method2028(-14795);
		this.aString50 = arg0.method2014();
		this.anInt3155 = arg0.method2036();
		this.anInt3157 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static470.aClass7Array1[this.anInt3153].method249().method7487(this.anInt3157, this.anInt3155, 0, this.aString50);
	}
}
