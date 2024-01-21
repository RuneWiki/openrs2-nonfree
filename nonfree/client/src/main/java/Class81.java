import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class81 {

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
	private int anInt3834 = -1;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	private int anInt3839 = 0;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Lclient!vb;")
	private Class84 aClass84_14 = new Class84();

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Z")
	public boolean aBoolean153 = false;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[Lclient!wf;")
	private Class2_Sub25[] aClass2_Sub25Array1;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	private final int anInt3841;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	private final int anInt3832;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(III)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub25Array1 = new Class2_Sub25[arg1];
		this.anInt3841 = arg0;
		this.anInt3832 = arg1;
		this.anIntArrayArray71 = new int[arg0][arg2];
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
	public int[] method2606(@OriginalArg(1) int arg0) {
		if (this.anInt3832 == this.anInt3841) {
			this.aBoolean153 = this.aClass2_Sub25Array1[arg0] == null;
			this.aClass2_Sub25Array1[arg0] = Static4.aClass2_Sub25_1;
			return this.anIntArrayArray71[arg0];
		} else if (this.anInt3841 == 1) {
			this.aBoolean153 = arg0 != this.anInt3834;
			this.anInt3834 = arg0;
			return this.anIntArrayArray71[0];
		} else {
			@Pc(44) Class2_Sub25 local44 = this.aClass2_Sub25Array1[arg0];
			if (this.aBoolean153 = local44 == null) {
				if (this.anInt3839 >= this.anInt3841) {
					@Pc(64) Class2_Sub25 local64 = (Class2_Sub25) this.aClass84_14.method2690();
					local44 = new Class2_Sub25(arg0, local64.anInt4186);
					this.aClass2_Sub25Array1[local64.anInt4189] = null;
					local64.method2808();
				} else {
					local44 = new Class2_Sub25(arg0, this.anInt3839);
					this.anInt3839++;
				}
				this.aClass2_Sub25Array1[arg0] = local44;
			}
			this.aClass84_14.method2702(local44);
			return this.anIntArrayArray71[local44.anInt4186];
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)[[I")
	public int[][] method2607() {
		if (this.anInt3832 != this.anInt3841) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3841; local17++) {
			this.aClass2_Sub25Array1[local17] = Static4.aClass2_Sub25_1;
		}
		return this.anIntArrayArray71;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public void method2608() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt3841; local8++) {
			this.anIntArrayArray71[local8] = null;
		}
		this.anIntArrayArray71 = null;
		this.aClass2_Sub25Array1 = null;
		this.aClass84_14.method2695();
		this.aClass84_14 = null;
	}
}
