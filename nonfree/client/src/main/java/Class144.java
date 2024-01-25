import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class144 {

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	private int anInt4369 = -1;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
	private int anInt4374 = 0;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "Lclient!bb;")
	private Class16 aClass16_26 = new Class16();

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "Z")
	public boolean aBoolean415 = false;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	private final int anInt4364;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	private final int anInt4373;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lclient!wk;")
	private Class1_Sub43[] aClass1_Sub43Array1;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(III)V")
	public Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4364 = arg0;
		this.anInt4373 = arg1;
		this.aClass1_Sub43Array1 = new Class1_Sub43[this.anInt4373];
		this.anIntArrayArrayArray14 = new int[this.anInt4364][3][arg2];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[[I")
	public int[][] method3947(@OriginalArg(0) int arg0) {
		if (this.anInt4364 == this.anInt4373) {
			this.aBoolean415 = this.aClass1_Sub43Array1[arg0] == null;
			this.aClass1_Sub43Array1[arg0] = Static244.aClass1_Sub43_1;
			return this.anIntArrayArrayArray14[arg0];
		} else if (this.anInt4364 == 1) {
			this.aBoolean415 = this.anInt4369 != arg0;
			this.anInt4369 = arg0;
			return this.anIntArrayArrayArray14[0];
		} else {
			@Pc(24) Class1_Sub43 local24 = this.aClass1_Sub43Array1[arg0];
			if (local24 == null) {
				this.aBoolean415 = true;
				if (this.anInt4364 > this.anInt4374) {
					local24 = new Class1_Sub43(arg0, this.anInt4374);
					this.anInt4374++;
				} else {
					@Pc(59) Class1_Sub43 local59 = (Class1_Sub43) this.aClass16_26.method420();
					local24 = new Class1_Sub43(arg0, local59.anInt6702);
					this.aClass1_Sub43Array1[local59.anInt6700] = null;
					local59.method5628();
				}
				this.aClass1_Sub43Array1[arg0] = local24;
			} else {
				this.aBoolean415 = false;
			}
			this.aClass16_26.method411(local24);
			return this.anIntArrayArrayArray14[local24.anInt6702];
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)[[[I")
	public int[][][] method3949() {
		if (this.anInt4364 != this.anInt4373) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4364; local21++) {
			this.aClass1_Sub43Array1[local21] = Static244.aClass1_Sub43_1;
		}
		return this.anIntArrayArrayArray14;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public void method3950() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4364; local7++) {
			this.anIntArrayArrayArray14[local7][0] = null;
			this.anIntArrayArrayArray14[local7][1] = null;
			this.anIntArrayArrayArray14[local7][2] = null;
			this.anIntArrayArrayArray14[local7] = null;
		}
		this.anIntArrayArrayArray14 = null;
		this.aClass1_Sub43Array1 = null;
		this.aClass16_26.method421();
		this.aClass16_26 = null;
	}
}
