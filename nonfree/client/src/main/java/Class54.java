import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class54 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	private int anInt1520 = -1;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	private int anInt1523 = 0;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!v;")
	private Class362 aClass362_9 = new Class362();

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	private final int anInt1526;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	private final int anInt1524;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "[Lclient!ia;")
	private Class6_Sub25[] aClass6_Sub25Array1;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(III)V")
	public Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1526 = arg0;
		this.anInt1524 = arg1;
		this.anIntArrayArrayArray13 = new int[this.anInt1526][3][arg2];
		this.aClass6_Sub25Array1 = new Class6_Sub25[this.anInt1524];
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public void method1385() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1526; local3++) {
			this.anIntArrayArrayArray13[local3][0] = null;
			this.anIntArrayArrayArray13[local3][1] = null;
			this.anIntArrayArrayArray13[local3][2] = null;
			this.anIntArrayArrayArray13[local3] = null;
		}
		this.aClass6_Sub25Array1 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass362_9.method8543();
		this.aClass362_9 = null;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[[I")
	public int[][] method1386(@OriginalArg(0) int arg0) {
		if (this.anInt1524 == this.anInt1526) {
			this.aBoolean81 = this.aClass6_Sub25Array1[arg0] == null;
			this.aClass6_Sub25Array1[arg0] = Static403.aClass6_Sub25_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt1526 == 1) {
			this.aBoolean81 = arg0 != this.anInt1520;
			this.anInt1520 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(44) Class6_Sub25 local44 = this.aClass6_Sub25Array1[arg0];
			if (local44 == null) {
				this.aBoolean81 = true;
				if (this.anInt1523 >= this.anInt1526) {
					@Pc(69) Class6_Sub25 local69 = (Class6_Sub25) this.aClass362_9.method8542();
					local44 = new Class6_Sub25(arg0, local69.anInt3948);
					this.aClass6_Sub25Array1[local69.anInt3947] = null;
					local69.method9174();
				} else {
					local44 = new Class6_Sub25(arg0, this.anInt1523);
					this.anInt1523++;
				}
				this.aClass6_Sub25Array1[arg0] = local44;
			} else {
				this.aBoolean81 = false;
			}
			this.aClass362_9.method8539(local44);
			return this.anIntArrayArrayArray13[local44.anInt3948];
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method1387() {
		if (this.anInt1524 != this.anInt1526) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt1526; local23++) {
			this.aClass6_Sub25Array1[local23] = Static403.aClass6_Sub25_1;
		}
		return this.anIntArrayArrayArray13;
	}
}
