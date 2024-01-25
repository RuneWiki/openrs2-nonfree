import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class3_Sub11_Sub5 extends Class3_Sub11 {

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Ljava/lang/String;")
	private String aString34 = null;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "J")
	private long aLong88 = -1L;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5847(this.aString34, this.aLong88);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		if (arg0.method5322(-18) != 255) {
			arg0.anInt6241--;
			this.aLong88 = arg0.method5287();
		}
		this.aString34 = arg0.method5306();
	}
}
