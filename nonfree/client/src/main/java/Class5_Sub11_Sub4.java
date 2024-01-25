import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class5_Sub11_Sub4 extends Class5_Sub11 {

	@OriginalMember(owner = "client!rha", name = "v", descriptor = "Ljava/lang/String;")
	private String aString113;

	@OriginalMember(owner = "client!rha", name = "s", descriptor = "I")
	private int anInt8720;

	@OriginalMember(owner = "client!rha", name = "p", descriptor = "B")
	private byte aByte125;

	@OriginalMember(owner = "client!rha", name = "o", descriptor = "I")
	private int anInt8723 = -1;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILclient!wca;)V")
	@Override
	public void method7459(@OriginalArg(1) Class5_Sub53 arg0) {
		@Pc(9) Class297 local9 = arg0.aClass297Array1[this.anInt8723];
		local9.anInt8235 = this.anInt8720;
		local9.aByte124 = this.aByte125;
		local9.aString109 = this.aString113;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method7461(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt8723 = arg0.method8519();
		this.aByte125 = arg0.method8488();
		this.anInt8720 = arg0.method8519();
		arg0.method8509();
		this.aString113 = arg0.method8497();
	}
}
