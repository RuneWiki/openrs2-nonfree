import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class225 {

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
	private int anInt6751 = 0;

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
	private int anInt6750 = 0;

	@OriginalMember(owner = "client!ow", name = "j", descriptor = "Lclient!pm;")
	private Class11 aClass11_1 = null;

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
	private int anInt6753 = 0;

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_27;

	@OriginalMember(owner = "client!ow", name = "o", descriptor = "Lclient!me;")
	private final Class190 aClass190_4;

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "[Lclient!daa;")
	private final Class56[] aClass56Array1;

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "Lclient!pj;")
	public final Class56_Sub6 aClass56_Sub6_1;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class225(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_27 = arg0;
		this.aClass190_4 = new Class190(arg0);
		this.aClass56Array1 = new Class56[10];
		this.aClass56Array1[1] = new Class56_Sub7(arg0);
		this.aClass56Array1[2] = new Class56_Sub5(arg0, this.aClass190_4);
		this.aClass56Array1[4] = new Class56_Sub1(arg0, this.aClass190_4);
		this.aClass56Array1[5] = new Class56_Sub4(arg0, this.aClass190_4);
		this.aClass56Array1[6] = new Class56_Sub2(arg0);
		this.aClass56Array1[7] = new Class56_Sub3(arg0);
		this.aClass56Array1[3] = this.aClass56_Sub6_1 = new Class56_Sub6(arg0);
		this.aClass56Array1[8] = new Class56_Sub9(arg0, this.aClass190_4);
		this.aClass56Array1[9] = new Class56_Sub8(arg0, this.aClass190_4);
		if (!this.aClass56Array1[8].method7142()) {
			this.aClass56Array1[8] = this.aClass56Array1[4];
		}
		if (!this.aClass56Array1[9].method7142()) {
			this.aClass56Array1[9] = this.aClass56Array1[8];
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZIZII)V")
	public void method5657(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(14) boolean local14 = arg1 & this.aClass5_Sub1_27.method7465();
		if (!local14 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg0 = arg4;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg3) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt6751 != arg2) {
			if (this.anInt6751 != 0) {
				this.aClass56Array1[Integer.MAX_VALUE & this.anInt6751].method7137();
			}
			if (arg2 != 0) {
				this.aClass56Array1[arg2 & Integer.MAX_VALUE].method7141(arg3);
				this.aClass56Array1[Integer.MAX_VALUE & arg2].method7138(arg3);
				this.aClass56Array1[Integer.MAX_VALUE & arg2].method7136(arg4, arg0);
			}
			this.anInt6753 = arg0;
			this.anInt6750 = arg4;
			this.anInt6751 = arg2;
			this.aClass11_1 = null;
		} else if (this.anInt6751 != 0) {
			this.aClass56Array1[Integer.MAX_VALUE & this.anInt6751].method7138(arg3);
			if (this.anInt6750 != arg4 || this.anInt6753 != arg0) {
				this.aClass56Array1[Integer.MAX_VALUE & this.anInt6751].method7136(arg4, arg0);
				this.anInt6750 = arg4;
				this.anInt6753 = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZILclient!pm;)Z")
	public boolean method5658(@OriginalArg(1) int arg0, @OriginalArg(2) Class11 arg1) {
		if (this.anInt6751 == 0) {
			return false;
		}
		if (this.aClass11_1 != arg1) {
			this.aClass56Array1[this.anInt6751 & Integer.MAX_VALUE].method7139(arg0, arg1);
			this.aClass11_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)Z")
	public boolean method5659() {
		return this.aClass56Array1[3].method7142();
	}
}
