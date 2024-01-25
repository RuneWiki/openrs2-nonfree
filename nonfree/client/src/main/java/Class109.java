import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class109 {

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
	private int anInt2683 = -1;

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
	private int anInt2686 = 0;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Lclient!vp;")
	private Class254 aClass254_16 = new Class254();

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
	private final int anInt2685;

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
	private final int anInt2684;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "[Lclient!tc;")
	private Class1_Sub41[] aClass1_Sub41Array1;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(III)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2685 = arg0;
		this.anInt2684 = arg1;
		this.anIntArrayArray69 = new int[this.anInt2685][arg2];
		this.aClass1_Sub41Array1 = new Class1_Sub41[this.anInt2684];
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)[I")
	public int[] method2236(@OriginalArg(0) int arg0) {
		if (this.anInt2685 == this.anInt2684) {
			this.aBoolean214 = this.aClass1_Sub41Array1[arg0] == null;
			this.aClass1_Sub41Array1[arg0] = Static358.aClass1_Sub41_1;
			return this.anIntArrayArray69[arg0];
		} else if (this.anInt2685 == 1) {
			this.aBoolean214 = this.anInt2683 != arg0;
			this.anInt2683 = arg0;
			return this.anIntArrayArray69[0];
		} else {
			@Pc(45) Class1_Sub41 local45 = this.aClass1_Sub41Array1[arg0];
			if (local45 == null) {
				this.aBoolean214 = true;
				if (this.anInt2685 <= this.anInt2686) {
					@Pc(65) Class1_Sub41 local65 = (Class1_Sub41) this.aClass254_16.method5439();
					local45 = new Class1_Sub41(arg0, local65.anInt6331);
					this.aClass1_Sub41Array1[local65.anInt6330] = null;
					local65.method5617();
				} else {
					local45 = new Class1_Sub41(arg0, this.anInt2686);
					this.anInt2686++;
				}
				this.aClass1_Sub41Array1[arg0] = local45;
			} else {
				this.aBoolean214 = false;
			}
			this.aClass254_16.method5440(local45);
			return this.anIntArrayArray69[local45.anInt6331];
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)[[I")
	public int[][] method2239() {
		if (this.anInt2685 != this.anInt2684) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2685; local25++) {
			this.aClass1_Sub41Array1[local25] = Static358.aClass1_Sub41_1;
		}
		return this.anIntArrayArray69;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
	public void method2240() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2685; local3++) {
			this.anIntArrayArray69[local3] = null;
		}
		this.anIntArrayArray69 = null;
		this.aClass1_Sub41Array1 = null;
		this.aClass254_16.method5438();
		this.aClass254_16 = null;
	}
}
