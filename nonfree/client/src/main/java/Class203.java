import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class203 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public int anInt5596;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
	public int anInt5598;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
	public int anInt5600;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	public int anInt5602 = 128;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public int anInt5601 = 128;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	public int anInt5603;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I)V")
	public Class203(@OriginalArg(0) int arg0) {
		this.anInt5603 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIII)V")
	private Class203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5600 = arg5;
		this.anInt5601 = arg1;
		this.anInt5603 = arg0;
		this.anInt5596 = arg4;
		this.anInt5598 = arg3;
		this.anInt5602 = arg2;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Lclient!qh;")
	public Class203 method4385() {
		return new Class203(this.anInt5603, this.anInt5601, this.anInt5602, this.anInt5598, this.anInt5596, this.anInt5600);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!qh;Z)V")
	public void method4388(@OriginalArg(0) Class203 arg0) {
		this.anInt5600 = arg0.anInt5600;
		this.anInt5598 = arg0.anInt5598;
		this.anInt5596 = arg0.anInt5596;
		this.anInt5603 = arg0.anInt5603;
		this.anInt5602 = arg0.anInt5602;
		this.anInt5601 = arg0.anInt5601;
	}
}
