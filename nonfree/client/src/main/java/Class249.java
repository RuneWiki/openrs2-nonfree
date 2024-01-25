import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class249 {

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
	private int anInt7341 = -1;

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
	private int anInt7352 = 0;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "Lclient!fea;")
	private Class99 aClass99_63 = new Class99();

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "Z")
	public boolean aBoolean520 = false;

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
	private final int anInt7351;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
	private final int anInt7349;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "[Lclient!gi;")
	private Class5_Sub21[] aClass5_Sub21Array1;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(III)V")
	public Class249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7351 = arg1;
		this.anInt7349 = arg0;
		this.anIntArrayArrayArray10 = new int[this.anInt7349][3][arg2];
		this.aClass5_Sub21Array1 = new Class5_Sub21[this.anInt7351];
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)[[[I")
	public int[][][] method5985() {
		if (this.anInt7349 != this.anInt7351) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(30) int local30 = 0; local30 < this.anInt7349; local30++) {
			this.aClass5_Sub21Array1[local30] = Static160.aClass5_Sub21_1;
		}
		return this.anIntArrayArrayArray10;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BI)[[I")
	public int[][] method5989(@OriginalArg(1) int arg0) {
		if (this.anInt7349 == this.anInt7351) {
			this.aBoolean520 = this.aClass5_Sub21Array1[arg0] == null;
			this.aClass5_Sub21Array1[arg0] = Static160.aClass5_Sub21_1;
			return this.anIntArrayArrayArray10[arg0];
		} else if (this.anInt7349 == 1) {
			this.aBoolean520 = this.anInt7341 != arg0;
			this.anInt7341 = arg0;
			return this.anIntArrayArrayArray10[0];
		} else {
			@Pc(70) Class5_Sub21 local70 = this.aClass5_Sub21Array1[arg0];
			if (local70 == null) {
				this.aBoolean520 = true;
				if (this.anInt7349 > this.anInt7352) {
					local70 = new Class5_Sub21(arg0, this.anInt7352);
					this.anInt7352++;
				} else {
					@Pc(101) Class5_Sub21 local101 = (Class5_Sub21) this.aClass99_63.method2527();
					local70 = new Class5_Sub21(arg0, local101.anInt3271);
					this.aClass5_Sub21Array1[local101.anInt3273] = null;
					local101.method7425();
				}
				this.aClass5_Sub21Array1[arg0] = local70;
			} else {
				this.aBoolean520 = false;
			}
			this.aClass99_63.method2514(local70);
			return this.anIntArrayArrayArray10[local70.anInt3271];
		}
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(B)V")
	public void method5993() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7349; local3++) {
			this.anIntArrayArrayArray10[local3][0] = null;
			this.anIntArrayArrayArray10[local3][1] = null;
			this.anIntArrayArrayArray10[local3][2] = null;
			this.anIntArrayArrayArray10[local3] = null;
		}
		this.anIntArrayArrayArray10 = null;
		this.aClass5_Sub21Array1 = null;
		this.aClass99_63.method2524();
		this.aClass99_63 = null;
	}
}
