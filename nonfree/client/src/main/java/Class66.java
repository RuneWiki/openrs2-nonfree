import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class66 {

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	private int anInt2953 = 0;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	private int anInt2952 = -1;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!vb;")
	private Class84 aClass84_10 = new Class84();

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Z")
	public boolean aBoolean123 = false;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "[Lclient!tb;")
	private Class2_Sub23[] aClass2_Sub23Array1;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	private final int anInt2951;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	private final int anInt2954;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub23Array1 = new Class2_Sub23[arg1];
		this.anInt2951 = arg1;
		this.anInt2954 = arg0;
		this.anIntArrayArrayArray9 = new int[arg0][3][arg2];
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public void method1970() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2954; local13++) {
			this.anIntArrayArrayArray9[local13][0] = null;
			this.anIntArrayArrayArray9[local13][1] = null;
			this.anIntArrayArrayArray9[local13][2] = null;
			this.anIntArrayArrayArray9[local13] = null;
		}
		this.anIntArrayArrayArray9 = null;
		this.aClass2_Sub23Array1 = null;
		this.aClass84_10.method2695();
		this.aClass84_10 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I")
	public int[][] method1971(@OriginalArg(0) int arg0) {
		if (this.anInt2951 == this.anInt2954) {
			this.aBoolean123 = this.aClass2_Sub23Array1[arg0] == null;
			this.aClass2_Sub23Array1[arg0] = Static36.aClass2_Sub23_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt2954 == 1) {
			this.aBoolean123 = arg0 != this.anInt2952;
			this.anInt2952 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(63) Class2_Sub23 local63 = this.aClass2_Sub23Array1[arg0];
			if (this.aBoolean123 = local63 == null) {
				if (this.anInt2954 > this.anInt2953) {
					local63 = new Class2_Sub23(arg0, this.anInt2953);
					this.anInt2953++;
				} else {
					@Pc(98) Class2_Sub23 local98 = (Class2_Sub23) this.aClass84_10.method2690();
					local63 = new Class2_Sub23(arg0, local98.anInt3631);
					this.aClass2_Sub23Array1[local98.anInt3634] = null;
					local98.method2808();
				}
				this.aClass2_Sub23Array1[arg0] = local63;
			}
			this.aClass84_10.method2702(local63);
			return this.anIntArrayArrayArray9[local63.anInt3631];
		}
	}
}
