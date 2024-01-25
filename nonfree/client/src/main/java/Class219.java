import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class219 {

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	private int anInt6658 = 0;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "I")
	private int anInt6653 = -1;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "Lclient!eea;")
	private Class71 aClass71_48 = new Class71();

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
	public boolean aBoolean423 = false;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	private final int anInt6657;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "I")
	private final int anInt6660;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "[Lclient!vo;")
	private Class3_Sub49[] aClass3_Sub49Array1;

	static {
		new Class67("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(III)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6657 = arg0;
		this.anInt6660 = arg1;
		this.anIntArrayArray61 = new int[this.anInt6657][arg2];
		this.aClass3_Sub49Array1 = new Class3_Sub49[this.anInt6660];
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[I")
	public int[] method5560(@OriginalArg(1) int arg0) {
		if (this.anInt6657 == this.anInt6660) {
			this.aBoolean423 = this.aClass3_Sub49Array1[arg0] == null;
			this.aClass3_Sub49Array1[arg0] = Static372.aClass3_Sub49_1;
			return this.anIntArrayArray61[arg0];
		} else if (this.anInt6657 == 1) {
			this.aBoolean423 = this.anInt6653 != arg0;
			this.anInt6653 = arg0;
			return this.anIntArrayArray61[0];
		} else {
			@Pc(71) Class3_Sub49 local71 = this.aClass3_Sub49Array1[arg0];
			if (local71 == null) {
				this.aBoolean423 = true;
				if (this.anInt6658 >= this.anInt6657) {
					@Pc(87) Class3_Sub49 local87 = (Class3_Sub49) this.aClass71_48.method2081();
					local71 = new Class3_Sub49(arg0, local87.anInt9023);
					this.aClass3_Sub49Array1[local87.anInt9020] = null;
					local87.method7820();
				} else {
					local71 = new Class3_Sub49(arg0, this.anInt6658);
					this.anInt6658++;
				}
				this.aClass3_Sub49Array1[arg0] = local71;
			} else {
				this.aBoolean423 = false;
			}
			this.aClass71_48.method2080(local71);
			return this.anIntArrayArray61[local71.anInt9023];
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public void method5565() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6657; local3++) {
			this.anIntArrayArray61[local3] = null;
		}
		this.aClass3_Sub49Array1 = null;
		this.anIntArrayArray61 = null;
		this.aClass71_48.method2088();
		this.aClass71_48 = null;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)[[I")
	public int[][] method5568() {
		if (this.anInt6657 != this.anInt6660) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt6657; local22++) {
			this.aClass3_Sub49Array1[local22] = Static372.aClass3_Sub49_1;
		}
		return this.anIntArrayArray61;
	}
}
