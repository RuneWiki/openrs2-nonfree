import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
	private int anInt721;

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
	private int anInt723;

	@OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
	private int anInt726 = -1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80 && this.method546()) {
			@Pc(39) int local39 = (this.anInt723 == Static31.anInt857 ? arg0 : arg0 * this.anInt723 / Static31.anInt857) * this.anInt721;
			@Pc(43) int[] local43 = local7[0];
			@Pc(47) int[] local47 = local7[1];
			@Pc(51) int[] local51 = local7[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (Static115.anInt2578 == this.anInt721) {
				for (local57 = 0; local57 < Static115.anInt2578; local57++) {
					local65 = this.anIntArray72[local39++];
					local51[local57] = (local65 & 0xFF) << 4;
					local47[local57] = local65 >> 4 & 0xFF0;
					local43[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static115.anInt2578; local57++) {
					local65 = this.anInt721 * local57 / Static115.anInt2578;
					@Pc(113) int local113 = this.anIntArray72[local65 + local39];
					local51[local57] = (local113 & 0xFF) << 4;
					local47[local57] = local113 >> 4 & 0xFF0;
					local43[local57] = local113 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt726 = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z")
	private boolean method546() {
		if (this.anIntArray72 != null) {
			return true;
		} else if (this.anInt726 >= 0) {
			@Pc(18) int local18 = Static115.anInt2578;
			@Pc(20) int local20 = Static31.anInt857;
			@Pc(30) int local30 = Static29.anInterface2_1.method1318(this.anInt726) ? 64 : 128;
			this.anIntArray72 = Static29.anInterface2_1.method1317(this.anInt726);
			this.anInt723 = local30;
			this.anInt721 = local30;
			Static205.method3459(local18, local20);
			return this.anIntArray72 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
	@Override
	public void method3574() {
		super.method3574();
		this.anIntArray72 = null;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I")
	@Override
	public int method3575() {
		return this.anInt726;
	}
}
