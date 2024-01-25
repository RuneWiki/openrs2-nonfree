import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class208 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	private int anInt5678 = 0;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	private int anInt5680 = -1;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Lclient!sm;")
	private Class210 aClass210_45 = new Class210();

	@OriginalMember(owner = "client!si", name = "m", descriptor = "Z")
	public boolean aBoolean443 = false;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	private final int anInt5684;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	private final int anInt5677;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "[Lclient!no;")
	private Class2_Sub27[] aClass2_Sub27Array1;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(III)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5684 = arg0;
		this.anInt5677 = arg1;
		this.aClass2_Sub27Array1 = new Class2_Sub27[this.anInt5677];
		this.anIntArrayArrayArray12 = new int[this.anInt5684][3][arg2];
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public void method4984() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5684; local3++) {
			this.anIntArrayArrayArray12[local3][0] = null;
			this.anIntArrayArrayArray12[local3][1] = null;
			this.anIntArrayArrayArray12[local3][2] = null;
			this.anIntArrayArrayArray12[local3] = null;
		}
		this.anIntArrayArrayArray12 = null;
		this.aClass2_Sub27Array1 = null;
		this.aClass210_45.method5043();
		this.aClass210_45 = null;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)[[[I")
	public int[][][] method4985() {
		if (this.anInt5684 != this.anInt5677) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5684; local25++) {
			this.aClass2_Sub27Array1[local25] = Static238.aClass2_Sub27_1;
		}
		return this.anIntArrayArrayArray12;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)[[I")
	public int[][] method4986(@OriginalArg(1) int arg0) {
		if (this.anInt5684 == this.anInt5677) {
			this.aBoolean443 = this.aClass2_Sub27Array1[arg0] == null;
			this.aClass2_Sub27Array1[arg0] = Static238.aClass2_Sub27_1;
			return this.anIntArrayArrayArray12[arg0];
		} else if (this.anInt5684 == 1) {
			this.aBoolean443 = this.anInt5680 != arg0;
			this.anInt5680 = arg0;
			return this.anIntArrayArrayArray12[0];
		} else {
			@Pc(50) Class2_Sub27 local50 = this.aClass2_Sub27Array1[arg0];
			if (local50 == null) {
				this.aBoolean443 = true;
				if (this.anInt5678 >= this.anInt5684) {
					@Pc(71) Class2_Sub27 local71 = (Class2_Sub27) this.aClass210_45.method5036();
					local50 = new Class2_Sub27(arg0, local71.anInt4386);
					this.aClass2_Sub27Array1[local71.anInt4387] = null;
					local71.method5745();
				} else {
					local50 = new Class2_Sub27(arg0, this.anInt5678);
					this.anInt5678++;
				}
				this.aClass2_Sub27Array1[arg0] = local50;
			} else {
				this.aBoolean443 = false;
			}
			this.aClass210_45.method5032(local50);
			return this.anIntArrayArrayArray12[local50.anInt4386];
		}
	}
}
