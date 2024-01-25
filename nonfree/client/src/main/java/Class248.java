import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class248 {

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
	private int anInt6869 = 0;

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
	private int anInt6867 = 0;

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "Lclient!kj;")
	private Class6 aClass6_1 = null;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
	private int anInt6871 = 0;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_40;

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "Lclient!m;")
	private final Class144 aClass144_6;

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "[Lclient!dl;")
	private final Class9[] aClass9Array1;

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "Lclient!ve;")
	public final Class9_Sub9 aClass9_Sub9_1;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class248(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_40 = arg0;
		this.aClass144_6 = new Class144(arg0);
		this.aClass9Array1 = new Class9[10];
		this.aClass9Array1[1] = new Class9_Sub6(arg0);
		this.aClass9Array1[2] = new Class9_Sub4(arg0, this.aClass144_6);
		this.aClass9Array1[4] = new Class9_Sub3(arg0, this.aClass144_6);
		this.aClass9Array1[5] = new Class9_Sub5(arg0, this.aClass144_6);
		this.aClass9Array1[6] = new Class9_Sub8(arg0);
		this.aClass9Array1[7] = new Class9_Sub7(arg0);
		this.aClass9Array1[3] = this.aClass9_Sub9_1 = new Class9_Sub9(arg0);
		this.aClass9Array1[8] = new Class9_Sub1(arg0, this.aClass144_6);
		this.aClass9Array1[9] = new Class9_Sub2(arg0, this.aClass144_6);
		if (!this.aClass9Array1[8].method5375()) {
			this.aClass9Array1[8] = this.aClass9Array1[4];
		}
		if (!this.aClass9Array1[9].method5375()) {
			this.aClass9Array1[9] = this.aClass9Array1[8];
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLclient!kj;I)Z")
	public boolean method5316(@OriginalArg(1) Class6 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6869 == 0) {
			return false;
		}
		if (arg0 != this.aClass6_1) {
			this.aClass9Array1[this.anInt6869 & Integer.MAX_VALUE].method5376(arg1, arg0);
			this.aClass6_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)Z")
	public boolean method5317() {
		return this.aClass9Array1[3].method5375();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZZI)V")
	public void method5318(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(9) boolean local9 = arg0 & this.aClass19_Sub2_40.method4261();
		if (!local9 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt6869) {
			if (this.anInt6869 != 0) {
				this.aClass9Array1[Integer.MAX_VALUE & this.anInt6869].method5373();
			}
			if (arg2 != 0) {
				this.aClass9Array1[arg2 & Integer.MAX_VALUE].method5371(arg1);
				this.aClass9Array1[Integer.MAX_VALUE & arg2].method5377(arg1);
			}
			this.anInt6869 = arg2;
			this.anInt6867 = Integer.MIN_VALUE;
			this.aClass6_1 = null;
			this.anInt6871 = Integer.MIN_VALUE;
		} else if (this.anInt6869 != 0) {
			this.aClass9Array1[Integer.MAX_VALUE & this.anInt6869].method5377(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZ)V")
	public void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((this.anInt6867 != arg0 | arg1 != this.anInt6871) & this.anInt6869 != 0) {
			this.aClass9Array1[Integer.MAX_VALUE & this.anInt6869].method5370(arg1, arg0);
			this.anInt6867 = arg0;
			this.anInt6871 = arg1;
		}
	}
}
