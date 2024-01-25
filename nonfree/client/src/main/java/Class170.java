import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class170 {

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
	private int anInt5113 = -1;

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
	private int anInt5110 = 0;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lclient!or;")
	private Class244 aClass244_41 = new Class244();

	@OriginalMember(owner = "client!kaa", name = "q", descriptor = "Z")
	public boolean aBoolean337 = false;

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
	private final int anInt5114;

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
	private final int anInt5112;

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "[Lclient!de;")
	private Class3_Sub11[] aClass3_Sub11Array1;

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(III)V")
	public Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5114 = arg0;
		this.anInt5112 = arg1;
		this.aClass3_Sub11Array1 = new Class3_Sub11[this.anInt5112];
		this.anIntArrayArray53 = new int[this.anInt5114][arg2];
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)V")
	public void method4100() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5114; local7++) {
			this.anIntArrayArray53[local7] = null;
		}
		this.aClass3_Sub11Array1 = null;
		this.anIntArrayArray53 = null;
		this.aClass244_41.method5581();
		this.aClass244_41 = null;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)[[I")
	public int[][] method4101() {
		if (this.anInt5114 != this.anInt5112) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt5114; local23++) {
			this.aClass3_Sub11Array1[local23] = Static501.aClass3_Sub11_1;
		}
		return this.anIntArrayArray53;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BI)[I")
	public int[] method4104(@OriginalArg(1) int arg0) {
		if (this.anInt5114 == this.anInt5112) {
			this.aBoolean337 = this.aClass3_Sub11Array1[arg0] == null;
			this.aClass3_Sub11Array1[arg0] = Static501.aClass3_Sub11_1;
			return this.anIntArrayArray53[arg0];
		} else if (this.anInt5114 == 1) {
			this.aBoolean337 = this.anInt5113 != arg0;
			this.anInt5113 = arg0;
			return this.anIntArrayArray53[0];
		} else {
			@Pc(63) Class3_Sub11 local63 = this.aClass3_Sub11Array1[arg0];
			if (local63 == null) {
				this.aBoolean337 = true;
				if (this.anInt5114 > this.anInt5110) {
					local63 = new Class3_Sub11(arg0, this.anInt5110);
					this.anInt5110++;
				} else {
					@Pc(94) Class3_Sub11 local94 = (Class3_Sub11) this.aClass244_41.method5577();
					local63 = new Class3_Sub11(arg0, local94.anInt2310);
					this.aClass3_Sub11Array1[local94.anInt2309] = null;
					local94.method8128();
				}
				this.aClass3_Sub11Array1[arg0] = local63;
			} else {
				this.aBoolean337 = false;
			}
			this.aClass244_41.method5573(local63);
			return this.anIntArrayArray53[local63.anInt2310];
		}
	}
}
