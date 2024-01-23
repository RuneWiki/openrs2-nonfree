import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class25_Sub6 extends Class25 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!ll;")
	private Class95_Sub1 aClass95_Sub1_5;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
	private int anInt5984 = -32768;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	private int anInt5991 = -1;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
	private int anInt5986 = 0;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	private int anInt5981 = 0;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
	public int anInt5979;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	private int anInt5978;

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
	public int anInt5996;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	public int anInt5983;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	public int anInt5992;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
	public int anInt5982;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!v;")
	private Class163 aClass163_2;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIII)V")
	public Class25_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5979 = arg1;
		this.anInt5978 = arg0;
		this.anInt5996 = arg3;
		this.anInt5983 = arg4;
		this.anInt5992 = arg2;
		this.anInt5982 = arg5 + arg6;
		@Pc(42) int local42 = Static43.method942(this.anInt5978).anInt5107;
		if (local42 == -1) {
			this.aBoolean319 = true;
		} else {
			this.aBoolean319 = false;
			this.aClass163_2 = Static115.method1895(local42);
		}
		if (this.anInt5982 == arg6) {
			Static188.method3369(this.anInt5996, this.aClass163_2, this.anInt5981, this.anInt5992, false);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		return this.anInt5984;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Lclient!lf;")
	private Class25_Sub2 method4647() {
		@Pc(15) Class139 local15 = Static43.method942(this.anInt5978);
		@Pc(25) Class25_Sub2 local25;
		if (this.aBoolean319) {
			local25 = local15.method4030(0, -1, -1);
		} else {
			local25 = local15.method4030(this.anInt5986, this.anInt5991, this.anInt5981);
		}
		return local25 == null ? null : local25;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V")
	public void method4648(@OriginalArg(1) int arg0) {
		if (this.aBoolean319) {
			return;
		}
		this.anInt5986 += arg0;
		while (this.aClass163_2.anIntArray589[this.anInt5981] < this.anInt5986) {
			this.anInt5986 -= this.aClass163_2.anIntArray589[this.anInt5981];
			this.anInt5981++;
			if (this.aClass163_2.anIntArray587.length <= this.anInt5981) {
				this.aBoolean319 = true;
				break;
			}
		}
		if (!this.aBoolean319) {
			Static188.method3369(this.anInt5996, this.aClass163_2, this.anInt5981, this.anInt5992, false);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
		@Pc(7) Class25_Sub2 local7 = this.method4647();
		if (local7 != null) {
			local7.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_5);
			this.anInt5984 = local7.method4773();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
