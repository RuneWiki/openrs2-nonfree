import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class323 {

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	private int anInt9265 = 0;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
	private int anInt9264 = 0;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	private int anInt9260 = 0;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_34;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!an;")
	private final Class19 aClass19_4;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "[Lclient!ut;")
	private final Class31[] aClass31Array1;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Lclient!op;")
	public final Class31_Sub5 aClass31_Sub5_1;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class323(@OriginalArg(0) Class101_Sub2 arg0) {
		this.aClass101_Sub2_34 = arg0;
		this.aClass19_4 = new Class19(arg0);
		this.aClass31Array1 = new Class31[10];
		this.aClass31Array1[1] = new Class31_Sub7(arg0);
		this.aClass31Array1[2] = new Class31_Sub6(arg0, this.aClass19_4);
		this.aClass31Array1[4] = new Class31_Sub9(arg0, this.aClass19_4);
		this.aClass31Array1[5] = new Class31_Sub3(arg0, this.aClass19_4);
		this.aClass31Array1[6] = new Class31_Sub2(arg0);
		this.aClass31Array1[7] = new Class31_Sub8(arg0);
		this.aClass31Array1[3] = this.aClass31_Sub5_1 = new Class31_Sub5(arg0);
		this.aClass31Array1[8] = new Class31_Sub4(arg0, this.aClass19_4);
		this.aClass31Array1[9] = new Class31_Sub1(arg0, this.aClass19_4);
		if (!this.aClass31Array1[8].method9604()) {
			this.aClass31Array1[8] = this.aClass31Array1[4];
		}
		if (!this.aClass31Array1[9].method9604()) {
			this.aClass31Array1[9] = this.aClass31Array1[8];
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZIIZ)V")
	public void method8171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg4 & this.aClass101_Sub2_34.method8102();
		if (!local9 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg3 = arg0;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt9260) {
			if (this.anInt9260 != 0) {
				this.aClass31Array1[Integer.MAX_VALUE & this.anInt9260].method9597();
			}
			if (arg1 != 0) {
				this.aClass31Array1[arg1 & Integer.MAX_VALUE].method9600(arg2);
				this.aClass31Array1[Integer.MAX_VALUE & arg1].method9602(arg2);
				this.aClass31Array1[arg1 & Integer.MAX_VALUE].method9603(arg0, arg3);
			}
			this.anInt9265 = arg0;
			this.anInt9260 = arg1;
			this.anInt9264 = arg3;
		} else if (this.anInt9260 != 0) {
			this.aClass31Array1[this.anInt9260 & Integer.MAX_VALUE].method9602(arg2);
			if (arg0 != this.anInt9265 || arg3 != this.anInt9264) {
				this.aClass31Array1[Integer.MAX_VALUE & this.anInt9260].method9603(arg0, arg3);
				this.anInt9264 = arg3;
				this.anInt9265 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!fga;I)Z")
	public boolean method8172(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9260 == 0) {
			return false;
		} else {
			this.aClass31Array1[Integer.MAX_VALUE & this.anInt9260].method9598(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)Z")
	public boolean method8175() {
		return this.aClass31Array1[3].method9604();
	}
}
