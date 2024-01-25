import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public final class Class3_Sub4_Sub10 extends Class3_Sub4 {

	@OriginalMember(owner = "client!vha", name = "s", descriptor = "B")
	private byte aByte136;

	@OriginalMember(owner = "client!vha", name = "u", descriptor = "B")
	private byte aByte137;

	@OriginalMember(owner = "client!vha", name = "C", descriptor = "Z")
	private boolean aBoolean725;

	@OriginalMember(owner = "client!vha", name = "D", descriptor = "B")
	private byte aByte138;

	@OriginalMember(owner = "client!vha", name = "F", descriptor = "B")
	private byte aByte139;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILclient!fca;)V")
	@Override
	public void method8503(@OriginalArg(1) Class3_Sub17 arg0) {
		this.aBoolean725 = arg0.method4888() == 1;
		this.aByte139 = arg0.method4861();
		this.aByte137 = arg0.method4861();
		this.aByte138 = arg0.method4861();
		this.aByte136 = arg0.method4861();
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!rh;Z)V")
	@Override
	public void method8504(@OriginalArg(0) Class308 arg0) {
		arg0.aBoolean644 = this.aBoolean725;
		arg0.aByte114 = this.aByte137;
		arg0.aByte116 = this.aByte136;
		arg0.aByte115 = this.aByte138;
		arg0.aByte117 = this.aByte139;
	}
}
