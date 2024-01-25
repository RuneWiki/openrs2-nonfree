import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class220 {

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
	private int anInt6369 = -1;

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
	private int anInt6378 = 0;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!vq;")
	private Class211 aClass211_38 = new Class211();

	@OriginalMember(owner = "client!wq", name = "z", descriptor = "Z")
	public boolean aBoolean429 = false;

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
	private final int anInt6377;

	@OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
	private final int anInt6379;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "[Lclient!bm;")
	private Class6_Sub6[] aClass6_Sub6Array1;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(III)V")
	public Class220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6377 = arg0;
		this.anInt6379 = arg1;
		this.anIntArrayArrayArray13 = new int[this.anInt6377][3][arg2];
		this.aClass6_Sub6Array1 = new Class6_Sub6[this.anInt6379];
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public void method5810() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6377; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.aClass6_Sub6Array1 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass211_38.method5584();
		this.aClass211_38 = null;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)[[[I")
	public int[][][] method5815() {
		if (this.anInt6379 != this.anInt6377) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt6377; local22++) {
			this.aClass6_Sub6Array1[local22] = Static253.aClass6_Sub6_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[[I")
	public int[][] method5816(@OriginalArg(0) int arg0) {
		if (this.anInt6379 == this.anInt6377) {
			this.aBoolean429 = this.aClass6_Sub6Array1[arg0] == null;
			this.aClass6_Sub6Array1[arg0] = Static253.aClass6_Sub6_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt6377 == 1) {
			this.aBoolean429 = arg0 != this.anInt6369;
			this.anInt6369 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(68) Class6_Sub6 local68 = this.aClass6_Sub6Array1[arg0];
			if (local68 == null) {
				this.aBoolean429 = true;
				if (this.anInt6377 <= this.anInt6378) {
					@Pc(89) Class6_Sub6 local89 = (Class6_Sub6) this.aClass211_38.method5590();
					local68 = new Class6_Sub6(arg0, local89.anInt536);
					this.aClass6_Sub6Array1[local89.anInt537] = null;
					local89.method5756();
				} else {
					local68 = new Class6_Sub6(arg0, this.anInt6378);
					this.anInt6378++;
				}
				this.aClass6_Sub6Array1[arg0] = local68;
			} else {
				this.aBoolean429 = false;
			}
			this.aClass211_38.method5588(local68);
			return this.anIntArrayArrayArray13[local68.anInt536];
		}
	}
}
