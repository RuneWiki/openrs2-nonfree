import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class212 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
	public int anInt6578;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
	public int anInt6579;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
	public int anInt6580;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public int anInt6583;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public int anInt6585;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public int anInt6586;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	public int anInt6588;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	public int anInt6581 = 128;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
	public int anInt6577 = 128;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
	public int anInt6584;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V")
	public Class212(@OriginalArg(0) int arg0) {
		this.anInt6584 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIIII)V")
	private Class212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6585 = arg5;
		this.anInt6584 = arg0;
		this.anInt6581 = arg2;
		this.anInt6586 = arg3;
		this.anInt6577 = arg1;
		this.anInt6583 = arg4;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Lclient!sq;")
	public Class212 method5166() {
		return new Class212(this.anInt6584, this.anInt6577, this.anInt6581, this.anInt6586, this.anInt6583, this.anInt6585);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!sq;B)V")
	public void method5167(@OriginalArg(0) Class212 arg0) {
		this.anInt6585 = arg0.anInt6585;
		this.anInt6577 = arg0.anInt6577;
		this.anInt6584 = arg0.anInt6584;
		this.anInt6581 = arg0.anInt6581;
		this.anInt6586 = arg0.anInt6586;
		this.anInt6583 = arg0.anInt6583;
	}
}
