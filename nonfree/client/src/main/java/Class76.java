import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class76 {

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	private int anInt3220 = 0;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	private int anInt3225 = -1;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Lclient!cf;")
	private Class12 aClass12_12 = new Class12();

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	private final int anInt3228;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "[Lclient!t;")
	private Class2_Sub21[] aClass2_Sub21Array1;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	private final int anInt3223;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(III)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3228 = arg0;
		this.aClass2_Sub21Array1 = new Class2_Sub21[arg1];
		this.anIntArrayArray34 = new int[arg0][arg2];
		this.anInt3223 = arg1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method2285() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3228; local7++) {
			this.anIntArrayArray34[local7] = null;
		}
		this.aClass2_Sub21Array1 = null;
		this.anIntArrayArray34 = null;
		this.aClass12_12.method386();
		this.aClass12_12 = null;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I")
	public int[] method2290(@OriginalArg(1) int arg0) {
		if (this.anInt3223 == this.anInt3228) {
			this.aBoolean142 = this.aClass2_Sub21Array1[arg0] == null;
			this.aClass2_Sub21Array1[arg0] = Static119.aClass2_Sub21_1;
			return this.anIntArrayArray34[arg0];
		} else if (this.anInt3228 == 1) {
			this.aBoolean142 = this.anInt3225 != arg0;
			this.anInt3225 = arg0;
			return this.anIntArrayArray34[0];
		} else {
			@Pc(24) Class2_Sub21 local24 = this.aClass2_Sub21Array1[arg0];
			if (this.aBoolean142 = local24 == null) {
				if (this.anInt3228 <= this.anInt3220) {
					@Pc(48) Class2_Sub21 local48 = (Class2_Sub21) this.aClass12_12.method380();
					local24 = new Class2_Sub21(arg0, local48.anInt3241);
					this.aClass2_Sub21Array1[local48.anInt3243] = null;
					local48.method2705();
				} else {
					local24 = new Class2_Sub21(arg0, this.anInt3220);
					this.anInt3220++;
				}
				this.aClass2_Sub21Array1[arg0] = local24;
			}
			this.aClass12_12.method388(local24);
			return this.anIntArrayArray34[local24.anInt3241];
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)[[I")
	public int[][] method2291() {
		if (this.anInt3228 != this.anInt3223) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt3228; local22++) {
			this.aClass2_Sub21Array1[local22] = Static119.aClass2_Sub21_1;
		}
		return this.anIntArrayArray34;
	}
}
