import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class281 {

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
	private int anInt8004 = 0;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
	private int anInt8006 = -1;

	@OriginalMember(owner = "client!tda", name = "l", descriptor = "Lclient!ui;")
	private Class295 aClass295_49 = new Class295();

	@OriginalMember(owner = "client!tda", name = "v", descriptor = "Z")
	public boolean aBoolean590 = false;

	@OriginalMember(owner = "client!tda", name = "u", descriptor = "I")
	private final int anInt8016;

	@OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
	private final int anInt8009;

	@OriginalMember(owner = "client!tda", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!tda", name = "m", descriptor = "[Lclient!kca;")
	private Class1_Sub28[] aClass1_Sub28Array1;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(III)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8016 = arg1;
		this.anInt8009 = arg0;
		this.anIntArrayArrayArray19 = new int[this.anInt8009][3][arg2];
		this.aClass1_Sub28Array1 = new Class1_Sub28[this.anInt8016];
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(II)[[I")
	public int[][] method7073(@OriginalArg(0) int arg0) {
		if (this.anInt8016 == this.anInt8009) {
			this.aBoolean590 = this.aClass1_Sub28Array1[arg0] == null;
			this.aClass1_Sub28Array1[arg0] = Static459.aClass1_Sub28_1;
			return this.anIntArrayArrayArray19[arg0];
		} else if (this.anInt8009 == 1) {
			this.aBoolean590 = this.anInt8006 != arg0;
			this.anInt8006 = arg0;
			return this.anIntArrayArrayArray19[0];
		} else {
			@Pc(32) Class1_Sub28 local32 = this.aClass1_Sub28Array1[arg0];
			if (local32 == null) {
				this.aBoolean590 = true;
				if (this.anInt8004 >= this.anInt8009) {
					@Pc(53) Class1_Sub28 local53 = (Class1_Sub28) this.aClass295_49.method7535();
					local32 = new Class1_Sub28(arg0, local53.anInt4716);
					this.aClass1_Sub28Array1[local53.anInt4712] = null;
					local53.method8239();
				} else {
					local32 = new Class1_Sub28(arg0, this.anInt8004);
					this.anInt8004++;
				}
				this.aClass1_Sub28Array1[arg0] = local32;
			} else {
				this.aBoolean590 = false;
			}
			this.aClass295_49.method7546(local32);
			return this.anIntArrayArrayArray19[local32.anInt4716];
		}
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)[[[I")
	public int[][][] method7076() {
		if (this.anInt8016 != this.anInt8009) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt8009; local17++) {
			this.aClass1_Sub28Array1[local17] = Static459.aClass1_Sub28_1;
		}
		return this.anIntArrayArrayArray19;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V")
	public void method7077() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8009; local3++) {
			this.anIntArrayArrayArray19[local3][0] = null;
			this.anIntArrayArrayArray19[local3][1] = null;
			this.anIntArrayArrayArray19[local3][2] = null;
			this.anIntArrayArrayArray19[local3] = null;
		}
		this.aClass1_Sub28Array1 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass295_49.method7541();
		this.aClass295_49 = null;
	}
}
