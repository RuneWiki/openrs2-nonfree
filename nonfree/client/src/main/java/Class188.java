import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class188 {

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	private int anInt5912 = 0;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	private int anInt5910 = -1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!jm;")
	private Class103 aClass103_142 = new Class103();

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Z")
	public boolean aBoolean490 = false;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	private final int anInt5914;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	private final int anInt5913;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "[Lclient!qb;")
	private Class5_Sub31[] aClass5_Sub31Array1;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray89;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(III)V")
	public Class188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5914 = arg0;
		this.anInt5913 = arg1;
		this.aClass5_Sub31Array1 = new Class5_Sub31[this.anInt5913];
		this.anIntArrayArray89 = new int[this.anInt5914][arg2];
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)[[I")
	public int[][] method5316() {
		if (this.anInt5914 != this.anInt5913) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt5914; local23++) {
			this.aClass5_Sub31Array1[local23] = Static347.aClass5_Sub31_1;
		}
		return this.anIntArrayArray89;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public void method5317() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5914; local3++) {
			this.anIntArrayArray89[local3] = null;
		}
		this.aClass5_Sub31Array1 = null;
		this.anIntArrayArray89 = null;
		this.aClass103_142.method2751();
		this.aClass103_142 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
	public int[] method5318(@OriginalArg(0) int arg0) {
		if (this.anInt5913 == this.anInt5914) {
			this.aBoolean490 = this.aClass5_Sub31Array1[arg0] == null;
			this.aClass5_Sub31Array1[arg0] = Static347.aClass5_Sub31_1;
			return this.anIntArrayArray89[arg0];
		} else if (this.anInt5914 == 1) {
			this.aBoolean490 = this.anInt5910 != arg0;
			this.anInt5910 = arg0;
			return this.anIntArrayArray89[0];
		} else {
			@Pc(64) Class5_Sub31 local64 = this.aClass5_Sub31Array1[arg0];
			if (local64 == null) {
				this.aBoolean490 = true;
				if (this.anInt5914 <= this.anInt5912) {
					@Pc(89) Class5_Sub31 local89 = (Class5_Sub31) this.aClass103_142.method2746();
					local64 = new Class5_Sub31(arg0, local89.anInt5085);
					this.aClass5_Sub31Array1[local89.anInt5086] = null;
					local89.method6005();
				} else {
					local64 = new Class5_Sub31(arg0, this.anInt5912);
					this.anInt5912++;
				}
				this.aClass5_Sub31Array1[arg0] = local64;
			} else {
				this.aBoolean490 = false;
			}
			this.aClass103_142.method2752(local64);
			return this.anIntArrayArray89[local64.anInt5085];
		}
	}
}
