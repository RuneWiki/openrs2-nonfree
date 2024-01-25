import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class5_Sub5_Sub7 extends Class5_Sub5 {

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
	private int anInt8349;

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
	private int anInt8352;

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
	private int anInt8353;

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "I")
	private int anInt8354 = -1;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.method5415(this.anInt8354, this.anInt8349, this.anInt8352, this.anInt8353);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt8354 = arg0.method3698();
		this.anInt8349 = arg0.method3671();
		this.anInt8353 = arg0.method3642();
		this.anInt8352 = arg0.method3642();
	}
}
