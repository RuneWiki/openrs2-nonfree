import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class3_Sub31_Sub2 extends Class3_Sub31 {

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	private int anInt6240 = -1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8254(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt6240 = arg0.method8593();
		arg0.method8632();
		if (arg0.method8632() != 255) {
			arg0.anInt9765--;
			arg0.method8600();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLclient!hka;)V")
	@Override
	public void method8255(@OriginalArg(1) Class3_Sub30 arg0) {
		arg0.method3900(this.anInt6240);
	}
}
