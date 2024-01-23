import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!f", name = "w", descriptor = "I")
	private int anInt1381 = 0;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Z")
	public boolean aBoolean121 = false;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	private int anInt1382 = -32768;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "I")
	private int anInt1379 = 0;

	@OriginalMember(owner = "client!f", name = "O", descriptor = "I")
	public int anInt1394;

	@OriginalMember(owner = "client!f", name = "A", descriptor = "I")
	public int anInt1385;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	public int anInt1384;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "I")
	public int anInt1388;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "I")
	private int anInt1389;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "I")
	public int anInt1383;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "Lclient!qa;")
	private Class96 aClass96_2;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1394 = arg6 + arg5;
		this.anInt1385 = arg2;
		this.anInt1384 = arg3;
		this.anInt1388 = arg4;
		this.anInt1389 = arg0;
		this.anInt1383 = arg1;
		@Pc(40) int local40 = Static89.method1514(this.anInt1389).anInt2562;
		if (local40 == -1) {
			this.aBoolean121 = true;
		} else {
			this.aBoolean121 = false;
			this.aClass96_2 = Static2.method88(local40);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
	@Override
	public int method2297() {
		return this.anInt1382;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lclient!nb;")
	private Class5_Sub3 method1109() {
		@Pc(16) Class69 local16 = Static89.method1514(this.anInt1389);
		@Pc(24) Class5_Sub3 local24;
		if (this.aBoolean121) {
			local24 = local16.method2008(-1);
		} else {
			local24 = local16.method2008(this.anInt1381);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class5_Sub3 local7 = this.method1109();
		if (local7 != null) {
			local7.method2300(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1382 = local7.method2297();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public void method1112(@OriginalArg(0) int arg0) {
		if (this.aBoolean121) {
			return;
		}
		this.anInt1379 += arg0;
		while (this.anInt1379 > this.aClass96_2.anIntArray327[this.anInt1381]) {
			this.anInt1379 -= this.aClass96_2.anIntArray327[this.anInt1381];
			this.anInt1381++;
			if (this.aClass96_2.anIntArray323.length <= this.anInt1381) {
				this.aBoolean121 = true;
				return;
			}
		}
	}
}
