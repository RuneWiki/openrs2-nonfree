import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class170 {

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
	private int anInt4424 = -1;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
	private int anInt4427 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!mg;")
	private Class156 aClass156_34 = new Class156();

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "Z")
	public boolean aBoolean317 = false;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
	private final int anInt4426;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	private final int anInt4422;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lclient!bq;")
	private Class2_Sub7[] aClass2_Sub7Array1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(III)V")
	public Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4426 = arg0;
		this.anInt4422 = arg1;
		this.anIntArrayArray31 = new int[this.anInt4426][arg2];
		this.aClass2_Sub7Array1 = new Class2_Sub7[this.anInt4422];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[I")
	public int[] method3645(@OriginalArg(0) int arg0) {
		if (this.anInt4426 == this.anInt4422) {
			this.aBoolean317 = this.aClass2_Sub7Array1[arg0] == null;
			this.aClass2_Sub7Array1[arg0] = Static5.aClass2_Sub7_1;
			return this.anIntArrayArray31[arg0];
		} else if (this.anInt4426 == 1) {
			this.aBoolean317 = this.anInt4424 != arg0;
			this.anInt4424 = arg0;
			return this.anIntArrayArray31[0];
		} else {
			@Pc(68) Class2_Sub7 local68 = this.aClass2_Sub7Array1[arg0];
			if (local68 == null) {
				this.aBoolean317 = true;
				if (this.anInt4427 >= this.anInt4426) {
					@Pc(93) Class2_Sub7 local93 = (Class2_Sub7) this.aClass156_34.method3163();
					local68 = new Class2_Sub7(arg0, local93.anInt699);
					this.aClass2_Sub7Array1[local93.anInt698] = null;
					local93.method5703();
				} else {
					local68 = new Class2_Sub7(arg0, this.anInt4427);
					this.anInt4427++;
				}
				this.aClass2_Sub7Array1[arg0] = local68;
			} else {
				this.aBoolean317 = false;
			}
			this.aClass156_34.method3159(local68);
			return this.anIntArrayArray31[local68.anInt699];
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)[[I")
	public int[][] method3646() {
		if (this.anInt4426 != this.anInt4422) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4426; local21++) {
			this.aClass2_Sub7Array1[local21] = Static5.aClass2_Sub7_1;
		}
		return this.anIntArrayArray31;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method3648() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4426; local3++) {
			this.anIntArrayArray31[local3] = null;
		}
		this.aClass2_Sub7Array1 = null;
		this.anIntArrayArray31 = null;
		this.aClass156_34.method3161();
		this.aClass156_34 = null;
	}
}
