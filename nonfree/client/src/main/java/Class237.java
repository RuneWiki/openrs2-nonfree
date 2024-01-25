import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class237 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	private int anInt6242 = 0;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	private int anInt6244 = -1;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!cf;")
	private Class30 aClass30_42 = new Class30();

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Z")
	public boolean aBoolean441 = false;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
	private final int anInt6243;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	private final int anInt6241;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "[Lclient!al;")
	private Class2_Sub5[] aClass2_Sub5Array1;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	static {
		new Class32("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(III)V")
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6243 = arg1;
		this.anInt6241 = arg0;
		this.aClass2_Sub5Array1 = new Class2_Sub5[this.anInt6243];
		this.anIntArrayArray57 = new int[this.anInt6241][arg2];
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)[[I")
	public int[][] method5429() {
		if (this.anInt6243 != this.anInt6241) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6241; local17++) {
			this.aClass2_Sub5Array1[local17] = Static326.aClass2_Sub5_1;
		}
		return this.anIntArrayArray57;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)[I")
	public int[] method5430(@OriginalArg(1) int arg0) {
		if (this.anInt6241 == this.anInt6243) {
			this.aBoolean441 = this.aClass2_Sub5Array1[arg0] == null;
			this.aClass2_Sub5Array1[arg0] = Static326.aClass2_Sub5_1;
			return this.anIntArrayArray57[arg0];
		} else if (this.anInt6241 == 1) {
			this.aBoolean441 = arg0 != this.anInt6244;
			this.anInt6244 = arg0;
			return this.anIntArrayArray57[0];
		} else {
			@Pc(48) Class2_Sub5 local48 = this.aClass2_Sub5Array1[arg0];
			if (local48 == null) {
				this.aBoolean441 = true;
				if (this.anInt6241 <= this.anInt6242) {
					@Pc(73) Class2_Sub5 local73 = (Class2_Sub5) this.aClass30_42.method696();
					local48 = new Class2_Sub5(arg0, local73.anInt251);
					this.aClass2_Sub5Array1[local73.anInt247] = null;
					local73.method5617();
				} else {
					local48 = new Class2_Sub5(arg0, this.anInt6242);
					this.anInt6242++;
				}
				this.aClass2_Sub5Array1[arg0] = local48;
			} else {
				this.aBoolean441 = false;
			}
			this.aClass30_42.method693(local48);
			return this.anIntArrayArray57[local48.anInt251];
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	public void method5431() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt6241; local13++) {
			this.anIntArrayArray57[local13] = null;
		}
		this.aClass2_Sub5Array1 = null;
		this.anIntArrayArray57 = null;
		this.aClass30_42.method692();
		this.aClass30_42 = null;
	}
}
