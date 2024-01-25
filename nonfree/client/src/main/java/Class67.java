import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class67 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
	private int anInt1968 = 0;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!vd;")
	private Class92 aClass92_1 = null;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	private int anInt1969 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_14;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "Lclient!cf;")
	private final Class38 aClass38_2;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "[Lclient!qg;")
	private final Class39[] aClass39Array1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class67(@OriginalArg(0) Class89_Sub1 arg0) {
		this.aClass89_Sub1_14 = arg0;
		this.aClass38_2 = new Class38(arg0);
		this.aClass39Array1 = new Class39[9];
		this.aClass39Array1[1] = new Class39_Sub3(arg0);
		this.aClass39Array1[2] = new Class39_Sub7(arg0, this.aClass38_2);
		this.aClass39Array1[4] = new Class39_Sub8(arg0, this.aClass38_2);
		this.aClass39Array1[5] = new Class39_Sub1(arg0, this.aClass38_2);
		this.aClass39Array1[6] = new Class39_Sub5(arg0);
		this.aClass39Array1[7] = new Class39_Sub2(arg0);
		this.aClass39Array1[3] = new Class39_Sub4(arg0);
		this.aClass39Array1[8] = new Class39_Sub6(arg0);
		if (!this.aClass39Array1[8].method5245()) {
			this.aClass39Array1[8] = this.aClass39Array1[4];
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!vd;I)Z")
	public boolean method1577(@OriginalArg(0) Class92 arg0) {
		if (this.anInt1969 == 0) {
			return false;
		}
		if (this.aClass92_1 != arg0) {
			this.aClass39Array1[Integer.MAX_VALUE & this.anInt1969].method5242(arg0);
			this.aClass92_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZB)V")
	public void method1578(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if ((arg0 != this.anInt1968 | arg1) & this.anInt1969 != 0) {
			this.aClass39Array1[Integer.MAX_VALUE & this.anInt1969].method5244(arg0);
			this.anInt1968 = arg0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZII)V")
	public void method1579(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) boolean local13 = arg1 & this.aClass89_Sub1_14.method5445();
		if (!local13 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt1969 != arg2) {
			if (this.anInt1969 != 0) {
				this.aClass39Array1[this.anInt1969 & Integer.MAX_VALUE].method5247();
			}
			if (arg2 != 0) {
				this.aClass39Array1[Integer.MAX_VALUE & arg2].method5246(arg0);
				this.aClass39Array1[Integer.MAX_VALUE & arg2].method5243(arg0);
			}
			this.aClass92_1 = null;
			this.anInt1968 = Integer.MIN_VALUE;
			this.anInt1969 = arg2;
		} else if (this.anInt1969 != 0) {
			this.aClass39Array1[this.anInt1969 & Integer.MAX_VALUE].method5243(arg0);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Z")
	public boolean method1580() {
		return this.aClass39Array1[3].method5245();
	}
}
