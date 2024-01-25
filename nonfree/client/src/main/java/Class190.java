import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class190 {

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	private int anInt6088 = 0;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
	private int anInt6089 = 0;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
	private int anInt6085 = 0;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_26;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "Lclient!faa;")
	private final Class91 aClass91_4;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "[Lclient!lda;")
	private final Class14[] aClass14Array1;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "Lclient!hs;")
	public final Class14_Sub5 aClass14_Sub5_1;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class190(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_26 = arg0;
		this.aClass91_4 = new Class91(arg0);
		this.aClass14Array1 = new Class14[10];
		this.aClass14Array1[1] = new Class14_Sub8(arg0);
		this.aClass14Array1[2] = new Class14_Sub3(arg0, this.aClass91_4);
		this.aClass14Array1[4] = new Class14_Sub2(arg0, this.aClass91_4);
		this.aClass14Array1[5] = new Class14_Sub9(arg0, this.aClass91_4);
		this.aClass14Array1[6] = new Class14_Sub7(arg0);
		this.aClass14Array1[7] = new Class14_Sub1(arg0);
		this.aClass14Array1[3] = this.aClass14_Sub5_1 = new Class14_Sub5(arg0);
		this.aClass14Array1[8] = new Class14_Sub6(arg0, this.aClass91_4);
		this.aClass14Array1[9] = new Class14_Sub4(arg0, this.aClass91_4);
		if (!this.aClass14Array1[8].method8549()) {
			this.aClass14Array1[8] = this.aClass14Array1[4];
		}
		if (!this.aClass14Array1[9].method8549()) {
			this.aClass14Array1[9] = this.aClass14Array1[8];
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!kp;I)Z")
	public boolean method5176(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6088 == 0) {
			return false;
		} else {
			this.aClass14Array1[Integer.MAX_VALUE & this.anInt6088].method8542(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZIIIZ)V")
	public void method5177(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg4 & this.aClass33_Sub3_26.method6235();
		if (!local9 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg3 = arg0;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt6088) {
			if (this.anInt6088 != 0) {
				this.aClass14Array1[Integer.MAX_VALUE & this.anInt6088].method8545();
			}
			if (arg2 != 0) {
				this.aClass14Array1[Integer.MAX_VALUE & arg2].method8543(arg1);
				this.aClass14Array1[arg2 & Integer.MAX_VALUE].method8550(arg1);
				this.aClass14Array1[arg2 & Integer.MAX_VALUE].method8544(arg3, arg0);
			}
			this.anInt6085 = arg0;
			this.anInt6088 = arg2;
			this.anInt6089 = arg3;
		} else if (this.anInt6088 != 0) {
			this.aClass14Array1[Integer.MAX_VALUE & this.anInt6088].method8550(arg1);
			if (this.anInt6085 != arg0 || arg3 != this.anInt6089) {
				this.aClass14Array1[this.anInt6088 & Integer.MAX_VALUE].method8544(arg3, arg0);
				this.anInt6089 = arg3;
				this.anInt6085 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Z")
	public boolean method5178() {
		return this.aClass14Array1[3].method8549();
	}
}
