import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class135 {

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
	private int anInt3819 = 0;

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
	private int anInt3821 = -1;

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "Lclient!au;")
	private Class22 aClass22_21 = new Class22();

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
	private final int anInt3820;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
	private final int anInt3823;

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "[Lclient!tl;")
	private Class4_Sub48[] aClass4_Sub48Array1;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(III)V")
	public Class135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3820 = arg1;
		this.anInt3823 = arg0;
		this.aClass4_Sub48Array1 = new Class4_Sub48[this.anInt3820];
		this.anIntArrayArray19 = new int[this.anInt3823][arg2];
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	public void method3006() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3823; local3++) {
			this.anIntArrayArray19[local3] = null;
		}
		this.aClass4_Sub48Array1 = null;
		this.anIntArrayArray19 = null;
		this.aClass22_21.method886();
		this.aClass22_21 = null;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)[[I")
	public int[][] method3010() {
		if (this.anInt3820 != this.anInt3823) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt3823; local22++) {
			this.aClass4_Sub48Array1[local22] = Static84.aClass4_Sub48_1;
		}
		return this.anIntArrayArray19;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)[I")
	public int[] method3011(@OriginalArg(1) int arg0) {
		if (this.anInt3823 == this.anInt3820) {
			this.aBoolean278 = this.aClass4_Sub48Array1[arg0] == null;
			this.aClass4_Sub48Array1[arg0] = Static84.aClass4_Sub48_1;
			return this.anIntArrayArray19[arg0];
		} else if (this.anInt3823 == 1) {
			this.aBoolean278 = this.anInt3821 != arg0;
			this.anInt3821 = arg0;
			return this.anIntArrayArray19[0];
		} else {
			@Pc(68) Class4_Sub48 local68 = this.aClass4_Sub48Array1[arg0];
			if (local68 == null) {
				this.aBoolean278 = true;
				if (this.anInt3823 <= this.anInt3819) {
					@Pc(93) Class4_Sub48 local93 = (Class4_Sub48) this.aClass22_21.method885();
					local68 = new Class4_Sub48(arg0, local93.anInt9508);
					this.aClass4_Sub48Array1[local93.anInt9507] = null;
					local93.method8193();
				} else {
					local68 = new Class4_Sub48(arg0, this.anInt3819);
					this.anInt3819++;
				}
				this.aClass4_Sub48Array1[arg0] = local68;
			} else {
				this.aBoolean278 = false;
			}
			this.aClass22_21.method892(local68);
			return this.anIntArrayArray19[local68.anInt9508];
		}
	}
}
