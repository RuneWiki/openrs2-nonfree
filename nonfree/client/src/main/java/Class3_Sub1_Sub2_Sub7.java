import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class3_Sub1_Sub2_Sub7 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!wa", name = "sb", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!wa", name = "Gb", descriptor = "I")
	private int anInt3083 = 0;

	@OriginalMember(owner = "client!wa", name = "Kb", descriptor = "I")
	private int anInt3086 = 0;

	@OriginalMember(owner = "client!wa", name = "Fb", descriptor = "I")
	public final int anInt3082;

	@OriginalMember(owner = "client!wa", name = "Ab", descriptor = "I")
	private final int anInt3081;

	@OriginalMember(owner = "client!wa", name = "yb", descriptor = "I")
	public final int anInt3080;

	@OriginalMember(owner = "client!wa", name = "Ub", descriptor = "I")
	public final int anInt3090;

	@OriginalMember(owner = "client!wa", name = "Pb", descriptor = "I")
	public final int anInt3088;

	@OriginalMember(owner = "client!wa", name = "tb", descriptor = "I")
	public final int anInt3076;

	@OriginalMember(owner = "client!wa", name = "Ob", descriptor = "Lclient!ed;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_3;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3082 = arg6 + arg5;
		this.anInt3081 = arg0;
		this.anInt3080 = arg4;
		this.anInt3090 = arg1;
		this.anInt3088 = arg3;
		this.anInt3076 = arg2;
		@Pc(36) int local36 = Static43.method800(this.anInt3081).anInt470;
		if (local36 == -1) {
			this.aBoolean166 = true;
		} else {
			this.aBoolean166 = false;
			this.aClass3_Sub1_Sub4_3 = Static41.method770(local36);
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)Lclient!t;")
	@Override
	public Class3_Sub1_Sub2_Sub6 method2028() {
		@Pc(15) Class3_Sub1_Sub3 local15 = Static43.method800(this.anInt3081);
		@Pc(24) Class3_Sub1_Sub2_Sub6 local24;
		if (this.aBoolean166) {
			local24 = local15.method341(-1);
		} else {
			local24 = local15.method341(this.anInt3083);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
	public void method1997(@OriginalArg(1) int arg0) {
		if (this.aBoolean166) {
			return;
		}
		this.anInt3086 += arg0;
		while (this.anInt3086 > this.aClass3_Sub1_Sub4_3.anIntArray54[this.anInt3083]) {
			this.anInt3086 -= this.aClass3_Sub1_Sub4_3.anIntArray54[this.anInt3083];
			this.anInt3083++;
			if (this.anInt3083 >= this.aClass3_Sub1_Sub4_3.anIntArray58.length) {
				this.aBoolean166 = true;
				return;
			}
		}
	}
}
