import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
	private int anInt6754;

	@OriginalMember(owner = "client!oea", name = "r", descriptor = "I")
	private int anInt6755;

	@OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
	private int anInt6756;

	@OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
	private int anInt6759 = -1;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt6759 = arg0.method8859();
		this.anInt6754 = arg0.method8850();
		this.anInt6755 = arg0.method8865();
		this.anInt6756 = arg0.method8865();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5956(this.anInt6755, this.anInt6756, this.anInt6754, this.anInt6759);
	}
}
