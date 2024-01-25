import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class321 {

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	private int anInt8805 = 0;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	private int anInt8806 = 0;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	private int anInt8813 = 0;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_36;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!b;")
	private final Class25 aClass25_5;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[Lclient!pl;")
	private final Class19[] aClass19Array1;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "Lclient!kk;")
	public final Class19_Sub6 aClass19_Sub6_1;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class321(@OriginalArg(0) Class143_Sub2 arg0) {
		this.aClass143_Sub2_36 = arg0;
		this.aClass25_5 = new Class25(arg0);
		this.aClass19Array1 = new Class19[10];
		this.aClass19Array1[1] = new Class19_Sub8(arg0);
		this.aClass19Array1[2] = new Class19_Sub9(arg0, this.aClass25_5);
		this.aClass19Array1[4] = new Class19_Sub1(arg0, this.aClass25_5);
		this.aClass19Array1[5] = new Class19_Sub7(arg0, this.aClass25_5);
		this.aClass19Array1[6] = new Class19_Sub2(arg0);
		this.aClass19Array1[7] = new Class19_Sub3(arg0);
		this.aClass19Array1[3] = this.aClass19_Sub6_1 = new Class19_Sub6(arg0);
		this.aClass19Array1[8] = new Class19_Sub5(arg0, this.aClass25_5);
		this.aClass19Array1[9] = new Class19_Sub4(arg0, this.aClass25_5);
		if (!this.aClass19Array1[8].method7874()) {
			this.aClass19Array1[8] = this.aClass19Array1[4];
		}
		if (!this.aClass19Array1[9].method7874()) {
			this.aClass19Array1[9] = this.aClass19Array1[8];
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!fia;II)Z")
	public boolean method7426(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8806 == 0) {
			return false;
		} else {
			this.aClass19Array1[this.anInt8806 & Integer.MAX_VALUE].method7873(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIIZII)V")
	public void method7430(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg0 & this.aClass143_Sub2_36.method6208();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg1 = arg3;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt8806 != arg4) {
			if (this.anInt8806 != 0) {
				this.aClass19Array1[this.anInt8806 & Integer.MAX_VALUE].method7871();
			}
			if (arg4 != 0) {
				this.aClass19Array1[Integer.MAX_VALUE & arg4].method7875(arg2);
				this.aClass19Array1[Integer.MAX_VALUE & arg4].method7872(arg2);
				this.aClass19Array1[Integer.MAX_VALUE & arg4].method7876(arg3, arg1);
			}
			this.anInt8805 = arg1;
			this.anInt8806 = arg4;
			this.anInt8813 = arg3;
		} else if (this.anInt8806 != 0) {
			this.aClass19Array1[this.anInt8806 & Integer.MAX_VALUE].method7872(arg2);
			if (this.anInt8813 != arg3 || arg1 != this.anInt8805) {
				this.aClass19Array1[this.anInt8806 & Integer.MAX_VALUE].method7876(arg3, arg1);
				this.anInt8813 = arg3;
				this.anInt8805 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
	public boolean method7431() {
		return this.aClass19Array1[3].method7874();
	}
}
