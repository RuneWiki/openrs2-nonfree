import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	private int anInt1930 = -32768;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
	private int anInt1933 = 0;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
	private int anInt1935 = 0;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
	public final int anInt1927;

	@OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
	public final int anInt1943;

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
	public final int anInt1937;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	public final int anInt1934;

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
	private final int anInt1940;

	@OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
	public final int anInt1944;

	@OriginalMember(owner = "client!ij", name = "P", descriptor = "Lclient!wb;")
	private Class2_Sub1_Sub25 aClass2_Sub1_Sub25_2;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIII)V")
	public Class7_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1927 = arg3;
		this.anInt1943 = arg4;
		this.anInt1937 = arg1;
		this.anInt1934 = arg6 + arg5;
		this.anInt1940 = arg0;
		this.anInt1944 = arg2;
		@Pc(39) int local39 = Static99.method1597(this.anInt1940).anInt4000;
		if (local39 == -1) {
			this.aBoolean103 = true;
		} else {
			this.aBoolean103 = false;
			this.aClass2_Sub1_Sub25_2 = Static90.method27(local39);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Lclient!ug;")
	private Class7_Sub7 method1265() {
		@Pc(13) Class2_Sub1_Sub23 local13 = Static99.method1597(this.anInt1940);
		@Pc(22) Class7_Sub7 local22;
		if (this.aBoolean103) {
			local22 = local13.method2759(-1);
		} else {
			local22 = local13.method2759(this.anInt1933);
		}
		return local22 == null ? null : local22;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	public void method1266(@OriginalArg(0) int arg0) {
		if (this.aBoolean103) {
			return;
		}
		this.anInt1935 += arg0;
		while (this.aClass2_Sub1_Sub25_2.anIntArray389[this.anInt1933] < this.anInt1935) {
			this.anInt1935 -= this.aClass2_Sub1_Sub25_2.anIntArray389[this.anInt1933];
			this.anInt1933++;
			if (this.aClass2_Sub1_Sub25_2.anIntArray392.length <= this.anInt1933) {
				this.aBoolean103 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class7_Sub7 local7 = this.method1265();
		if (local7 != null) {
			local7.method3143(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1930 = local7.method3148();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()I")
	@Override
	public int method3148() {
		return this.anInt1930;
	}
}
