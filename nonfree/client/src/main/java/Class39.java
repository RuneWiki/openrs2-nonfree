import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class39 {

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
	private int anInt1875 = 0;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	private int anInt1876 = -1;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!bg;")
	private Class11 aClass11_9 = new Class11();

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "[Lclient!f;")
	private Class4_Sub9[] aClass4_Sub9Array1;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	private final int anInt1878;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	private final int anInt1874;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(III)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub9Array1 = new Class4_Sub9[arg1];
		this.anIntArrayArrayArray20 = new int[arg0][3][arg2];
		this.anInt1878 = arg0;
		this.anInt1874 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)[[[I")
	public int[][][] method1501() {
		if (this.anInt1878 != this.anInt1874) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt1878; local22++) {
			this.aClass4_Sub9Array1[local22] = Static8.aClass4_Sub9_1;
		}
		return this.anIntArrayArrayArray20;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	public void method1505() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1878; local3++) {
			this.anIntArrayArrayArray20[local3][0] = null;
			this.anIntArrayArrayArray20[local3][1] = null;
			this.anIntArrayArrayArray20[local3][2] = null;
			this.anIntArrayArrayArray20[local3] = null;
		}
		this.anIntArrayArrayArray20 = null;
		this.aClass4_Sub9Array1 = null;
		this.aClass11_9.method280();
		this.aClass11_9 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[[I")
	public int[][] method1506(@OriginalArg(0) int arg0) {
		if (this.anInt1874 == this.anInt1878) {
			this.aBoolean84 = this.aClass4_Sub9Array1[arg0] == null;
			this.aClass4_Sub9Array1[arg0] = Static8.aClass4_Sub9_1;
			return this.anIntArrayArrayArray20[arg0];
		} else if (this.anInt1878 == 1) {
			this.aBoolean84 = this.anInt1876 != arg0;
			this.anInt1876 = arg0;
			return this.anIntArrayArrayArray20[0];
		} else {
			@Pc(40) Class4_Sub9 local40 = this.aClass4_Sub9Array1[arg0];
			if (this.aBoolean84 = local40 == null) {
				if (this.anInt1878 <= this.anInt1875) {
					@Pc(64) Class4_Sub9 local64 = (Class4_Sub9) this.aClass11_9.method275();
					local40 = new Class4_Sub9(arg0, local64.anInt1217);
					this.aClass4_Sub9Array1[local64.anInt1216] = null;
					local64.method3173();
				} else {
					local40 = new Class4_Sub9(arg0, this.anInt1875);
					this.anInt1875++;
				}
				this.aClass4_Sub9Array1[arg0] = local40;
			}
			this.aClass11_9.method273(local40);
			return this.anIntArrayArrayArray20[local40.anInt1217];
		}
	}
}
