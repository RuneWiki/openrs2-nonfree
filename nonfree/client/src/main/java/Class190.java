import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class190 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private int anInt5005 = -1;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private int anInt5004 = 0;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!ko;")
	private Class142 aClass142_30 = new Class142();

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	private final int anInt5008;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private final int anInt5003;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray89;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "[Lclient!dc;")
	private Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(III)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5008 = arg1;
		this.anInt5003 = arg0;
		this.anIntArrayArrayArray89 = new int[this.anInt5003][3][arg2];
		this.aClass1_Sub9Array1 = new Class1_Sub9[this.anInt5008];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public void method4095() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5003; local7++) {
			this.anIntArrayArrayArray89[local7][0] = null;
			this.anIntArrayArrayArray89[local7][1] = null;
			this.anIntArrayArrayArray89[local7][2] = null;
			this.anIntArrayArrayArray89[local7] = null;
		}
		this.aClass1_Sub9Array1 = null;
		this.anIntArrayArrayArray89 = null;
		this.aClass142_30.method3206();
		this.aClass142_30 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)[[I")
	public int[][] method4096(@OriginalArg(1) int arg0) {
		if (this.anInt5003 == this.anInt5008) {
			this.aBoolean401 = this.aClass1_Sub9Array1[arg0] == null;
			this.aClass1_Sub9Array1[arg0] = Static197.aClass1_Sub9_1;
			return this.anIntArrayArrayArray89[arg0];
		} else if (this.anInt5003 == 1) {
			this.aBoolean401 = arg0 != this.anInt5005;
			this.anInt5005 = arg0;
			return this.anIntArrayArrayArray89[0];
		} else {
			@Pc(24) Class1_Sub9 local24 = this.aClass1_Sub9Array1[arg0];
			if (local24 == null) {
				this.aBoolean401 = true;
				if (this.anInt5004 < this.anInt5003) {
					local24 = new Class1_Sub9(arg0, this.anInt5004);
					this.anInt5004++;
				} else {
					@Pc(64) Class1_Sub9 local64 = (Class1_Sub9) this.aClass142_30.method3202();
					local24 = new Class1_Sub9(arg0, local64.anInt1214);
					this.aClass1_Sub9Array1[local64.anInt1215] = null;
					local64.method5965();
				}
				this.aClass1_Sub9Array1[arg0] = local24;
			} else {
				this.aBoolean401 = false;
			}
			this.aClass142_30.method3207(local24);
			return this.anIntArrayArrayArray89[local24.anInt1214];
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)[[[I")
	public int[][][] method4097() {
		if (this.anInt5008 != this.anInt5003) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt5003; local17++) {
			this.aClass1_Sub9Array1[local17] = Static197.aClass1_Sub9_1;
		}
		return this.anIntArrayArrayArray89;
	}
}
