import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class174 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
	private int anInt4333 = 0;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	private int anInt4337 = -1;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Lclient!rh;")
	private Class275 aClass275_88 = new Class275();

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Z")
	public boolean aBoolean271 = false;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	private final int anInt4340;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	private final int anInt4336;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "[Lclient!kn;")
	private Class6_Sub30[] aClass6_Sub30Array1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(III)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4340 = arg1;
		this.anInt4336 = arg0;
		this.anIntArrayArray52 = new int[this.anInt4336][arg2];
		this.aClass6_Sub30Array1 = new Class6_Sub30[this.anInt4340];
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)[[I")
	public int[][] method3727() {
		if (this.anInt4340 != this.anInt4336) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(19) int local19 = 0; local19 < this.anInt4336; local19++) {
			this.aClass6_Sub30Array1[local19] = Static397.aClass6_Sub30_3;
		}
		return this.anIntArrayArray52;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	public void method3730() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4336; local3++) {
			this.anIntArrayArray52[local3] = null;
		}
		this.aClass6_Sub30Array1 = null;
		this.anIntArrayArray52 = null;
		this.aClass275_88.method6357();
		this.aClass275_88 = null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[I")
	public int[] method3731(@OriginalArg(0) int arg0) {
		if (this.anInt4336 == this.anInt4340) {
			this.aBoolean271 = this.aClass6_Sub30Array1[arg0] == null;
			this.aClass6_Sub30Array1[arg0] = Static397.aClass6_Sub30_3;
			return this.anIntArrayArray52[arg0];
		} else if (this.anInt4336 == 1) {
			this.aBoolean271 = this.anInt4337 != arg0;
			this.anInt4337 = arg0;
			return this.anIntArrayArray52[0];
		} else {
			@Pc(72) Class6_Sub30 local72 = this.aClass6_Sub30Array1[arg0];
			if (local72 == null) {
				this.aBoolean271 = true;
				if (this.anInt4336 <= this.anInt4333) {
					@Pc(92) Class6_Sub30 local92 = (Class6_Sub30) this.aClass275_88.method6369();
					local72 = new Class6_Sub30(arg0, local92.anInt4406);
					this.aClass6_Sub30Array1[local92.anInt4405] = null;
					local92.method7849();
				} else {
					local72 = new Class6_Sub30(arg0, this.anInt4333);
					this.anInt4333++;
				}
				this.aClass6_Sub30Array1[arg0] = local72;
			} else {
				this.aBoolean271 = false;
			}
			this.aClass275_88.method6368(local72);
			return this.anIntArrayArray52[local72.anInt4406];
		}
	}
}
