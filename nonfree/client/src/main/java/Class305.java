import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class305 {

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
	private int anInt8165 = 0;

	@OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
	private int anInt8159 = -1;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "Lclient!sja;")
	private Class342 aClass342_65 = new Class342();

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Z")
	public boolean aBoolean550 = false;

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
	private final int anInt8158;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
	private final int anInt8162;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "[Lclient!gla;")
	private Class3_Sub26[] aClass3_Sub26Array1;

	@OriginalMember(owner = "client!qea", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(III)V")
	public Class305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8158 = arg0;
		this.anInt8162 = arg1;
		this.aClass3_Sub26Array1 = new Class3_Sub26[this.anInt8162];
		this.anIntArrayArray42 = new int[this.anInt8158][arg2];
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)[[I")
	public int[][] method6986() {
		if (this.anInt8158 != this.anInt8162) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt8158; local26++) {
			this.aClass3_Sub26Array1[local26] = Static696.aClass3_Sub26_1;
		}
		return this.anIntArrayArray42;
	}

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "(B)V")
	public void method6988() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8158; local3++) {
			this.anIntArrayArray42[local3] = null;
		}
		this.aClass3_Sub26Array1 = null;
		this.anIntArrayArray42 = null;
		this.aClass342_65.method7655();
		this.aClass342_65 = null;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)[I")
	public int[] method6989(@OriginalArg(0) int arg0) {
		if (this.anInt8158 == this.anInt8162) {
			this.aBoolean550 = this.aClass3_Sub26Array1[arg0] == null;
			this.aClass3_Sub26Array1[arg0] = Static696.aClass3_Sub26_1;
			return this.anIntArrayArray42[arg0];
		} else if (this.anInt8158 == 1) {
			this.aBoolean550 = arg0 != this.anInt8159;
			this.anInt8159 = arg0;
			return this.anIntArrayArray42[0];
		} else {
			@Pc(77) Class3_Sub26 local77 = this.aClass3_Sub26Array1[arg0];
			if (local77 == null) {
				this.aBoolean550 = true;
				if (this.anInt8158 > this.anInt8165) {
					local77 = new Class3_Sub26(arg0, this.anInt8165);
					this.anInt8165++;
				} else {
					@Pc(121) Class3_Sub26 local121 = (Class3_Sub26) this.aClass342_65.method7656();
					local77 = new Class3_Sub26(arg0, local121.anInt3563);
					this.aClass3_Sub26Array1[local121.anInt3562] = null;
					local121.method9596();
				}
				this.aClass3_Sub26Array1[arg0] = local77;
			} else {
				this.aBoolean550 = false;
			}
			this.aClass342_65.method7651(local77);
			return this.anIntArrayArray42[local77.anInt3563];
		}
	}
}
