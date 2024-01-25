import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class157 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	private int anInt4600 = 0;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
	private int anInt4599 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Lclient!fl;")
	private Class11 aClass11_1 = null;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_32;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!de;")
	private final Class44 aClass44_3;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "[Lclient!t;")
	private final Class23[] aClass23Array1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class157(@OriginalArg(0) Class59_Sub1 arg0) {
		this.aClass59_Sub1_32 = arg0;
		this.aClass44_3 = new Class44(arg0);
		this.aClass23Array1 = new Class23[9];
		this.aClass23Array1[1] = new Class23_Sub4(arg0);
		this.aClass23Array1[2] = new Class23_Sub5(arg0, this.aClass44_3);
		this.aClass23Array1[4] = new Class23_Sub7(arg0, this.aClass44_3);
		this.aClass23Array1[5] = new Class23_Sub1(arg0, this.aClass44_3);
		this.aClass23Array1[6] = new Class23_Sub2(arg0);
		this.aClass23Array1[7] = new Class23_Sub6(arg0);
		this.aClass23Array1[3] = new Class23_Sub3(arg0);
		this.aClass23Array1[8] = this.aClass23Array1[4];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!fl;)Z")
	public boolean method4037(@OriginalArg(1) Class11 arg0) {
		if (this.anInt4600 == 0) {
			return false;
		}
		if (arg0 != this.aClass11_1) {
			this.aClass23Array1[this.anInt4600 & Integer.MAX_VALUE].method5763(arg0);
			this.aClass11_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZI)V")
	public void method4038(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4600 != 0 & (this.anInt4599 != arg1 | arg0)) {
			this.aClass23Array1[this.anInt4600 & Integer.MAX_VALUE].method5765(arg1);
			this.anInt4599 = arg1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBZZ)V")
	public void method4039(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) boolean local5 = arg2 & this.aClass59_Sub1_32.method4818();
		if (!local5 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt4600 != arg0) {
			if (this.anInt4600 != 0) {
				this.aClass23Array1[Integer.MAX_VALUE & this.anInt4600].method5762();
			}
			if (arg0 != 0) {
				this.aClass23Array1[arg0 & Integer.MAX_VALUE].method5767(arg1);
				this.aClass23Array1[Integer.MAX_VALUE & arg0].method5766(arg1);
			}
			this.anInt4600 = arg0;
			this.aClass11_1 = null;
			this.anInt4599 = Integer.MIN_VALUE;
		} else if (this.anInt4600 != 0) {
			this.aClass23Array1[this.anInt4600 & Integer.MAX_VALUE].method5766(arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z")
	public boolean method4040() {
		return this.aClass23Array1[3].method5764();
	}
}
