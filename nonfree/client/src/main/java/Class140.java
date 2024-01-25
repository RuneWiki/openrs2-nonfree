import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class140 {

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	private int anInt3735 = 0;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	private int anInt3729 = -1;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!vq;")
	private Class211 aClass211_23 = new Class211();

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Z")
	public boolean aBoolean287 = false;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	private final int anInt3740;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	private final int anInt3734;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "[Lclient!am;")
	private Class6_Sub3[] aClass6_Sub3Array1;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray135;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3740 = arg1;
		this.anInt3734 = arg0;
		this.aClass6_Sub3Array1 = new Class6_Sub3[this.anInt3740];
		this.anIntArrayArray135 = new int[this.anInt3734][arg2];
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)[[I")
	public int[][] method3662() {
		if (this.anInt3740 != this.anInt3734) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3734; local17++) {
			this.aClass6_Sub3Array1[local17] = Static333.aClass6_Sub3_1;
		}
		return this.anIntArrayArray135;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[I")
	public int[] method3664(@OriginalArg(0) int arg0) {
		if (this.anInt3734 == this.anInt3740) {
			this.aBoolean287 = this.aClass6_Sub3Array1[arg0] == null;
			this.aClass6_Sub3Array1[arg0] = Static333.aClass6_Sub3_1;
			return this.anIntArrayArray135[arg0];
		} else if (this.anInt3734 == 1) {
			this.aBoolean287 = arg0 != this.anInt3729;
			this.anInt3729 = arg0;
			return this.anIntArrayArray135[0];
		} else {
			@Pc(52) Class6_Sub3 local52 = this.aClass6_Sub3Array1[arg0];
			if (local52 == null) {
				this.aBoolean287 = true;
				if (this.anInt3734 <= this.anInt3735) {
					@Pc(72) Class6_Sub3 local72 = (Class6_Sub3) this.aClass211_23.method5590();
					local52 = new Class6_Sub3(arg0, local72.anInt195);
					this.aClass6_Sub3Array1[local72.anInt196] = null;
					local72.method5756();
				} else {
					local52 = new Class6_Sub3(arg0, this.anInt3735);
					this.anInt3735++;
				}
				this.aClass6_Sub3Array1[arg0] = local52;
			} else {
				this.aBoolean287 = false;
			}
			this.aClass211_23.method5588(local52);
			return this.anIntArrayArray135[local52.anInt195];
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public void method3665() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3734; local11++) {
			this.anIntArrayArray135[local11] = null;
		}
		this.aClass6_Sub3Array1 = null;
		this.anIntArrayArray135 = null;
		this.aClass211_23.method5584();
		this.aClass211_23 = null;
	}
}
