import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class224 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	private int anInt5855 = 0;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	private int anInt5856 = 0;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!hf;")
	private Class114 aClass114_1 = null;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	private int anInt5859 = 0;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_26;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!hm;")
	private final Class145 aClass145_4;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "[Lclient!pi;")
	private final Class44[] aClass44Array1;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Lclient!caa;")
	public final Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class224(@OriginalArg(0) Class66_Sub3 arg0) {
		this.aClass66_Sub3_26 = arg0;
		this.aClass145_4 = new Class145(arg0);
		this.aClass44Array1 = new Class44[10];
		this.aClass44Array1[1] = new Class44_Sub4(arg0);
		this.aClass44Array1[2] = new Class44_Sub7(arg0, this.aClass145_4);
		this.aClass44Array1[4] = new Class44_Sub8(arg0, this.aClass145_4);
		this.aClass44Array1[5] = new Class44_Sub5(arg0, this.aClass145_4);
		this.aClass44Array1[6] = new Class44_Sub9(arg0);
		this.aClass44Array1[7] = new Class44_Sub6(arg0);
		this.aClass44Array1[3] = this.aClass44_Sub1_1 = new Class44_Sub1(arg0);
		this.aClass44Array1[8] = new Class44_Sub2(arg0, this.aClass145_4);
		this.aClass44Array1[9] = new Class44_Sub3(arg0, this.aClass145_4);
		if (!this.aClass44Array1[8].method7484()) {
			this.aClass44Array1[8] = this.aClass44Array1[4];
		}
		if (!this.aClass44Array1[9].method7484()) {
			this.aClass44Array1[9] = this.aClass44Array1[8];
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZZIIZ)V")
	public void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) boolean local9 = arg1 & this.aClass66_Sub3_26.method6778();
		if (!local9 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg3 = arg0;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt5856 != arg4) {
			if (this.anInt5856 != 0) {
				this.aClass44Array1[Integer.MAX_VALUE & this.anInt5856].method7482();
			}
			if (arg4 != 0) {
				this.aClass44Array1[Integer.MAX_VALUE & arg4].method7477(arg2);
				this.aClass44Array1[arg4 & Integer.MAX_VALUE].method7479(arg2);
				this.aClass44Array1[arg4 & Integer.MAX_VALUE].method7476(arg3, arg0);
			}
			this.aClass114_1 = null;
			this.anInt5859 = arg0;
			this.anInt5855 = arg3;
			this.anInt5856 = arg4;
		} else if (this.anInt5856 != 0) {
			this.aClass44Array1[Integer.MAX_VALUE & this.anInt5856].method7479(arg2);
			if (arg0 != this.anInt5859 || this.anInt5855 != arg3) {
				this.aClass44Array1[Integer.MAX_VALUE & this.anInt5856].method7476(arg3, arg0);
				this.anInt5859 = arg0;
				this.anInt5855 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!hf;I)Z")
	public boolean method4947(@OriginalArg(1) Class114 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5856 == 0) {
			return false;
		}
		if (this.aClass114_1 != arg0) {
			this.aClass44Array1[this.anInt5856 & Integer.MAX_VALUE].method7478(arg1, arg0);
			this.aClass114_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)Z")
	public boolean method4948() {
		return this.aClass44Array1[3].method7484();
	}
}
