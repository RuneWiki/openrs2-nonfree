import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class3_Sub12_Sub5 extends Class3_Sub12 {

	@OriginalMember(owner = "client!laa", name = "B", descriptor = "B")
	private byte aByte80;

	@OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
	private int anInt5475 = -1;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt5475 = arg0.method8593();
		this.aByte80 = arg0.method8621();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4657(this.anInt5475, this.aByte80);
	}
}
