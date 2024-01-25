import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class205 {

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
	private int anInt6881 = 0;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
	private int anInt6879 = 0;

	@OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
	private int anInt6885 = 0;

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_24;

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "Lclient!lc;")
	private final Class189 aClass189_4;

	@OriginalMember(owner = "client!mea", name = "l", descriptor = "[Lclient!vk;")
	private final Class19[] aClass19Array1;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "Lclient!an;")
	public final Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class205(@OriginalArg(0) Class20_Sub3 arg0) {
		this.aClass20_Sub3_24 = arg0;
		this.aClass189_4 = new Class189(arg0);
		this.aClass19Array1 = new Class19[10];
		this.aClass19Array1[1] = new Class19_Sub9(arg0);
		this.aClass19Array1[2] = new Class19_Sub3(arg0, this.aClass189_4);
		this.aClass19Array1[4] = new Class19_Sub7(arg0, this.aClass189_4);
		this.aClass19Array1[5] = new Class19_Sub5(arg0, this.aClass189_4);
		this.aClass19Array1[6] = new Class19_Sub2(arg0);
		this.aClass19Array1[7] = new Class19_Sub8(arg0);
		this.aClass19Array1[3] = this.aClass19_Sub1_1 = new Class19_Sub1(arg0);
		this.aClass19Array1[8] = new Class19_Sub6(arg0, this.aClass189_4);
		this.aClass19Array1[9] = new Class19_Sub4(arg0, this.aClass189_4);
		if (!this.aClass19Array1[8].method9165()) {
			this.aClass19Array1[8] = this.aClass19Array1[4];
		}
		if (!this.aClass19Array1[9].method9165()) {
			this.aClass19Array1[9] = this.aClass19Array1[8];
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZIIBZ)V")
	public void method5880(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg4 & this.aClass20_Sub3_24.method7242();
		if (!local9 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg3 = arg0;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt6879) {
			if (this.anInt6879 != 0) {
				this.aClass19Array1[Integer.MAX_VALUE & this.anInt6879].method9161();
			}
			if (arg2 != 0) {
				this.aClass19Array1[arg2 & Integer.MAX_VALUE].method9162(arg1);
				this.aClass19Array1[Integer.MAX_VALUE & arg2].method9167(arg1);
				this.aClass19Array1[arg2 & Integer.MAX_VALUE].method9164(arg0, arg3);
			}
			this.anInt6879 = arg2;
			this.anInt6881 = arg3;
			this.anInt6885 = arg0;
		} else if (this.anInt6879 != 0) {
			this.aClass19Array1[Integer.MAX_VALUE & this.anInt6879].method9167(arg1);
			if (this.anInt6885 != arg0 || this.anInt6881 != arg3) {
				this.aClass19Array1[Integer.MAX_VALUE & this.anInt6879].method9164(arg0, arg3);
				this.anInt6885 = arg0;
				this.anInt6881 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IBLclient!ud;)Z")
	public boolean method5881(@OriginalArg(0) int arg0, @OriginalArg(2) Class85 arg1) {
		if (this.anInt6879 == 0) {
			return false;
		} else {
			this.aClass19Array1[Integer.MAX_VALUE & this.anInt6879].method9168(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BI)Z")
	public boolean method5885() {
		return this.aClass19Array1[3].method9165();
	}
}
