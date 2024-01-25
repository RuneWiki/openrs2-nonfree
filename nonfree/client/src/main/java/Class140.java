import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class140 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	private int anInt3515 = 0;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	private int anInt3516 = 0;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!ap;")
	private Class15 aClass15_1 = null;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_25;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!vq;")
	private final Class239 aClass239_2;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "[Lclient!wf;")
	private final Class30[] aClass30Array1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class140(@OriginalArg(0) Class164_Sub1 arg0) {
		this.aClass164_Sub1_25 = arg0;
		this.aClass239_2 = new Class239(arg0);
		this.aClass30Array1 = new Class30[9];
		this.aClass30Array1[1] = new Class30_Sub4(arg0);
		this.aClass30Array1[2] = new Class30_Sub1(arg0, this.aClass239_2);
		this.aClass30Array1[4] = new Class30_Sub7(arg0, this.aClass239_2);
		this.aClass30Array1[5] = new Class30_Sub6(arg0, this.aClass239_2);
		this.aClass30Array1[6] = new Class30_Sub2(arg0);
		this.aClass30Array1[7] = new Class30_Sub5(arg0);
		this.aClass30Array1[3] = new Class30_Sub3(arg0);
		this.aClass30Array1[8] = this.aClass30Array1[4];
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIZI)V")
	public void method2863(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass164_Sub1_25.method5379();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt3515) {
			if (this.anInt3515 != 0) {
				this.aClass30Array1[Integer.MAX_VALUE & this.anInt3515].method4842();
			}
			if (arg2 != 0) {
				this.aClass30Array1[Integer.MAX_VALUE & arg2].method4846(arg1);
				this.aClass30Array1[arg2 & Integer.MAX_VALUE].method4844(arg1);
			}
			this.anInt3515 = arg2;
			this.anInt3516 = Integer.MIN_VALUE;
			this.aClass15_1 = null;
		} else if (this.anInt3515 != 0) {
			this.aClass30Array1[Integer.MAX_VALUE & this.anInt3515].method4844(arg1);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
	public boolean method2864() {
		return this.aClass30Array1[3].method4843();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZII)V")
	public void method2865(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if ((arg0 | this.anInt3516 != arg1) & this.anInt3515 != 0) {
			this.aClass30Array1[this.anInt3515 & Integer.MAX_VALUE].method4845(arg1);
			this.anInt3516 = arg1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ap;B)Z")
	public boolean method2866(@OriginalArg(0) Class15 arg0) {
		if (this.anInt3515 == 0) {
			return false;
		}
		if (arg0 != this.aClass15_1) {
			this.aClass30Array1[Integer.MAX_VALUE & this.anInt3515].method4847(arg0);
			this.aClass15_1 = arg0;
		}
		return true;
	}
}
