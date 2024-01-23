import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class45 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	private int anInt1390 = -1;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	private int anInt1392 = 0;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Lclient!ci;")
	private Class26 aClass26_13 = new Class26();

	@OriginalMember(owner = "client!el", name = "o", descriptor = "Z")
	public boolean aBoolean95 = false;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	private int anInt1395;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	private int anInt1389;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "[Lclient!il;")
	private Class1_Sub13[] aClass1_Sub13Array1;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(III)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1395 = arg0;
		this.anInt1389 = arg1;
		this.anIntArrayArrayArray2 = new int[this.anInt1395][3][arg2];
		this.aClass1_Sub13Array1 = new Class1_Sub13[this.anInt1389];
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)[[[I")
	public int[][][] method1137() {
		if (this.anInt1395 != this.anInt1389) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt1395; local21++) {
			this.aClass1_Sub13Array1[local21] = Static288.aClass1_Sub13_1;
		}
		return this.anIntArrayArrayArray2;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)[[I")
	public int[][] method1139(@OriginalArg(1) int arg0) {
		if (this.anInt1395 == this.anInt1389) {
			this.aBoolean95 = this.aClass1_Sub13Array1[arg0] == null;
			this.aClass1_Sub13Array1[arg0] = Static288.aClass1_Sub13_1;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt1395 == 1) {
			this.aBoolean95 = arg0 != this.anInt1390;
			this.anInt1390 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(48) Class1_Sub13 local48 = this.aClass1_Sub13Array1[arg0];
			if (local48 == null) {
				this.aBoolean95 = true;
				if (this.anInt1395 > this.anInt1392) {
					local48 = new Class1_Sub13(arg0, this.anInt1392);
					this.anInt1392++;
				} else {
					@Pc(79) Class1_Sub13 local79 = (Class1_Sub13) this.aClass26_13.method677();
					local48 = new Class1_Sub13(arg0, local79.anInt2544);
					this.aClass1_Sub13Array1[local79.anInt2547] = null;
					local79.method4767();
				}
				this.aClass1_Sub13Array1[arg0] = local48;
			} else {
				this.aBoolean95 = false;
			}
			this.aClass26_13.method665(local48);
			return this.anIntArrayArrayArray2[local48.anInt2544];
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
	public void method1142() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1395; local7++) {
			this.anIntArrayArrayArray2[local7][0] = null;
			this.anIntArrayArrayArray2[local7][1] = null;
			this.anIntArrayArrayArray2[local7][2] = null;
			this.anIntArrayArrayArray2[local7] = null;
		}
		this.anIntArrayArrayArray2 = null;
		this.aClass1_Sub13Array1 = null;
		this.aClass26_13.method667();
		this.aClass26_13 = null;
	}
}
