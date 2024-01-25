import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class155 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	private int anInt4202 = -1;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	private int anInt4205 = 0;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Lclient!gk;")
	private Class112 aClass112_26 = new Class112();

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Z")
	public boolean aBoolean306 = false;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "I")
	private final int anInt4203;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	private final int anInt4207;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "[Lclient!ub;")
	private Class3_Sub47[] aClass3_Sub47Array1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(III)V")
	public Class155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4203 = arg1;
		this.anInt4207 = arg0;
		this.anIntArrayArrayArray9 = new int[this.anInt4207][3][arg2];
		this.aClass3_Sub47Array1 = new Class3_Sub47[this.anInt4203];
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)[[[I")
	public int[][][] method3665() {
		if (this.anInt4203 != this.anInt4207) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4207; local17++) {
			this.aClass3_Sub47Array1[local17] = Static203.aClass3_Sub47_3;
		}
		return this.anIntArrayArrayArray9;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I")
	public int[][] method3666(@OriginalArg(1) int arg0) {
		if (this.anInt4203 == this.anInt4207) {
			this.aBoolean306 = this.aClass3_Sub47Array1[arg0] == null;
			this.aClass3_Sub47Array1[arg0] = Static203.aClass3_Sub47_3;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt4207 == 1) {
			this.aBoolean306 = this.anInt4202 != arg0;
			this.anInt4202 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(72) Class3_Sub47 local72 = this.aClass3_Sub47Array1[arg0];
			if (local72 == null) {
				this.aBoolean306 = true;
				if (this.anInt4205 >= this.anInt4207) {
					@Pc(92) Class3_Sub47 local92 = (Class3_Sub47) this.aClass112_26.method3086();
					local72 = new Class3_Sub47(arg0, local92.anInt8393);
					this.aClass3_Sub47Array1[local92.anInt8392] = null;
					local92.method7825();
				} else {
					local72 = new Class3_Sub47(arg0, this.anInt4205);
					this.anInt4205++;
				}
				this.aClass3_Sub47Array1[arg0] = local72;
			} else {
				this.aBoolean306 = false;
			}
			this.aClass112_26.method3091(local72);
			return this.anIntArrayArrayArray9[local72.anInt8393];
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	public void method3667() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4207; local3++) {
			this.anIntArrayArrayArray9[local3][0] = null;
			this.anIntArrayArrayArray9[local3][1] = null;
			this.anIntArrayArrayArray9[local3][2] = null;
			this.anIntArrayArrayArray9[local3] = null;
		}
		this.aClass3_Sub47Array1 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass112_26.method3092();
		this.aClass112_26 = null;
	}
}
