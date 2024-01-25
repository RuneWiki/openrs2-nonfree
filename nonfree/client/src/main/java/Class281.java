import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class281 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	private int anInt8479 = 0;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	private int anInt8483 = -1;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Lclient!uh;")
	private Class341 aClass341_48 = new Class341();

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Z")
	public boolean aBoolean607 = false;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	private final int anInt8481;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	private final int anInt8484;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "[Lclient!gba;")
	private Class2_Sub18[] aClass2_Sub18Array1;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(III)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8481 = arg0;
		this.anInt8484 = arg1;
		this.aClass2_Sub18Array1 = new Class2_Sub18[this.anInt8484];
		this.anIntArrayArray47 = new int[this.anInt8481][arg2];
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)[[I")
	public int[][] method7183() {
		if (this.anInt8481 != this.anInt8484) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt8481; local17++) {
			this.aClass2_Sub18Array1[local17] = Static363.aClass2_Sub18_1;
		}
		return this.anIntArrayArray47;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	public void method7188() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8481; local3++) {
			this.anIntArrayArray47[local3] = null;
		}
		this.aClass2_Sub18Array1 = null;
		this.anIntArrayArray47 = null;
		this.aClass341_48.method8525();
		this.aClass341_48 = null;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I")
	public int[] method7189(@OriginalArg(1) int arg0) {
		if (this.anInt8481 == this.anInt8484) {
			this.aBoolean607 = this.aClass2_Sub18Array1[arg0] == null;
			this.aClass2_Sub18Array1[arg0] = Static363.aClass2_Sub18_1;
			return this.anIntArrayArray47[arg0];
		} else if (this.anInt8481 == 1) {
			this.aBoolean607 = arg0 != this.anInt8483;
			this.anInt8483 = arg0;
			return this.anIntArrayArray47[0];
		} else {
			@Pc(45) Class2_Sub18 local45 = this.aClass2_Sub18Array1[arg0];
			if (local45 == null) {
				this.aBoolean607 = true;
				if (this.anInt8481 > this.anInt8479) {
					local45 = new Class2_Sub18(arg0, this.anInt8479);
					this.anInt8479++;
				} else {
					@Pc(82) Class2_Sub18 local82 = (Class2_Sub18) this.aClass341_48.method8522();
					local45 = new Class2_Sub18(arg0, local82.anInt4168);
					this.aClass2_Sub18Array1[local82.anInt4164] = null;
					local82.method9253();
				}
				this.aClass2_Sub18Array1[arg0] = local45;
			} else {
				this.aBoolean607 = false;
			}
			this.aClass341_48.method8530(local45);
			return this.anIntArrayArray47[local45.anInt4168];
		}
	}
}
