import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class220 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
	private int anInt5709 = 0;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Lclient!sv;")
	private Class23 aClass23_1 = null;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	private int anInt5714 = 0;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	private int anInt5713 = 0;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_35;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Lclient!pq;")
	private final Class202 aClass202_4;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "[Lclient!kd;")
	private final Class69[] aClass69Array1;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "Lclient!qb;")
	public final Class69_Sub6 aClass69_Sub6_1;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class220(@OriginalArg(0) Class117_Sub1 arg0) {
		this.aClass117_Sub1_35 = arg0;
		this.aClass202_4 = new Class202(arg0);
		this.aClass69Array1 = new Class69[10];
		this.aClass69Array1[1] = new Class69_Sub8(arg0);
		this.aClass69Array1[2] = new Class69_Sub2(arg0, this.aClass202_4);
		this.aClass69Array1[4] = new Class69_Sub9(arg0, this.aClass202_4);
		this.aClass69Array1[5] = new Class69_Sub7(arg0, this.aClass202_4);
		this.aClass69Array1[6] = new Class69_Sub4(arg0);
		this.aClass69Array1[7] = new Class69_Sub5(arg0);
		this.aClass69Array1[3] = this.aClass69_Sub6_1 = new Class69_Sub6(arg0);
		this.aClass69Array1[8] = new Class69_Sub1(arg0, this.aClass202_4);
		this.aClass69Array1[9] = new Class69_Sub3(arg0, this.aClass202_4);
		if (!this.aClass69Array1[8].method5852()) {
			this.aClass69Array1[8] = this.aClass69Array1[4];
		}
		if (!this.aClass69Array1[9].method5852()) {
			this.aClass69Array1[9] = this.aClass69Array1[8];
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILclient!sv;)Z")
	public boolean method4613(@OriginalArg(1) int arg0, @OriginalArg(2) Class23 arg1) {
		if (this.anInt5713 == 0) {
			return false;
		}
		if (this.aClass23_1 != arg1) {
			this.aClass69Array1[Integer.MAX_VALUE & this.anInt5713].method5863(arg1, arg0);
			this.aClass23_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)Z")
	public boolean method4614() {
		return this.aClass69Array1[3].method5852();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZZIIII)V")
	public void method4615(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) boolean local5 = arg1 & this.aClass117_Sub1_35.method5725();
		if (!local5 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg4 = arg2;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg0) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (this.anInt5713 != arg3) {
			if (this.anInt5713 != 0) {
				this.aClass69Array1[Integer.MAX_VALUE & this.anInt5713].method5853();
			}
			if (arg3 != 0) {
				this.aClass69Array1[arg3 & Integer.MAX_VALUE].method5862(arg0);
				this.aClass69Array1[Integer.MAX_VALUE & arg3].method5861(arg0);
				this.aClass69Array1[arg3 & Integer.MAX_VALUE].method5857(arg4, arg2);
			}
			this.anInt5713 = arg3;
			this.anInt5709 = arg2;
			this.anInt5714 = arg4;
			this.aClass23_1 = null;
		} else if (this.anInt5713 != 0) {
			this.aClass69Array1[Integer.MAX_VALUE & this.anInt5713].method5861(arg0);
			if (arg2 != this.anInt5709 || this.anInt5714 != arg4) {
				this.aClass69Array1[this.anInt5713 & Integer.MAX_VALUE].method5857(arg4, arg2);
				this.anInt5709 = arg2;
				this.anInt5714 = arg4;
			}
		}
	}
}
