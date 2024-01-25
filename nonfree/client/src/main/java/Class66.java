import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class66 {

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	private int anInt1848 = 0;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!fg;")
	private Class20 aClass20_1 = null;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
	private int anInt1852 = 0;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
	private int anInt1856 = 0;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_14;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!rk;")
	private final Class215 aClass215_1;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "[Lclient!tt;")
	private final Class63[] aClass63Array1;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!qm;")
	public final Class63_Sub7 aClass63_Sub7_1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class66(@OriginalArg(0) Class163_Sub2 arg0) {
		this.aClass163_Sub2_14 = arg0;
		this.aClass215_1 = new Class215(arg0);
		this.aClass63Array1 = new Class63[10];
		this.aClass63Array1[1] = new Class63_Sub2(arg0);
		this.aClass63Array1[2] = new Class63_Sub5(arg0, this.aClass215_1);
		this.aClass63Array1[4] = new Class63_Sub9(arg0, this.aClass215_1);
		this.aClass63Array1[5] = new Class63_Sub6(arg0, this.aClass215_1);
		this.aClass63Array1[6] = new Class63_Sub1(arg0);
		this.aClass63Array1[7] = new Class63_Sub3(arg0);
		this.aClass63Array1[3] = this.aClass63_Sub7_1 = new Class63_Sub7(arg0);
		this.aClass63Array1[8] = new Class63_Sub4(arg0, this.aClass215_1);
		this.aClass63Array1[9] = new Class63_Sub8(arg0, this.aClass215_1);
		if (!this.aClass63Array1[8].method5723()) {
			this.aClass63Array1[8] = this.aClass63Array1[4];
		}
		if (!this.aClass63Array1[9].method5723()) {
			this.aClass63Array1[9] = this.aClass63Array1[8];
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZIZII)V")
	public void method1495(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg2 & this.aClass163_Sub2_14.method5552();
		if (!local5 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg3 = arg4;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt1856 != arg1) {
			if (this.anInt1856 != 0) {
				this.aClass63Array1[this.anInt1856 & Integer.MAX_VALUE].method5725();
			}
			if (arg1 != 0) {
				this.aClass63Array1[Integer.MAX_VALUE & arg1].method5722(arg0);
				this.aClass63Array1[arg1 & Integer.MAX_VALUE].method5724(arg0);
				this.aClass63Array1[arg1 & Integer.MAX_VALUE].method5727(arg4, arg3);
			}
			this.anInt1856 = arg1;
			this.aClass20_1 = null;
			this.anInt1852 = arg3;
			this.anInt1848 = arg4;
		} else if (this.anInt1856 != 0) {
			this.aClass63Array1[Integer.MAX_VALUE & this.anInt1856].method5724(arg0);
			if (arg4 != this.anInt1848 || this.anInt1852 != arg3) {
				this.aClass63Array1[Integer.MAX_VALUE & this.anInt1856].method5727(arg4, arg3);
				this.anInt1852 = arg3;
				this.anInt1848 = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!fg;IB)Z")
	public boolean method1496(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1856 == 0) {
			return false;
		}
		if (this.aClass20_1 != arg0) {
			this.aClass63Array1[Integer.MAX_VALUE & this.anInt1856].method5728(arg0, arg1);
			this.aClass20_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Z")
	public boolean method1500() {
		return this.aClass63Array1[3].method5723();
	}
}
