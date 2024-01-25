import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class98 {

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	private int anInt2892 = 0;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	private int anInt2893 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!na;")
	private Class70 aClass70_1 = null;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_17;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!bo;")
	private final Class29 aClass29_1;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "[Lclient!ha;")
	private final Class87[] aClass87Array1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class98(@OriginalArg(0) Class92_Sub2 arg0) {
		this.aClass92_Sub2_17 = arg0;
		this.aClass29_1 = new Class29(arg0);
		this.aClass87Array1 = new Class87[9];
		this.aClass87Array1[1] = new Class87_Sub5(arg0);
		this.aClass87Array1[2] = new Class87_Sub3(arg0, this.aClass29_1);
		this.aClass87Array1[4] = new Class87_Sub7(arg0, this.aClass29_1);
		this.aClass87Array1[5] = new Class87_Sub6(arg0, this.aClass29_1);
		this.aClass87Array1[6] = new Class87_Sub4(arg0);
		this.aClass87Array1[7] = new Class87_Sub1(arg0);
		this.aClass87Array1[3] = new Class87_Sub2(arg0);
		this.aClass87Array1[8] = this.aClass87Array1[4];
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Z")
	public boolean method2568() {
		return this.aClass87Array1[3].method5656();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!na;B)Z")
	public boolean method2569(@OriginalArg(0) Class70 arg0) {
		if (this.anInt2893 == 0) {
			return false;
		}
		if (this.aClass70_1 != arg0) {
			this.aClass87Array1[this.anInt2893 & Integer.MAX_VALUE].method5654(arg0);
			this.aClass70_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZIZI)V")
	public void method2570(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg1 & this.aClass92_Sub2_17.method4460();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt2893 != arg2) {
			if (this.anInt2893 != 0) {
				this.aClass87Array1[this.anInt2893 & Integer.MAX_VALUE].method5651();
			}
			if (arg2 != 0) {
				this.aClass87Array1[arg2 & Integer.MAX_VALUE].method5653(arg0);
				this.aClass87Array1[Integer.MAX_VALUE & arg2].method5652(arg0);
			}
			this.anInt2893 = arg2;
			this.aClass70_1 = null;
			this.anInt2892 = Integer.MIN_VALUE;
		} else if (this.anInt2893 != 0) {
			this.aClass87Array1[this.anInt2893 & Integer.MAX_VALUE].method5652(arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZIZ)V")
	public void method2571(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2893 != 0 & (arg0 | arg1 != this.anInt2892)) {
			this.aClass87Array1[Integer.MAX_VALUE & this.anInt2893].method5655(arg1);
			this.anInt2892 = arg1;
		}
	}
}
