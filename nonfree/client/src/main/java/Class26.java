import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class26 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
	private int anInt455 = -1;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
	private int anInt461 = 0;

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "Lclient!vf;")
	private Class238 aClass238_2 = new Class238();

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	private final int anInt462;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
	private final int anInt459;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "[Lclient!as;")
	private Class2_Sub4[] aClass2_Sub4Array1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(III)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt462 = arg0;
		this.anInt459 = arg1;
		this.anIntArrayArrayArray3 = new int[this.anInt462][3][arg2];
		this.aClass2_Sub4Array1 = new Class2_Sub4[this.anInt459];
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)[[I")
	public int[][] method350(@OriginalArg(1) int arg0) {
		if (this.anInt459 == this.anInt462) {
			this.aBoolean41 = this.aClass2_Sub4Array1[arg0] == null;
			this.aClass2_Sub4Array1[arg0] = Static238.aClass2_Sub4_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt462 == 1) {
			this.aBoolean41 = arg0 != this.anInt455;
			this.anInt455 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(29) Class2_Sub4 local29 = this.aClass2_Sub4Array1[arg0];
			if (local29 == null) {
				this.aBoolean41 = true;
				if (this.anInt461 >= this.anInt462) {
					@Pc(50) Class2_Sub4 local50 = (Class2_Sub4) this.aClass238_2.method5800();
					local29 = new Class2_Sub4(arg0, local50.anInt315);
					this.aClass2_Sub4Array1[local50.anInt313] = null;
					local50.method6130();
				} else {
					local29 = new Class2_Sub4(arg0, this.anInt461);
					this.anInt461++;
				}
				this.aClass2_Sub4Array1[arg0] = local29;
			} else {
				this.aBoolean41 = false;
			}
			this.aClass238_2.method5804(local29);
			return this.anIntArrayArrayArray3[local29.anInt315];
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	public void method352() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt462; local3++) {
			this.anIntArrayArrayArray3[local3][0] = null;
			this.anIntArrayArrayArray3[local3][1] = null;
			this.anIntArrayArrayArray3[local3][2] = null;
			this.anIntArrayArrayArray3[local3] = null;
		}
		this.anIntArrayArrayArray3 = null;
		this.aClass2_Sub4Array1 = null;
		this.aClass238_2.method5806();
		this.aClass238_2 = null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method353() {
		if (this.anInt462 != this.anInt459) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt462; local29++) {
			this.aClass2_Sub4Array1[local29] = Static238.aClass2_Sub4_1;
		}
		return this.anIntArrayArrayArray3;
	}
}
