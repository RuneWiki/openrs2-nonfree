import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	private int anInt15 = 0;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	private int anInt14 = 0;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	private int anInt18 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!pia;")
	private final Class288 aClass288_1;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "[Lclient!hs;")
	private final Class160[] aClass160Array1;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!tp;")
	public final Class160_Sub9 aClass160_Sub9_1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class3(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_1 = arg0;
		this.aClass288_1 = new Class288(arg0);
		this.aClass160Array1 = new Class160[10];
		this.aClass160Array1[1] = new Class160_Sub8(arg0);
		this.aClass160Array1[2] = new Class160_Sub2(arg0, this.aClass288_1);
		this.aClass160Array1[4] = new Class160_Sub6(arg0, this.aClass288_1);
		this.aClass160Array1[5] = new Class160_Sub5(arg0, this.aClass288_1);
		this.aClass160Array1[6] = new Class160_Sub4(arg0);
		this.aClass160Array1[7] = new Class160_Sub1(arg0);
		this.aClass160Array1[3] = this.aClass160_Sub9_1 = new Class160_Sub9(arg0);
		this.aClass160Array1[8] = new Class160_Sub7(arg0, this.aClass288_1);
		this.aClass160Array1[9] = new Class160_Sub3(arg0, this.aClass288_1);
		if (!this.aClass160Array1[8].method8062()) {
			this.aClass160Array1[8] = this.aClass160Array1[4];
		}
		if (!this.aClass160Array1[9].method8062()) {
			this.aClass160Array1[9] = this.aClass160Array1[8];
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Z")
	public boolean method27() {
		return this.aClass160Array1[3].method8062();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!gb;I)Z")
	public boolean method30(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1) {
		if (this.anInt18 == 0) {
			return false;
		} else {
			this.aClass160Array1[Integer.MAX_VALUE & this.anInt18].method8067(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZIIZ)V")
	public void method32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(17) boolean local17 = arg4 & this.aClass100_Sub3_1.method8631();
		if (!local17 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg3 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt18 != arg0) {
			if (this.anInt18 != 0) {
				this.aClass160Array1[Integer.MAX_VALUE & this.anInt18].method8061();
			}
			if (arg0 != 0) {
				this.aClass160Array1[Integer.MAX_VALUE & arg0].method8065(arg2);
				this.aClass160Array1[Integer.MAX_VALUE & arg0].method8066(arg2);
				this.aClass160Array1[Integer.MAX_VALUE & arg0].method8063(arg1, arg3);
			}
			this.anInt18 = arg0;
			this.anInt15 = arg3;
			this.anInt14 = arg1;
		} else if (this.anInt18 != 0) {
			this.aClass160Array1[Integer.MAX_VALUE & this.anInt18].method8066(arg2);
			if (this.anInt14 != arg1 || this.anInt15 != arg3) {
				this.aClass160Array1[Integer.MAX_VALUE & this.anInt18].method8063(arg1, arg3);
				this.anInt15 = arg3;
				this.anInt14 = arg1;
			}
		}
	}
}
