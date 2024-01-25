import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class153 {

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	private int anInt4170 = 0;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	private int anInt4177 = -1;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!wo;")
	private Class361 aClass361_43 = new Class361();

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Z")
	public boolean aBoolean340 = false;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private final int anInt4172;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	private final int anInt4166;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[Lclient!hl;")
	private Class1_Sub18[] aClass1_Sub18Array1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(III)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4172 = arg1;
		this.anInt4166 = arg0;
		this.anIntArrayArrayArray7 = new int[this.anInt4166][3][arg2];
		this.aClass1_Sub18Array1 = new Class1_Sub18[this.anInt4172];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[[I")
	public int[][] method3557(@OriginalArg(0) int arg0) {
		if (this.anInt4166 == this.anInt4172) {
			this.aBoolean340 = this.aClass1_Sub18Array1[arg0] == null;
			this.aClass1_Sub18Array1[arg0] = Static35.aClass1_Sub18_1;
			return this.anIntArrayArrayArray7[arg0];
		} else if (this.anInt4166 == 1) {
			this.aBoolean340 = this.anInt4177 != arg0;
			this.anInt4177 = arg0;
			return this.anIntArrayArrayArray7[0];
		} else {
			@Pc(26) Class1_Sub18 local26 = this.aClass1_Sub18Array1[arg0];
			if (local26 == null) {
				this.aBoolean340 = true;
				if (this.anInt4170 >= this.anInt4166) {
					@Pc(42) Class1_Sub18 local42 = (Class1_Sub18) this.aClass361_43.method7848();
					local26 = new Class1_Sub18(arg0, local42.anInt4011);
					this.aClass1_Sub18Array1[local42.anInt4009] = null;
					local42.method7878();
				} else {
					local26 = new Class1_Sub18(arg0, this.anInt4170);
					this.anInt4170++;
				}
				this.aClass1_Sub18Array1[arg0] = local26;
			} else {
				this.aBoolean340 = false;
			}
			this.aClass361_43.method7849(local26);
			return this.anIntArrayArrayArray7[local26.anInt4011];
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method3558() {
		if (this.anInt4166 != this.anInt4172) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4166; local17++) {
			this.aClass1_Sub18Array1[local17] = Static35.aClass1_Sub18_1;
		}
		return this.anIntArrayArrayArray7;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public void method3559() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4166; local7++) {
			this.anIntArrayArrayArray7[local7][0] = null;
			this.anIntArrayArrayArray7[local7][1] = null;
			this.anIntArrayArrayArray7[local7][2] = null;
			this.anIntArrayArrayArray7[local7] = null;
		}
		this.anIntArrayArrayArray7 = null;
		this.aClass1_Sub18Array1 = null;
		this.aClass361_43.method7860();
		this.aClass361_43 = null;
	}
}
