import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class53 {

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	private int anInt1470 = 0;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	private int anInt1473 = -1;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!dm;")
	private Class73 aClass73_15 = new Class73();

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	private final int anInt1465;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	private final int anInt1469;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "[Lclient!jk;")
	private Class12_Sub27[] aClass12_Sub27Array1;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1465 = arg1;
		this.anInt1469 = arg0;
		this.aClass12_Sub27Array1 = new Class12_Sub27[this.anInt1465];
		this.anIntArrayArrayArray1 = new int[this.anInt1469][3][arg2];
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public void method1460() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1469; local3++) {
			this.anIntArrayArrayArray1[local3][0] = null;
			this.anIntArrayArrayArray1[local3][1] = null;
			this.anIntArrayArrayArray1[local3][2] = null;
			this.anIntArrayArrayArray1[local3] = null;
		}
		this.anIntArrayArrayArray1 = null;
		this.aClass12_Sub27Array1 = null;
		this.aClass73_15.method2014();
		this.aClass73_15 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[[I")
	public int[][] method1462(@OriginalArg(1) int arg0) {
		if (this.anInt1469 == this.anInt1465) {
			this.aBoolean108 = this.aClass12_Sub27Array1[arg0] == null;
			this.aClass12_Sub27Array1[arg0] = Static446.aClass12_Sub27_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt1469 == 1) {
			this.aBoolean108 = this.anInt1473 != arg0;
			this.anInt1473 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(33) Class12_Sub27 local33 = this.aClass12_Sub27Array1[arg0];
			if (local33 == null) {
				this.aBoolean108 = true;
				if (this.anInt1470 < this.anInt1469) {
					local33 = new Class12_Sub27(arg0, this.anInt1470);
					this.anInt1470++;
				} else {
					@Pc(64) Class12_Sub27 local64 = (Class12_Sub27) this.aClass73_15.method2016();
					local33 = new Class12_Sub27(arg0, local64.anInt4888);
					this.aClass12_Sub27Array1[local64.anInt4887] = null;
					local64.method7967();
				}
				this.aClass12_Sub27Array1[arg0] = local33;
			} else {
				this.aBoolean108 = false;
			}
			this.aClass73_15.method2011(local33);
			return this.anIntArrayArrayArray1[local33.anInt4888];
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)[[[I")
	public int[][][] method1463() {
		if (this.anInt1469 != this.anInt1465) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt1469; local21++) {
			this.aClass12_Sub27Array1[local21] = Static446.aClass12_Sub27_1;
		}
		return this.anIntArrayArrayArray1;
	}
}
