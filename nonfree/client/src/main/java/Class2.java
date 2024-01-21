import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	private int anInt35 = -1;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	private int anInt38 = 0;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!h;")
	private Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
	private final int anInt43;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "[Lclient!th;")
	private Class1_Sub22[] aClass1_Sub22Array1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	private final int anInt41;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt43 = arg0;
		this.aClass1_Sub22Array1 = new Class1_Sub22[arg1];
		this.anIntArrayArray1 = new int[arg0][arg2];
		this.anInt41 = arg1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[[I")
	public int[][] method18() {
		if (this.anInt43 != this.anInt41) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt43; local21++) {
			this.aClass1_Sub22Array1[local21] = Static31.aClass1_Sub22_1;
		}
		return this.anIntArrayArray1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[I")
	public int[] method19(@OriginalArg(1) int arg0) {
		if (this.anInt43 == this.anInt41) {
			this.aBoolean2 = this.aClass1_Sub22Array1[arg0] == null;
			this.aClass1_Sub22Array1[arg0] = Static31.aClass1_Sub22_1;
			return this.anIntArrayArray1[arg0];
		} else if (this.anInt43 == 1) {
			this.aBoolean2 = arg0 != this.anInt35;
			this.anInt35 = arg0;
			return this.anIntArrayArray1[0];
		} else {
			@Pc(68) Class1_Sub22 local68 = this.aClass1_Sub22Array1[arg0];
			if (this.aBoolean2 = local68 == null) {
				if (this.anInt43 <= this.anInt38) {
					@Pc(88) Class1_Sub22 local88 = (Class1_Sub22) this.aClass30_1.method1123();
					local68 = new Class1_Sub22(arg0, local88.anInt3719);
					this.aClass1_Sub22Array1[local88.anInt3716] = null;
					local88.method3134();
				} else {
					local68 = new Class1_Sub22(arg0, this.anInt38);
					this.anInt38++;
				}
				this.aClass1_Sub22Array1[arg0] = local68;
			}
			this.aClass30_1.method1114(local68);
			return this.anIntArrayArray1[local68.anInt3719];
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public void method23() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt43; local7++) {
			this.anIntArrayArray1[local7] = null;
		}
		this.anIntArrayArray1 = null;
		this.aClass1_Sub22Array1 = null;
		this.aClass30_1.method1118();
		this.aClass30_1 = null;
	}
}
