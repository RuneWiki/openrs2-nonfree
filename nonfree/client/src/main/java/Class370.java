import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uia")
public final class Class370 {

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
	private int anInt9907 = 0;

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
	private int anInt9909 = -1;

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "Lclient!cga;")
	private Class60 aClass60_204 = new Class60();

	@OriginalMember(owner = "client!uia", name = "g", descriptor = "Z")
	public boolean aBoolean846 = false;

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
	private final int anInt9911;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
	private final int anInt9913;

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "[Lclient!sda;")
	private Class2_Sub50[] aClass2_Sub50Array1;

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray25;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(III)V")
	public Class370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9911 = arg1;
		this.anInt9913 = arg0;
		this.aClass2_Sub50Array1 = new Class2_Sub50[this.anInt9911];
		this.anIntArrayArrayArray25 = new int[this.anInt9913][3][arg2];
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V")
	public void method8742() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt9913; local14++) {
			this.anIntArrayArrayArray25[local14][0] = null;
			this.anIntArrayArrayArray25[local14][1] = null;
			this.anIntArrayArrayArray25[local14][2] = null;
			this.anIntArrayArrayArray25[local14] = null;
		}
		this.aClass2_Sub50Array1 = null;
		this.anIntArrayArrayArray25 = null;
		this.aClass60_204.method1223();
		this.aClass60_204 = null;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method8743() {
		if (this.anInt9913 != this.anInt9911) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt9913; local20++) {
			this.aClass2_Sub50Array1[local20] = Static372.aClass2_Sub50_1;
		}
		return this.anIntArrayArrayArray25;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)[[I")
	public int[][] method8744(@OriginalArg(1) int arg0) {
		if (this.anInt9911 == this.anInt9913) {
			this.aBoolean846 = this.aClass2_Sub50Array1[arg0] == null;
			this.aClass2_Sub50Array1[arg0] = Static372.aClass2_Sub50_1;
			return this.anIntArrayArrayArray25[arg0];
		} else if (this.anInt9913 == 1) {
			this.aBoolean846 = arg0 != this.anInt9909;
			this.anInt9909 = arg0;
			return this.anIntArrayArrayArray25[0];
		} else {
			@Pc(58) Class2_Sub50 local58 = this.aClass2_Sub50Array1[arg0];
			if (local58 == null) {
				this.aBoolean846 = true;
				if (this.anInt9907 < this.anInt9913) {
					local58 = new Class2_Sub50(arg0, this.anInt9907);
					this.anInt9907++;
				} else {
					@Pc(98) Class2_Sub50 local98 = (Class2_Sub50) this.aClass60_204.method1227();
					local58 = new Class2_Sub50(arg0, local98.anInt9058);
					this.aClass2_Sub50Array1[local98.anInt9054] = null;
					local98.method9872();
				}
				this.aClass2_Sub50Array1[arg0] = local58;
			} else {
				this.aBoolean846 = false;
			}
			this.aClass60_204.method1234(local58);
			return this.anIntArrayArrayArray25[local58.anInt9058];
		}
	}
}
