import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public final class Class5_Sub15_Sub5 extends Class5_Sub15 {

	@OriginalMember(owner = "client!naa", name = "u", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
	private int anInt6375;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.anInt6375 = arg0.method7268();
		this.aLong188 = arg0.method7304();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7395(this.anInt6375, this.aLong188);
	}
}
