import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class14_Sub31 extends Class14 {

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	public int anInt5958;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	public int anInt5959;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!qk;")
	public Class14_Sub5_Sub4 aClass14_Sub5_Sub4_2;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "Lclient!dfa;")
	public Class14_Sub13 aClass14_Sub13_1;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "Lclient!dga;")
	public Class14_Sub14_Sub1 aClass14_Sub14_Sub1_2;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "Z")
	public boolean aBoolean405;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
	public boolean aBoolean406;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
	public int anInt5962;

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "Z")
	public boolean aBoolean407;

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "Lclient!dfa;")
	public Class14_Sub13 aClass14_Sub13_2;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
	public int anInt5964;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "Lclient!av;")
	public Class12_Sub2_Sub2_Sub1_Sub1 aClass12_Sub2_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
	public int anInt5965;

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
	public int anInt5966;

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "Lclient!qk;")
	public Class14_Sub5_Sub4 aClass14_Sub5_Sub4_3;

	@OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
	public int anInt5967;

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "[I")
	public int[] anIntArray436;

	@OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
	public int anInt5968;

	@OriginalMember(owner = "client!kp", name = "I", descriptor = "Lclient!fb;")
	public Class12_Sub2_Sub2_Sub1_Sub2 aClass12_Sub2_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
	public int anInt5969;

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
	public int anInt5970;

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "Lclient!dga;")
	public Class14_Sub14_Sub1 aClass14_Sub14_Sub1_3;

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "Lclient!kv;")
	public Class203 aClass203_1;

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
	public int anInt5971;

	@OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
	public int anInt5973;

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
	public int anInt5974;

	@OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
	public int anInt5975;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
	public int anInt5960 = 0;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	public void method4985() {
		@Pc(13) int local13 = this.anInt5975;
		@Pc(16) boolean local16 = this.aBoolean407;
		if (this.aClass203_1 != null) {
			@Pc(147) Class203 local147 = this.aClass203_1.method5007(Static595.aClass241_1);
			if (local147 == null) {
				this.anInt5965 = 0;
				this.anInt5967 = 0;
				this.anIntArray436 = null;
				this.aBoolean407 = false;
				this.anInt5966 = 0;
				this.anInt5964 = 256;
				this.anInt5958 = 0;
				this.anInt5962 = 0;
				this.anInt5975 = -1;
				this.anInt5974 = 256;
				this.aBoolean406 = false;
			} else {
				this.anInt5974 = local147.lb;
				this.anInt5975 = local147.anInt6044;
				this.anInt5958 = local147.anInt6040;
				this.anInt5966 = local147.anInt6012;
				this.aBoolean407 = local147.aBoolean424;
				this.anIntArray436 = local147.anIntArray443;
				this.anInt5967 = local147.anInt6056 << 9;
				this.aBoolean406 = local147.aBoolean419;
				this.anInt5962 = local147.anInt6033;
				this.anInt5964 = local147.anInt6036;
			}
		} else if (this.aClass12_Sub2_Sub2_Sub1_Sub1_1 != null) {
			@Pc(64) int local64 = Static55.method1185(this.aClass12_Sub2_Sub2_Sub1_Sub1_1);
			if (local64 != local13) {
				this.anInt5975 = local64;
				@Pc(78) Class283 local78 = this.aClass12_Sub2_Sub2_Sub1_Sub1_1.aClass283_1;
				if (local78.anIntArray638 != null) {
					local78 = local78.method7129(Static595.aClass241_1);
				}
				if (local78 == null) {
					this.anInt5964 = 256;
					this.aBoolean407 = this.aClass12_Sub2_Sub2_Sub1_Sub1_1.aClass283_1.aBoolean614;
					this.anInt5974 = 256;
					this.anInt5958 = this.anInt5967 = this.anInt5965 = 0;
				} else {
					this.anInt5964 = local78.anInt8636;
					this.anInt5974 = local78.anInt8611;
					this.anInt5965 = local78.anInt8624 << 9;
					this.aBoolean407 = local78.aBoolean614;
					this.anInt5967 = local78.anInt8612 << 9;
					this.anInt5958 = local78.anInt8623;
				}
			}
		} else if (this.aClass12_Sub2_Sub2_Sub1_Sub2_1 != null) {
			this.anInt5975 = Static368.method5530(this.aClass12_Sub2_Sub2_Sub1_Sub2_1);
			this.anInt5964 = 256;
			this.anInt5958 = this.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2992;
			this.anInt5967 = this.aClass12_Sub2_Sub2_Sub1_Sub2_1.anInt2976 << 9;
			this.anInt5974 = 256;
			this.aBoolean407 = this.aClass12_Sub2_Sub2_Sub1_Sub2_1.aBoolean228;
			this.anInt5965 = 0;
		}
		if (this.anInt5975 == local13 && this.aBoolean407 == local16) {
			return;
		}
		if (this.aClass14_Sub5_Sub4_2 == null) {
			return;
		}
		Static217.aClass14_Sub5_Sub3_1.method6029(this.aClass14_Sub5_Sub4_2);
		this.aClass14_Sub13_1 = null;
		this.aClass14_Sub14_Sub1_2 = null;
		this.aClass14_Sub5_Sub4_2 = null;
	}
}
