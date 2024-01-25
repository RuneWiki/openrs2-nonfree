import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class3_Sub17_Sub12 extends Class3_Sub17 {

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "Z")
	private boolean aBoolean579;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "B")
	private byte aByte119;

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "B")
	private byte aByte120;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "B")
	private byte aByte121;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "B")
	private byte aByte122;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aBoolean579 = arg0.method2048(255) == 1;
		this.aByte122 = arg0.method2022();
		this.aByte119 = arg0.method2022();
		this.aByte121 = arg0.method2022();
		this.aByte120 = arg0.method2022();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.aBoolean167 = this.aBoolean579;
		arg0.aByte53 = this.aByte121;
		arg0.aByte52 = this.aByte120;
		arg0.aByte54 = this.aByte122;
		arg0.aByte51 = this.aByte119;
	}
}
