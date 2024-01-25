import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class336 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public int anInt9696;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public int anInt9698;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public int anInt9700;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	public int anInt9702;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public int anInt9703;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
	public int anInt9706;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	public int anInt9712;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	public int anInt9713;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public int anInt9704 = 128;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public int anInt9699 = 128;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	public int anInt9709;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class336(@OriginalArg(0) int arg0) {
		this.anInt9709 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIII)V")
	private Class336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9704 = arg2;
		this.anInt9709 = arg0;
		this.anInt9706 = arg5;
		this.anInt9698 = arg3;
		this.anInt9699 = arg1;
		this.anInt9712 = arg4;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!uc;I)V")
	public void method7936(@OriginalArg(0) Class336 arg0) {
		this.anInt9709 = arg0.anInt9709;
		this.anInt9704 = arg0.anInt9704;
		this.anInt9706 = arg0.anInt9706;
		this.anInt9699 = arg0.anInt9699;
		this.anInt9698 = arg0.anInt9698;
		this.anInt9712 = arg0.anInt9712;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Lclient!uc;")
	public Class336 method7937() {
		return new Class336(this.anInt9709, this.anInt9699, this.anInt9704, this.anInt9698, this.anInt9712, this.anInt9706);
	}
}
