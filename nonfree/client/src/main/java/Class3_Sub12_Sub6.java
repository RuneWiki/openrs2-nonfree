import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class3_Sub12_Sub6 extends Class3_Sub12 {

	@OriginalMember(owner = "client!li", name = "C", descriptor = "J")
	private long aLong180 = -1L;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "Ljava/lang/String;")
	private String aString59 = null;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4655(this.aString59, this.aLong180);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		if (arg0.method8632() != 255) {
			arg0.anInt9765--;
			this.aLong180 = arg0.method8600();
		}
		this.aString59 = arg0.method8617();
	}
}
