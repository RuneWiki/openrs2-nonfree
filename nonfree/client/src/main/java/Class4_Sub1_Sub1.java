import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5954(this.anInt75, this.anInt73);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt73 = arg0.method8850();
		this.anInt75 = arg0.method8850();
	}
}
