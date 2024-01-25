import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	private int anInt11075;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	private int anInt11076;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
	private int anInt11078;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	private int anInt11074 = -1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6018(this.anInt11075, this.anInt11074, this.anInt11076, this.anInt11078);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt11074 = arg0.method5211();
		this.anInt11076 = arg0.method5172();
		this.anInt11075 = arg0.method5203();
		this.anInt11078 = arg0.method5203();
	}
}
