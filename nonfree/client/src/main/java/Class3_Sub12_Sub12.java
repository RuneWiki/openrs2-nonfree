import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public final class Class3_Sub12_Sub12 extends Class3_Sub12 {

	@OriginalMember(owner = "client!vja", name = "x", descriptor = "I")
	private int anInt10146;

	@OriginalMember(owner = "client!vja", name = "D", descriptor = "I")
	private int anInt10151;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt10146 = arg0.method8618();
		this.anInt10151 = arg0.method8618();
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4635(this.anInt10146, this.anInt10151);
	}
}
