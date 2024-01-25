import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class174 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	private int anInt5755 = 0;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
	private int anInt5756 = 0;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!q;")
	private Class81 aClass81_1 = null;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_36;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Lclient!c;")
	private final Class31 aClass31_4;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "[Lclient!se;")
	private final Class67[] aClass67Array1;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class174(@OriginalArg(0) Class37_Sub1 arg0) {
		this.aClass37_Sub1_36 = arg0;
		this.aClass31_4 = new Class31(arg0);
		this.aClass67Array1 = new Class67[9];
		this.aClass67Array1[1] = new Class67_Sub7(arg0);
		this.aClass67Array1[2] = new Class67_Sub1(arg0, this.aClass31_4);
		this.aClass67Array1[4] = new Class67_Sub5(arg0, this.aClass31_4);
		this.aClass67Array1[5] = new Class67_Sub6(arg0, this.aClass31_4);
		this.aClass67Array1[6] = new Class67_Sub3(arg0);
		this.aClass67Array1[7] = new Class67_Sub2(arg0);
		this.aClass67Array1[3] = new Class67_Sub4(arg0);
		this.aClass67Array1[8] = this.aClass67Array1[4];
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)Z")
	public boolean method4841() {
		return this.aClass67Array1[3].method4168();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBZ)V")
	public void method4842(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (this.anInt5755 != 0 & (arg1 | arg0 != this.anInt5756)) {
			this.aClass67Array1[this.anInt5755 & Integer.MAX_VALUE].method4167(arg0);
			this.anInt5756 = arg0;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZZIZ)V")
	public void method4843(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass37_Sub1_36.method3722();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt5755 != arg2) {
			if (this.anInt5755 != 0) {
				this.aClass67Array1[this.anInt5755 & Integer.MAX_VALUE].method4166();
			}
			if (arg2 != 0) {
				this.aClass67Array1[arg2 & Integer.MAX_VALUE].method4163(arg1);
				this.aClass67Array1[arg2 & Integer.MAX_VALUE].method4164(arg1);
			}
			this.aClass81_1 = null;
			this.anInt5755 = arg2;
			this.anInt5756 = Integer.MIN_VALUE;
		} else if (this.anInt5755 != 0) {
			this.aClass67Array1[this.anInt5755 & Integer.MAX_VALUE].method4164(arg1);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!q;I)Z")
	public boolean method4844(@OriginalArg(0) Class81 arg0) {
		if (this.anInt5755 == 0) {
			return false;
		}
		if (this.aClass81_1 != arg0) {
			this.aClass67Array1[this.anInt5755 & Integer.MAX_VALUE].method4165(arg0);
			this.aClass81_1 = arg0;
		}
		return true;
	}
}
