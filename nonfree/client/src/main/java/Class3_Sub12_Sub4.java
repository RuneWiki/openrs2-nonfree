import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class3_Sub12_Sub4 extends Class3_Sub12 {

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
	private int anInt3234 = -1;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt3234 = arg0.method8593();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4653(this.anInt3234);
	}
}
