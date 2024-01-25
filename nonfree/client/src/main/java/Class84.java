import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class84 {

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	private int anInt2542 = 0;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	private int anInt2539 = -1;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!mba;")
	private Class216 aClass216_19 = new Class216();

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	private final int anInt2537;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	private final int anInt2541;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[Lclient!rs;")
	private Class3_Sub46[] aClass3_Sub46Array1;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2537 = arg1;
		this.anInt2541 = arg0;
		this.aClass3_Sub46Array1 = new Class3_Sub46[this.anInt2537];
		this.anIntArrayArray10 = new int[this.anInt2541][arg2];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)[I")
	public int[] method2125(@OriginalArg(1) int arg0) {
		if (this.anInt2541 == this.anInt2537) {
			this.aBoolean201 = this.aClass3_Sub46Array1[arg0] == null;
			this.aClass3_Sub46Array1[arg0] = Static352.aClass3_Sub46_3;
			return this.anIntArrayArray10[arg0];
		} else if (this.anInt2541 == 1) {
			this.aBoolean201 = arg0 != this.anInt2539;
			this.anInt2539 = arg0;
			return this.anIntArrayArray10[0];
		} else {
			@Pc(46) Class3_Sub46 local46 = this.aClass3_Sub46Array1[arg0];
			if (local46 == null) {
				this.aBoolean201 = true;
				if (this.anInt2542 < this.anInt2541) {
					local46 = new Class3_Sub46(arg0, this.anInt2542);
					this.anInt2542++;
				} else {
					@Pc(81) Class3_Sub46 local81 = (Class3_Sub46) this.aClass216_19.method5456();
					local46 = new Class3_Sub46(arg0, local81.anInt8500);
					this.aClass3_Sub46Array1[local81.anInt8499] = null;
					local81.method8682();
				}
				this.aClass3_Sub46Array1[arg0] = local46;
			} else {
				this.aBoolean201 = false;
			}
			this.aClass216_19.method5453(local46);
			return this.anIntArrayArray10[local46.anInt8500];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)[[I")
	public int[][] method2126() {
		if (this.anInt2537 != this.anInt2541) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt2541; local21++) {
			this.aClass3_Sub46Array1[local21] = Static352.aClass3_Sub46_3;
		}
		return this.anIntArrayArray10;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	public void method2127() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2541; local7++) {
			this.anIntArrayArray10[local7] = null;
		}
		this.anIntArrayArray10 = null;
		this.aClass3_Sub46Array1 = null;
		this.aClass216_19.method5454();
		this.aClass216_19 = null;
	}
}
