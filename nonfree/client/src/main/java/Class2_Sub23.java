import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public int anInt4447;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "[Lclient!ed;")
	public Class38[] aClass38Array2;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I[Lclient!ed;)V")
	public Class2_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class38[] arg1) {
		this.anInt4447 = arg0;
		this.aClass38Array2 = arg1;
	}
}
