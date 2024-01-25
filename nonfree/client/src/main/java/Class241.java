import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class241 {

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	private int anInt6490 = 0;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "I")
	private int anInt6491 = -1;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "Lclient!gca;")
	private Class111 aClass111_40 = new Class111();

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Z")
	public boolean aBoolean505 = false;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "I")
	private final int anInt6487;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	private final int anInt6494;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "[Lclient!gk;")
	private Class1_Sub25[] aClass1_Sub25Array1;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(III)V")
	public Class241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6487 = arg0;
		this.anInt6494 = arg1;
		this.anIntArrayArrayArray16 = new int[this.anInt6487][3][arg2];
		this.aClass1_Sub25Array1 = new Class1_Sub25[this.anInt6494];
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)[[[I")
	public int[][][] method5267() {
		if (this.anInt6494 != this.anInt6487) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6487; local17++) {
			this.aClass1_Sub25Array1[local17] = Static571.aClass1_Sub25_1;
		}
		return this.anIntArrayArrayArray16;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)[[I")
	public int[][] method5268(@OriginalArg(0) int arg0) {
		if (this.anInt6494 == this.anInt6487) {
			this.aBoolean505 = this.aClass1_Sub25Array1[arg0] == null;
			this.aClass1_Sub25Array1[arg0] = Static571.aClass1_Sub25_1;
			return this.anIntArrayArrayArray16[arg0];
		} else if (this.anInt6487 == 1) {
			this.aBoolean505 = arg0 != this.anInt6491;
			this.anInt6491 = arg0;
			return this.anIntArrayArrayArray16[0];
		} else {
			@Pc(64) Class1_Sub25 local64 = this.aClass1_Sub25Array1[arg0];
			if (local64 == null) {
				this.aBoolean505 = true;
				if (this.anInt6487 > this.anInt6490) {
					local64 = new Class1_Sub25(arg0, this.anInt6490);
					this.anInt6490++;
				} else {
					@Pc(95) Class1_Sub25 local95 = (Class1_Sub25) this.aClass111_40.method2544();
					local64 = new Class1_Sub25(arg0, local95.anInt3177);
					this.aClass1_Sub25Array1[local95.anInt3178] = null;
					local95.method7908();
				}
				this.aClass1_Sub25Array1[arg0] = local64;
			} else {
				this.aBoolean505 = false;
			}
			this.aClass111_40.method2549(local64);
			return this.anIntArrayArrayArray16[local64.anInt3177];
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	public void method5272() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6487; local3++) {
			this.anIntArrayArrayArray16[local3][0] = null;
			this.anIntArrayArrayArray16[local3][1] = null;
			this.anIntArrayArrayArray16[local3][2] = null;
			this.anIntArrayArrayArray16[local3] = null;
		}
		this.anIntArrayArrayArray16 = null;
		this.aClass1_Sub25Array1 = null;
		this.aClass111_40.method2555();
		this.aClass111_40 = null;
	}
}
