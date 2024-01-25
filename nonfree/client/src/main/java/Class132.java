import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class132 {

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	private int anInt3550 = 0;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	private int anInt3549 = 0;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient!me;")
	private Class44 aClass44_1 = null;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_23;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Lclient!qg;")
	private final Class166 aClass166_3;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "[Lclient!km;")
	private final Class20[] aClass20Array1;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class132(@OriginalArg(0) Class105_Sub1 arg0) {
		this.aClass105_Sub1_23 = arg0;
		this.aClass166_3 = new Class166(arg0);
		this.aClass20Array1 = new Class20[9];
		this.aClass20Array1[1] = new Class20_Sub3(arg0);
		this.aClass20Array1[2] = new Class20_Sub5(arg0, this.aClass166_3);
		this.aClass20Array1[4] = new Class20_Sub4(arg0, this.aClass166_3);
		this.aClass20Array1[5] = new Class20_Sub1(arg0, this.aClass166_3);
		this.aClass20Array1[6] = new Class20_Sub2(arg0);
		this.aClass20Array1[7] = new Class20_Sub7(arg0);
		this.aClass20Array1[3] = new Class20_Sub6(arg0);
		this.aClass20Array1[8] = this.aClass20Array1[4];
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Z")
	public boolean method2997() {
		return this.aClass20Array1[3].method5683();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZB)V")
	public void method2998(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if ((arg1 | arg0 != this.anInt3550) & this.anInt3549 != 0) {
			this.aClass20Array1[Integer.MAX_VALUE & this.anInt3549].method5685(arg0);
			this.anInt3550 = arg0;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZZB)V")
	public void method2999(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = arg1 & this.aClass105_Sub1_23.method4235();
		if (!local5 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3549 != arg0) {
			if (this.anInt3549 != 0) {
				this.aClass20Array1[this.anInt3549 & Integer.MAX_VALUE].method5684();
			}
			if (arg0 != 0) {
				this.aClass20Array1[arg0 & Integer.MAX_VALUE].method5681(arg2);
				this.aClass20Array1[arg0 & Integer.MAX_VALUE].method5682(arg2);
			}
			this.anInt3550 = Integer.MIN_VALUE;
			this.anInt3549 = arg0;
			this.aClass44_1 = null;
		} else if (this.anInt3549 != 0) {
			this.aClass20Array1[Integer.MAX_VALUE & this.anInt3549].method5682(arg2);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLclient!me;)Z")
	public boolean method3000(@OriginalArg(1) Class44 arg0) {
		if (this.anInt3549 == 0) {
			return false;
		}
		if (this.aClass44_1 != arg0) {
			this.aClass20Array1[this.anInt3549 & Integer.MAX_VALUE].method5680(arg0);
			this.aClass44_1 = arg0;
		}
		return true;
	}
}
