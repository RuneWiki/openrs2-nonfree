import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class2_Sub1_Sub1_Sub6 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!gh", name = "cb", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!gh", name = "jb", descriptor = "I")
	private int anInt1971 = 0;

	@OriginalMember(owner = "client!gh", name = "eb", descriptor = "I")
	private int anInt1967 = -32768;

	@OriginalMember(owner = "client!gh", name = "ub", descriptor = "I")
	private int anInt1976 = 0;

	@OriginalMember(owner = "client!gh", name = "nb", descriptor = "I")
	public final int anInt1972;

	@OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
	public final int anInt1964;

	@OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
	public final int anInt1961;

	@OriginalMember(owner = "client!gh", name = "ob", descriptor = "I")
	private final int anInt1973;

	@OriginalMember(owner = "client!gh", name = "bb", descriptor = "I")
	public final int anInt1965;

	@OriginalMember(owner = "client!gh", name = "db", descriptor = "I")
	public final int anInt1966;

	@OriginalMember(owner = "client!gh", name = "Z", descriptor = "Lclient!ce;")
	private Class2_Sub1_Sub5 aClass2_Sub1_Sub5_3;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1972 = arg5 + arg6;
		this.anInt1964 = arg1;
		this.anInt1961 = arg4;
		this.anInt1973 = arg0;
		this.anInt1965 = arg3;
		this.anInt1966 = arg2;
		@Pc(39) int local39 = Static101.method2313(this.anInt1973).anInt2838;
		if (local39 == -1) {
			this.aBoolean81 = true;
		} else {
			this.aBoolean81 = false;
			this.aClass2_Sub1_Sub5_3 = Static103.method2357(local39);
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)Lclient!fe;")
	private Class2_Sub1_Sub1_Sub4 method1470() {
		@Pc(15) Class2_Sub1_Sub14 local15 = Static101.method2313(this.anInt1973);
		@Pc(24) Class2_Sub1_Sub1_Sub4 local24;
		if (this.aBoolean81) {
			local24 = local15.method2261(-1);
		} else {
			local24 = local15.method2261(this.anInt1971);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
	public void method1472(@OriginalArg(0) int arg0) {
		if (this.aBoolean81) {
			return;
		}
		this.anInt1976 += arg0;
		while (this.anInt1976 > this.aClass2_Sub1_Sub5_3.anIntArray83[this.anInt1971]) {
			this.anInt1976 -= this.aClass2_Sub1_Sub5_3.anIntArray83[this.anInt1971];
			this.anInt1971++;
			if (this.anInt1971 >= this.aClass2_Sub1_Sub5_3.anIntArray84.length) {
				this.aBoolean81 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
	@Override
	public int method3179() {
		return this.anInt1967;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class2_Sub1_Sub1_Sub4 local3 = this.method1470();
		if (local3 != null) {
			local3.method3173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1967 = local3.method3179();
		}
	}
}
