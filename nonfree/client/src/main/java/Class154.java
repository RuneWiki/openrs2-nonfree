import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class154 {

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "[I")
	public final int[] anIntArray234 = new int[3];

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "[I")
	public final int[] anIntArray233 = new int[2];

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "[I")
	public final int[] anIntArray232 = new int[2];

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "[I")
	public final int[] anIntArray231 = new int[3];

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!mv;)V")
	public Class154(@OriginalArg(0) Class238 arg0) {
		this.anIntArray231[0] = arg0.anInt6836;
		this.anIntArray231[1] = arg0.anInt6873;
		this.anIntArray231[2] = arg0.anInt6860;
		this.anIntArray234[1] = arg0.anInt6859;
		this.anIntArray234[2] = arg0.anInt6889;
		this.anIntArray234[0] = arg0.anInt6868;
		this.anIntArray232[1] = arg0.anInt6830;
		this.anIntArray232[0] = arg0.anInt6839;
		this.anIntArray233[1] = arg0.anInt6897;
		this.anIntArray233[0] = arg0.anInt6862;
		if (arg0.lb != null) {
			this.aShortArray67 = new short[arg0.lb.length];
			Static686.method4965(arg0.lb, 0, this.aShortArray67, 0, this.aShortArray67.length);
		}
		if (arg0.aShortArray81 != null) {
			this.aShortArray66 = new short[arg0.aShortArray81.length];
			Static686.method4965(arg0.aShortArray81, 0, this.aShortArray66, 0, this.aShortArray66.length);
		}
	}
}
