import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class146 {

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	private int anInt4545 = -1;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
	private int anInt4549 = 0;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "Lclient!tu;")
	private Class229 aClass229_29 = new Class229();

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "Z")
	public boolean aBoolean342 = false;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
	private final int anInt4542;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
	private final int anInt4547;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "[Lclient!pu;")
	private Class3_Sub33[] aClass3_Sub33Array1;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(III)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4542 = arg0;
		this.anInt4547 = arg1;
		this.anIntArrayArray36 = new int[this.anInt4542][arg2];
		this.aClass3_Sub33Array1 = new Class3_Sub33[this.anInt4547];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)[I")
	public int[] method3700(@OriginalArg(1) int arg0) {
		if (this.anInt4542 == this.anInt4547) {
			this.aBoolean342 = this.aClass3_Sub33Array1[arg0] == null;
			this.aClass3_Sub33Array1[arg0] = Static297.aClass3_Sub33_2;
			return this.anIntArrayArray36[arg0];
		} else if (this.anInt4542 == 1) {
			this.aBoolean342 = arg0 != this.anInt4545;
			this.anInt4545 = arg0;
			return this.anIntArrayArray36[0];
		} else {
			@Pc(48) Class3_Sub33 local48 = this.aClass3_Sub33Array1[arg0];
			if (local48 == null) {
				this.aBoolean342 = true;
				if (this.anInt4542 > this.anInt4549) {
					local48 = new Class3_Sub33(arg0, this.anInt4549);
					this.anInt4549++;
				} else {
					@Pc(79) Class3_Sub33 local79 = (Class3_Sub33) this.aClass229_29.method5318();
					local48 = new Class3_Sub33(arg0, local79.anInt5749);
					this.aClass3_Sub33Array1[local79.anInt5747] = null;
					local79.method5987();
				}
				this.aClass3_Sub33Array1[arg0] = local48;
			} else {
				this.aBoolean342 = false;
			}
			this.aClass229_29.method5320(local48);
			return this.anIntArrayArray36[local48.anInt5749];
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)[[I")
	public int[][] method3701() {
		if (this.anInt4542 != this.anInt4547) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt4542; local22++) {
			this.aClass3_Sub33Array1[local22] = Static297.aClass3_Sub33_2;
		}
		return this.anIntArrayArray36;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public void method3703() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4542; local7++) {
			this.anIntArrayArray36[local7] = null;
		}
		this.anIntArrayArray36 = null;
		this.aClass3_Sub33Array1 = null;
		this.aClass229_29.method5326();
		this.aClass229_29 = null;
	}
}
