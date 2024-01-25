import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class98 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!sd;")
	private Class20 aClass20_1 = null;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "I")
	private int anInt2842 = 0;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	private int anInt2841 = 0;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_21;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "Lclient!sh;")
	private final Class189 aClass189_2;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "[Lclient!es;")
	private final Class29[] aClass29Array1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class98(@OriginalArg(0) Class32_Sub2 arg0) {
		this.aClass32_Sub2_21 = arg0;
		this.aClass189_2 = new Class189(arg0);
		this.aClass29Array1 = new Class29[9];
		this.aClass29Array1[1] = new Class29_Sub5(arg0);
		this.aClass29Array1[2] = new Class29_Sub3(arg0, this.aClass189_2);
		this.aClass29Array1[4] = new Class29_Sub6(arg0, this.aClass189_2);
		this.aClass29Array1[5] = new Class29_Sub2(arg0, this.aClass189_2);
		this.aClass29Array1[6] = new Class29_Sub4(arg0);
		this.aClass29Array1[7] = new Class29_Sub1(arg0);
		this.aClass29Array1[3] = new Class29_Sub7(arg0);
		this.aClass29Array1[8] = this.aClass29Array1[4];
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)Z")
	public boolean method2629() {
		return this.aClass29Array1[3].method5171();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!sd;B)Z")
	public boolean method2630(@OriginalArg(0) Class20 arg0) {
		if (this.anInt2842 == 0) {
			return false;
		}
		if (this.aClass20_1 != arg0) {
			this.aClass29Array1[Integer.MAX_VALUE & this.anInt2842].method5174(arg0);
			this.aClass20_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBZ)V")
	public void method2631(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (this.anInt2842 != 0 & (this.anInt2841 != arg0 | arg1)) {
			this.aClass29Array1[Integer.MAX_VALUE & this.anInt2842].method5176(arg0);
			this.anInt2841 = arg0;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZZI)V")
	public void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = arg1 & this.aClass32_Sub2_21.method2235();
		if (!local5 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt2842) {
			if (this.anInt2842 != 0) {
				this.aClass29Array1[Integer.MAX_VALUE & this.anInt2842].method5175();
			}
			if (arg0 != 0) {
				this.aClass29Array1[arg0 & Integer.MAX_VALUE].method5173(arg2);
				this.aClass29Array1[Integer.MAX_VALUE & arg0].method5172(arg2);
			}
			this.aClass20_1 = null;
			this.anInt2842 = arg0;
			this.anInt2841 = Integer.MIN_VALUE;
		} else if (this.anInt2842 != 0) {
			this.aClass29Array1[this.anInt2842 & Integer.MAX_VALUE].method5172(arg2);
		}
	}
}
