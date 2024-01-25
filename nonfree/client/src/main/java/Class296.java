import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class296 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
	private int anInt8444 = 0;

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
	private int anInt8456 = -1;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "Lclient!ga;")
	private Class124 aClass124_87 = new Class124();

	@OriginalMember(owner = "client!raa", name = "u", descriptor = "Z")
	public boolean aBoolean614 = false;

	@OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
	private final int anInt8457;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
	private final int anInt8455;

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "[Lclient!dk;")
	private Class5_Sub18[] aClass5_Sub18Array1;

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(III)V")
	public Class296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8457 = arg1;
		this.anInt8455 = arg0;
		this.aClass5_Sub18Array1 = new Class5_Sub18[this.anInt8457];
		this.anIntArrayArray65 = new int[this.anInt8455][arg2];
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)[I")
	public int[] method7185(@OriginalArg(1) int arg0) {
		if (this.anInt8457 == this.anInt8455) {
			this.aBoolean614 = this.aClass5_Sub18Array1[arg0] == null;
			this.aClass5_Sub18Array1[arg0] = Static317.aClass5_Sub18_1;
			return this.anIntArrayArray65[arg0];
		} else if (this.anInt8455 == 1) {
			this.aBoolean614 = arg0 != this.anInt8456;
			this.anInt8456 = arg0;
			return this.anIntArrayArray65[0];
		} else {
			@Pc(46) Class5_Sub18 local46 = this.aClass5_Sub18Array1[arg0];
			if (local46 == null) {
				this.aBoolean614 = true;
				if (this.anInt8455 <= this.anInt8444) {
					@Pc(66) Class5_Sub18 local66 = (Class5_Sub18) this.aClass124_87.method2573();
					local46 = new Class5_Sub18(arg0, local66.anInt1944);
					this.aClass5_Sub18Array1[local66.anInt1942] = null;
					local66.method8829();
				} else {
					local46 = new Class5_Sub18(arg0, this.anInt8444);
					this.anInt8444++;
				}
				this.aClass5_Sub18Array1[arg0] = local46;
			} else {
				this.aBoolean614 = false;
			}
			this.aClass124_87.method2570(local46);
			return this.anIntArrayArray65[local46.anInt1944];
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
	public void method7186() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt8455; local15++) {
			this.anIntArrayArray65[local15] = null;
		}
		this.aClass5_Sub18Array1 = null;
		this.anIntArrayArray65 = null;
		this.aClass124_87.method2567();
		this.aClass124_87 = null;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)[[I")
	public int[][] method7190() {
		if (this.anInt8455 != this.anInt8457) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt8455; local23++) {
			this.aClass5_Sub18Array1[local23] = Static317.aClass5_Sub18_1;
		}
		return this.anIntArrayArray65;
	}
}
