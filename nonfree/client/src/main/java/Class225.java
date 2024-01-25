import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class225 {

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private int anInt6657 = -1;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	private int anInt6658 = 0;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!pu;")
	private Class203 aClass203_44 = new Class203();

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Z")
	public boolean aBoolean421 = false;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private final int anInt6662;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private final int anInt6655;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[Lclient!ev;")
	private Class1_Sub16[] aClass1_Sub16Array1;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	static {
		new Class158("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6662 = arg1;
		this.anInt6655 = arg0;
		this.aClass1_Sub16Array1 = new Class1_Sub16[this.anInt6662];
		this.anIntArrayArray53 = new int[this.anInt6655][arg2];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public void method5083() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt6655; local13++) {
			this.anIntArrayArray53[local13] = null;
		}
		this.aClass1_Sub16Array1 = null;
		this.anIntArrayArray53 = null;
		this.aClass203_44.method4553();
		this.aClass203_44 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)[I")
	public int[] method5085(@OriginalArg(0) int arg0) {
		if (this.anInt6662 == this.anInt6655) {
			this.aBoolean421 = this.aClass1_Sub16Array1[arg0] == null;
			this.aClass1_Sub16Array1[arg0] = Static120.aClass1_Sub16_1;
			return this.anIntArrayArray53[arg0];
		} else if (this.anInt6655 == 1) {
			this.aBoolean421 = this.anInt6657 != arg0;
			this.anInt6657 = arg0;
			return this.anIntArrayArray53[0];
		} else {
			@Pc(65) Class1_Sub16 local65 = this.aClass1_Sub16Array1[arg0];
			if (local65 == null) {
				this.aBoolean421 = true;
				if (this.anInt6655 <= this.anInt6658) {
					@Pc(81) Class1_Sub16 local81 = (Class1_Sub16) this.aClass203_44.method4556();
					local65 = new Class1_Sub16(arg0, local81.anInt2439);
					this.aClass1_Sub16Array1[local81.anInt2437] = null;
					local81.method6178();
				} else {
					local65 = new Class1_Sub16(arg0, this.anInt6658);
					this.anInt6658++;
				}
				this.aClass1_Sub16Array1[arg0] = local65;
			} else {
				this.aBoolean421 = false;
			}
			this.aClass203_44.method4555(local65);
			return this.anIntArrayArray53[local65.anInt2439];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)[[I")
	public int[][] method5086() {
		if (this.anInt6655 != this.anInt6662) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt6655; local21++) {
			this.aClass1_Sub16Array1[local21] = Static120.aClass1_Sub16_1;
		}
		return this.anIntArrayArray53;
	}
}
