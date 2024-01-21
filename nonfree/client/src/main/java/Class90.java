import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class90 {

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	private int anInt4479 = -1;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	private int anInt4481 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!pi;")
	private Class67 aClass67_13 = new Class67();

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	private final int anInt4486;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	private final int anInt4483;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "[Lclient!hb;")
	private Class2_Sub9[] aClass2_Sub9Array1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(III)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4486 = arg1;
		this.anInt4483 = arg0;
		this.anIntArrayArrayArray8 = new int[this.anInt4483][3][arg2];
		this.aClass2_Sub9Array1 = new Class2_Sub9[this.anInt4486];
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public void method3440() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt4483; local5++) {
			this.anIntArrayArrayArray8[local5][0] = null;
			this.anIntArrayArrayArray8[local5][1] = null;
			this.anIntArrayArrayArray8[local5][2] = null;
			this.anIntArrayArrayArray8[local5] = null;
		}
		this.aClass2_Sub9Array1 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass67_13.method2847();
		this.aClass67_13 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)[[[I")
	public int[][][] method3441() {
		if (this.anInt4486 != this.anInt4483) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt4483; local22++) {
			this.aClass2_Sub9Array1[local22] = Static148.aClass2_Sub9_1;
		}
		return this.anIntArrayArrayArray8;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[[I")
	public int[][] method3443(@OriginalArg(0) int arg0) {
		if (this.anInt4483 == this.anInt4486) {
			this.aBoolean177 = this.aClass2_Sub9Array1[arg0] == null;
			this.aClass2_Sub9Array1[arg0] = Static148.aClass2_Sub9_1;
			return this.anIntArrayArrayArray8[arg0];
		} else if (this.anInt4483 == 1) {
			this.aBoolean177 = this.anInt4479 != arg0;
			this.anInt4479 = arg0;
			return this.anIntArrayArrayArray8[0];
		} else {
			@Pc(27) Class2_Sub9 local27 = this.aClass2_Sub9Array1[arg0];
			if (local27 == null) {
				this.aBoolean177 = true;
				if (this.anInt4483 > this.anInt4481) {
					local27 = new Class2_Sub9(arg0, this.anInt4481);
					this.anInt4481++;
				} else {
					@Pc(67) Class2_Sub9 local67 = (Class2_Sub9) this.aClass67_13.method2849();
					local27 = new Class2_Sub9(arg0, local67.anInt2084);
					this.aClass2_Sub9Array1[local67.anInt2085] = null;
					local67.method3556();
				}
				this.aClass2_Sub9Array1[arg0] = local27;
			} else {
				this.aBoolean177 = false;
			}
			this.aClass67_13.method2845(local27);
			return this.anIntArrayArrayArray8[local27.anInt2084];
		}
	}
}
