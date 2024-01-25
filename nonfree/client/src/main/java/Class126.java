import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class126 {

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
	private int anInt3933 = 0;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
	private int anInt3932 = 0;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Lclient!gd;")
	private Class66 aClass66_1 = null;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_24;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "Lclient!tk;")
	private final Class192 aClass192_3;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "[Lclient!sc;")
	private final Class43[] aClass43Array1;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class126(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aClass122_Sub2_24 = arg0;
		this.aClass192_3 = new Class192(arg0);
		this.aClass43Array1 = new Class43[9];
		this.aClass43Array1[1] = new Class43_Sub5(arg0);
		this.aClass43Array1[2] = new Class43_Sub4(arg0, this.aClass192_3);
		this.aClass43Array1[4] = new Class43_Sub2(arg0, this.aClass192_3);
		this.aClass43Array1[5] = new Class43_Sub8(arg0, this.aClass192_3);
		this.aClass43Array1[6] = new Class43_Sub7(arg0);
		this.aClass43Array1[7] = new Class43_Sub6(arg0);
		this.aClass43Array1[3] = new Class43_Sub3(arg0);
		this.aClass43Array1[8] = new Class43_Sub1(arg0);
		if (!this.aClass43Array1[8].method4383()) {
			this.aClass43Array1[8] = this.aClass43Array1[4];
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!gd;I)Z")
	public boolean method3374(@OriginalArg(0) Class66 arg0) {
		if (this.anInt3932 == 0) {
			return false;
		}
		if (arg0 != this.aClass66_1) {
			this.aClass43Array1[Integer.MAX_VALUE & this.anInt3932].method4385(arg0);
			this.aClass66_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)Z")
	public boolean method3375() {
		return this.aClass43Array1[3].method4383();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZBI)V")
	public void method3376(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3932 != 0 & (arg0 | this.anInt3933 != arg1)) {
			this.aClass43Array1[this.anInt3932 & Integer.MAX_VALUE].method4381(arg1);
			this.anInt3933 = arg1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BZZI)V")
	public void method3377(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass122_Sub2_24.method4715();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt3932) {
			if (this.anInt3932 != 0) {
				this.aClass43Array1[this.anInt3932 & Integer.MAX_VALUE].method4382();
			}
			if (arg2 != 0) {
				this.aClass43Array1[arg2 & Integer.MAX_VALUE].method4386(arg1);
				this.aClass43Array1[Integer.MAX_VALUE & arg2].method4384(arg1);
			}
			this.anInt3933 = Integer.MIN_VALUE;
			this.aClass66_1 = null;
			this.anInt3932 = arg2;
		} else if (this.anInt3932 != 0) {
			this.aClass43Array1[this.anInt3932 & Integer.MAX_VALUE].method4384(arg1);
		}
	}
}
