import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class73 {

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	private int anInt3305 = -1;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
	private int anInt3311 = 0;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!wi;")
	private Class108 aClass108_12 = new Class108();

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	private int anInt3306;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	private int anInt3307;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "[Lclient!oc;")
	private Class2_Sub18[] aClass2_Sub18Array1;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V")
	public Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3306 = arg0;
		this.anIntArrayArray28 = new int[this.anInt3306][arg2];
		this.anInt3307 = arg1;
		this.aClass2_Sub18Array1 = new Class2_Sub18[this.anInt3307];
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)[[I")
	public int[][] method2246() {
		if (this.anInt3307 != this.anInt3306) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3306; local21++) {
			this.aClass2_Sub18Array1[local21] = Static76.aClass2_Sub18_2;
		}
		return this.anIntArrayArray28;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(ZI)[I")
	public int[] method2249(@OriginalArg(1) int arg0) {
		if (this.anInt3306 == this.anInt3307) {
			this.aBoolean188 = this.aClass2_Sub18Array1[arg0] == null;
			this.aClass2_Sub18Array1[arg0] = Static76.aClass2_Sub18_2;
			return this.anIntArrayArray28[arg0];
		} else if (this.anInt3306 == 1) {
			this.aBoolean188 = arg0 != this.anInt3305;
			this.anInt3305 = arg0;
			return this.anIntArrayArray28[0];
		} else {
			@Pc(31) Class2_Sub18 local31 = this.aClass2_Sub18Array1[arg0];
			if (local31 == null) {
				this.aBoolean188 = true;
				if (this.anInt3306 > this.anInt3311) {
					local31 = new Class2_Sub18(arg0, this.anInt3311);
					this.anInt3311++;
				} else {
					@Pc(71) Class2_Sub18 local71 = (Class2_Sub18) this.aClass108_12.method3324();
					local31 = new Class2_Sub18(arg0, local71.anInt3236);
					this.aClass2_Sub18Array1[local71.anInt3232] = null;
					local71.method3314();
				}
				this.aClass2_Sub18Array1[arg0] = local31;
			} else {
				this.aBoolean188 = false;
			}
			this.aClass108_12.method3327(local31);
			return this.anIntArrayArray28[local31.anInt3236];
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public void method2252() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3306; local7++) {
			this.anIntArrayArray28[local7] = null;
		}
		this.anIntArrayArray28 = null;
		this.aClass2_Sub18Array1 = null;
		this.aClass108_12.method3328();
		this.aClass108_12 = null;
	}
}
