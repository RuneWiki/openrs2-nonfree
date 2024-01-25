import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class269 {

	@OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
	private int anInt8251 = -1;

	@OriginalMember(owner = "client!qaa", name = "l", descriptor = "I")
	private int anInt8250 = 0;

	@OriginalMember(owner = "client!qaa", name = "i", descriptor = "Lclient!bq;")
	private Class43 aClass43_51 = new Class43();

	@OriginalMember(owner = "client!qaa", name = "q", descriptor = "Z")
	public boolean aBoolean591 = false;

	@OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
	private final int anInt8253;

	@OriginalMember(owner = "client!qaa", name = "p", descriptor = "I")
	private final int anInt8254;

	@OriginalMember(owner = "client!qaa", name = "h", descriptor = "[Lclient!as;")
	private Class8_Sub3[] aClass8_Sub3Array1;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(III)V")
	public Class269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8253 = arg1;
		this.anInt8254 = arg0;
		this.aClass8_Sub3Array1 = new Class8_Sub3[this.anInt8253];
		this.anIntArrayArrayArray12 = new int[this.anInt8254][3][arg2];
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
	public void method6814() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8254; local3++) {
			this.anIntArrayArrayArray12[local3][0] = null;
			this.anIntArrayArrayArray12[local3][1] = null;
			this.anIntArrayArrayArray12[local3][2] = null;
			this.anIntArrayArrayArray12[local3] = null;
		}
		this.anIntArrayArrayArray12 = null;
		this.aClass8_Sub3Array1 = null;
		this.aClass43_51.method1431();
		this.aClass43_51 = null;
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)[[[I")
	public int[][][] method6816() {
		if (this.anInt8254 != this.anInt8253) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt8254; local25++) {
			this.aClass8_Sub3Array1[local25] = Static608.aClass8_Sub3_1;
		}
		return this.anIntArrayArrayArray12;
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)[[I")
	public int[][] method6817(@OriginalArg(1) int arg0) {
		if (this.anInt8254 == this.anInt8253) {
			this.aBoolean591 = this.aClass8_Sub3Array1[arg0] == null;
			this.aClass8_Sub3Array1[arg0] = Static608.aClass8_Sub3_1;
			return this.anIntArrayArrayArray12[arg0];
		} else if (this.anInt8254 == 1) {
			this.aBoolean591 = this.anInt8251 != arg0;
			this.anInt8251 = arg0;
			return this.anIntArrayArrayArray12[0];
		} else {
			@Pc(30) Class8_Sub3 local30 = this.aClass8_Sub3Array1[arg0];
			if (local30 == null) {
				this.aBoolean591 = true;
				if (this.anInt8250 < this.anInt8254) {
					local30 = new Class8_Sub3(arg0, this.anInt8250);
					this.anInt8250++;
				} else {
					@Pc(65) Class8_Sub3 local65 = (Class8_Sub3) this.aClass43_51.method1421();
					local30 = new Class8_Sub3(arg0, local65.anInt1034);
					this.aClass8_Sub3Array1[local65.anInt1037] = null;
					local65.method8640();
				}
				this.aClass8_Sub3Array1[arg0] = local30;
			} else {
				this.aBoolean591 = false;
			}
			this.aClass43_51.method1434(local30);
			return this.anIntArrayArrayArray12[local30.anInt1034];
		}
	}
}
