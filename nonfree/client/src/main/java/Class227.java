import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class227 {

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "[I")
	public static final int[] anIntArray466 = new int[32];

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
	public int anInt7388;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
	public int anInt7389;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
	public int anInt7392;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
	public int anInt7394;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
	public int anInt7395;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
	public int anInt7396;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "Lclient!nn;")
	public Class227 aClass227_1;

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
	public int anInt7398;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	public int anInt7399;

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
	public int anInt7400;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
	private final int anInt7397;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "B")
	public final byte aByte112;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	public final int anInt7393;

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
	public final int anInt7401;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
	public final int anInt7390;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray466[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIIIB)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt7397 = arg0;
		this.aByte112 = arg4;
		this.anInt7393 = arg1;
		this.anInt7401 = arg3;
		this.anInt7390 = arg2;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)Lclient!nn;")
	public Class227 method6273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class227(this.anInt7397, arg2, arg0, arg1, this.aByte112);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)Lclient!qb;")
	public Class273 method6274() {
		return Static169.method797(this.anInt7397);
	}
}
