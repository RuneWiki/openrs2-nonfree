import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class143 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	private int anInt2977 = 0;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	private int anInt2979 = -1;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!dc;")
	private Class70 aClass70_14 = new Class70();

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	private final int anInt2976;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	private final int anInt2984;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "[Lclient!ri;")
	private Class2_Sub41[] aClass2_Sub41Array1;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(III)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2976 = arg1;
		this.anInt2984 = arg0;
		this.aClass2_Sub41Array1 = new Class2_Sub41[this.anInt2976];
		this.anIntArrayArrayArray6 = new int[this.anInt2984][3][arg2];
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[[I")
	public int[][] method2531(@OriginalArg(1) int arg0) {
		if (this.anInt2984 == this.anInt2976) {
			this.aBoolean214 = this.aClass2_Sub41Array1[arg0] == null;
			this.aClass2_Sub41Array1[arg0] = Static49.aClass2_Sub41_2;
			return this.anIntArrayArrayArray6[arg0];
		} else if (this.anInt2984 == 1) {
			this.aBoolean214 = this.anInt2979 != arg0;
			this.anInt2979 = arg0;
			return this.anIntArrayArrayArray6[0];
		} else {
			@Pc(66) Class2_Sub41 local66 = this.aClass2_Sub41Array1[arg0];
			if (local66 == null) {
				this.aBoolean214 = true;
				if (this.anInt2984 <= this.anInt2977) {
					@Pc(82) Class2_Sub41 local82 = (Class2_Sub41) this.aClass70_14.method1266();
					local66 = new Class2_Sub41(arg0, local82.anInt7424);
					this.aClass2_Sub41Array1[local82.anInt7422] = null;
					local82.method7657();
				} else {
					local66 = new Class2_Sub41(arg0, this.anInt2977);
					this.anInt2977++;
				}
				this.aClass2_Sub41Array1[arg0] = local66;
			} else {
				this.aBoolean214 = false;
			}
			this.aClass70_14.method1268(local66);
			return this.anIntArrayArrayArray6[local66.anInt7424];
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	public void method2533() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2984; local15++) {
			this.anIntArrayArrayArray6[local15][0] = null;
			this.anIntArrayArrayArray6[local15][1] = null;
			this.anIntArrayArrayArray6[local15][2] = null;
			this.anIntArrayArrayArray6[local15] = null;
		}
		this.aClass2_Sub41Array1 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass70_14.method1265();
		this.aClass70_14 = null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)[[[I")
	public int[][][] method2536() {
		if (this.anInt2976 != this.anInt2984) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2984; local25++) {
			this.aClass2_Sub41Array1[local25] = Static49.aClass2_Sub41_2;
		}
		return this.anIntArrayArrayArray6;
	}
}
