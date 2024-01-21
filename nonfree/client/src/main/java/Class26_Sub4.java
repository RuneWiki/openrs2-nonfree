import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class26_Sub4 extends Class26 {

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
	private int anInt2418 = -32768;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
	private int anInt2423 = 0;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	private int anInt2427 = 0;

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
	public final int anInt2420;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	public final int anInt2414;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	public final int anInt2416;

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
	private final int anInt2425;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
	public final int anInt2417;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	public final int anInt2426;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "Lclient!nd;")
	private Class3_Sub3_Sub17 aClass3_Sub3_Sub17_3;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class26_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2420 = arg1;
		this.anInt2414 = arg3;
		this.anInt2416 = arg5 + arg6;
		this.anInt2425 = arg0;
		this.anInt2417 = arg4;
		this.anInt2426 = arg2;
		@Pc(39) int local39 = Static78.method1141(this.anInt2425).anInt106;
		if (local39 == -1) {
			this.aBoolean122 = true;
		} else {
			this.aBoolean122 = false;
			this.aClass3_Sub3_Sub17_3 = Static11.method254(local39);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()I")
	@Override
	public int method2995() {
		return this.anInt2418;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)Lclient!wa;")
	private Class26_Sub6 method1721() {
		@Pc(8) Class3_Sub3_Sub1 local8 = Static78.method1141(this.anInt2425);
		@Pc(17) Class26_Sub6 local17;
		if (this.aBoolean122) {
			local17 = local8.method89(-1);
		} else {
			local17 = local8.method89(this.anInt2423);
		}
		return local17 == null ? null : local17;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public void method1722(@OriginalArg(0) int arg0) {
		if (this.aBoolean122) {
			return;
		}
		this.anInt2427 += arg0;
		while (this.aClass3_Sub3_Sub17_3.anIntArray193[this.anInt2423] < this.anInt2427) {
			this.anInt2427 -= this.aClass3_Sub3_Sub17_3.anIntArray193[this.anInt2423];
			this.anInt2423++;
			if (this.aClass3_Sub3_Sub17_3.anIntArray197.length <= this.anInt2423) {
				this.aBoolean122 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class26_Sub6 local7 = this.method1721();
		if (local7 != null) {
			local7.method2993(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2418 = local7.method2995();
		}
	}
}
