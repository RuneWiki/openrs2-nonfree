import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!af", name = "sb", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!af", name = "tb", descriptor = "I")
	private int anInt226 = 0;

	@OriginalMember(owner = "client!af", name = "Ib", descriptor = "I")
	private int anInt238 = 0;

	@OriginalMember(owner = "client!af", name = "Eb", descriptor = "I")
	public final int anInt234;

	@OriginalMember(owner = "client!af", name = "Fb", descriptor = "I")
	public final int anInt235;

	@OriginalMember(owner = "client!af", name = "Lb", descriptor = "I")
	public final int anInt241;

	@OriginalMember(owner = "client!af", name = "Cb", descriptor = "I")
	private final int anInt233;

	@OriginalMember(owner = "client!af", name = "Jb", descriptor = "I")
	public final int anInt239;

	@OriginalMember(owner = "client!af", name = "Mb", descriptor = "I")
	public final int anInt242;

	@OriginalMember(owner = "client!af", name = "xb", descriptor = "Lclient!tb;")
	private Class1_Sub1_Sub15 aClass1_Sub1_Sub15_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt234 = arg5 + arg6;
		this.anInt235 = arg2;
		this.anInt241 = arg3;
		this.anInt233 = arg0;
		this.anInt239 = arg1;
		this.anInt242 = arg4;
		@Pc(36) int local36 = Static122.method1994(this.anInt233).anInt2351;
		if (local36 == -1) {
			this.aBoolean12 = true;
		} else {
			this.aBoolean12 = false;
			this.aClass1_Sub1_Sub15_1 = Static56.method1247(local36);
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)Lclient!lb;")
	@Override
	public Class1_Sub1_Sub1_Sub6 method1897() {
		@Pc(8) Class1_Sub1_Sub12 local8 = Static122.method1994(this.anInt233);
		@Pc(21) Class1_Sub1_Sub1_Sub6 local21;
		if (this.aBoolean12) {
			local21 = local8.method1643(-1);
		} else {
			local21 = local8.method1643(this.anInt226);
		}
		return local21 == null ? null : local21;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V")
	public void method165(@OriginalArg(0) int arg0) {
		if (this.aBoolean12) {
			return;
		}
		this.anInt238 += arg0;
		while (this.anInt238 > this.aClass1_Sub1_Sub15_1.anIntArray452[this.anInt226]) {
			this.anInt238 -= this.aClass1_Sub1_Sub15_1.anIntArray452[this.anInt226];
			this.anInt226++;
			if (this.aClass1_Sub1_Sub15_1.anIntArray450.length <= this.anInt226) {
				this.aBoolean12 = true;
				return;
			}
		}
	}
}
