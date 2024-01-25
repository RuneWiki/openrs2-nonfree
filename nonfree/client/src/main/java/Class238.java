import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class238 {

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
	private int anInt6645 = 0;

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
	private int anInt6646 = -1;

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "Lclient!ae;")
	private Class8 aClass8_39 = new Class8();

	@OriginalMember(owner = "client!oca", name = "o", descriptor = "Z")
	public boolean aBoolean518 = false;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
	private final int anInt6643;

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
	private final int anInt6650;

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "[Lclient!pu;")
	private Class2_Sub37[] aClass2_Sub37Array1;

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(III)V")
	public Class238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6643 = arg0;
		this.anInt6650 = arg1;
		this.aClass2_Sub37Array1 = new Class2_Sub37[this.anInt6650];
		this.anIntArrayArray39 = new int[this.anInt6643][arg2];
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZ)[I")
	public int[] method5571(@OriginalArg(0) int arg0) {
		if (this.anInt6650 == this.anInt6643) {
			this.aBoolean518 = this.aClass2_Sub37Array1[arg0] == null;
			this.aClass2_Sub37Array1[arg0] = Static365.aClass2_Sub37_1;
			return this.anIntArrayArray39[arg0];
		} else if (this.anInt6643 == 1) {
			this.aBoolean518 = arg0 != this.anInt6646;
			this.anInt6646 = arg0;
			return this.anIntArrayArray39[0];
		} else {
			@Pc(48) Class2_Sub37 local48 = this.aClass2_Sub37Array1[arg0];
			if (local48 == null) {
				this.aBoolean518 = true;
				if (this.anInt6643 <= this.anInt6645) {
					@Pc(69) Class2_Sub37 local69 = (Class2_Sub37) this.aClass8_39.method221();
					local48 = new Class2_Sub37(arg0, local69.anInt7198);
					this.aClass2_Sub37Array1[local69.anInt7197] = null;
					local69.method7966();
				} else {
					local48 = new Class2_Sub37(arg0, this.anInt6645);
					this.anInt6645++;
				}
				this.aClass2_Sub37Array1[arg0] = local48;
			} else {
				this.aBoolean518 = false;
			}
			this.aClass8_39.method209(local48);
			return this.anIntArrayArray39[local48.anInt7198];
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
	public void method5572() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6643; local7++) {
			this.anIntArrayArray39[local7] = null;
		}
		this.aClass2_Sub37Array1 = null;
		this.anIntArrayArray39 = null;
		this.aClass8_39.method220();
		this.aClass8_39 = null;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)[[I")
	public int[][] method5573() {
		if (this.anInt6650 != this.anInt6643) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt6643; local27++) {
			this.aClass2_Sub37Array1[local27] = Static365.aClass2_Sub37_1;
		}
		return this.anIntArrayArray39;
	}
}
