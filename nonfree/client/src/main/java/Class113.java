import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class113 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	private int anInt3029 = -1;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	private int anInt3032 = 0;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!fr;")
	private Class85 aClass85_18 = new Class85();

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "Z")
	public boolean aBoolean181 = false;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
	private final int anInt3031;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	private final int anInt3033;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "[Lclient!hu;")
	private Class7_Sub21[] aClass7_Sub21Array1;

	static {
		new Class55("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3031 = arg1;
		this.anInt3033 = arg0;
		this.anIntArrayArray25 = new int[this.anInt3033][arg2];
		this.aClass7_Sub21Array1 = new Class7_Sub21[this.anInt3031];
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method2453() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3033; local7++) {
			this.anIntArrayArray25[local7] = null;
		}
		this.aClass7_Sub21Array1 = null;
		this.anIntArrayArray25 = null;
		this.aClass85_18.method2008();
		this.aClass85_18 = null;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[I")
	public int[] method2456(@OriginalArg(0) int arg0) {
		if (this.anInt3033 == this.anInt3031) {
			this.aBoolean181 = this.aClass7_Sub21Array1[arg0] == null;
			this.aClass7_Sub21Array1[arg0] = Static391.aClass7_Sub21_1;
			return this.anIntArrayArray25[arg0];
		} else if (this.anInt3033 == 1) {
			this.aBoolean181 = this.anInt3029 != arg0;
			this.anInt3029 = arg0;
			return this.anIntArrayArray25[0];
		} else {
			@Pc(45) Class7_Sub21 local45 = this.aClass7_Sub21Array1[arg0];
			if (local45 == null) {
				this.aBoolean181 = true;
				if (this.anInt3033 > this.anInt3032) {
					local45 = new Class7_Sub21(arg0, this.anInt3032);
					this.anInt3032++;
				} else {
					@Pc(76) Class7_Sub21 local76 = (Class7_Sub21) this.aClass85_18.method2002();
					local45 = new Class7_Sub21(arg0, local76.anInt2987);
					this.aClass7_Sub21Array1[local76.anInt2989] = null;
					local76.method5802();
				}
				this.aClass7_Sub21Array1[arg0] = local45;
			} else {
				this.aBoolean181 = false;
			}
			this.aClass85_18.method2006(local45);
			return this.anIntArrayArray25[local45.anInt2987];
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)[[I")
	public int[][] method2457() {
		if (this.anInt3031 != this.anInt3033) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3033; local21++) {
			this.aClass7_Sub21Array1[local21] = Static391.aClass7_Sub21_1;
		}
		return this.anIntArrayArray25;
	}
}
