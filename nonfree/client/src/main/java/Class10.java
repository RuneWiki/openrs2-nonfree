import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class10 {

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
	private int anInt152 = 0;

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
	private int anInt149 = -1;

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "Lclient!uh;")
	private Class341 aClass341_5 = new Class341();

	@OriginalMember(owner = "client!afa", name = "r", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
	private final int anInt148;

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
	private final int anInt151;

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "[Lclient!ls;")
	private Class2_Sub34[] aClass2_Sub34Array1;

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(III)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt148 = arg0;
		this.anInt151 = arg1;
		this.aClass2_Sub34Array1 = new Class2_Sub34[this.anInt151];
		this.anIntArrayArrayArray1 = new int[this.anInt148][3][arg2];
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)[[[I")
	public int[][][] method207() {
		if (this.anInt151 != this.anInt148) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt148; local17++) {
			this.aClass2_Sub34Array1[local17] = Static117.aClass2_Sub34_1;
		}
		return this.anIntArrayArrayArray1;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)[[I")
	public int[][] method211(@OriginalArg(1) int arg0) {
		if (this.anInt148 == this.anInt151) {
			this.aBoolean11 = this.aClass2_Sub34Array1[arg0] == null;
			this.aClass2_Sub34Array1[arg0] = Static117.aClass2_Sub34_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt148 == 1) {
			this.aBoolean11 = this.anInt149 != arg0;
			this.anInt149 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(47) Class2_Sub34 local47 = this.aClass2_Sub34Array1[arg0];
			if (local47 == null) {
				this.aBoolean11 = true;
				if (this.anInt152 >= this.anInt148) {
					@Pc(67) Class2_Sub34 local67 = (Class2_Sub34) this.aClass341_5.method8522();
					local47 = new Class2_Sub34(arg0, local67.anInt6730);
					this.aClass2_Sub34Array1[local67.anInt6727] = null;
					local67.method9253();
				} else {
					local47 = new Class2_Sub34(arg0, this.anInt152);
					this.anInt152++;
				}
				this.aClass2_Sub34Array1[arg0] = local47;
			} else {
				this.aBoolean11 = false;
			}
			this.aClass341_5.method8530(local47);
			return this.anIntArrayArrayArray1[local47.anInt6730];
		}
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
	public void method212() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt148; local13++) {
			this.anIntArrayArrayArray1[local13][0] = null;
			this.anIntArrayArrayArray1[local13][1] = null;
			this.anIntArrayArrayArray1[local13][2] = null;
			this.anIntArrayArrayArray1[local13] = null;
		}
		this.aClass2_Sub34Array1 = null;
		this.anIntArrayArrayArray1 = null;
		this.aClass341_5.method8525();
		this.aClass341_5 = null;
	}
}
