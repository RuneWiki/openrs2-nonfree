import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class3_Sub12_Sub11 extends Class3_Sub12 {

	@OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
	private int anInt8180;

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
	private int anInt8183;

	@OriginalMember(owner = "client!qu", name = "B", descriptor = "I")
	private int anInt8185;

	@OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
	private int anInt8187;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt8185 = arg0.method8618();
		this.anInt8187 = arg0.method8618();
		this.anInt8183 = arg0.method8632();
		this.anInt8180 = arg0.method8632();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4654(this.anInt8185, this.anInt8187, this.anInt8180, this.anInt8183);
	}
}
