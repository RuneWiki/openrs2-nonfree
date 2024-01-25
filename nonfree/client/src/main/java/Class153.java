import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class153 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private int anInt4740 = 0;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!ue;")
	private Class56 aClass56_1 = null;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private int anInt4739 = 0;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_31;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!rl;")
	private final Class178 aClass178_4;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[Lclient!oh;")
	private final Class22[] aClass22Array1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class153(@OriginalArg(0) Class129_Sub2 arg0) {
		this.aClass129_Sub2_31 = arg0;
		this.aClass178_4 = new Class178(arg0);
		this.aClass22Array1 = new Class22[9];
		this.aClass22Array1[1] = new Class22_Sub1(arg0);
		this.aClass22Array1[2] = new Class22_Sub2(arg0, this.aClass178_4);
		this.aClass22Array1[4] = new Class22_Sub5(arg0, this.aClass178_4);
		this.aClass22Array1[5] = new Class22_Sub6(arg0, this.aClass178_4);
		this.aClass22Array1[6] = new Class22_Sub4(arg0);
		this.aClass22Array1[7] = new Class22_Sub7(arg0);
		this.aClass22Array1[3] = new Class22_Sub3(arg0);
		this.aClass22Array1[8] = this.aClass22Array1[4];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
	public boolean method4174() {
		return this.aClass22Array1[3].method4341();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ue;)Z")
	public boolean method4175(@OriginalArg(1) Class56 arg0) {
		if (this.anInt4740 == 0) {
			return false;
		}
		if (this.aClass56_1 != arg0) {
			this.aClass22Array1[this.anInt4740 & Integer.MAX_VALUE].method4343(arg0);
			this.aClass56_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZB)V")
	public void method4176(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if ((arg1 | arg0 != this.anInt4739) & this.anInt4740 != 0) {
			this.aClass22Array1[this.anInt4740 & Integer.MAX_VALUE].method4339(arg0);
			this.anInt4739 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZII)V")
	public void method4177(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass129_Sub2_31.method5021();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt4740 != arg2) {
			if (this.anInt4740 != 0) {
				this.aClass22Array1[Integer.MAX_VALUE & this.anInt4740].method4342();
			}
			if (arg2 != 0) {
				this.aClass22Array1[Integer.MAX_VALUE & arg2].method4340(arg1);
				this.aClass22Array1[Integer.MAX_VALUE & arg2].method4338(arg1);
			}
			this.anInt4739 = Integer.MIN_VALUE;
			this.anInt4740 = arg2;
			this.aClass56_1 = null;
		} else if (this.anInt4740 != 0) {
			this.aClass22Array1[this.anInt4740 & Integer.MAX_VALUE].method4338(arg1);
		}
	}
}
