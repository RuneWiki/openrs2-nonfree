import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class196 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	private int anInt6395 = 0;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	private int anInt6396 = 0;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!lp;")
	private Class124 aClass124_1 = null;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_38;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!im;")
	private final Class91 aClass91_4;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "[Lclient!oi;")
	private final Class35[] aClass35Array1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class196(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass4_Sub1_38 = arg0;
		this.aClass91_4 = new Class91(arg0);
		this.aClass35Array1 = new Class35[9];
		this.aClass35Array1[1] = new Class35_Sub2(arg0);
		this.aClass35Array1[2] = new Class35_Sub6(arg0, this.aClass91_4);
		this.aClass35Array1[4] = new Class35_Sub4(arg0, this.aClass91_4);
		this.aClass35Array1[5] = new Class35_Sub3(arg0, this.aClass91_4);
		this.aClass35Array1[6] = new Class35_Sub1(arg0);
		this.aClass35Array1[7] = new Class35_Sub5(arg0);
		this.aClass35Array1[3] = new Class35_Sub7(arg0);
		this.aClass35Array1[8] = this.aClass35Array1[4];
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZI)V")
	public void method5559(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if ((arg1 != this.anInt6395 | arg0) & this.anInt6396 != 0) {
			this.aClass35Array1[this.anInt6396 & Integer.MAX_VALUE].method5198(arg1);
			this.anInt6395 = arg1;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZIZ)V")
	public void method5560(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) boolean local5 = arg1 & this.aClass4_Sub1_38.method4228();
		if (!local5 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt6396 != arg0) {
			if (this.anInt6396 != 0) {
				this.aClass35Array1[Integer.MAX_VALUE & this.anInt6396].method5197();
			}
			if (arg0 != 0) {
				this.aClass35Array1[arg0 & Integer.MAX_VALUE].method5195(arg2);
				this.aClass35Array1[arg0 & Integer.MAX_VALUE].method5200(arg2);
			}
			this.aClass124_1 = null;
			this.anInt6395 = Integer.MIN_VALUE;
			this.anInt6396 = arg0;
		} else if (this.anInt6396 != 0) {
			this.aClass35Array1[this.anInt6396 & Integer.MAX_VALUE].method5200(arg2);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!lp;)Z")
	public boolean method5561(@OriginalArg(1) Class124 arg0) {
		if (this.anInt6396 == 0) {
			return false;
		}
		if (this.aClass124_1 != arg0) {
			this.aClass35Array1[this.anInt6396 & Integer.MAX_VALUE].method5196(arg0);
			this.aClass124_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Z")
	public boolean method5562() {
		return this.aClass35Array1[3].method5199();
	}
}
