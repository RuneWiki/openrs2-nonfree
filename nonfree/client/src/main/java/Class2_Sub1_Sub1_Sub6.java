import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class2_Sub1_Sub1_Sub6 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
	private int anInt1359 = 0;

	@OriginalMember(owner = "client!ja", name = "Bb", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!ja", name = "Ab", descriptor = "I")
	private int anInt1369 = 0;

	@OriginalMember(owner = "client!ja", name = "kb", descriptor = "I")
	public final int anInt1358;

	@OriginalMember(owner = "client!ja", name = "mb", descriptor = "I")
	public final int anInt1360;

	@OriginalMember(owner = "client!ja", name = "vb", descriptor = "I")
	public final int anInt1366;

	@OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
	public final int anInt1361;

	@OriginalMember(owner = "client!ja", name = "Cb", descriptor = "I")
	private final int anInt1370;

	@OriginalMember(owner = "client!ja", name = "rb", descriptor = "I")
	public final int anInt1364;

	@OriginalMember(owner = "client!ja", name = "ob", descriptor = "Lclient!nc;")
	private Class2_Sub1_Sub7 aClass2_Sub1_Sub7_3;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1358 = arg3;
		this.anInt1360 = arg5 + arg6;
		this.anInt1366 = arg1;
		this.anInt1361 = arg4;
		this.anInt1370 = arg0;
		this.anInt1364 = arg2;
		@Pc(36) int local36 = Static63.method291(this.anInt1370).anInt2810;
		if (local36 == -1) {
			this.aBoolean98 = true;
		} else {
			this.aBoolean98 = false;
			this.aClass2_Sub1_Sub7_3 = Static40.method724(local36);
		}
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)Lclient!ad;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method2168() {
		@Pc(12) Class2_Sub1_Sub14 local12 = Static63.method291(this.anInt1370);
		@Pc(21) Class2_Sub1_Sub1_Sub2 local21;
		if (this.aBoolean98) {
			local21 = local12.method2026(-1);
		} else {
			local21 = local12.method2026(this.anInt1369);
		}
		return local21 == null ? null : local21;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
	public void method919(@OriginalArg(0) int arg0) {
		if (this.aBoolean98) {
			return;
		}
		this.anInt1359 += arg0;
		while (this.aClass2_Sub1_Sub7_3.anIntArray210[this.anInt1369] < this.anInt1359) {
			this.anInt1359 -= this.aClass2_Sub1_Sub7_3.anIntArray210[this.anInt1369];
			this.anInt1369++;
			if (this.anInt1369 >= this.aClass2_Sub1_Sub7_3.anIntArray212.length) {
				this.aBoolean98 = true;
				return;
			}
		}
	}
}
