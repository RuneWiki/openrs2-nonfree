import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class80 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
	private int anInt2021 = 0;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
	private int anInt2029 = 0;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
	private int anInt2030 = 0;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_7;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "Lclient!ah;")
	private final Class12 aClass12_2;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "[Lclient!ie;")
	private final Class39[] aClass39Array1;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!de;")
	public final Class39_Sub3 aClass39_Sub3_1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class80(@OriginalArg(0) Class133_Sub3 arg0) {
		this.aClass133_Sub3_7 = arg0;
		this.aClass12_2 = new Class12(arg0);
		this.aClass39Array1 = new Class39[10];
		this.aClass39Array1[1] = new Class39_Sub6(arg0);
		this.aClass39Array1[2] = new Class39_Sub8(arg0, this.aClass12_2);
		this.aClass39Array1[4] = new Class39_Sub5(arg0, this.aClass12_2);
		this.aClass39Array1[5] = new Class39_Sub7(arg0, this.aClass12_2);
		this.aClass39Array1[6] = new Class39_Sub4(arg0);
		this.aClass39Array1[7] = new Class39_Sub1(arg0);
		this.aClass39Array1[3] = this.aClass39_Sub3_1 = new Class39_Sub3(arg0);
		this.aClass39Array1[8] = new Class39_Sub9(arg0, this.aClass12_2);
		this.aClass39Array1[9] = new Class39_Sub2(arg0, this.aClass12_2);
		if (!this.aClass39Array1[8].method8865()) {
			this.aClass39Array1[8] = this.aClass39Array1[4];
		}
		if (!this.aClass39Array1[9].method8865()) {
			this.aClass39Array1[9] = this.aClass39Array1[8];
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)Z")
	public boolean method1671() {
		return this.aClass39Array1[3].method8865();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZZIB)V")
	public void method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(5) boolean local5 = arg2 & this.aClass133_Sub3_7.method7254();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg1 = arg0;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg3) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt2029) {
			if (this.anInt2029 != 0) {
				this.aClass39Array1[this.anInt2029 & Integer.MAX_VALUE].method8866();
			}
			if (arg4 != 0) {
				this.aClass39Array1[arg4 & Integer.MAX_VALUE].method8863(arg3);
				this.aClass39Array1[arg4 & Integer.MAX_VALUE].method8862(arg3);
				this.aClass39Array1[Integer.MAX_VALUE & arg4].method8860(arg0, arg1);
			}
			this.anInt2021 = arg1;
			this.anInt2030 = arg0;
			this.anInt2029 = arg4;
		} else if (this.anInt2029 != 0) {
			this.aClass39Array1[this.anInt2029 & Integer.MAX_VALUE].method8862(arg3);
			if (arg0 != this.anInt2030 || arg1 != this.anInt2021) {
				this.aClass39Array1[Integer.MAX_VALUE & this.anInt2029].method8860(arg0, arg1);
				this.anInt2030 = arg0;
				this.anInt2021 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!nba;IZ)Z")
	public boolean method1673(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2029 == 0) {
			return false;
		} else {
			this.aClass39Array1[this.anInt2029 & Integer.MAX_VALUE].method8864(arg1, arg0);
			return true;
		}
	}
}
