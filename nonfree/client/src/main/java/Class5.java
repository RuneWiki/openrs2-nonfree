import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5 {

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	private int anInt326 = 0;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	private int anInt330 = -1;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!n;")
	private Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Z")
	public boolean aBoolean16 = false;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	private final int anInt320;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "[Lclient!ah;")
	private Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	private final int anInt325;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(III)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3 = new int[arg0][arg2];
		this.anInt320 = arg0;
		this.aClass1_Sub3Array1 = new Class1_Sub3[arg1];
		this.anInt325 = arg1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I")
	public int[] method168(@OriginalArg(0) int arg0) {
		if (this.anInt320 == this.anInt325) {
			this.aBoolean16 = this.aClass1_Sub3Array1[arg0] == null;
			this.aClass1_Sub3Array1[arg0] = Static108.aClass1_Sub3_3;
			return this.anIntArrayArray3[arg0];
		} else if (this.anInt320 == 1) {
			this.aBoolean16 = this.anInt330 != arg0;
			this.anInt330 = arg0;
			return this.anIntArrayArray3[0];
		} else {
			@Pc(65) Class1_Sub3 local65 = this.aClass1_Sub3Array1[arg0];
			if (this.aBoolean16 = local65 == null) {
				if (this.anInt320 > this.anInt326) {
					local65 = new Class1_Sub3(arg0, this.anInt326);
					this.anInt326++;
				} else {
					@Pc(100) Class1_Sub3 local100 = (Class1_Sub3) this.aClass56_2.method1849();
					local65 = new Class1_Sub3(arg0, local100.anInt348);
					this.aClass1_Sub3Array1[local100.anInt346] = null;
					local100.method3141();
				}
				this.aClass1_Sub3Array1[arg0] = local65;
			}
			this.aClass56_2.method1852(local65);
			return this.anIntArrayArray3[local65.anInt348];
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public void method169() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt320; local7++) {
			this.anIntArrayArray3[local7] = null;
		}
		this.aClass1_Sub3Array1 = null;
		this.anIntArrayArray3 = null;
		this.aClass56_2.method1851();
		this.aClass56_2 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)[[I")
	public int[][] method171() {
		if (this.anInt320 != this.anInt325) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt320; local26++) {
			this.aClass1_Sub3Array1[local26] = Static108.aClass1_Sub3_3;
		}
		return this.anIntArrayArray3;
	}
}
