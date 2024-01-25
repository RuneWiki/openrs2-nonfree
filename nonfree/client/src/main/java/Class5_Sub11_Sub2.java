import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class5_Sub11_Sub2 extends Class5_Sub11 {

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	private int anInt3897;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "B")
	private byte aByte52;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "Ljava/lang/String;")
	private String aString59 = null;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "J")
	private long aLong118 = -1L;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method7461(@OriginalArg(1) Class5_Sub23 arg0) {
		if (arg0.method8529() != 255) {
			arg0.anInt9869--;
			this.aLong118 = arg0.method8509();
		}
		this.aString59 = arg0.method8475();
		this.anInt3897 = arg0.method8519();
		this.aByte52 = arg0.method8488();
		arg0.method8509();
		if (Static212.aBoolean277) {
			System.out.println("memberhash:" + this.aLong118 + " membername:" + this.aString59);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!wca;)V")
	@Override
	public void method7459(@OriginalArg(1) Class5_Sub53 arg0) {
		@Pc(7) Class297 local7 = new Class297();
		local7.aString109 = this.aString59;
		local7.anInt8235 = this.anInt3897;
		local7.aByte124 = this.aByte52;
		arg0.method9056(local7);
	}
}
