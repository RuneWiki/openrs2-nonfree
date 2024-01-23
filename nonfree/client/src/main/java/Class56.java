import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class56 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	private int anInt2009 = 0;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	private int anInt2012 = -1;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!mi;")
	private Class75 aClass75_11 = new Class75();

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	private int anInt2011;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	private int anInt2008;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "[Lclient!tb;")
	private Class1_Sub25[] aClass1_Sub25Array1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(III)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2011 = arg0;
		this.anIntArrayArrayArray8 = new int[this.anInt2011][3][arg2];
		this.anInt2008 = arg1;
		this.aClass1_Sub25Array1 = new Class1_Sub25[this.anInt2008];
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)[[I")
	public int[][] method1552(@OriginalArg(0) int arg0) {
		if (this.anInt2008 == this.anInt2011) {
			this.aBoolean90 = this.aClass1_Sub25Array1[arg0] == null;
			this.aClass1_Sub25Array1[arg0] = Static212.aClass1_Sub25_1;
			return this.anIntArrayArrayArray8[arg0];
		} else if (this.anInt2011 == 1) {
			this.aBoolean90 = arg0 != this.anInt2012;
			this.anInt2012 = arg0;
			return this.anIntArrayArrayArray8[0];
		} else {
			@Pc(68) Class1_Sub25 local68 = this.aClass1_Sub25Array1[arg0];
			if (local68 == null) {
				this.aBoolean90 = true;
				if (this.anInt2011 > this.anInt2009) {
					local68 = new Class1_Sub25(arg0, this.anInt2009);
					this.anInt2009++;
				} else {
					@Pc(103) Class1_Sub25 local103 = (Class1_Sub25) this.aClass75_11.method2244();
					local68 = new Class1_Sub25(arg0, local103.anInt3995);
					this.aClass1_Sub25Array1[local103.anInt3993] = null;
					local103.method3525();
				}
				this.aClass1_Sub25Array1[arg0] = local68;
			} else {
				this.aBoolean90 = false;
			}
			this.aClass75_11.method2236(local68);
			return this.anIntArrayArrayArray8[local68.anInt3995];
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public void method1554() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt2011; local8++) {
			this.anIntArrayArrayArray8[local8][0] = null;
			this.anIntArrayArrayArray8[local8][1] = null;
			this.anIntArrayArrayArray8[local8][2] = null;
			this.anIntArrayArrayArray8[local8] = null;
		}
		this.aClass1_Sub25Array1 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass75_11.method2243();
		this.aClass75_11 = null;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)[[[I")
	public int[][][] method1555() {
		if (this.anInt2008 != this.anInt2011) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2011; local17++) {
			this.aClass1_Sub25Array1[local17] = Static212.aClass1_Sub25_1;
		}
		return this.anIntArrayArrayArray8;
	}
}
