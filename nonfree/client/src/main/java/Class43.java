import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class43 {

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	private int anInt1727 = -1;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	private int anInt1728 = 0;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Lclient!cf;")
	private Class20 aClass20_7 = new Class20();

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
	private final int anInt1730;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "[Lclient!lb;")
	private Class1_Sub16[] aClass1_Sub16Array1;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	private final int anInt1725;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(III)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1730 = arg1;
		this.aClass1_Sub16Array1 = new Class1_Sub16[this.anInt1730];
		this.anInt1725 = arg0;
		this.anIntArrayArray11 = new int[this.anInt1725][arg2];
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)[[I")
	public int[][] method1182() {
		if (this.anInt1730 != this.anInt1725) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1725; local29++) {
			this.aClass1_Sub16Array1[local29] = Static88.aClass1_Sub16_1;
		}
		return this.anIntArrayArray11;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	public void method1183() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1725; local3++) {
			this.anIntArrayArray11[local3] = null;
		}
		this.anIntArrayArray11 = null;
		this.aClass1_Sub16Array1 = null;
		this.aClass20_7.method469();
		this.aClass20_7 = null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
	public int[] method1185(@OriginalArg(1) int arg0) {
		if (this.anInt1730 == this.anInt1725) {
			this.aBoolean106 = this.aClass1_Sub16Array1[arg0] == null;
			this.aClass1_Sub16Array1[arg0] = Static88.aClass1_Sub16_1;
			return this.anIntArrayArray11[arg0];
		} else if (this.anInt1725 == 1) {
			this.aBoolean106 = this.anInt1727 != arg0;
			this.anInt1727 = arg0;
			return this.anIntArrayArray11[0];
		} else {
			@Pc(36) Class1_Sub16 local36 = this.aClass1_Sub16Array1[arg0];
			if (local36 == null) {
				this.aBoolean106 = true;
				if (this.anInt1728 < this.anInt1725) {
					local36 = new Class1_Sub16(arg0, this.anInt1728);
					this.anInt1728++;
				} else {
					@Pc(73) Class1_Sub16 local73 = (Class1_Sub16) this.aClass20_7.method477();
					local36 = new Class1_Sub16(arg0, local73.anInt2359);
					this.aClass1_Sub16Array1[local73.anInt2358] = null;
					local73.method3414();
				}
				this.aClass1_Sub16Array1[arg0] = local36;
			} else {
				this.aBoolean106 = false;
			}
			this.aClass20_7.method471(local36);
			return this.anIntArrayArray11[local36.anInt2359];
		}
	}
}
