import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class265 {

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
	private int anInt6721 = 0;

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "I")
	private int anInt6726 = 0;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
	private int anInt6719 = 0;

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_34;

	@OriginalMember(owner = "client!pea", name = "q", descriptor = "Lclient!fa;")
	private final Class101 aClass101_6;

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "[Lclient!eha;")
	private final Class18[] aClass18Array1;

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "Lclient!fn;")
	public final Class18_Sub5 aClass18_Sub5_1;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class265(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass95_Sub1_34 = arg0;
		this.aClass101_6 = new Class101(arg0);
		this.aClass18Array1 = new Class18[10];
		this.aClass18Array1[1] = new Class18_Sub1(arg0);
		this.aClass18Array1[2] = new Class18_Sub6(arg0, this.aClass101_6);
		this.aClass18Array1[4] = new Class18_Sub8(arg0, this.aClass101_6);
		this.aClass18Array1[5] = new Class18_Sub7(arg0, this.aClass101_6);
		this.aClass18Array1[6] = new Class18_Sub9(arg0);
		this.aClass18Array1[7] = new Class18_Sub3(arg0);
		this.aClass18Array1[3] = this.aClass18_Sub5_1 = new Class18_Sub5(arg0);
		this.aClass18Array1[8] = new Class18_Sub2(arg0, this.aClass101_6);
		this.aClass18Array1[9] = new Class18_Sub4(arg0, this.aClass101_6);
		if (!this.aClass18Array1[8].method7544()) {
			this.aClass18Array1[8] = this.aClass18Array1[4];
		}
		if (!this.aClass18Array1[9].method7544()) {
			this.aClass18Array1[9] = this.aClass18Array1[8];
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)Z")
	public boolean method5705() {
		return this.aClass18Array1[3].method7544();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZIIIZ)V")
	public void method5708(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(10) boolean local10 = arg1 & this.aClass95_Sub1_34.method6964();
		if (!local10 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg3 = arg0;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg4) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt6726) {
			if (this.anInt6726 != 0) {
				this.aClass18Array1[Integer.MAX_VALUE & this.anInt6726].method7551();
			}
			if (arg2 != 0) {
				this.aClass18Array1[Integer.MAX_VALUE & arg2].method7550(arg4);
				this.aClass18Array1[arg2 & Integer.MAX_VALUE].method7552(arg4);
				this.aClass18Array1[arg2 & Integer.MAX_VALUE].method7545(arg0, arg3);
			}
			this.anInt6721 = arg3;
			this.anInt6726 = arg2;
			this.anInt6719 = arg0;
		} else if (this.anInt6726 != 0) {
			this.aClass18Array1[Integer.MAX_VALUE & this.anInt6726].method7552(arg4);
			if (arg0 != this.anInt6719 || arg3 != this.anInt6721) {
				this.aClass18Array1[this.anInt6726 & Integer.MAX_VALUE].method7545(arg0, arg3);
				this.anInt6719 = arg0;
				this.anInt6721 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!hl;II)Z")
	public boolean method5709(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6726 == 0) {
			return false;
		} else {
			this.aClass18Array1[Integer.MAX_VALUE & this.anInt6726].method7546(arg1, arg0);
			return true;
		}
	}
}
