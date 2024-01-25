import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class211 {

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	private int anInt6205 = 0;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	private int anInt6204 = -1;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!ok;")
	private Class262 aClass262_35 = new Class262();

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Z")
	public boolean aBoolean432 = false;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	private final int anInt6208;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
	private final int anInt6207;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[Lclient!ro;")
	private Class14_Sub48[] aClass14_Sub48Array1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
	public Class211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6208 = arg1;
		this.anInt6207 = arg0;
		this.anIntArrayArray38 = new int[this.anInt6207][arg2];
		this.aClass14_Sub48Array1 = new Class14_Sub48[this.anInt6208];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public void method5133() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6207; local3++) {
			this.anIntArrayArray38[local3] = null;
		}
		this.anIntArrayArray38 = null;
		this.aClass14_Sub48Array1 = null;
		this.aClass262_35.method6316();
		this.aClass262_35 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
	public int[] method5137(@OriginalArg(1) int arg0) {
		if (this.anInt6208 == this.anInt6207) {
			this.aBoolean432 = this.aClass14_Sub48Array1[arg0] == null;
			this.aClass14_Sub48Array1[arg0] = Static235.aClass14_Sub48_1;
			return this.anIntArrayArray38[arg0];
		} else if (this.anInt6207 == 1) {
			this.aBoolean432 = this.anInt6204 != arg0;
			this.anInt6204 = arg0;
			return this.anIntArrayArray38[0];
		} else {
			@Pc(26) Class14_Sub48 local26 = this.aClass14_Sub48Array1[arg0];
			if (local26 == null) {
				this.aBoolean432 = true;
				if (this.anInt6205 >= this.anInt6207) {
					@Pc(46) Class14_Sub48 local46 = (Class14_Sub48) this.aClass262_35.method6320();
					local26 = new Class14_Sub48(arg0, local46.anInt9072);
					this.aClass14_Sub48Array1[local46.anInt9069] = null;
					local46.method9315();
				} else {
					local26 = new Class14_Sub48(arg0, this.anInt6205);
					this.anInt6205++;
				}
				this.aClass14_Sub48Array1[arg0] = local26;
			} else {
				this.aBoolean432 = false;
			}
			this.aClass262_35.method6315(local26);
			return this.anIntArrayArray38[local26.anInt9072];
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)[[I")
	public int[][] method5139() {
		if (this.anInt6207 != this.anInt6208) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt6207; local21++) {
			this.aClass14_Sub48Array1[local21] = Static235.aClass14_Sub48_1;
		}
		return this.anIntArrayArray38;
	}
}
