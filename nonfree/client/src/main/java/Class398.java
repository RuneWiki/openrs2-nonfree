import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class398 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public int anInt10831;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public int anInt10832;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public int anInt10834;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public int anInt10839;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	private final int anInt10837;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public final int anInt10838;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class398(@OriginalArg(0) Class2_Sub20 arg0) {
		this.anInt10837 = arg0.method8552();
		this.anInt10838 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZI)V")
	public void method9449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static283.method7819(arg0, arg2, arg3, this.anInt10838, arg1, this.anInt10837, Static269.anIntArray307[this.anInt10838]);
		this.anInt10834 = arg2;
		this.anInt10832 = arg1;
		this.anInt10831 = arg3;
		this.anInt10839 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public void method9454() {
		Static283.method7819(this.anInt10839, this.anInt10834, this.anInt10831, this.anInt10838, this.anInt10832, -1, Static269.anIntArray307[this.anInt10838]);
	}
}
