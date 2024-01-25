import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class207 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	private int anInt5638 = -1;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
	private int anInt5642 = 0;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Lclient!mg;")
	private Class156 aClass156_50 = new Class156();

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
	private final int anInt5644;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	private final int anInt5646;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "[Lclient!iu;")
	private Class2_Sub25[] aClass2_Sub25Array1;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(III)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5644 = arg0;
		this.anInt5646 = arg1;
		this.anIntArrayArrayArray13 = new int[this.anInt5644][3][arg2];
		this.aClass2_Sub25Array1 = new Class2_Sub25[this.anInt5646];
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method4462() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5644; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass2_Sub25Array1 = null;
		this.aClass156_50.method3161();
		this.aClass156_50 = null;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)[[[I")
	public int[][][] method4464() {
		if (this.anInt5646 != this.anInt5644) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt5644; local22++) {
			this.aClass2_Sub25Array1[local22] = Static358.aClass2_Sub25_3;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[[I")
	public int[][] method4467(@OriginalArg(0) int arg0) {
		if (this.anInt5644 == this.anInt5646) {
			this.aBoolean419 = this.aClass2_Sub25Array1[arg0] == null;
			this.aClass2_Sub25Array1[arg0] = Static358.aClass2_Sub25_3;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt5644 == 1) {
			this.aBoolean419 = arg0 != this.anInt5638;
			this.anInt5638 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(48) Class2_Sub25 local48 = this.aClass2_Sub25Array1[arg0];
			if (local48 == null) {
				this.aBoolean419 = true;
				if (this.anInt5644 <= this.anInt5642) {
					@Pc(71) Class2_Sub25 local71 = (Class2_Sub25) this.aClass156_50.method3163();
					local48 = new Class2_Sub25(arg0, local71.anInt3092);
					this.aClass2_Sub25Array1[local71.anInt3091] = null;
					local71.method5703();
				} else {
					local48 = new Class2_Sub25(arg0, this.anInt5642);
					this.anInt5642++;
				}
				this.aClass2_Sub25Array1[arg0] = local48;
			} else {
				this.aBoolean419 = false;
			}
			this.aClass156_50.method3159(local48);
			return this.anIntArrayArrayArray13[local48.anInt3092];
		}
	}
}
