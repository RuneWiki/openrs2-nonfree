import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class95 {

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	private int anInt2487 = 0;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	private int anInt2488 = 0;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "Lclient!kq;")
	private Class8 aClass8_1 = null;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_14;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient!fs;")
	private final Class76 aClass76_3;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "[Lclient!cd;")
	private final Class33[] aClass33Array1;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!bf;)V", line = 100)
	public Class95(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass19_Sub1_14 = arg0;
		this.aClass76_3 = new Class76(arg0);
		this.aClass33Array1 = new Class33[9];
		this.aClass33Array1[1] = new Class33_Sub7(arg0);
		this.aClass33Array1[2] = new Class33_Sub1(arg0, this.aClass76_3);
		this.aClass33Array1[4] = new Class33_Sub2(arg0, this.aClass76_3);
		this.aClass33Array1[5] = new Class33_Sub4(arg0, this.aClass76_3);
		this.aClass33Array1[6] = new Class33_Sub3(arg0);
		this.aClass33Array1[7] = new Class33_Sub6(arg0);
		this.aClass33Array1[3] = new Class33_Sub5(arg0);
		this.aClass33Array1[8] = this.aClass33Array1[4];
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZI)V", line = 6)
	public void method2506(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2487 != 0 & (arg1 != this.anInt2488 | arg0)) {
			this.aClass33Array1[Integer.MAX_VALUE & this.anInt2487].method5713(arg1);
			this.anInt2488 = arg1;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZIZI)V", line = 22)
	public void method2507(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass19_Sub1_14.method2807();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt2487) {
			if (this.anInt2487 != 0) {
				this.aClass33Array1[Integer.MAX_VALUE & this.anInt2487].method5716();
			}
			if (arg2 != 0) {
				this.aClass33Array1[Integer.MAX_VALUE & arg2].method5715(arg1);
				this.aClass33Array1[Integer.MAX_VALUE & arg2].method5714(arg1);
			}
			this.anInt2487 = arg2;
			this.aClass8_1 = null;
			this.anInt2488 = Integer.MIN_VALUE;
		} else if (this.anInt2487 != 0) {
			this.aClass33Array1[Integer.MAX_VALUE & this.anInt2487].method5714(arg1);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)Z", line = 63)
	public boolean method2508() {
		return this.aClass33Array1[3].method5712();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!kq;I)Z", line = 80)
	public boolean method2509(@OriginalArg(0) Class8 arg0) {
		if (this.anInt2487 == 0) {
			return false;
		}
		if (arg0 != this.aClass8_1) {
			this.aClass33Array1[this.anInt2487 & Integer.MAX_VALUE].method5711(arg0);
			this.aClass8_1 = arg0;
		}
		return true;
	}
}
