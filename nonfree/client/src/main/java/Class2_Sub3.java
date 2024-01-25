import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	public int anInt337;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "Lclient!sv;")
	public Class2_Sub8_Sub4 aClass2_Sub8_Sub4_1;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
	public int anInt339;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "Lclient!sv;")
	public Class2_Sub8_Sub4 aClass2_Sub8_Sub4_2;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "Lclient!wq;")
	public Class11_Sub5_Sub2_Sub2 aClass11_Sub5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
	public int anInt342;

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
	public int anInt344;

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
	public int anInt345;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "Z")
	public boolean aBoolean15;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "Lclient!oq;")
	public Class192 aClass192_1;

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
	public int anInt347;

	@OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
	public int anInt350;

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	public int anInt351;

	@OriginalMember(owner = "client!ar", name = "I", descriptor = "Lclient!gh;")
	public Class11_Sub5_Sub2_Sub1 aClass11_Sub5_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
	public int anInt338 = 0;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	public void method337() {
		@Pc(6) int local6 = this.anInt349;
		if (this.aClass192_1 != null) {
			@Pc(15) Class192 local15 = this.aClass192_1.method4323(Static63.aClass120_2);
			if (local15 == null) {
				this.anInt339 = 0;
				this.anInt351 = 0;
				this.anInt349 = -1;
				this.anInt337 = 0;
				this.anIntArray36 = null;
				this.anInt344 = 0;
			} else {
				this.anInt351 = local15.anInt5456;
				this.anInt349 = local15.anInt5436;
				this.anInt344 = local15.anInt5458 << 7;
				this.anInt339 = local15.anInt5430;
				this.anIntArray36 = local15.anIntArray463;
				this.anInt337 = local15.anInt5414;
			}
		} else if (this.aClass11_Sub5_Sub2_Sub2_1 != null) {
			@Pc(71) int local71 = Static442.method5943(this.aClass11_Sub5_Sub2_Sub2_1);
			if (local6 != local71) {
				this.anInt349 = local71;
				@Pc(85) Class82 local85 = this.aClass11_Sub5_Sub2_Sub2_1.aClass82_1;
				if (local85.anIntArray149 != null) {
					local85 = local85.method1888(Static63.aClass120_2);
				}
				if (local85 == null) {
					this.anInt337 = this.anInt344 = 0;
				} else {
					this.anInt337 = local85.anInt1954;
					this.anInt344 = local85.anInt1944 << 7;
				}
			}
		} else if (this.aClass11_Sub5_Sub2_Sub1_1 != null) {
			this.anInt349 = Static363.method5111(this.aClass11_Sub5_Sub2_Sub1_1);
			this.anInt344 = this.aClass11_Sub5_Sub2_Sub1_1.anInt2402 << 7;
			this.anInt337 = this.aClass11_Sub5_Sub2_Sub1_1.anInt2416;
		}
		if (this.anInt349 != local6 && this.aClass2_Sub8_Sub4_2 != null) {
			Static414.aClass2_Sub8_Sub1_2.method1041(this.aClass2_Sub8_Sub4_2);
			this.aClass2_Sub8_Sub4_2 = null;
		}
	}
}
