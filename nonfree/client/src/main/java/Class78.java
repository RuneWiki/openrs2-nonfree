import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class78 {

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	private int anInt3332 = 0;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	private int anInt3336 = -1;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Lclient!bg;")
	private Class13 aClass13_10 = new Class13();

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	private final int anInt3333;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[Lclient!wd;")
	private Class2_Sub27[] aClass2_Sub27Array1;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
	private final int anInt3342;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(III)V")
	public Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3333 = arg1;
		this.aClass2_Sub27Array1 = new Class2_Sub27[this.anInt3333];
		this.anInt3342 = arg0;
		this.anIntArrayArray25 = new int[this.anInt3342][arg2];
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)[[I")
	public int[][] method2315() {
		if (this.anInt3342 != this.anInt3333) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3342; local21++) {
			this.aClass2_Sub27Array1[local21] = Static194.aClass2_Sub27_1;
		}
		return this.anIntArrayArray25;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[I")
	public int[] method2318(@OriginalArg(1) int arg0) {
		if (this.anInt3333 == this.anInt3342) {
			this.aBoolean144 = this.aClass2_Sub27Array1[arg0] == null;
			this.aClass2_Sub27Array1[arg0] = Static194.aClass2_Sub27_1;
			return this.anIntArrayArray25[arg0];
		} else if (this.anInt3342 == 1) {
			this.aBoolean144 = arg0 != this.anInt3336;
			this.anInt3336 = arg0;
			return this.anIntArrayArray25[0];
		} else {
			@Pc(70) Class2_Sub27 local70 = this.aClass2_Sub27Array1[arg0];
			if (local70 == null) {
				this.aBoolean144 = true;
				if (this.anInt3342 <= this.anInt3332) {
					@Pc(91) Class2_Sub27 local91 = (Class2_Sub27) this.aClass13_10.method308();
					local70 = new Class2_Sub27(arg0, local91.anInt4419);
					this.aClass2_Sub27Array1[local91.anInt4420] = null;
					local91.method3183();
				} else {
					local70 = new Class2_Sub27(arg0, this.anInt3332);
					this.anInt3332++;
				}
				this.aClass2_Sub27Array1[arg0] = local70;
			} else {
				this.aBoolean144 = false;
			}
			this.aClass13_10.method306(local70);
			return this.anIntArrayArray25[local70.anInt4419];
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	public void method2320() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3342; local3++) {
			this.anIntArrayArray25[local3] = null;
		}
		this.aClass2_Sub27Array1 = null;
		this.anIntArrayArray25 = null;
		this.aClass13_10.method314();
		this.aClass13_10 = null;
	}
}
