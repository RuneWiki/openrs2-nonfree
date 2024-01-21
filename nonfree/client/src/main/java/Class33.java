import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class33 {

	@OriginalMember(owner = "client!i", name = "m", descriptor = "I")
	private int anInt1870 = -1;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	private int anInt1863 = 0;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!qd;")
	private Class65 aClass65_5 = new Class65();

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "[Lclient!pg;")
	private Class2_Sub23[] aClass2_Sub23Array1;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "I")
	private final int anInt1873;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	private final int anInt1865;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub23Array1 = new Class2_Sub23[arg1];
		this.anInt1873 = arg0;
		this.anInt1865 = arg1;
		this.anIntArrayArray13 = new int[arg0][arg2];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)[[I")
	public int[][] method1303() {
		if (this.anInt1865 != this.anInt1873) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt1873; local23++) {
			this.aClass2_Sub23Array1[local23] = Static51.aClass2_Sub23_3;
		}
		return this.anIntArrayArray13;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[I")
	public int[] method1306(@OriginalArg(0) int arg0) {
		if (this.anInt1865 == this.anInt1873) {
			this.aBoolean93 = this.aClass2_Sub23Array1[arg0] == null;
			this.aClass2_Sub23Array1[arg0] = Static51.aClass2_Sub23_3;
			return this.anIntArrayArray13[arg0];
		} else if (this.anInt1873 == 1) {
			this.aBoolean93 = arg0 != this.anInt1870;
			this.anInt1870 = arg0;
			return this.anIntArrayArray13[0];
		} else {
			@Pc(46) Class2_Sub23 local46 = this.aClass2_Sub23Array1[arg0];
			if (this.aBoolean93 = local46 == null) {
				if (this.anInt1873 > this.anInt1863) {
					local46 = new Class2_Sub23(arg0, this.anInt1863);
					this.anInt1863++;
				} else {
					@Pc(85) Class2_Sub23 local85 = (Class2_Sub23) this.aClass65_5.method2122();
					local46 = new Class2_Sub23(arg0, local85.anInt3030);
					this.aClass2_Sub23Array1[local85.anInt3032] = null;
					local85.method2888();
				}
				this.aClass2_Sub23Array1[arg0] = local46;
			}
			this.aClass65_5.method2120(local46);
			return this.anIntArrayArray13[local46.anInt3030];
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public void method1307() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt1873; local14++) {
			this.anIntArrayArray13[local14] = null;
		}
		this.anIntArrayArray13 = null;
		this.aClass2_Sub23Array1 = null;
		this.aClass65_5.method2113();
		this.aClass65_5 = null;
	}
}
