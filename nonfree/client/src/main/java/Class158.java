import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class158 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	private int anInt4034 = 0;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	private int anInt4039 = -1;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!ld;")
	private Class135 aClass135_27 = new Class135();

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
	public boolean aBoolean265 = false;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	private final int anInt4037;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private final int anInt4033;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!se;")
	private Class2_Sub33[] aClass2_Sub33Array1;

	static {
		new Class79("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V", line = 769)
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4037 = arg0;
		this.anInt4033 = arg1;
		this.anIntArrayArray34 = new int[this.anInt4037][arg2];
		this.aClass2_Sub33Array1 = new Class2_Sub33[this.anInt4033];
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 6)
	public void method3995() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4037; local3++) {
			this.anIntArrayArray34[local3] = null;
		}
		this.aClass2_Sub33Array1 = null;
		this.anIntArrayArray34 = null;
		this.aClass135_27.method3545();
		this.aClass135_27 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I", line = 597)
	public int[] method3997(@OriginalArg(0) int arg0) {
		if (this.anInt4033 == this.anInt4037) {
			this.aBoolean265 = this.aClass2_Sub33Array1[arg0] == null;
			this.aClass2_Sub33Array1[arg0] = Class2_Sub2_Sub8.aClass2_Sub33_1;
			return this.anIntArrayArray34[arg0];
		} else if (this.anInt4037 == 1) {
			this.aBoolean265 = this.anInt4039 != arg0;
			this.anInt4039 = arg0;
			return this.anIntArrayArray34[0];
		} else {
			@Pc(27) Class2_Sub33 local27 = this.aClass2_Sub33Array1[arg0];
			if (local27 == null) {
				this.aBoolean265 = true;
				if (this.anInt4034 >= this.anInt4037) {
					@Pc(52) Class2_Sub33 local52 = (Class2_Sub33) this.aClass135_27.method3549();
					local27 = new Class2_Sub33(arg0, local52.anInt5921);
					this.aClass2_Sub33Array1[local52.anInt5920] = null;
					local52.method6469();
				} else {
					local27 = new Class2_Sub33(arg0, this.anInt4034);
					this.anInt4034++;
				}
				this.aClass2_Sub33Array1[arg0] = local27;
			} else {
				this.aBoolean265 = false;
			}
			this.aClass135_27.method3546(local27);
			return this.anIntArrayArray34[local27.anInt5921];
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)[[I", line = 724)
	public int[][] method3999() {
		if (this.anInt4037 != this.anInt4033) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4037; local21++) {
			this.aClass2_Sub33Array1[local21] = Class2_Sub2_Sub8.aClass2_Sub33_1;
		}
		return this.anIntArrayArray34;
	}
}
