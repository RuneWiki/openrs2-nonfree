import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class4_Sub3_Sub1_Sub4 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
	private int anInt1698 = 0;

	@OriginalMember(owner = "client!mb", name = "Ab", descriptor = "I")
	private int anInt1709 = 0;

	@OriginalMember(owner = "client!mb", name = "Rb", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!mb", name = "Qb", descriptor = "I")
	public final int anInt1714;

	@OriginalMember(owner = "client!mb", name = "zb", descriptor = "I")
	public final int anInt1708;

	@OriginalMember(owner = "client!mb", name = "Lb", descriptor = "I")
	public final int anInt1712;

	@OriginalMember(owner = "client!mb", name = "rb", descriptor = "I")
	public final int anInt1705;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
	private final int anInt1702;

	@OriginalMember(owner = "client!mb", name = "Jb", descriptor = "I")
	public final int anInt1711;

	@OriginalMember(owner = "client!mb", name = "Kb", descriptor = "Lclient!ne;")
	private Class4_Sub3_Sub10 aClass4_Sub3_Sub10_2;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class4_Sub3_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1714 = arg5 + arg6;
		this.anInt1708 = arg1;
		this.anInt1712 = arg2;
		this.anInt1705 = arg4;
		this.anInt1702 = arg0;
		this.anInt1711 = arg3;
		@Pc(36) int local36 = Static46.method642(this.anInt1702).anInt795;
		if (local36 == -1) {
			this.aBoolean62 = true;
		} else {
			this.aBoolean62 = false;
			this.aClass4_Sub3_Sub10_2 = Static7.method63(local36);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class4_Sub3_Sub1_Sub7 method1484() {
		@Pc(8) Class4_Sub3_Sub4 local8 = Static46.method642(this.anInt1702);
		@Pc(21) Class4_Sub3_Sub1_Sub7 local21;
		if (this.aBoolean62) {
			local21 = local8.method417(-1);
		} else {
			local21 = local8.method417(this.anInt1698);
		}
		return local21 == null ? null : local21;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method1096(@OriginalArg(1) int arg0) {
		if (this.aBoolean62) {
			return;
		}
		this.anInt1709 += arg0;
		while (this.anInt1709 > this.aClass4_Sub3_Sub10_2.anIntArray218[this.anInt1698]) {
			this.anInt1709 -= this.aClass4_Sub3_Sub10_2.anIntArray218[this.anInt1698];
			this.anInt1698++;
			if (this.aClass4_Sub3_Sub10_2.anIntArray216.length <= this.anInt1698) {
				this.aBoolean62 = true;
				return;
			}
		}
	}
}
