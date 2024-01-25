import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class235 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	private int anInt6130 = 0;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	private int anInt6134 = -1;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!fr;")
	private Class85 aClass85_36 = new Class85();

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	private final int anInt6129;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	private final int anInt6128;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "[Lclient!em;")
	private Class7_Sub15[] aClass7_Sub15Array1;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(III)V")
	public Class235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6129 = arg0;
		this.anInt6128 = arg1;
		this.aClass7_Sub15Array1 = new Class7_Sub15[this.anInt6128];
		this.anIntArrayArrayArray12 = new int[this.anInt6129][3][arg2];
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)[[[I")
	public int[][][] method4859() {
		if (this.anInt6129 != this.anInt6128) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6129; local17++) {
			this.aClass7_Sub15Array1[local17] = Static54.aClass7_Sub15_1;
		}
		return this.anIntArrayArrayArray12;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	public void method4861() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6129; local3++) {
			this.anIntArrayArrayArray12[local3][0] = null;
			this.anIntArrayArrayArray12[local3][1] = null;
			this.anIntArrayArrayArray12[local3][2] = null;
			this.anIntArrayArrayArray12[local3] = null;
		}
		this.aClass7_Sub15Array1 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass85_36.method2008();
		this.aClass85_36 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)[[I")
	public int[][] method4862(@OriginalArg(0) int arg0) {
		if (this.anInt6128 == this.anInt6129) {
			this.aBoolean402 = this.aClass7_Sub15Array1[arg0] == null;
			this.aClass7_Sub15Array1[arg0] = Static54.aClass7_Sub15_1;
			return this.anIntArrayArrayArray12[arg0];
		} else if (this.anInt6129 == 1) {
			this.aBoolean402 = arg0 != this.anInt6134;
			this.anInt6134 = arg0;
			return this.anIntArrayArrayArray12[0];
		} else {
			@Pc(64) Class7_Sub15 local64 = this.aClass7_Sub15Array1[arg0];
			if (local64 == null) {
				this.aBoolean402 = true;
				if (this.anInt6130 >= this.anInt6129) {
					@Pc(80) Class7_Sub15 local80 = (Class7_Sub15) this.aClass85_36.method2002();
					local64 = new Class7_Sub15(arg0, local80.anInt1922);
					this.aClass7_Sub15Array1[local80.anInt1924] = null;
					local80.method5802();
				} else {
					local64 = new Class7_Sub15(arg0, this.anInt6130);
					this.anInt6130++;
				}
				this.aClass7_Sub15Array1[arg0] = local64;
			} else {
				this.aBoolean402 = false;
			}
			this.aClass85_36.method2006(local64);
			return this.anIntArrayArrayArray12[local64.anInt1922];
		}
	}
}
