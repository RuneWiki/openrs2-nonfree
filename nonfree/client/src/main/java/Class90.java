import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class90 {

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	private int anInt2953 = -1;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
	private int anInt2959 = 0;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Lclient!kn;")
	private Class116 aClass116_16 = new Class116();

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
	private final int anInt2952;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	private final int anInt2951;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "[Lclient!ai;")
	private Class4_Sub2[] aClass4_Sub2Array1;

	static {
		new Class159("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(III)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2952 = arg1;
		this.anInt2951 = arg0;
		this.anIntArrayArrayArray15 = new int[this.anInt2951][3][arg2];
		this.aClass4_Sub2Array1 = new Class4_Sub2[this.anInt2952];
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)[[[I")
	public int[][][] method2573() {
		if (this.anInt2951 != this.anInt2952) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt2951; local21++) {
			this.aClass4_Sub2Array1[local21] = Static65.aClass4_Sub2_1;
		}
		return this.anIntArrayArrayArray15;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)[[I")
	public int[][] method2575(@OriginalArg(1) int arg0) {
		if (this.anInt2951 == this.anInt2952) {
			this.aBoolean211 = this.aClass4_Sub2Array1[arg0] == null;
			this.aClass4_Sub2Array1[arg0] = Static65.aClass4_Sub2_1;
			return this.anIntArrayArrayArray15[arg0];
		} else if (this.anInt2951 == 1) {
			this.aBoolean211 = arg0 != this.anInt2953;
			this.anInt2953 = arg0;
			return this.anIntArrayArrayArray15[0];
		} else {
			@Pc(50) Class4_Sub2 local50 = this.aClass4_Sub2Array1[arg0];
			if (local50 == null) {
				this.aBoolean211 = true;
				if (this.anInt2959 >= this.anInt2951) {
					@Pc(71) Class4_Sub2 local71 = (Class4_Sub2) this.aClass116_16.method3278();
					local50 = new Class4_Sub2(arg0, local71.anInt188);
					this.aClass4_Sub2Array1[local71.anInt186] = null;
					local71.method5687();
				} else {
					local50 = new Class4_Sub2(arg0, this.anInt2959);
					this.anInt2959++;
				}
				this.aClass4_Sub2Array1[arg0] = local50;
			} else {
				this.aBoolean211 = false;
			}
			this.aClass116_16.method3276(local50);
			return this.anIntArrayArrayArray15[local50.anInt188];
		}
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
	public void method2577() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2951; local3++) {
			this.anIntArrayArrayArray15[local3][0] = null;
			this.anIntArrayArrayArray15[local3][1] = null;
			this.anIntArrayArrayArray15[local3][2] = null;
			this.anIntArrayArrayArray15[local3] = null;
		}
		this.aClass4_Sub2Array1 = null;
		this.anIntArrayArrayArray15 = null;
		this.aClass116_16.method3273();
		this.aClass116_16 = null;
	}
}
