import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class2_Sub1_Sub1_Sub6 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!tb", name = "Tb", descriptor = "I")
	private int anInt2502 = 0;

	@OriginalMember(owner = "client!tb", name = "Qb", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!tb", name = "Mb", descriptor = "I")
	private int anInt2498 = 0;

	@OriginalMember(owner = "client!tb", name = "Ob", descriptor = "I")
	public final int anInt2500;

	@OriginalMember(owner = "client!tb", name = "Xb", descriptor = "I")
	public final int anInt2504;

	@OriginalMember(owner = "client!tb", name = "Jb", descriptor = "I")
	public final int anInt2495;

	@OriginalMember(owner = "client!tb", name = "Kb", descriptor = "I")
	public final int anInt2496;

	@OriginalMember(owner = "client!tb", name = "cc", descriptor = "I")
	private final int anInt2505;

	@OriginalMember(owner = "client!tb", name = "Sb", descriptor = "I")
	public final int anInt2501;

	@OriginalMember(owner = "client!tb", name = "Vb", descriptor = "Lclient!he;")
	private Class2_Sub1_Sub9 aClass2_Sub1_Sub9_3;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2500 = arg3;
		this.anInt2504 = arg2;
		this.anInt2495 = arg5 + arg6;
		this.anInt2496 = arg4;
		this.anInt2505 = arg0;
		this.anInt2501 = arg1;
		@Pc(36) int local36 = Static65.method1339(this.anInt2505).anInt1013;
		if (local36 == -1) {
			this.aBoolean146 = true;
		} else {
			this.aBoolean146 = false;
			this.aClass2_Sub1_Sub9_3 = Static4.method192(local36);
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Lclient!pa;")
	@Override
	public Class2_Sub1_Sub1_Sub5 method1778() {
		@Pc(8) Class2_Sub1_Sub4 local8 = Static65.method1339(this.anInt2505);
		@Pc(24) Class2_Sub1_Sub1_Sub5 local24;
		if (this.aBoolean146) {
			local24 = local8.method715(-1);
		} else {
			local24 = local8.method715(this.anInt2502);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	public void method1657(@OriginalArg(1) int arg0) {
		if (this.aBoolean146) {
			return;
		}
		this.anInt2498 += arg0;
		while (this.anInt2498 > this.aClass2_Sub1_Sub9_3.anIntArray144[this.anInt2502]) {
			this.anInt2498 -= this.aClass2_Sub1_Sub9_3.anIntArray144[this.anInt2502];
			this.anInt2502++;
			if (this.aClass2_Sub1_Sub9_3.anIntArray147.length <= this.anInt2502) {
				this.aBoolean146 = true;
				return;
			}
		}
	}
}
