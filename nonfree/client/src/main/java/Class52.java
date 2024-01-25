import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class52 {

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
	private int anInt1222 = -1;

	@OriginalMember(owner = "client!cga", name = "m", descriptor = "I")
	private int anInt1227 = 0;

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "Lclient!fha;")
	private Class109 aClass109_6 = new Class109();

	@OriginalMember(owner = "client!cga", name = "q", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
	private final int anInt1219;

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
	private final int anInt1220;

	@OriginalMember(owner = "client!cga", name = "l", descriptor = "[Lclient!va;")
	private Class2_Sub50[] aClass2_Sub50Array1;

	@OriginalMember(owner = "client!cga", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(III)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1219 = arg1;
		this.anInt1220 = arg0;
		this.aClass2_Sub50Array1 = new Class2_Sub50[this.anInt1219];
		this.anIntArrayArrayArray2 = new int[this.anInt1220][3][arg2];
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	public void method961() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt1220; local8++) {
			this.anIntArrayArrayArray2[local8][0] = null;
			this.anIntArrayArrayArray2[local8][1] = null;
			this.anIntArrayArrayArray2[local8][2] = null;
			this.anIntArrayArrayArray2[local8] = null;
		}
		this.aClass2_Sub50Array1 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass109_6.method2329();
		this.aClass109_6 = null;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)[[I")
	public int[][] method962(@OriginalArg(1) int arg0) {
		if (this.anInt1220 == this.anInt1219) {
			this.aBoolean88 = this.aClass2_Sub50Array1[arg0] == null;
			this.aClass2_Sub50Array1[arg0] = Static450.aClass2_Sub50_1;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt1220 == 1) {
			this.aBoolean88 = this.anInt1222 != arg0;
			this.anInt1222 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(51) Class2_Sub50 local51 = this.aClass2_Sub50Array1[arg0];
			if (local51 == null) {
				this.aBoolean88 = true;
				if (this.anInt1220 <= this.anInt1227) {
					@Pc(72) Class2_Sub50 local72 = (Class2_Sub50) this.aClass109_6.method2321();
					local51 = new Class2_Sub50(arg0, local72.anInt9585);
					this.aClass2_Sub50Array1[local72.anInt9586] = null;
					local72.method8653();
				} else {
					local51 = new Class2_Sub50(arg0, this.anInt1227);
					this.anInt1227++;
				}
				this.aClass2_Sub50Array1[arg0] = local51;
			} else {
				this.aBoolean88 = false;
			}
			this.aClass109_6.method2331(local51);
			return this.anIntArrayArrayArray2[local51.anInt9585];
		}
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)[[[I")
	public int[][][] method965() {
		if (this.anInt1220 != this.anInt1219) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1220; local25++) {
			this.aClass2_Sub50Array1[local25] = Static450.aClass2_Sub50_1;
		}
		return this.anIntArrayArrayArray2;
	}
}
