import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class326 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
	private int anInt8970 = -1;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	private int anInt8972 = 0;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Lclient!qw;")
	private Class302 aClass302_62 = new Class302();

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "Z")
	public boolean aBoolean628 = false;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	private final int anInt8977;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	private final int anInt8973;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "[Lclient!haa;")
	private Class3_Sub23[] aClass3_Sub23Array1;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
	public Class326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8977 = arg1;
		this.anInt8973 = arg0;
		this.aClass3_Sub23Array1 = new Class3_Sub23[this.anInt8977];
		this.anIntArrayArrayArray17 = new int[this.anInt8973][3][arg2];
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)[[[I")
	public int[][][] method7327() {
		if (this.anInt8977 != this.anInt8973) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt8973; local17++) {
			this.aClass3_Sub23Array1[local17] = Static335.aClass3_Sub23_1;
		}
		return this.anIntArrayArrayArray17;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	public void method7328() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8973; local3++) {
			this.anIntArrayArrayArray17[local3][0] = null;
			this.anIntArrayArrayArray17[local3][1] = null;
			this.anIntArrayArrayArray17[local3][2] = null;
			this.anIntArrayArrayArray17[local3] = null;
		}
		this.anIntArrayArrayArray17 = null;
		this.aClass3_Sub23Array1 = null;
		this.aClass302_62.method6614();
		this.aClass302_62 = null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)[[I")
	public int[][] method7329(@OriginalArg(0) int arg0) {
		if (this.anInt8973 == this.anInt8977) {
			this.aBoolean628 = this.aClass3_Sub23Array1[arg0] == null;
			this.aClass3_Sub23Array1[arg0] = Static335.aClass3_Sub23_1;
			return this.anIntArrayArrayArray17[arg0];
		} else if (this.anInt8973 == 1) {
			this.aBoolean628 = this.anInt8970 != arg0;
			this.anInt8970 = arg0;
			return this.anIntArrayArrayArray17[0];
		} else {
			@Pc(48) Class3_Sub23 local48 = this.aClass3_Sub23Array1[arg0];
			if (local48 == null) {
				this.aBoolean628 = true;
				if (this.anInt8973 <= this.anInt8972) {
					@Pc(69) Class3_Sub23 local69 = (Class3_Sub23) this.aClass302_62.method6602();
					local48 = new Class3_Sub23(arg0, local69.anInt3718);
					this.aClass3_Sub23Array1[local69.anInt3717] = null;
					local69.method9034();
				} else {
					local48 = new Class3_Sub23(arg0, this.anInt8972);
					this.anInt8972++;
				}
				this.aClass3_Sub23Array1[arg0] = local48;
			} else {
				this.aBoolean628 = false;
			}
			this.aClass302_62.method6610(local48);
			return this.anIntArrayArrayArray17[local48.anInt3718];
		}
	}
}
