import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class214 {

	@OriginalMember(owner = "client!st", name = "e", descriptor = "I")
	private int anInt6598 = -1;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "I")
	private int anInt6600 = 0;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "Lclient!tu;")
	private Class229 aClass229_40 = new Class229();

	@OriginalMember(owner = "client!st", name = "s", descriptor = "Z")
	public boolean aBoolean455 = false;

	@OriginalMember(owner = "client!st", name = "l", descriptor = "I")
	private final int anInt6604;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "I")
	private final int anInt6596;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "[Lclient!cp;")
	private Class3_Sub9[] aClass3_Sub9Array1;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(III)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6604 = arg0;
		this.anInt6596 = arg1;
		this.aClass3_Sub9Array1 = new Class3_Sub9[this.anInt6596];
		this.anIntArrayArrayArray12 = new int[this.anInt6604][3][arg2];
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)[[[I")
	public int[][][] method5171() {
		if (this.anInt6596 != this.anInt6604) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt6604; local28++) {
			this.aClass3_Sub9Array1[local28] = Static433.aClass3_Sub9_1;
		}
		return this.anIntArrayArrayArray12;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	public void method5175() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6604; local3++) {
			this.anIntArrayArrayArray12[local3][0] = null;
			this.anIntArrayArrayArray12[local3][1] = null;
			this.anIntArrayArrayArray12[local3][2] = null;
			this.anIntArrayArrayArray12[local3] = null;
		}
		this.anIntArrayArrayArray12 = null;
		this.aClass3_Sub9Array1 = null;
		this.aClass229_40.method5326();
		this.aClass229_40 = null;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)[[I")
	public int[][] method5177(@OriginalArg(0) int arg0) {
		if (this.anInt6596 == this.anInt6604) {
			this.aBoolean455 = this.aClass3_Sub9Array1[arg0] == null;
			this.aClass3_Sub9Array1[arg0] = Static433.aClass3_Sub9_1;
			return this.anIntArrayArrayArray12[arg0];
		} else if (this.anInt6604 == 1) {
			this.aBoolean455 = arg0 != this.anInt6598;
			this.anInt6598 = arg0;
			return this.anIntArrayArrayArray12[0];
		} else {
			@Pc(49) Class3_Sub9 local49 = this.aClass3_Sub9Array1[arg0];
			if (local49 == null) {
				this.aBoolean455 = true;
				if (this.anInt6600 < this.anInt6604) {
					local49 = new Class3_Sub9(arg0, this.anInt6600);
					this.anInt6600++;
				} else {
					@Pc(89) Class3_Sub9 local89 = (Class3_Sub9) this.aClass229_40.method5318();
					local49 = new Class3_Sub9(arg0, local89.anInt1424);
					this.aClass3_Sub9Array1[local89.anInt1422] = null;
					local89.method5987();
				}
				this.aClass3_Sub9Array1[arg0] = local49;
			} else {
				this.aBoolean455 = false;
			}
			this.aClass229_40.method5320(local49);
			return this.anIntArrayArrayArray12[local49.anInt1424];
		}
	}
}
