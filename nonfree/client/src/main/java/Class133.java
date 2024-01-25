import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class133 {

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	private int anInt4142 = 0;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	private int anInt4143 = -1;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "Lclient!kn;")
	private Class116 aClass116_36 = new Class116();

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "Z")
	public boolean aBoolean318 = false;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	private final int anInt4138;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
	private final int anInt4141;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray106;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "[Lclient!dr;")
	private Class4_Sub15[] aClass4_Sub15Array1;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(III)V")
	public Class133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4138 = arg0;
		this.anInt4141 = arg1;
		this.anIntArrayArray106 = new int[this.anInt4138][arg2];
		this.aClass4_Sub15Array1 = new Class4_Sub15[this.anInt4141];
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[[I")
	public int[][] method3736() {
		if (this.anInt4138 != this.anInt4141) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4138; local21++) {
			this.aClass4_Sub15Array1[local21] = Static10.aClass4_Sub15_1;
		}
		return this.anIntArrayArray106;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)[I")
	public int[] method3738(@OriginalArg(1) int arg0) {
		if (this.anInt4141 == this.anInt4138) {
			this.aBoolean318 = this.aClass4_Sub15Array1[arg0] == null;
			this.aClass4_Sub15Array1[arg0] = Static10.aClass4_Sub15_1;
			return this.anIntArrayArray106[arg0];
		} else if (this.anInt4138 == 1) {
			this.aBoolean318 = arg0 != this.anInt4143;
			this.anInt4143 = arg0;
			return this.anIntArrayArray106[0];
		} else {
			@Pc(26) Class4_Sub15 local26 = this.aClass4_Sub15Array1[arg0];
			if (local26 == null) {
				this.aBoolean318 = true;
				if (this.anInt4142 >= this.anInt4138) {
					@Pc(47) Class4_Sub15 local47 = (Class4_Sub15) this.aClass116_36.method3278();
					local26 = new Class4_Sub15(arg0, local47.anInt1749);
					this.aClass4_Sub15Array1[local47.anInt1750] = null;
					local47.method5687();
				} else {
					local26 = new Class4_Sub15(arg0, this.anInt4142);
					this.anInt4142++;
				}
				this.aClass4_Sub15Array1[arg0] = local26;
			} else {
				this.aBoolean318 = false;
			}
			this.aClass116_36.method3276(local26);
			return this.anIntArrayArray106[local26.anInt1749];
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public void method3741() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4138; local3++) {
			this.anIntArrayArray106[local3] = null;
		}
		this.aClass4_Sub15Array1 = null;
		this.anIntArrayArray106 = null;
		this.aClass116_36.method3273();
		this.aClass116_36 = null;
	}
}
