import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class85 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	public int anInt2862;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "I")
	public int anInt2863;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	public int anInt2864;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "I")
	public int anInt2865;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	public int anInt2869;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "I")
	public int anInt2873;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "I")
	public int anInt2874;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "Lclient!et;")
	public Class85 aClass85_1;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "I")
	public int anInt2875;

	@OriginalMember(owner = "client!et", name = "v", descriptor = "I")
	public int anInt2878;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public final int anInt2870;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	public final int anInt2868;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "I")
	private final int anInt2867;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "I")
	public final int anInt2866;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIB)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2870 = arg2;
		this.anInt2868 = arg1;
		this.anInt2867 = arg0;
		this.aByte26 = arg4;
		this.anInt2866 = arg3;
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!et;I)V")
	public Class85(@OriginalArg(0) Class85 arg0, @OriginalArg(1) int arg1) {
		this.aClass85_1 = arg0;
		this.anInt2868 = this.aClass85_1.anInt2868 + arg1;
		this.anInt2867 = this.aClass85_1.anInt2867;
		this.anInt2870 = arg1 + this.aClass85_1.anInt2870;
		this.anInt2866 = this.aClass85_1.anInt2866 + arg1;
		this.aByte26 = this.aClass85_1.aByte26;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)Lclient!et;")
	public Class85 method2521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class85(this.anInt2867, arg0, arg1, arg2, this.aByte26);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Lclient!rba;")
	public Class281 method2522() {
		return Static438.method6239(this.anInt2867);
	}
}
