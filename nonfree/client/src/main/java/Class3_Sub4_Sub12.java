import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class3_Sub4_Sub12 extends Class3_Sub4 {

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "J")
	private long aLong297 = -1L;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Ljava/lang/String;")
	private String aString128 = null;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		if (arg0.method4888() != 255) {
			arg0.lb--;
			this.aLong297 = arg0.method4865();
		}
		this.aString128 = arg0.method4897();
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7280(this.aString128, this.aLong297);
	}
}
