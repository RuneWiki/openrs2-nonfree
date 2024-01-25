import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Ljava/lang/String;")
	private String aString38 = null;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "J")
	private long aLong119 = -1L;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		if (arg0.method8865() != 255) {
			arg0.anInt10466--;
			this.aLong119 = arg0.method8830();
		}
		this.aString38 = arg0.method8852();
		if (Static149.aBoolean199) {
			System.out.println("memberhash:" + this.aLong119 + " membername:" + this.aString38);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5952(this.aLong119, this.aString38);
	}
}
