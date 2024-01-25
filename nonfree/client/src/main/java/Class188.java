import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class188 {

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "Lclient!rg;")
	private Class23 aClass23_1 = null;

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
	private int anInt4974 = 0;

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
	private int anInt4976 = 0;

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
	private int anInt4979 = 0;

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_28;

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lclient!pea;")
	private final Class252 aClass252_4;

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "[Lclient!uc;")
	private final Class101[] aClass101Array1;

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "Lclient!un;")
	public final Class101_Sub7 aClass101_Sub7_1;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class188(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_28 = arg0;
		this.aClass252_4 = new Class252(arg0);
		this.aClass101Array1 = new Class101[10];
		this.aClass101Array1[1] = new Class101_Sub9(arg0);
		this.aClass101Array1[2] = new Class101_Sub5(arg0, this.aClass252_4);
		this.aClass101Array1[4] = new Class101_Sub4(arg0, this.aClass252_4);
		this.aClass101Array1[5] = new Class101_Sub3(arg0, this.aClass252_4);
		this.aClass101Array1[6] = new Class101_Sub1(arg0);
		this.aClass101Array1[7] = new Class101_Sub8(arg0);
		this.aClass101Array1[3] = this.aClass101_Sub7_1 = new Class101_Sub7(arg0);
		this.aClass101Array1[8] = new Class101_Sub2(arg0, this.aClass252_4);
		this.aClass101Array1[9] = new Class101_Sub6(arg0, this.aClass252_4);
		if (!this.aClass101Array1[8].method7836()) {
			this.aClass101Array1[8] = this.aClass101Array1[4];
		}
		if (!this.aClass101Array1[9].method7836()) {
			this.aClass101Array1[9] = this.aClass101Array1[8];
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!rg;I)Z")
	public boolean method4156(@OriginalArg(1) Class23 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4974 == 0) {
			return false;
		}
		if (this.aClass23_1 != arg0) {
			this.aClass101Array1[Integer.MAX_VALUE & this.anInt4974].method7834(arg1, arg0);
			this.aClass23_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)Z")
	public boolean method4158() {
		return this.aClass101Array1[3].method7836();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZZIIII)V")
	public void method4159(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg1 & this.aClass100_Sub3_28.method6187();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg3 = arg2;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg0) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt4974) {
			if (this.anInt4974 != 0) {
				this.aClass101Array1[this.anInt4974 & Integer.MAX_VALUE].method7835();
			}
			if (arg4 != 0) {
				this.aClass101Array1[arg4 & Integer.MAX_VALUE].method7841(arg0);
				this.aClass101Array1[arg4 & Integer.MAX_VALUE].method7839(arg0);
				this.aClass101Array1[Integer.MAX_VALUE & arg4].method7840(arg2, arg3);
			}
			this.anInt4979 = arg2;
			this.anInt4976 = arg3;
			this.anInt4974 = arg4;
			this.aClass23_1 = null;
		} else if (this.anInt4974 != 0) {
			this.aClass101Array1[Integer.MAX_VALUE & this.anInt4974].method7839(arg0);
			if (arg2 != this.anInt4979 || this.anInt4976 != arg3) {
				this.aClass101Array1[Integer.MAX_VALUE & this.anInt4974].method7840(arg2, arg3);
				this.anInt4976 = arg3;
				this.anInt4979 = arg2;
			}
		}
	}
}
