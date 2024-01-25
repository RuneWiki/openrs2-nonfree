import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
	private int anInt1705;

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "B")
	private byte aByte43;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
	private int anInt1710 = -1;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!ika;B)V")
	@Override
	public void method4957(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt1710 = arg0.method2028(-14795);
		this.aByte43 = arg0.method2022();
		this.anInt1705 = arg0.method2028(-14795);
		arg0.method2063();
		this.aString31 = arg0.method2014();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLclient!cg;)V")
	@Override
	public void method4954(@OriginalArg(1) Class3_Sub14 arg0) {
		@Pc(9) Class54 local9 = arg0.aClass54Array1[this.anInt1710];
		local9.aString30 = this.aString31;
		local9.aByte42 = this.aByte43;
		local9.anInt1629 = this.anInt1705;
	}
}
