import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class42 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	private int anInt1321 = -1;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	private int anInt1328 = 0;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!fi;")
	private Class74 aClass74_5 = new Class74();

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
	private final int anInt1323;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	private final int anInt1324;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "[Lclient!ij;")
	private Class7_Sub15[] aClass7_Sub15Array1;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(III)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1323 = arg0;
		this.anInt1324 = arg1;
		this.aClass7_Sub15Array1 = new Class7_Sub15[this.anInt1324];
		this.anIntArrayArrayArray7 = new int[this.anInt1323][3][arg2];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[[I")
	public int[][] method1058(@OriginalArg(0) int arg0) {
		if (this.anInt1324 == this.anInt1323) {
			this.aBoolean109 = this.aClass7_Sub15Array1[arg0] == null;
			this.aClass7_Sub15Array1[arg0] = Static289.aClass7_Sub15_3;
			return this.anIntArrayArrayArray7[arg0];
		} else if (this.anInt1323 == 1) {
			this.aBoolean109 = this.anInt1321 != arg0;
			this.anInt1321 = arg0;
			return this.anIntArrayArrayArray7[0];
		} else {
			@Pc(61) Class7_Sub15 local61 = this.aClass7_Sub15Array1[arg0];
			if (local61 == null) {
				this.aBoolean109 = true;
				if (this.anInt1328 >= this.anInt1323) {
					@Pc(81) Class7_Sub15 local81 = (Class7_Sub15) this.aClass74_5.method1805();
					local61 = new Class7_Sub15(arg0, local81.anInt2895);
					this.aClass7_Sub15Array1[local81.anInt2894] = null;
					local81.method5648();
				} else {
					local61 = new Class7_Sub15(arg0, this.anInt1328);
					this.anInt1328++;
				}
				this.aClass7_Sub15Array1[arg0] = local61;
			} else {
				this.aBoolean109 = false;
			}
			this.aClass74_5.method1797(local61);
			return this.anIntArrayArrayArray7[local61.anInt2895];
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method1060() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1323; local3++) {
			this.anIntArrayArrayArray7[local3][0] = null;
			this.anIntArrayArrayArray7[local3][1] = null;
			this.anIntArrayArrayArray7[local3][2] = null;
			this.anIntArrayArrayArray7[local3] = null;
		}
		this.aClass7_Sub15Array1 = null;
		this.anIntArrayArrayArray7 = null;
		this.aClass74_5.method1803();
		this.aClass74_5 = null;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)[[[I")
	public int[][][] method1062() {
		if (this.anInt1323 != this.anInt1324) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt1323; local28++) {
			this.aClass7_Sub15Array1[local28] = Static289.aClass7_Sub15_3;
		}
		return this.anIntArrayArrayArray7;
	}
}
