import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class343 {

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
	private int anInt8932 = -1;

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
	private int anInt8933 = 0;

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "Lclient!at;")
	private Class20 aClass20_49 = new Class20();

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "Z")
	public boolean aBoolean592 = false;

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
	private final int anInt8929;

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
	private final int anInt8930;

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "[Lclient!re;")
	private Class5_Sub48[] aClass5_Sub48Array1;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(III)V")
	public Class343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8929 = arg0;
		this.anInt8930 = arg1;
		this.anIntArrayArrayArray18 = new int[this.anInt8929][3][arg2];
		this.aClass5_Sub48Array1 = new Class5_Sub48[this.anInt8930];
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
	public void method7659() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8929; local3++) {
			this.anIntArrayArrayArray18[local3][0] = null;
			this.anIntArrayArrayArray18[local3][1] = null;
			this.anIntArrayArrayArray18[local3][2] = null;
			this.anIntArrayArrayArray18[local3] = null;
		}
		this.anIntArrayArrayArray18 = null;
		this.aClass5_Sub48Array1 = null;
		this.aClass20_49.method374();
		this.aClass20_49 = null;
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)[[[I")
	public int[][][] method7660() {
		if (this.anInt8930 != this.anInt8929) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(34) int local34 = 0; local34 < this.anInt8929; local34++) {
			this.aClass5_Sub48Array1[local34] = Static262.aClass5_Sub48_1;
		}
		return this.anIntArrayArrayArray18;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)[[I")
	public int[][] method7661(@OriginalArg(0) int arg0) {
		if (this.anInt8929 == this.anInt8930) {
			this.aBoolean592 = this.aClass5_Sub48Array1[arg0] == null;
			this.aClass5_Sub48Array1[arg0] = Static262.aClass5_Sub48_1;
			return this.anIntArrayArrayArray18[arg0];
		} else if (this.anInt8929 == 1) {
			this.aBoolean592 = this.anInt8932 != arg0;
			this.anInt8932 = arg0;
			return this.anIntArrayArrayArray18[0];
		} else {
			@Pc(29) Class5_Sub48 local29 = this.aClass5_Sub48Array1[arg0];
			if (local29 == null) {
				this.aBoolean592 = true;
				if (this.anInt8933 < this.anInt8929) {
					local29 = new Class5_Sub48(arg0, this.anInt8933);
					this.anInt8933++;
				} else {
					@Pc(66) Class5_Sub48 local66 = (Class5_Sub48) this.aClass20_49.method379();
					local29 = new Class5_Sub48(arg0, local66.anInt8138);
					this.aClass5_Sub48Array1[local66.anInt8137] = null;
					local66.method9222();
				}
				this.aClass5_Sub48Array1[arg0] = local29;
			} else {
				this.aBoolean592 = false;
			}
			this.aClass20_49.method371(local29);
			return this.anIntArrayArrayArray18[local29.anInt8138];
		}
	}
}
