import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class3_Sub4_Sub5 extends Class3_Sub4 {

	@OriginalMember(owner = "client!laa", name = "s", descriptor = "J")
	private long aLong150 = -1L;

	@OriginalMember(owner = "client!laa", name = "A", descriptor = "Ljava/lang/String;")
	private String aString74 = null;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		if (arg0.method4888() != 255) {
			arg0.lb--;
			this.aLong150 = arg0.method4865();
		}
		this.aString74 = arg0.method4897();
		if (Static277.aBoolean407) {
			System.out.println("memberhash:" + this.aLong150 + " membername:" + this.aString74);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.method7295(this.aString74, this.aLong150);
	}
}
