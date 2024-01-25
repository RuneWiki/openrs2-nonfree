import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uia")
public final class Class348 {

	@OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
	private int anInt9507 = -1;

	@OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
	private int anInt9508 = 0;

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "Lclient!fh;")
	private Class114 aClass114_57 = new Class114();

	@OriginalMember(owner = "client!uia", name = "r", descriptor = "Z")
	public boolean aBoolean680 = false;

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
	private final int anInt9509;

	@OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
	private final int anInt9510;

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray108;

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "[Lclient!lb;")
	private Class2_Sub30[] aClass2_Sub30Array1;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(III)V")
	public Class348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9509 = arg0;
		this.anInt9510 = arg1;
		this.anIntArrayArray108 = new int[this.anInt9509][arg2];
		this.aClass2_Sub30Array1 = new Class2_Sub30[this.anInt9510];
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)[[I")
	public int[][] method8071() {
		if (this.anInt9509 != this.anInt9510) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt9509; local21++) {
			this.aClass2_Sub30Array1[local21] = Static598.aClass2_Sub30_2;
		}
		return this.anIntArrayArray108;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IB)[I")
	public int[] method8072(@OriginalArg(0) int arg0) {
		if (this.anInt9509 == this.anInt9510) {
			this.aBoolean680 = this.aClass2_Sub30Array1[arg0] == null;
			this.aClass2_Sub30Array1[arg0] = Static598.aClass2_Sub30_2;
			return this.anIntArrayArray108[arg0];
		} else if (this.anInt9509 == 1) {
			this.aBoolean680 = this.anInt9507 != arg0;
			this.anInt9507 = arg0;
			return this.anIntArrayArray108[0];
		} else {
			@Pc(28) Class2_Sub30 local28 = this.aClass2_Sub30Array1[arg0];
			if (local28 == null) {
				this.aBoolean680 = true;
				if (this.anInt9508 >= this.anInt9509) {
					@Pc(48) Class2_Sub30 local48 = (Class2_Sub30) this.aClass114_57.method2758();
					local28 = new Class2_Sub30(arg0, local48.anInt5572);
					this.aClass2_Sub30Array1[local48.anInt5574] = null;
					local48.method8920();
				} else {
					local28 = new Class2_Sub30(arg0, this.anInt9508);
					this.anInt9508++;
				}
				this.aClass2_Sub30Array1[arg0] = local28;
			} else {
				this.aBoolean680 = false;
			}
			this.aClass114_57.method2759(local28);
			return this.anIntArrayArray108[local28.anInt5572];
		}
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)V")
	public void method8073() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9509; local3++) {
			this.anIntArrayArray108[local3] = null;
		}
		this.anIntArrayArray108 = null;
		this.aClass2_Sub30Array1 = null;
		this.aClass114_57.method2768();
		this.aClass114_57 = null;
	}
}
