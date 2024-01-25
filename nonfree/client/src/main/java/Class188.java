import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class188 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!ac;")
	private Class4 aClass4_1 = null;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	private int anInt5398 = 0;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	private int anInt5402 = 0;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	private int anInt5404 = 0;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_30;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!ai;")
	private final Class9 aClass9_5;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "[Lclient!go;")
	private final Class29[] aClass29Array1;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Lclient!od;")
	public final Class29_Sub8 aClass29_Sub8_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class188(@OriginalArg(0) Class50_Sub1 arg0) {
		this.aClass50_Sub1_30 = arg0;
		this.aClass9_5 = new Class9(arg0);
		this.aClass29Array1 = new Class29[10];
		this.aClass29Array1[1] = new Class29_Sub6(arg0);
		this.aClass29Array1[2] = new Class29_Sub9(arg0, this.aClass9_5);
		this.aClass29Array1[4] = new Class29_Sub2(arg0, this.aClass9_5);
		this.aClass29Array1[5] = new Class29_Sub3(arg0, this.aClass9_5);
		this.aClass29Array1[6] = new Class29_Sub4(arg0);
		this.aClass29Array1[7] = new Class29_Sub5(arg0);
		this.aClass29Array1[3] = this.aClass29_Sub8_1 = new Class29_Sub8(arg0);
		this.aClass29Array1[8] = new Class29_Sub1(arg0, this.aClass9_5);
		this.aClass29Array1[9] = new Class29_Sub7(arg0, this.aClass9_5);
		if (!this.aClass29Array1[8].method5375()) {
			this.aClass29Array1[8] = this.aClass29Array1[4];
		}
		if (!this.aClass29Array1[9].method5375()) {
			this.aClass29Array1[9] = this.aClass29Array1[8];
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIZZ)V")
	public void method4311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		@Pc(13) boolean local13 = arg4 & this.aClass50_Sub1_30.method5813();
		if (!local13 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg0 = arg1;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg3) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt5402) {
			if (this.anInt5402 != 0) {
				this.aClass29Array1[Integer.MAX_VALUE & this.anInt5402].method5381();
			}
			if (arg2 != 0) {
				this.aClass29Array1[arg2 & Integer.MAX_VALUE].method5376(arg3);
				this.aClass29Array1[Integer.MAX_VALUE & arg2].method5383(arg3);
				this.aClass29Array1[arg2 & Integer.MAX_VALUE].method5378(arg1, arg0);
			}
			this.anInt5404 = arg1;
			this.anInt5402 = arg2;
			this.aClass4_1 = null;
			this.anInt5398 = arg0;
		} else if (this.anInt5402 != 0) {
			this.aClass29Array1[this.anInt5402 & Integer.MAX_VALUE].method5383(arg3);
			if (arg1 != this.anInt5404 || arg0 != this.anInt5398) {
				this.aClass29Array1[Integer.MAX_VALUE & this.anInt5402].method5378(arg1, arg0);
				this.anInt5398 = arg0;
				this.anInt5404 = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ac;II)Z")
	public boolean method4312(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5402 == 0) {
			return false;
		}
		if (arg0 != this.aClass4_1) {
			this.aClass29Array1[Integer.MAX_VALUE & this.anInt5402].method5382(arg1, arg0);
			this.aClass4_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)Z")
	public boolean method4315() {
		return this.aClass29Array1[3].method5375();
	}
}
