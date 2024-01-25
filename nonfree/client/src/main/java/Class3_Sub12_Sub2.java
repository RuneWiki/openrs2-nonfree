import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class3_Sub12_Sub2 extends Class3_Sub12 {

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
	private int anInt2321;

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	private int anInt2323;

	@OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
	private int anInt2324;

	@OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
	private int anInt2322 = -1;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt2322 = arg0.method8593();
		this.anInt2324 = arg0.method8618();
		this.anInt2323 = arg0.method8632();
		this.anInt2321 = arg0.method8632();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4636(this.anInt2322, this.anInt2323, this.anInt2321, this.anInt2324);
	}
}
