import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class155 {

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	private int anInt3804 = 0;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!tp;")
	private Class20 aClass20_1 = null;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private int anInt3803 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_28;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!s;")
	private final Class213 aClass213_2;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[Lclient!fb;")
	private final Class7[] aClass7Array1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class155(@OriginalArg(0) Class63_Sub2 arg0) {
		this.aClass63_Sub2_28 = arg0;
		this.aClass213_2 = new Class213(arg0);
		this.aClass7Array1 = new Class7[9];
		this.aClass7Array1[1] = new Class7_Sub5(arg0);
		this.aClass7Array1[2] = new Class7_Sub6(arg0, this.aClass213_2);
		this.aClass7Array1[4] = new Class7_Sub1(arg0, this.aClass213_2);
		this.aClass7Array1[5] = new Class7_Sub7(arg0, this.aClass213_2);
		this.aClass7Array1[6] = new Class7_Sub2(arg0);
		this.aClass7Array1[7] = new Class7_Sub4(arg0);
		this.aClass7Array1[3] = new Class7_Sub3(arg0);
		this.aClass7Array1[8] = this.aClass7Array1[4];
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
	public boolean method3489() {
		return this.aClass7Array1[3].method5473();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BZI)V")
	public void method3490(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if ((arg0 | this.anInt3803 != arg1) & this.anInt3804 != 0) {
			this.aClass7Array1[this.anInt3804 & Integer.MAX_VALUE].method5474(arg1);
			this.anInt3803 = arg1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIZI)V")
	public void method3491(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg1 & this.aClass63_Sub2_28.method2012();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt3804 != arg2) {
			if (this.anInt3804 != 0) {
				this.aClass7Array1[this.anInt3804 & Integer.MAX_VALUE].method5472();
			}
			if (arg2 != 0) {
				this.aClass7Array1[Integer.MAX_VALUE & arg2].method5476(arg0);
				this.aClass7Array1[arg2 & Integer.MAX_VALUE].method5471(arg0);
			}
			this.anInt3804 = arg2;
			this.aClass20_1 = null;
			this.anInt3803 = Integer.MIN_VALUE;
		} else if (this.anInt3804 != 0) {
			this.aClass7Array1[Integer.MAX_VALUE & this.anInt3804].method5471(arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!tp;)Z")
	public boolean method3492(@OriginalArg(1) Class20 arg0) {
		if (this.anInt3804 == 0) {
			return false;
		}
		if (this.aClass20_1 != arg0) {
			this.aClass7Array1[this.anInt3804 & Integer.MAX_VALUE].method5475(arg0);
			this.aClass20_1 = arg0;
		}
		return true;
	}
}
