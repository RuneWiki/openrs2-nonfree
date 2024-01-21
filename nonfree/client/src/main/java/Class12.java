import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class12 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt752 = 0;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	private int anInt758 = -1;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!qd;")
	private Class65 aClass65_1 = new Class65();

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[Lclient!na;")
	private Class2_Sub17[] aClass2_Sub17Array1;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private final int anInt756;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	private final int anInt757;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(III)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub17Array1 = new Class2_Sub17[arg1];
		this.anIntArrayArrayArray3 = new int[arg0][3][arg2];
		this.anInt756 = arg0;
		this.anInt757 = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public void method480() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt756; local3++) {
			this.anIntArrayArrayArray3[local3][0] = null;
			this.anIntArrayArrayArray3[local3][1] = null;
			this.anIntArrayArrayArray3[local3][2] = null;
			this.anIntArrayArrayArray3[local3] = null;
		}
		this.anIntArrayArrayArray3 = null;
		this.aClass2_Sub17Array1 = null;
		this.aClass65_1.method2113();
		this.aClass65_1 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[[I")
	public int[][] method485(@OriginalArg(1) int arg0) {
		if (this.anInt757 == this.anInt756) {
			this.aBoolean24 = this.aClass2_Sub17Array1[arg0] == null;
			this.aClass2_Sub17Array1[arg0] = Static22.aClass2_Sub17_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt756 == 1) {
			this.aBoolean24 = arg0 != this.anInt758;
			this.anInt758 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(41) Class2_Sub17 local41 = this.aClass2_Sub17Array1[arg0];
			if (this.aBoolean24 = local41 == null) {
				if (this.anInt752 >= this.anInt756) {
					@Pc(65) Class2_Sub17 local65 = (Class2_Sub17) this.aClass65_1.method2122();
					local41 = new Class2_Sub17(arg0, local65.anInt2646);
					this.aClass2_Sub17Array1[local65.anInt2641] = null;
					local65.method2888();
				} else {
					local41 = new Class2_Sub17(arg0, this.anInt752);
					this.anInt752++;
				}
				this.aClass2_Sub17Array1[arg0] = local41;
			}
			this.aClass65_1.method2120(local41);
			return this.anIntArrayArrayArray3[local41.anInt2646];
		}
	}
}
