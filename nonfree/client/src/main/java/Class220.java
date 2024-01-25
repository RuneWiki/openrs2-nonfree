import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class220 {

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
	private int anInt6957 = 0;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
	private int anInt6956 = -1;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!ki;")
	private Class183 aClass183_43 = new Class183();

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "Z")
	public boolean aBoolean587 = false;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
	private final int anInt6965;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
	private final int anInt6961;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "[Lclient!wba;")
	private Class3_Sub50[] aClass3_Sub50Array1;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(III)V")
	public Class220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6965 = arg0;
		this.anInt6961 = arg1;
		this.anIntArrayArrayArray9 = new int[this.anInt6965][3][arg2];
		this.aClass3_Sub50Array1 = new Class3_Sub50[this.anInt6961];
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)[[[I")
	public int[][][] method5789() {
		if (this.anInt6961 != this.anInt6965) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt6965; local22++) {
			this.aClass3_Sub50Array1[local22] = Static10.aClass3_Sub50_1;
		}
		return this.anIntArrayArrayArray9;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)[[I")
	public int[][] method5791(@OriginalArg(0) int arg0) {
		if (this.anInt6965 == this.anInt6961) {
			this.aBoolean587 = this.aClass3_Sub50Array1[arg0] == null;
			this.aClass3_Sub50Array1[arg0] = Static10.aClass3_Sub50_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt6965 == 1) {
			this.aBoolean587 = this.anInt6956 != arg0;
			this.anInt6956 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(46) Class3_Sub50 local46 = this.aClass3_Sub50Array1[arg0];
			if (local46 == null) {
				this.aBoolean587 = true;
				if (this.anInt6965 <= this.anInt6957) {
					@Pc(66) Class3_Sub50 local66 = (Class3_Sub50) this.aClass183_43.method4786();
					local46 = new Class3_Sub50(arg0, local66.anInt10096);
					this.aClass3_Sub50Array1[local66.anInt10094] = null;
					local66.method8412();
				} else {
					local46 = new Class3_Sub50(arg0, this.anInt6957);
					this.anInt6957++;
				}
				this.aClass3_Sub50Array1[arg0] = local46;
			} else {
				this.aBoolean587 = false;
			}
			this.aClass183_43.method4787(local46);
			return this.anIntArrayArrayArray9[local46.anInt10096];
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)V")
	public void method5792() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt6965; local8++) {
			this.anIntArrayArrayArray9[local8][0] = null;
			this.anIntArrayArrayArray9[local8][1] = null;
			this.anIntArrayArrayArray9[local8][2] = null;
			this.anIntArrayArrayArray9[local8] = null;
		}
		this.anIntArrayArrayArray9 = null;
		this.aClass3_Sub50Array1 = null;
		this.aClass183_43.method4790();
		this.aClass183_43 = null;
	}
}
