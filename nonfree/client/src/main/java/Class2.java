import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	private int anInt9 = 0;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	private int anInt13 = -1;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!sr;")
	private Class227 aClass227_1 = new Class227();

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Z")
	public boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	private final int anInt8;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	private final int anInt11;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "[Lclient!fp;")
	private Class1_Sub18[] aClass1_Sub18Array1;

	static {
		new Class119("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8 = arg0;
		this.anInt11 = arg1;
		this.anIntArrayArray1 = new int[this.anInt8][arg2];
		this.aClass1_Sub18Array1 = new Class1_Sub18[this.anInt11];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)[I")
	public int[] method10(@OriginalArg(0) int arg0) {
		if (this.anInt8 == this.anInt11) {
			this.aBoolean5 = this.aClass1_Sub18Array1[arg0] == null;
			this.aClass1_Sub18Array1[arg0] = Static417.aClass1_Sub18_1;
			return this.anIntArrayArray1[arg0];
		} else if (this.anInt8 == 1) {
			this.aBoolean5 = this.anInt13 != arg0;
			this.anInt13 = arg0;
			return this.anIntArrayArray1[0];
		} else {
			@Pc(70) Class1_Sub18 local70 = this.aClass1_Sub18Array1[arg0];
			if (local70 == null) {
				this.aBoolean5 = true;
				if (this.anInt8 <= this.anInt9) {
					@Pc(91) Class1_Sub18 local91 = (Class1_Sub18) this.aClass227_1.method4978();
					local70 = new Class1_Sub18(arg0, local91.anInt2193);
					this.aClass1_Sub18Array1[local91.anInt2189] = null;
					local91.method5915();
				} else {
					local70 = new Class1_Sub18(arg0, this.anInt9);
					this.anInt9++;
				}
				this.aClass1_Sub18Array1[arg0] = local70;
			} else {
				this.aBoolean5 = false;
			}
			this.aClass227_1.method4968(local70);
			return this.anIntArrayArray1[local70.anInt2193];
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public void method11() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8; local7++) {
			this.anIntArrayArray1[local7] = null;
		}
		this.aClass1_Sub18Array1 = null;
		this.anIntArrayArray1 = null;
		this.aClass227_1.method4981();
		this.aClass227_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)[[I")
	public int[][] method13() {
		if (this.anInt11 != this.anInt8) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt8; local22++) {
			this.aClass1_Sub18Array1[local22] = Static417.aClass1_Sub18_1;
		}
		return this.anIntArrayArray1;
	}
}
