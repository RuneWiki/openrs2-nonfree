import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class263 {

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	private int anInt7472 = -1;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	private int anInt7474 = 0;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Lclient!su;")
	private Class298 aClass298_158 = new Class298();

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Z")
	public boolean aBoolean505 = false;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	private final int anInt7469;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	private final int anInt7471;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[Lclient!wt;")
	private Class6_Sub51[] aClass6_Sub51Array1;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(III)V")
	public Class263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7469 = arg0;
		this.anInt7471 = arg1;
		this.aClass6_Sub51Array1 = new Class6_Sub51[this.anInt7471];
		this.anIntArrayArrayArray19 = new int[this.anInt7469][3][arg2];
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public void method5965() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7469; local3++) {
			this.anIntArrayArrayArray19[local3][0] = null;
			this.anIntArrayArrayArray19[local3][1] = null;
			this.anIntArrayArrayArray19[local3][2] = null;
			this.anIntArrayArrayArray19[local3] = null;
		}
		this.aClass6_Sub51Array1 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass298_158.method6808();
		this.aClass298_158 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)[[[I")
	public int[][][] method5966() {
		if (this.anInt7471 != this.anInt7469) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt7469; local17++) {
			this.aClass6_Sub51Array1[local17] = Static319.aClass6_Sub51_2;
		}
		return this.anIntArrayArrayArray19;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[[I")
	public int[][] method5967(@OriginalArg(0) int arg0) {
		if (this.anInt7471 == this.anInt7469) {
			this.aBoolean505 = this.aClass6_Sub51Array1[arg0] == null;
			this.aClass6_Sub51Array1[arg0] = Static319.aClass6_Sub51_2;
			return this.anIntArrayArrayArray19[arg0];
		} else if (this.anInt7469 == 1) {
			this.aBoolean505 = arg0 != this.anInt7472;
			this.anInt7472 = arg0;
			return this.anIntArrayArrayArray19[0];
		} else {
			@Pc(25) Class6_Sub51 local25 = this.aClass6_Sub51Array1[arg0];
			if (local25 == null) {
				this.aBoolean505 = true;
				if (this.anInt7474 >= this.anInt7469) {
					@Pc(46) Class6_Sub51 local46 = (Class6_Sub51) this.aClass298_158.method6823();
					local25 = new Class6_Sub51(arg0, local46.anInt9946);
					this.aClass6_Sub51Array1[local46.anInt9949] = null;
					local46.method7948();
				} else {
					local25 = new Class6_Sub51(arg0, this.anInt7474);
					this.anInt7474++;
				}
				this.aClass6_Sub51Array1[arg0] = local25;
			} else {
				this.aBoolean505 = false;
			}
			this.aClass298_158.method6819(local25);
			return this.anIntArrayArrayArray19[local25.anInt9946];
		}
	}
}
