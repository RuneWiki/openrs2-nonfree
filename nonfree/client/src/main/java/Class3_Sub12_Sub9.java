import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class3_Sub12_Sub9 extends Class3_Sub12 {

	@OriginalMember(owner = "client!pga", name = "B", descriptor = "I")
	private int anInt7570;

	@OriginalMember(owner = "client!pga", name = "E", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt7570 = arg0.method8618();
		this.aLong232 = arg0.method8600();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4649(this.aLong232, this.anInt7570);
	}
}
