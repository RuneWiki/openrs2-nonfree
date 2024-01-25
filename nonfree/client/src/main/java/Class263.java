import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class263 {

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
	private int anInt7309 = 0;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
	private int anInt7305 = 0;

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
	private int anInt7311 = 0;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "Lclient!ew;")
	private Class59 aClass59_1 = null;

	@OriginalMember(owner = "client!vv", name = "o", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_40;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "Lclient!bt;")
	private final Class30 aClass30_6;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "[Lclient!ue;")
	private final Class22[] aClass22Array1;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "Lclient!ck;")
	public final Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class263(@OriginalArg(0) Class51_Sub2 arg0) {
		this.aClass51_Sub2_40 = arg0;
		this.aClass30_6 = new Class30(arg0);
		this.aClass22Array1 = new Class22[10];
		this.aClass22Array1[1] = new Class22_Sub8(arg0);
		this.aClass22Array1[2] = new Class22_Sub7(arg0, this.aClass30_6);
		this.aClass22Array1[4] = new Class22_Sub1(arg0, this.aClass30_6);
		this.aClass22Array1[5] = new Class22_Sub5(arg0, this.aClass30_6);
		this.aClass22Array1[6] = new Class22_Sub6(arg0);
		this.aClass22Array1[7] = new Class22_Sub4(arg0);
		this.aClass22Array1[3] = this.aClass22_Sub2_1 = new Class22_Sub2(arg0);
		this.aClass22Array1[8] = new Class22_Sub9(arg0, this.aClass30_6);
		this.aClass22Array1[9] = new Class22_Sub3(arg0, this.aClass30_6);
		if (!this.aClass22Array1[8].method4106()) {
			this.aClass22Array1[8] = this.aClass22Array1[4];
		}
		if (!this.aClass22Array1[9].method4106()) {
			this.aClass22Array1[9] = this.aClass22Array1[8];
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)V")
	public void method5613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7311 != 0 & (arg1 != this.anInt7305 | this.anInt7309 != arg0)) {
			this.aClass22Array1[this.anInt7311 & Integer.MAX_VALUE].method4104(arg1, arg0);
			this.anInt7309 = arg0;
			this.anInt7305 = arg1;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BLclient!ew;I)Z")
	public boolean method5615(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7311 == 0) {
			return false;
		}
		if (arg0 != this.aClass59_1) {
			this.aClass22Array1[this.anInt7311 & Integer.MAX_VALUE].method4100(arg0, arg1);
			this.aClass59_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIZZ)V")
	public void method5616(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(9) boolean local9 = arg1 & this.aClass51_Sub2_40.method5348();
		if (!local9 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt7311) {
			if (this.anInt7311 != 0) {
				this.aClass22Array1[Integer.MAX_VALUE & this.anInt7311].method4103();
			}
			if (arg0 != 0) {
				this.aClass22Array1[arg0 & Integer.MAX_VALUE].method4101(arg2);
				this.aClass22Array1[Integer.MAX_VALUE & arg0].method4099(arg2);
			}
			this.aClass59_1 = null;
			this.anInt7311 = arg0;
			this.anInt7309 = Integer.MIN_VALUE;
			this.anInt7305 = Integer.MIN_VALUE;
		} else if (this.anInt7311 != 0) {
			this.aClass22Array1[Integer.MAX_VALUE & this.anInt7311].method4099(arg2);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI)Z")
	public boolean method5617() {
		return this.aClass22Array1[3].method4106();
	}
}
