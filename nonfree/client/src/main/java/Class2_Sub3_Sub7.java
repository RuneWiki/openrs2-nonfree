import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
	private int anInt5329;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
	private int anInt5330;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
	private int anInt5331;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
	private int anInt5332;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6017(this.anInt5331, this.anInt5330, this.anInt5332, this.anInt5329);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt5330 = arg0.method5172();
		this.anInt5329 = arg0.method5172();
		this.anInt5331 = arg0.method5203();
		this.anInt5332 = arg0.method5203();
	}
}
