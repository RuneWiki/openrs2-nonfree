import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class43 {

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
	private int anInt1763 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	private int anInt1760 = 0;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!dc;")
	private Class19 aClass19_7 = new Class19();

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	private final int anInt1761;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
	private final int anInt1765;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "[Lclient!q;")
	private Class2_Sub21[] aClass2_Sub21Array1;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1761 = arg0;
		this.anInt1765 = arg1;
		this.aClass2_Sub21Array1 = new Class2_Sub21[this.anInt1765];
		this.anIntArrayArrayArray5 = new int[this.anInt1761][3][arg2];
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public void method1430() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt1761; local13++) {
			this.anIntArrayArrayArray5[local13][0] = null;
			this.anIntArrayArrayArray5[local13][1] = null;
			this.anIntArrayArrayArray5[local13][2] = null;
			this.anIntArrayArrayArray5[local13] = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.aClass2_Sub21Array1 = null;
		this.aClass19_7.method685();
		this.aClass19_7 = null;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)[[[I")
	public int[][][] method1431() {
		if (this.anInt1761 != this.anInt1765) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt1761; local23++) {
			this.aClass2_Sub21Array1[local23] = Static197.aClass2_Sub21_1;
		}
		return this.anIntArrayArrayArray5;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)[[I")
	public int[][] method1433(@OriginalArg(1) int arg0) {
		if (this.anInt1761 == this.anInt1765) {
			this.aBoolean92 = this.aClass2_Sub21Array1[arg0] == null;
			this.aClass2_Sub21Array1[arg0] = Static197.aClass2_Sub21_1;
			return this.anIntArrayArrayArray5[arg0];
		} else if (this.anInt1761 == 1) {
			this.aBoolean92 = arg0 != this.anInt1763;
			this.anInt1763 = arg0;
			return this.anIntArrayArrayArray5[0];
		} else {
			@Pc(65) Class2_Sub21 local65 = this.aClass2_Sub21Array1[arg0];
			if (local65 == null) {
				this.aBoolean92 = true;
				if (this.anInt1761 > this.anInt1760) {
					local65 = new Class2_Sub21(arg0, this.anInt1760);
					this.anInt1760++;
				} else {
					@Pc(101) Class2_Sub21 local101 = (Class2_Sub21) this.aClass19_7.method683();
					local65 = new Class2_Sub21(arg0, local101.anInt3094);
					this.aClass2_Sub21Array1[local101.anInt3091] = null;
					local101.method3254();
				}
				this.aClass2_Sub21Array1[arg0] = local65;
			} else {
				this.aBoolean92 = false;
			}
			this.aClass19_7.method682(local65);
			return this.anIntArrayArrayArray5[local65.anInt3094];
		}
	}
}
