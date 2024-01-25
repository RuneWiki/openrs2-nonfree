import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gla")
public final class Class3_Sub11_Sub7 extends Class3_Sub11 {

	@OriginalMember(owner = "client!gla", name = "l", descriptor = "Ljava/lang/String;")
	private String aString74 = null;

	@OriginalMember(owner = "client!gla", name = "q", descriptor = "J")
	private long aLong141 = -1L;

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		if (arg0.method5322(-46) != 255) {
			arg0.anInt6241--;
			this.aLong141 = arg0.method5287();
		}
		this.aString74 = arg0.method5306();
		if (Static125.aBoolean201) {
			System.out.println("memberhash:" + this.aLong141 + " membername:" + this.aString74);
		}
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5840(this.aLong141, 0, this.aString74);
	}
}
