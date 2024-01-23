import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class43 {

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	private int anInt1408 = -1;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	private int anInt1400 = 0;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!c;")
	private Class17 aClass17_10 = new Class17();

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
	private int anInt1410;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	private int anInt1409;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "[Lclient!id;")
	private Class4_Sub18[] aClass4_Sub18Array1;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(III)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1410 = arg0;
		this.anInt1409 = arg1;
		this.aClass4_Sub18Array1 = new Class4_Sub18[this.anInt1409];
		this.anIntArrayArray14 = new int[this.anInt1410][arg2];
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)[I")
	public int[] method1180(@OriginalArg(1) int arg0) {
		if (this.anInt1410 == this.anInt1409) {
			this.aBoolean82 = this.aClass4_Sub18Array1[arg0] == null;
			this.aClass4_Sub18Array1[arg0] = Static291.aClass4_Sub18_1;
			return this.anIntArrayArray14[arg0];
		} else if (this.anInt1410 == 1) {
			this.aBoolean82 = this.anInt1408 != arg0;
			this.anInt1408 = arg0;
			return this.anIntArrayArray14[0];
		} else {
			@Pc(45) Class4_Sub18 local45 = this.aClass4_Sub18Array1[arg0];
			if (local45 == null) {
				this.aBoolean82 = true;
				if (this.anInt1400 >= this.anInt1410) {
					@Pc(73) Class4_Sub18 local73 = (Class4_Sub18) this.aClass17_10.method609();
					local45 = new Class4_Sub18(arg0, local73.anInt2216);
					this.aClass4_Sub18Array1[local73.anInt2222] = null;
					local73.method4690();
				} else {
					local45 = new Class4_Sub18(arg0, this.anInt1400);
					this.anInt1400++;
				}
				this.aClass4_Sub18Array1[arg0] = local45;
			} else {
				this.aBoolean82 = false;
			}
			this.aClass17_10.method611(local45);
			return this.anIntArrayArray14[local45.anInt2216];
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	public void method1181() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1410; local7++) {
			this.anIntArrayArray14[local7] = null;
		}
		this.aClass4_Sub18Array1 = null;
		this.anIntArrayArray14 = null;
		this.aClass17_10.method618();
		this.aClass17_10 = null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)[[I")
	public int[][] method1182() {
		if (this.anInt1410 != this.anInt1409) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1410; local18++) {
			this.aClass4_Sub18Array1[local18] = Static291.aClass4_Sub18_1;
		}
		return this.anIntArrayArray14;
	}
}
