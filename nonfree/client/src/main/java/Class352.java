import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class352 {

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "I")
	private int anInt9791 = 0;

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
	private int anInt9792 = 0;

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
	private int anInt9794 = 0;

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_39;

	@OriginalMember(owner = "client!uga", name = "k", descriptor = "Lclient!sa;")
	private final Class314 aClass314_5;

	@OriginalMember(owner = "client!uga", name = "j", descriptor = "[Lclient!ef;")
	private final Class11[] aClass11Array1;

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "Lclient!lfa;")
	public final Class11_Sub5 aClass11_Sub5_1;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class352(@OriginalArg(0) Class132_Sub3 arg0) {
		this.aClass132_Sub3_39 = arg0;
		this.aClass314_5 = new Class314(arg0);
		this.aClass11Array1 = new Class11[10];
		this.aClass11Array1[1] = new Class11_Sub4(arg0);
		this.aClass11Array1[2] = new Class11_Sub2(arg0, this.aClass314_5);
		this.aClass11Array1[4] = new Class11_Sub8(arg0, this.aClass314_5);
		this.aClass11Array1[5] = new Class11_Sub9(arg0, this.aClass314_5);
		this.aClass11Array1[6] = new Class11_Sub7(arg0);
		this.aClass11Array1[7] = new Class11_Sub3(arg0);
		this.aClass11Array1[3] = this.aClass11_Sub5_1 = new Class11_Sub5(arg0);
		this.aClass11Array1[8] = new Class11_Sub6(arg0, this.aClass314_5);
		this.aClass11Array1[9] = new Class11_Sub1(arg0, this.aClass314_5);
		if (!this.aClass11Array1[8].method8991()) {
			this.aClass11Array1[8] = this.aClass11Array1[4];
		}
		if (!this.aClass11Array1[9].method8991()) {
			this.aClass11Array1[9] = this.aClass11Array1[8];
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IZIZII)V")
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = arg1 & this.aClass132_Sub3_39.method7503();
		if (!local15 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg4 = arg0;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg3) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt9794) {
			if (this.anInt9794 != 0) {
				this.aClass11Array1[this.anInt9794 & Integer.MAX_VALUE].method8982();
			}
			if (arg2 != 0) {
				this.aClass11Array1[Integer.MAX_VALUE & arg2].method8984(arg3);
				this.aClass11Array1[arg2 & Integer.MAX_VALUE].method8989(arg3);
				this.aClass11Array1[Integer.MAX_VALUE & arg2].method8987(arg4, arg0);
			}
			this.anInt9792 = arg4;
			this.anInt9794 = arg2;
			this.anInt9791 = arg0;
		} else if (this.anInt9794 != 0) {
			this.aClass11Array1[this.anInt9794 & Integer.MAX_VALUE].method8989(arg3);
			if (arg0 != this.anInt9791 || arg4 != this.anInt9792) {
				this.aClass11Array1[Integer.MAX_VALUE & this.anInt9794].method8987(arg4, arg0);
				this.anInt9792 = arg4;
				this.anInt9791 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)Z")
	public boolean method8274() {
		return this.aClass11Array1[3].method8991();
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IBLclient!wha;)Z")
	public boolean method8275(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		if (this.anInt9794 == 0) {
			return false;
		} else {
			this.aClass11Array1[Integer.MAX_VALUE & this.anInt9794].method8983(arg0, arg1);
			return true;
		}
	}
}
