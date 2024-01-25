import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class235 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!et;")
	private Class7 aClass7_1 = null;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	private int anInt6416 = 0;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	private int anInt6417 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_42;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Lclient!co;")
	private final Class37 aClass37_4;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[Lclient!rg;")
	private final Class8[] aClass8Array1;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class235(@OriginalArg(0) Class82_Sub2 arg0) {
		this.aClass82_Sub2_42 = arg0;
		this.aClass37_4 = new Class37(arg0);
		this.aClass8Array1 = new Class8[9];
		this.aClass8Array1[1] = new Class8_Sub1(arg0);
		this.aClass8Array1[2] = new Class8_Sub7(arg0, this.aClass37_4);
		this.aClass8Array1[4] = new Class8_Sub4(arg0, this.aClass37_4);
		this.aClass8Array1[5] = new Class8_Sub3(arg0, this.aClass37_4);
		this.aClass8Array1[6] = new Class8_Sub6(arg0);
		this.aClass8Array1[7] = new Class8_Sub2(arg0);
		this.aClass8Array1[3] = new Class8_Sub5(arg0);
		this.aClass8Array1[8] = this.aClass8Array1[4];
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)Z")
	public boolean method5532() {
		return this.aClass8Array1[3].method4892();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBZZ)V")
	public void method5533(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) boolean local5 = arg2 & this.aClass82_Sub2_42.method4475();
		if (!local5 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt6417) {
			if (this.anInt6417 != 0) {
				this.aClass8Array1[this.anInt6417 & Integer.MAX_VALUE].method4893();
			}
			if (arg0 != 0) {
				this.aClass8Array1[Integer.MAX_VALUE & arg0].method4896(arg1);
				this.aClass8Array1[arg0 & Integer.MAX_VALUE].method4891(arg1);
			}
			this.anInt6417 = arg0;
			this.anInt6416 = Integer.MIN_VALUE;
			this.aClass7_1 = null;
		} else if (this.anInt6417 != 0) {
			this.aClass8Array1[this.anInt6417 & Integer.MAX_VALUE].method4891(arg1);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!et;)Z")
	public boolean method5534(@OriginalArg(1) Class7 arg0) {
		if (this.anInt6417 == 0) {
			return false;
		}
		if (this.aClass7_1 != arg0) {
			this.aClass8Array1[Integer.MAX_VALUE & this.anInt6417].method4894(arg0);
			this.aClass7_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZI)V")
	public void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt6417 != 0 & (this.anInt6416 != arg0 | arg1)) {
			this.aClass8Array1[Integer.MAX_VALUE & this.anInt6417].method4895(arg0);
			this.anInt6416 = arg0;
		}
	}
}
