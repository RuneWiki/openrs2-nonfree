import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class192 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	private int anInt5415 = 0;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Lclient!mk;")
	private Class55 aClass55_1 = null;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	private int anInt5417 = 0;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	private int anInt5421 = 0;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_32;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!mc;")
	private final Class159 aClass159_2;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[Lclient!og;")
	private final Class62[] aClass62Array1;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "Lclient!e;")
	public final Class62_Sub1 aClass62_Sub1_1;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class192(@OriginalArg(0) Class49_Sub2 arg0) {
		this.aClass49_Sub2_32 = arg0;
		this.aClass159_2 = new Class159(arg0);
		this.aClass62Array1 = new Class62[10];
		this.aClass62Array1[1] = new Class62_Sub2(arg0);
		this.aClass62Array1[2] = new Class62_Sub4(arg0, this.aClass159_2);
		this.aClass62Array1[4] = new Class62_Sub5(arg0, this.aClass159_2);
		this.aClass62Array1[5] = new Class62_Sub9(arg0, this.aClass159_2);
		this.aClass62Array1[6] = new Class62_Sub3(arg0);
		this.aClass62Array1[7] = new Class62_Sub6(arg0);
		this.aClass62Array1[3] = this.aClass62_Sub1_1 = new Class62_Sub1(arg0);
		this.aClass62Array1[8] = new Class62_Sub8(arg0, this.aClass159_2);
		this.aClass62Array1[9] = new Class62_Sub7(arg0, this.aClass159_2);
		if (!this.aClass62Array1[8].method5821()) {
			this.aClass62Array1[8] = this.aClass62Array1[4];
		}
		if (!this.aClass62Array1[9].method5821()) {
			this.aClass62Array1[9] = this.aClass62Array1[8];
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZZI)V")
	public void method4334(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(9) boolean local9 = arg1 & this.aClass49_Sub2_32.method4442();
		if (!local9 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt5421) {
			if (this.anInt5421 != 0) {
				this.aClass62Array1[Integer.MAX_VALUE & this.anInt5421].method5829();
			}
			if (arg2 != 0) {
				this.aClass62Array1[Integer.MAX_VALUE & arg2].method5822(arg0);
				this.aClass62Array1[Integer.MAX_VALUE & arg2].method5825(arg0);
			}
			this.anInt5415 = Integer.MIN_VALUE;
			this.anInt5417 = Integer.MIN_VALUE;
			this.anInt5421 = arg2;
			this.aClass55_1 = null;
		} else if (this.anInt5421 != 0) {
			this.aClass62Array1[Integer.MAX_VALUE & this.anInt5421].method5825(arg0);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)Z")
	public boolean method4335() {
		return this.aClass62Array1[3].method5821();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLclient!mk;I)Z")
	public boolean method4337(@OriginalArg(1) Class55 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5421 == 0) {
			return false;
		}
		if (arg0 != this.aClass55_1) {
			this.aClass62Array1[this.anInt5421 & Integer.MAX_VALUE].method5830(arg0, arg1);
			this.aClass55_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
	public void method4339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5421 != 0 & (arg1 != this.anInt5415 | arg0 != this.anInt5417)) {
			this.aClass62Array1[Integer.MAX_VALUE & this.anInt5421].method5819(arg0, arg1);
			this.anInt5415 = arg1;
			this.anInt5417 = arg0;
		}
	}
}
