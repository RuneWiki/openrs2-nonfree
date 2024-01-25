import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class3_Sub12_Sub1 extends Class3_Sub12 {

	@OriginalMember(owner = "client!bw", name = "A", descriptor = "J")
	private long aLong34 = -1L;

	@OriginalMember(owner = "client!bw", name = "F", descriptor = "Ljava/lang/String;")
	private String aString10 = null;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		if (arg0.method8632() != 255) {
			arg0.anInt9765--;
			this.aLong34 = arg0.method8600();
		}
		this.aString10 = arg0.method8617();
		if (Static356.aBoolean417) {
			System.out.println("memberhash:" + this.aLong34 + " membername:" + this.aString10);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4639(this.aLong34, this.aString10);
	}
}
