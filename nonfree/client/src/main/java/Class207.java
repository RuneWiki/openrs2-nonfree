import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class207 {

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	private int anInt6184 = -1;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	private int anInt6189 = 0;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Lclient!vr;")
	private Class258 aClass258_42 = new Class258();

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "Z")
	public boolean aBoolean426 = false;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	private final int anInt6190;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	private final int anInt6186;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "[Lclient!bh;")
	private Class4_Sub5[] aClass4_Sub5Array1;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(III)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6190 = arg1;
		this.anInt6186 = arg0;
		this.aClass4_Sub5Array1 = new Class4_Sub5[this.anInt6190];
		this.anIntArrayArrayArray13 = new int[this.anInt6186][3][arg2];
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[[I")
	public int[][] method4800(@OriginalArg(0) int arg0) {
		if (this.anInt6190 == this.anInt6186) {
			this.aBoolean426 = this.aClass4_Sub5Array1[arg0] == null;
			this.aClass4_Sub5Array1[arg0] = Static274.aClass4_Sub5_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt6186 == 1) {
			this.aBoolean426 = this.anInt6184 != arg0;
			this.anInt6184 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(23) Class4_Sub5 local23 = this.aClass4_Sub5Array1[arg0];
			if (local23 == null) {
				this.aBoolean426 = true;
				if (this.anInt6186 > this.anInt6189) {
					local23 = new Class4_Sub5(arg0, this.anInt6189);
					this.anInt6189++;
				} else {
					@Pc(54) Class4_Sub5 local54 = (Class4_Sub5) this.aClass258_42.method5536();
					local23 = new Class4_Sub5(arg0, local54.anInt697);
					this.aClass4_Sub5Array1[local54.anInt698] = null;
					local54.method5854();
				}
				this.aClass4_Sub5Array1[arg0] = local23;
			} else {
				this.aBoolean426 = false;
			}
			this.aClass258_42.method5529(local23);
			return this.anIntArrayArrayArray13[local23.anInt697];
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	public void method4801() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6186; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass4_Sub5Array1 = null;
		this.aClass258_42.method5527();
		this.aClass258_42 = null;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)[[[I")
	public int[][][] method4804() {
		if (this.anInt6186 != this.anInt6190) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6186; local25++) {
			this.aClass4_Sub5Array1[local25] = Static274.aClass4_Sub5_1;
		}
		return this.anIntArrayArrayArray13;
	}
}
