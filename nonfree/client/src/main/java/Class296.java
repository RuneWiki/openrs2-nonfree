import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class296 {

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
	private int anInt8398 = -1;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	private int anInt8399 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!mba;")
	private Class216 aClass216_57 = new Class216();

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "Z")
	public boolean aBoolean608 = false;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	private final int anInt8394;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	private final int anInt8396;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "[Lclient!cda;")
	private Class3_Sub12[] aClass3_Sub12Array1;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray27;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(III)V")
	public Class296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8394 = arg1;
		this.anInt8396 = arg0;
		this.aClass3_Sub12Array1 = new Class3_Sub12[this.anInt8394];
		this.anIntArrayArrayArray27 = new int[this.anInt8396][3][arg2];
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public void method7237() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8396; local7++) {
			this.anIntArrayArrayArray27[local7][0] = null;
			this.anIntArrayArrayArray27[local7][1] = null;
			this.anIntArrayArrayArray27[local7][2] = null;
			this.anIntArrayArrayArray27[local7] = null;
		}
		this.anIntArrayArrayArray27 = null;
		this.aClass3_Sub12Array1 = null;
		this.aClass216_57.method5454();
		this.aClass216_57 = null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[[I")
	public int[][] method7238(@OriginalArg(1) int arg0) {
		if (this.anInt8394 == this.anInt8396) {
			this.aBoolean608 = this.aClass3_Sub12Array1[arg0] == null;
			this.aClass3_Sub12Array1[arg0] = Static300.aClass3_Sub12_12;
			return this.anIntArrayArrayArray27[arg0];
		} else if (this.anInt8396 == 1) {
			this.aBoolean608 = arg0 != this.anInt8398;
			this.anInt8398 = arg0;
			return this.anIntArrayArrayArray27[0];
		} else {
			@Pc(48) Class3_Sub12 local48 = this.aClass3_Sub12Array1[arg0];
			if (local48 == null) {
				this.aBoolean608 = true;
				if (this.anInt8396 <= this.anInt8399) {
					@Pc(64) Class3_Sub12 local64 = (Class3_Sub12) this.aClass216_57.method5456();
					local48 = new Class3_Sub12(arg0, local64.anInt1098);
					this.aClass3_Sub12Array1[local64.anInt1096] = null;
					local64.method8682();
				} else {
					local48 = new Class3_Sub12(arg0, this.anInt8399);
					this.anInt8399++;
				}
				this.aClass3_Sub12Array1[arg0] = local48;
			} else {
				this.aBoolean608 = false;
			}
			this.aClass216_57.method5453(local48);
			return this.anIntArrayArrayArray27[local48.anInt1098];
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)[[[I")
	public int[][][] method7239() {
		if (this.anInt8394 != this.anInt8396) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt8396; local17++) {
			this.aClass3_Sub12Array1[local17] = Static300.aClass3_Sub12_12;
		}
		return this.anIntArrayArrayArray27;
	}
}
