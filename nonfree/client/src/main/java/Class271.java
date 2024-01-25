import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class271 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	private int anInt6881 = 0;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "I")
	private int anInt6884 = -1;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "Lclient!ifa;")
	private Class163 aClass163_48 = new Class163();

	@OriginalMember(owner = "client!op", name = "n", descriptor = "Z")
	public boolean aBoolean534 = false;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	private final int anInt6883;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	private final int anInt6886;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "[Lclient!hga;")
	private Class4_Sub22[] aClass4_Sub22Array1;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(III)V")
	public Class271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6883 = arg1;
		this.anInt6886 = arg0;
		this.anIntArrayArray40 = new int[this.anInt6886][arg2];
		this.aClass4_Sub22Array1 = new Class4_Sub22[this.anInt6883];
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)[[I")
	public int[][] method6063() {
		if (this.anInt6886 != this.anInt6883) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt6886; local21++) {
			this.aClass4_Sub22Array1[local21] = Static647.aClass4_Sub22_1;
		}
		return this.anIntArrayArray40;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(Z)V")
	public void method6066() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6886; local7++) {
			this.anIntArrayArray40[local7] = null;
		}
		this.aClass4_Sub22Array1 = null;
		this.anIntArrayArray40 = null;
		this.aClass163_48.method3643();
		this.aClass163_48 = null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)[I")
	public int[] method6067(@OriginalArg(1) int arg0) {
		if (this.anInt6886 == this.anInt6883) {
			this.aBoolean534 = this.aClass4_Sub22Array1[arg0] == null;
			this.aClass4_Sub22Array1[arg0] = Static647.aClass4_Sub22_1;
			return this.anIntArrayArray40[arg0];
		} else if (this.anInt6886 == 1) {
			this.aBoolean534 = arg0 != this.anInt6884;
			this.anInt6884 = arg0;
			return this.anIntArrayArray40[0];
		} else {
			@Pc(27) Class4_Sub22 local27 = this.aClass4_Sub22Array1[arg0];
			if (local27 == null) {
				this.aBoolean534 = true;
				if (this.anInt6886 > this.anInt6881) {
					local27 = new Class4_Sub22(arg0, this.anInt6881);
					this.anInt6881++;
				} else {
					@Pc(67) Class4_Sub22 local67 = (Class4_Sub22) this.aClass163_48.method3648();
					local27 = new Class4_Sub22(arg0, local67.anInt3530);
					this.aClass4_Sub22Array1[local67.anInt3533] = null;
					local67.method9000();
				}
				this.aClass4_Sub22Array1[arg0] = local27;
			} else {
				this.aBoolean534 = false;
			}
			this.aClass163_48.method3641(local27);
			return this.anIntArrayArray40[local27.anInt3530];
		}
	}
}
