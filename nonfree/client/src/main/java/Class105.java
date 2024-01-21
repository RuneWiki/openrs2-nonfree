import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class105 {

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	private int anInt4076 = -1;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	private int anInt4078 = 0;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "Lclient!sg;")
	private Class91 aClass91_20 = new Class91();

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "Z")
	public boolean aBoolean183 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	private final int anInt4075;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
	private final int anInt4079;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "[Lclient!qf;")
	private Class5_Sub24[] aClass5_Sub24Array1;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(III)V")
	public Class105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4075 = arg1;
		this.anInt4079 = arg0;
		this.aClass5_Sub24Array1 = new Class5_Sub24[this.anInt4075];
		this.anIntArrayArrayArray14 = new int[this.anInt4079][3][arg2];
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
	public int[][] method3106(@OriginalArg(1) int arg0) {
		if (this.anInt4079 == this.anInt4075) {
			this.aBoolean183 = this.aClass5_Sub24Array1[arg0] == null;
			this.aClass5_Sub24Array1[arg0] = Static79.aClass5_Sub24_1;
			return this.anIntArrayArrayArray14[arg0];
		} else if (this.anInt4079 == 1) {
			this.aBoolean183 = this.anInt4076 != arg0;
			this.anInt4076 = arg0;
			return this.anIntArrayArrayArray14[0];
		} else {
			@Pc(66) Class5_Sub24 local66 = this.aClass5_Sub24Array1[arg0];
			if (local66 == null) {
				this.aBoolean183 = true;
				if (this.anInt4079 <= this.anInt4078) {
					@Pc(91) Class5_Sub24 local91 = (Class5_Sub24) this.aClass91_20.method2687();
					local66 = new Class5_Sub24(arg0, local91.anInt3188);
					this.aClass5_Sub24Array1[local91.anInt3194] = null;
					local91.method3207();
				} else {
					local66 = new Class5_Sub24(arg0, this.anInt4078);
					this.anInt4078++;
				}
				this.aClass5_Sub24Array1[arg0] = local66;
			} else {
				this.aBoolean183 = false;
			}
			this.aClass91_20.method2681(local66);
			return this.anIntArrayArrayArray14[local66.anInt3188];
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public void method3107() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4079; local3++) {
			this.anIntArrayArrayArray14[local3][0] = null;
			this.anIntArrayArrayArray14[local3][1] = null;
			this.anIntArrayArrayArray14[local3][2] = null;
			this.anIntArrayArrayArray14[local3] = null;
		}
		this.aClass5_Sub24Array1 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass91_20.method2682();
		this.aClass91_20 = null;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)[[[I")
	public int[][][] method3108() {
		if (this.anInt4075 != this.anInt4079) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4079; local17++) {
			this.aClass5_Sub24Array1[local17] = Static79.aClass5_Sub24_1;
		}
		return this.anIntArrayArrayArray14;
	}
}
