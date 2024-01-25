import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class233 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "I")
	private int anInt6730 = 0;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "I")
	private int anInt6734 = 0;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!mw;")
	private Class79 aClass79_1 = null;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	private int anInt6738 = 0;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_25;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "Lclient!de;")
	private final Class67 aClass67_4;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "[Lclient!mp;")
	private final Class112[] aClass112Array1;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "Lclient!pm;")
	public final Class112_Sub6 aClass112_Sub6_1;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class233(@OriginalArg(0) Class42_Sub3 arg0) {
		this.aClass42_Sub3_25 = arg0;
		this.aClass67_4 = new Class67(arg0);
		this.aClass112Array1 = new Class112[10];
		this.aClass112Array1[1] = new Class112_Sub5(arg0);
		this.aClass112Array1[2] = new Class112_Sub1(arg0, this.aClass67_4);
		this.aClass112Array1[4] = new Class112_Sub8(arg0, this.aClass67_4);
		this.aClass112Array1[5] = new Class112_Sub4(arg0, this.aClass67_4);
		this.aClass112Array1[6] = new Class112_Sub2(arg0);
		this.aClass112Array1[7] = new Class112_Sub9(arg0);
		this.aClass112Array1[3] = this.aClass112_Sub6_1 = new Class112_Sub6(arg0);
		this.aClass112Array1[8] = new Class112_Sub7(arg0, this.aClass67_4);
		this.aClass112Array1[9] = new Class112_Sub3(arg0, this.aClass67_4);
		if (!this.aClass112Array1[8].method7305()) {
			this.aClass112Array1[8] = this.aClass112Array1[4];
		}
		if (!this.aClass112Array1[9].method7305()) {
			this.aClass112Array1[9] = this.aClass112Array1[8];
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!mw;I)Z")
	public boolean method5628(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6738 == 0) {
			return false;
		}
		if (arg0 != this.aClass79_1) {
			this.aClass112Array1[Integer.MAX_VALUE & this.anInt6738].method7304(arg0, arg1);
			this.aClass79_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Z")
	public boolean method5629() {
		return this.aClass112Array1[3].method7305();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIIIIZ)V")
	public void method5630(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(5) boolean local5 = arg0 & this.aClass42_Sub3_25.method5813();
		if (!local5 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg1 = arg3;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg4) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt6738 != arg2) {
			if (this.anInt6738 != 0) {
				this.aClass112Array1[Integer.MAX_VALUE & this.anInt6738].method7308();
			}
			if (arg2 != 0) {
				this.aClass112Array1[arg2 & Integer.MAX_VALUE].method7306(arg4);
				this.aClass112Array1[Integer.MAX_VALUE & arg2].method7309(arg4);
				this.aClass112Array1[Integer.MAX_VALUE & arg2].method7311(arg1, arg3);
			}
			this.aClass79_1 = null;
			this.anInt6730 = arg1;
			this.anInt6734 = arg3;
			this.anInt6738 = arg2;
		} else if (this.anInt6738 != 0) {
			this.aClass112Array1[this.anInt6738 & Integer.MAX_VALUE].method7309(arg4);
			if (this.anInt6734 != arg3 || arg1 != this.anInt6730) {
				this.aClass112Array1[this.anInt6738 & Integer.MAX_VALUE].method7311(arg1, arg3);
				this.anInt6734 = arg3;
				this.anInt6730 = arg1;
			}
			return;
		}
	}
}
