import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class174 {

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	private int anInt5478 = -1;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	private int anInt5480 = 0;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!en;")
	private Class44 aClass44_24 = new Class44();

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Z")
	public boolean aBoolean364 = false;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	private int anInt5475;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[Lclient!ke;")
	private Class2_Sub18[] aClass2_Sub18Array1;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	private int anInt5479;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(III)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5475 = arg1;
		this.aClass2_Sub18Array1 = new Class2_Sub18[this.anInt5475];
		this.anInt5479 = arg0;
		this.anIntArrayArray38 = new int[this.anInt5479][arg2];
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	public int[] method4334(@OriginalArg(0) int arg0) {
		if (this.anInt5475 == this.anInt5479) {
			this.aBoolean364 = this.aClass2_Sub18Array1[arg0] == null;
			this.aClass2_Sub18Array1[arg0] = Static277.aClass2_Sub18_1;
			return this.anIntArrayArray38[arg0];
		} else if (this.anInt5479 == 1) {
			this.aBoolean364 = arg0 != this.anInt5478;
			this.anInt5478 = arg0;
			return this.anIntArrayArray38[0];
		} else {
			@Pc(29) Class2_Sub18 local29 = this.aClass2_Sub18Array1[arg0];
			if (local29 == null) {
				this.aBoolean364 = true;
				if (this.anInt5480 >= this.anInt5479) {
					@Pc(51) Class2_Sub18 local51 = (Class2_Sub18) this.aClass44_24.method1350();
					local29 = new Class2_Sub18(arg0, local51.anInt3262);
					this.aClass2_Sub18Array1[local51.anInt3259] = null;
					local51.method4743();
				} else {
					local29 = new Class2_Sub18(arg0, this.anInt5480);
					this.anInt5480++;
				}
				this.aClass2_Sub18Array1[arg0] = local29;
			} else {
				this.aBoolean364 = false;
			}
			this.aClass44_24.method1355(local29);
			return this.anIntArrayArray38[local29.anInt3262];
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)[[I")
	public int[][] method4335() {
		if (this.anInt5475 != this.anInt5479) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt5479; local26++) {
			this.aClass2_Sub18Array1[local26] = Static277.aClass2_Sub18_1;
		}
		return this.anIntArrayArray38;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public void method4339() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5479; local3++) {
			this.anIntArrayArray38[local3] = null;
		}
		this.aClass2_Sub18Array1 = null;
		this.anIntArrayArray38 = null;
		this.aClass44_24.method1361();
		this.aClass44_24 = null;
	}
}
