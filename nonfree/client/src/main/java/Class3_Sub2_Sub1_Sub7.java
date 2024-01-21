import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class3_Sub2_Sub1_Sub7 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
	private int anInt3617 = 0;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
	private int anInt3624 = 0;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
	private final int anInt3616;

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
	public final int anInt3618;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "I")
	public final int anInt3612;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "I")
	public final int anInt3611;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
	public final int anInt3622;

	@OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
	public final int anInt3620;

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "Lclient!ca;")
	private Class3_Sub2_Sub4 aClass3_Sub2_Sub4_3;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub2_Sub1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3616 = arg0;
		this.anInt3618 = arg3;
		this.anInt3612 = arg1;
		this.anInt3611 = arg2;
		this.anInt3622 = arg6 + arg5;
		this.anInt3620 = arg4;
		@Pc(36) int local36 = Static1.method8(this.anInt3616).anInt507;
		if (local36 == -1) {
			this.aBoolean173 = true;
		} else {
			this.aBoolean173 = false;
			this.aClass3_Sub2_Sub4_3 = Static21.method594(local36);
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Lclient!d;")
	@Override
	protected Class3_Sub2_Sub1_Sub1 method2761() {
		@Pc(10) Class3_Sub2_Sub3 local10 = Static1.method8(this.anInt3616);
		@Pc(19) Class3_Sub2_Sub1_Sub1 local19;
		if (this.aBoolean173) {
			local19 = local10.method553(-1);
		} else {
			local19 = local10.method553(this.anInt3617);
		}
		return local19 == null ? null : local19;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
	public void method2768(@OriginalArg(0) int arg0) {
		if (this.aBoolean173) {
			return;
		}
		this.anInt3624 += arg0;
		while (this.aClass3_Sub2_Sub4_3.anIntArray139[this.anInt3617] < this.anInt3624) {
			this.anInt3624 -= this.aClass3_Sub2_Sub4_3.anIntArray139[this.anInt3617];
			this.anInt3617++;
			if (this.aClass3_Sub2_Sub4_3.anIntArray142.length <= this.anInt3617) {
				this.aBoolean173 = true;
				return;
			}
		}
	}
}
