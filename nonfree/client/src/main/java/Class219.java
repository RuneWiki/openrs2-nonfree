import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class219 {

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
	private int anInt6697 = 0;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
	private int anInt6695 = -1;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "Lclient!fi;")
	private Class74 aClass74_39 = new Class74();

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "Z")
	public boolean aBoolean495 = false;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	private final int anInt6693;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	private final int anInt6700;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "[Lclient!gk;")
	private Class7_Sub11[] aClass7_Sub11Array1;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(III)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6693 = arg0;
		this.anInt6700 = arg1;
		this.anIntArrayArray59 = new int[this.anInt6693][arg2];
		this.aClass7_Sub11Array1 = new Class7_Sub11[this.anInt6700];
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)[[I")
	public int[][] method5704() {
		if (this.anInt6700 != this.anInt6693) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6693; local17++) {
			this.aClass7_Sub11Array1[local17] = Static103.aClass7_Sub11_1;
		}
		return this.anIntArrayArray59;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	public void method5706() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6693; local7++) {
			this.anIntArrayArray59[local7] = null;
		}
		this.anIntArrayArray59 = null;
		this.aClass7_Sub11Array1 = null;
		this.aClass74_39.method1803();
		this.aClass74_39 = null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)[I")
	public int[] method5708(@OriginalArg(1) int arg0) {
		if (this.anInt6693 == this.anInt6700) {
			this.aBoolean495 = this.aClass7_Sub11Array1[arg0] == null;
			this.aClass7_Sub11Array1[arg0] = Static103.aClass7_Sub11_1;
			return this.anIntArrayArray59[arg0];
		} else if (this.anInt6693 == 1) {
			this.aBoolean495 = this.anInt6695 != arg0;
			this.anInt6695 = arg0;
			return this.anIntArrayArray59[0];
		} else {
			@Pc(72) Class7_Sub11 local72 = this.aClass7_Sub11Array1[arg0];
			if (local72 == null) {
				this.aBoolean495 = true;
				if (this.anInt6697 >= this.anInt6693) {
					@Pc(92) Class7_Sub11 local92 = (Class7_Sub11) this.aClass74_39.method1805();
					local72 = new Class7_Sub11(arg0, local92.anInt2482);
					this.aClass7_Sub11Array1[local92.anInt2485] = null;
					local92.method5648();
				} else {
					local72 = new Class7_Sub11(arg0, this.anInt6697);
					this.anInt6697++;
				}
				this.aClass7_Sub11Array1[arg0] = local72;
			} else {
				this.aBoolean495 = false;
			}
			this.aClass74_39.method1797(local72);
			return this.anIntArrayArray59[local72.anInt2482];
		}
	}
}
