import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "B")
	private byte aByte2;

	@OriginalMember(owner = "client!aia", name = "q", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "I")
	private int anInt284 = -1;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!wr;B)V")
	@Override
	public void method5915(@OriginalArg(0) Class3_Sub56 arg0) {
		@Pc(9) Class407 local9 = arg0.aClass407Array1[this.anInt284];
		local9.anInt11258 = this.anInt285;
		local9.aByte147 = this.aByte2;
		local9.aString133 = this.aString2;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method5916(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt284 = arg0.method5272();
		this.aByte2 = arg0.method5288();
		this.anInt285 = arg0.method5272();
		arg0.method5287();
		this.aString2 = arg0.method5295();
	}
}
