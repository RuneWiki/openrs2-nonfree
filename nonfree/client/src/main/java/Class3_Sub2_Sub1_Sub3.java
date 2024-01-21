import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class3_Sub2_Sub1_Sub3 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "I")
	private int anInt1984 = 0;

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
	private int anInt1988 = 0;

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
	public final int anInt1980;

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
	public final int anInt1986;

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
	public final int anInt1987;

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
	public final int anInt1989;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "I")
	public final int anInt1983;

	@OriginalMember(owner = "client!k", name = "W", descriptor = "I")
	private final int anInt1985;

	@OriginalMember(owner = "client!k", name = "N", descriptor = "Lclient!dg;")
	private Class3_Sub2_Sub2 aClass3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub2_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1980 = arg6 + arg5;
		this.anInt1986 = arg3;
		this.anInt1987 = arg4;
		this.anInt1989 = arg2;
		this.anInt1983 = arg1;
		this.anInt1985 = arg0;
		@Pc(37) int local37 = Static155.method2522(this.anInt1985).anInt1284;
		if (local37 == -1) {
			this.aBoolean83 = true;
		} else {
			this.aBoolean83 = false;
			this.aClass3_Sub2_Sub2_1 = Static35.method628(local37);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public void method1325(@OriginalArg(0) int arg0) {
		if (this.aBoolean83) {
			return;
		}
		this.anInt1988 += arg0;
		while (this.aClass3_Sub2_Sub2_1.anIntArray73[this.anInt1984] < this.anInt1988) {
			this.anInt1988 -= this.aClass3_Sub2_Sub2_1.anIntArray73[this.anInt1984];
			this.anInt1984++;
			if (this.aClass3_Sub2_Sub2_1.anIntArray74.length <= this.anInt1984) {
				this.aBoolean83 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Lclient!fd;")
	@Override
	protected Class3_Sub2_Sub1_Sub2 method2683() {
		@Pc(8) Class3_Sub2_Sub5 local8 = Static155.method2522(this.anInt1985);
		@Pc(22) Class3_Sub2_Sub1_Sub2 local22;
		if (this.aBoolean83) {
			local22 = local8.method933(-1);
		} else {
			local22 = local8.method933(this.anInt1984);
		}
		return local22 == null ? null : local22;
	}
}
