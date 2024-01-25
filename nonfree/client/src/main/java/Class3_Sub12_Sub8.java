import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class3_Sub12_Sub8 extends Class3_Sub12 {

	@OriginalMember(owner = "client!on", name = "w", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "Z")
	private boolean aBoolean492;

	@OriginalMember(owner = "client!on", name = "C", descriptor = "B")
	private byte aByte91;

	@OriginalMember(owner = "client!on", name = "E", descriptor = "B")
	private byte aByte92;

	@OriginalMember(owner = "client!on", name = "F", descriptor = "B")
	private byte aByte93;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.aBoolean492 = arg0.method8632() == 1;
		this.aByte91 = arg0.method8621();
		this.aByte93 = arg0.method8621();
		this.aByte92 = arg0.method8621();
		this.aByte90 = arg0.method8621();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.aBoolean369 = this.aBoolean492;
		arg0.aByte74 = this.aByte92;
		arg0.aByte73 = this.aByte91;
		arg0.aByte72 = this.aByte93;
		arg0.aByte71 = this.aByte90;
	}
}
