import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class77 {

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	private int anInt3779 = 0;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
	private int anInt3786 = -1;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!n;")
	private Class56 aClass56_13 = new Class56();

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "Z")
	public boolean aBoolean193 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	private final int anInt3775;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "[Lclient!cc;")
	private Class1_Sub6[] aClass1_Sub6Array1;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	private final int anInt3781;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(III)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3775 = arg0;
		this.anIntArrayArrayArray6 = new int[arg0][3][arg2];
		this.aClass1_Sub6Array1 = new Class1_Sub6[arg1];
		this.anInt3781 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I")
	public int[][] method2617(@OriginalArg(0) int arg0) {
		if (this.anInt3775 == this.anInt3781) {
			this.aBoolean193 = this.aClass1_Sub6Array1[arg0] == null;
			this.aClass1_Sub6Array1[arg0] = Static146.aClass1_Sub6_1;
			return this.anIntArrayArrayArray6[arg0];
		} else if (this.anInt3775 == 1) {
			this.aBoolean193 = arg0 != this.anInt3786;
			this.anInt3786 = arg0;
			return this.anIntArrayArrayArray6[0];
		} else {
			@Pc(65) Class1_Sub6 local65 = this.aClass1_Sub6Array1[arg0];
			if (this.aBoolean193 = local65 == null) {
				if (this.anInt3775 <= this.anInt3779) {
					@Pc(85) Class1_Sub6 local85 = (Class1_Sub6) this.aClass56_13.method1849();
					local65 = new Class1_Sub6(arg0, local85.anInt686);
					this.aClass1_Sub6Array1[local85.anInt685] = null;
					local85.method3141();
				} else {
					local65 = new Class1_Sub6(arg0, this.anInt3779);
					this.anInt3779++;
				}
				this.aClass1_Sub6Array1[arg0] = local65;
			}
			this.aClass56_13.method1852(local65);
			return this.anIntArrayArrayArray6[local65.anInt686];
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
	public void method2618() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3775; local7++) {
			this.anIntArrayArrayArray6[local7][0] = null;
			this.anIntArrayArrayArray6[local7][1] = null;
			this.anIntArrayArrayArray6[local7][2] = null;
			this.anIntArrayArrayArray6[local7] = null;
		}
		this.anIntArrayArrayArray6 = null;
		this.aClass1_Sub6Array1 = null;
		this.aClass56_13.method1851();
		this.aClass56_13 = null;
	}
}
