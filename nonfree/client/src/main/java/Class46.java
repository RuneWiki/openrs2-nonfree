import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class46 {

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
	private int anInt1826 = 0;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	private int anInt1825 = 0;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Lclient!jl;")
	private Class20 aClass20_1 = null;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
	private int anInt1828 = 0;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_9;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "Lclient!wq;")
	private final Class319 aClass319_3;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "[Lclient!jh;")
	private final Class35[] aClass35Array1;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!ir;")
	public final Class35_Sub5 aClass35_Sub5_1;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class46(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aClass9_Sub3_9 = arg0;
		this.aClass319_3 = new Class319(arg0);
		this.aClass35Array1 = new Class35[10];
		this.aClass35Array1[1] = new Class35_Sub9(arg0);
		this.aClass35Array1[2] = new Class35_Sub6(arg0, this.aClass319_3);
		this.aClass35Array1[4] = new Class35_Sub1(arg0, this.aClass319_3);
		this.aClass35Array1[5] = new Class35_Sub3(arg0, this.aClass319_3);
		this.aClass35Array1[6] = new Class35_Sub8(arg0);
		this.aClass35Array1[7] = new Class35_Sub4(arg0);
		this.aClass35Array1[3] = this.aClass35_Sub5_1 = new Class35_Sub5(arg0);
		this.aClass35Array1[8] = new Class35_Sub7(arg0, this.aClass319_3);
		this.aClass35Array1[9] = new Class35_Sub2(arg0, this.aClass319_3);
		if (!this.aClass35Array1[8].method7414()) {
			this.aClass35Array1[8] = this.aClass35Array1[4];
		}
		if (!this.aClass35Array1[9].method7414()) {
			this.aClass35Array1[9] = this.aClass35Array1[8];
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!jl;BI)Z")
	public boolean method1760(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1825 == 0) {
			return false;
		}
		if (arg0 != this.aClass20_1) {
			this.aClass35Array1[this.anInt1825 & Integer.MAX_VALUE].method7420(arg1, arg0);
			this.aClass20_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)Z")
	public boolean method1761() {
		return this.aClass35Array1[3].method7414();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIBZZI)V")
	public void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(9) boolean local9 = arg2 & this.aClass9_Sub3_9.method7622();
		if (!local9 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg4 = arg0;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg3) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt1825) {
			if (this.anInt1825 != 0) {
				this.aClass35Array1[this.anInt1825 & Integer.MAX_VALUE].method7418();
			}
			if (arg1 != 0) {
				this.aClass35Array1[Integer.MAX_VALUE & arg1].method7416(arg3);
				this.aClass35Array1[Integer.MAX_VALUE & arg1].method7417(arg3);
				this.aClass35Array1[arg1 & Integer.MAX_VALUE].method7419(arg4, arg0);
			}
			this.aClass20_1 = null;
			this.anInt1826 = arg4;
			this.anInt1825 = arg1;
			this.anInt1828 = arg0;
		} else if (this.anInt1825 != 0) {
			this.aClass35Array1[Integer.MAX_VALUE & this.anInt1825].method7417(arg3);
			if (arg0 != this.anInt1828 || this.anInt1826 != arg4) {
				this.aClass35Array1[Integer.MAX_VALUE & this.anInt1825].method7419(arg4, arg0);
				this.anInt1828 = arg0;
				this.anInt1826 = arg4;
			}
			return;
		}
	}
}
