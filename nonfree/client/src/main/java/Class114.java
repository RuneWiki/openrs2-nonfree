import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class114 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!mo;")
	private Class28 aClass28_1 = null;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	private int anInt2954 = 0;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	private int anInt2955 = 0;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_24;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!mk;")
	private final Class135 aClass135_3;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "[Lclient!pr;")
	private final Class54[] aClass54Array1;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class114(@OriginalArg(0) Class81_Sub1 arg0) {
		this.aClass81_Sub1_24 = arg0;
		this.aClass135_3 = new Class135(arg0);
		this.aClass54Array1 = new Class54[9];
		this.aClass54Array1[1] = new Class54_Sub4(arg0);
		this.aClass54Array1[2] = new Class54_Sub5(arg0, this.aClass135_3);
		this.aClass54Array1[4] = new Class54_Sub1(arg0, this.aClass135_3);
		this.aClass54Array1[5] = new Class54_Sub2(arg0, this.aClass135_3);
		this.aClass54Array1[6] = new Class54_Sub6(arg0);
		this.aClass54Array1[7] = new Class54_Sub3(arg0);
		this.aClass54Array1[3] = new Class54_Sub7(arg0);
		this.aClass54Array1[8] = this.aClass54Array1[4];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIZ)V")
	public void method3142(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass81_Sub1_24.method2975();
		if (!local5 && (arg1 == 4 || arg1 == 8)) {
			arg1 = 2;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt2954) {
			if (this.anInt2954 != 0) {
				this.aClass54Array1[this.anInt2954 & Integer.MAX_VALUE].method5298();
			}
			if (arg1 != 0) {
				this.aClass54Array1[arg1 & Integer.MAX_VALUE].method5297(arg2);
				this.aClass54Array1[arg1 & Integer.MAX_VALUE].method5299(arg2);
			}
			this.aClass28_1 = null;
			this.anInt2955 = Integer.MIN_VALUE;
			this.anInt2954 = arg1;
		} else if (this.anInt2954 != 0) {
			this.aClass54Array1[this.anInt2954 & Integer.MAX_VALUE].method5299(arg2);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)V")
	public void method3143(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2954 != 0 & (arg1 != this.anInt2955 | arg0)) {
			this.aClass54Array1[this.anInt2954 & Integer.MAX_VALUE].method5300(arg1);
			this.anInt2955 = arg1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!mo;I)Z")
	public boolean method3144(@OriginalArg(0) Class28 arg0) {
		if (this.anInt2954 == 0) {
			return false;
		}
		if (this.aClass28_1 != arg0) {
			this.aClass54Array1[Integer.MAX_VALUE & this.anInt2954].method5296(arg0);
			this.aClass28_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z")
	public boolean method3145() {
		return this.aClass54Array1[3].method5295();
	}
}
