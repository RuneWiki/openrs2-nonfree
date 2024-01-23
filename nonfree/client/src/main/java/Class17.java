import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class17 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
	private int anInt595 = 0;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	private int anInt593 = -1;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!sf;")
	private Class105 aClass105_2 = new Class105();

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	private int anInt591;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	private int anInt590;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "[Lclient!gd;")
	private Class1_Sub11[] aClass1_Sub11Array1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(III)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt591 = arg1;
		this.anInt590 = arg0;
		this.anIntArrayArray2 = new int[this.anInt590][arg2];
		this.aClass1_Sub11Array1 = new Class1_Sub11[this.anInt591];
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)[[I")
	public int[][] method472() {
		if (this.anInt591 != this.anInt590) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt590; local26++) {
			this.aClass1_Sub11Array1[local26] = Static104.aClass1_Sub11_1;
		}
		return this.anIntArrayArray2;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)[I")
	public int[] method474(@OriginalArg(1) int arg0) {
		if (this.anInt591 == this.anInt590) {
			this.aBoolean24 = this.aClass1_Sub11Array1[arg0] == null;
			this.aClass1_Sub11Array1[arg0] = Static104.aClass1_Sub11_1;
			return this.anIntArrayArray2[arg0];
		} else if (this.anInt590 == 1) {
			this.aBoolean24 = this.anInt593 != arg0;
			this.anInt593 = arg0;
			return this.anIntArrayArray2[0];
		} else {
			@Pc(72) Class1_Sub11 local72 = this.aClass1_Sub11Array1[arg0];
			if (local72 == null) {
				this.aBoolean24 = true;
				if (this.anInt595 >= this.anInt590) {
					@Pc(92) Class1_Sub11 local92 = (Class1_Sub11) this.aClass105_2.method3112();
					local72 = new Class1_Sub11(arg0, local92.anInt1463);
					this.aClass1_Sub11Array1[local92.anInt1467] = null;
					local92.method3758();
				} else {
					local72 = new Class1_Sub11(arg0, this.anInt595);
					this.anInt595++;
				}
				this.aClass1_Sub11Array1[arg0] = local72;
			} else {
				this.aBoolean24 = false;
			}
			this.aClass105_2.method3116(local72);
			return this.anIntArrayArray2[local72.anInt1463];
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public void method477() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt590; local7++) {
			this.anIntArrayArray2[local7] = null;
		}
		this.aClass1_Sub11Array1 = null;
		this.anIntArrayArray2 = null;
		this.aClass105_2.method3114();
		this.aClass105_2 = null;
	}
}
