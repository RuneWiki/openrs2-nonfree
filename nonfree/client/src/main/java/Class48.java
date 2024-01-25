import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class48 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!nj;")
	private Class18 aClass18_1 = null;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	private int anInt1535 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	private int anInt1534 = 0;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_12;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!qf;")
	private final Class163 aClass163_2;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "[Lclient!np;")
	private final Class22[] aClass22Array1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class48(@OriginalArg(0) Class2_Sub1 arg0) {
		this.aClass2_Sub1_12 = arg0;
		this.aClass163_2 = new Class163(arg0);
		this.aClass22Array1 = new Class22[9];
		this.aClass22Array1[1] = new Class22_Sub3(arg0);
		this.aClass22Array1[2] = new Class22_Sub7(arg0, this.aClass163_2);
		this.aClass22Array1[4] = new Class22_Sub6(arg0, this.aClass163_2);
		this.aClass22Array1[5] = new Class22_Sub2(arg0, this.aClass163_2);
		this.aClass22Array1[6] = new Class22_Sub4(arg0);
		this.aClass22Array1[7] = new Class22_Sub5(arg0);
		this.aClass22Array1[3] = new Class22_Sub1(arg0);
		this.aClass22Array1[8] = this.aClass22Array1[4];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!nj;)Z")
	public boolean method1463(@OriginalArg(1) Class18 arg0) {
		if (this.anInt1534 == 0) {
			return false;
		}
		if (arg0 != this.aClass18_1) {
			this.aClass22Array1[Integer.MAX_VALUE & this.anInt1534].method5718(arg0);
			this.aClass18_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZZ)V")
	public void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt1534 != 0 & (arg0 != this.anInt1535 | arg1)) {
			this.aClass22Array1[Integer.MAX_VALUE & this.anInt1534].method5714(arg0);
			this.anInt1535 = arg0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z")
	public boolean method1465() {
		return this.aClass22Array1[3].method5719();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIZI)V")
	public void method1466(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = arg2 & this.aClass2_Sub1_12.method3243();
		if (!local5 && (arg1 == 4 || arg1 == 8)) {
			arg1 = 2;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt1534) {
			if (this.anInt1534 != 0) {
				this.aClass22Array1[Integer.MAX_VALUE & this.anInt1534].method5717();
			}
			if (arg1 != 0) {
				this.aClass22Array1[Integer.MAX_VALUE & arg1].method5716(arg0);
				this.aClass22Array1[arg1 & Integer.MAX_VALUE].method5715(arg0);
			}
			this.anInt1534 = arg1;
			this.aClass18_1 = null;
			this.anInt1535 = Integer.MIN_VALUE;
		} else if (this.anInt1534 != 0) {
			this.aClass22Array1[this.anInt1534 & Integer.MAX_VALUE].method5715(arg0);
		}
	}
}
