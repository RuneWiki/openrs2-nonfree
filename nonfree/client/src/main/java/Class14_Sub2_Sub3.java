import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class14_Sub2_Sub3 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	private int anInt3459;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5433(this.aLong102, this.anInt3459);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.anInt3459 = arg0.method5878();
		this.aLong102 = arg0.method5907();
	}
}
