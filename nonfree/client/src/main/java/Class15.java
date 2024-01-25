import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class15 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	private int anInt369 = 0;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	private int anInt370 = 0;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Lclient!t;")
	private Class60 aClass60_1 = null;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_5;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!gk;")
	private final Class78 aClass78_1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "[Lclient!te;")
	private final Class33[] aClass33Array1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class15(@OriginalArg(0) Class55_Sub1 arg0) {
		this.aClass55_Sub1_5 = arg0;
		this.aClass78_1 = new Class78(arg0);
		this.aClass33Array1 = new Class33[9];
		this.aClass33Array1[1] = new Class33_Sub1(arg0);
		this.aClass33Array1[2] = new Class33_Sub7(arg0, this.aClass78_1);
		this.aClass33Array1[4] = new Class33_Sub2(arg0, this.aClass78_1);
		this.aClass33Array1[5] = new Class33_Sub6(arg0, this.aClass78_1);
		this.aClass33Array1[6] = new Class33_Sub5(arg0);
		this.aClass33Array1[7] = new Class33_Sub3(arg0);
		this.aClass33Array1[3] = new Class33_Sub4(arg0);
		this.aClass33Array1[8] = this.aClass33Array1[4];
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZZIB)V")
	public void method339(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(9) boolean local9 = arg0 & this.aClass55_Sub1_5.method5190();
		if (!local9 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt369) {
			if (this.anInt369 != 0) {
				this.aClass33Array1[this.anInt369 & Integer.MAX_VALUE].method6043();
			}
			if (arg2 != 0) {
				this.aClass33Array1[Integer.MAX_VALUE & arg2].method6046(arg1);
				this.aClass33Array1[arg2 & Integer.MAX_VALUE].method6042(arg1);
			}
			this.anInt370 = Integer.MIN_VALUE;
			this.anInt369 = arg2;
			this.aClass60_1 = null;
		} else if (this.anInt369 != 0) {
			this.aClass33Array1[Integer.MAX_VALUE & this.anInt369].method6042(arg1);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)Z")
	public boolean method340() {
		return this.aClass33Array1[3].method6041();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!t;B)Z")
	public boolean method341(@OriginalArg(0) Class60 arg0) {
		if (this.anInt369 == 0) {
			return false;
		}
		if (this.aClass60_1 != arg0) {
			this.aClass33Array1[Integer.MAX_VALUE & this.anInt369].method6045(arg0);
			this.aClass60_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZII)V")
	public void method342(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.anInt369 != 0 & (arg0 | arg1 != this.anInt370)) {
			this.aClass33Array1[this.anInt369 & Integer.MAX_VALUE].method6044(arg1);
			this.anInt370 = arg1;
		}
	}
}
