import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class38 {

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	private int anInt1095 = 0;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	private int anInt1097 = -1;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!ow;")
	private Class271 aClass271_5 = new Class271();

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
	private final int anInt1094;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
	private final int anInt1093;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "[Lclient!kka;")
	private Class2_Sub38[] aClass2_Sub38Array1;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(III)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1094 = arg1;
		this.anInt1093 = arg0;
		this.aClass2_Sub38Array1 = new Class2_Sub38[this.anInt1094];
		this.anIntArrayArrayArray9 = new int[this.anInt1093][3][arg2];
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)[[[I")
	public int[][][] method1078() {
		if (this.anInt1094 != this.anInt1093) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt1093; local17++) {
			this.aClass2_Sub38Array1[local17] = Static519.aClass2_Sub38_1;
		}
		return this.anIntArrayArrayArray9;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public void method1079() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt1093; local9++) {
			this.anIntArrayArrayArray9[local9][0] = null;
			this.anIntArrayArrayArray9[local9][1] = null;
			this.anIntArrayArrayArray9[local9][2] = null;
			this.anIntArrayArrayArray9[local9] = null;
		}
		this.aClass2_Sub38Array1 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass271_5.method7181();
		this.aClass271_5 = null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)[[I")
	public int[][] method1080(@OriginalArg(1) int arg0) {
		if (this.anInt1093 == this.anInt1094) {
			this.aBoolean64 = this.aClass2_Sub38Array1[arg0] == null;
			this.aClass2_Sub38Array1[arg0] = Static519.aClass2_Sub38_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt1093 == 1) {
			this.aBoolean64 = this.anInt1097 != arg0;
			this.anInt1097 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(31) Class2_Sub38 local31 = this.aClass2_Sub38Array1[arg0];
			if (local31 == null) {
				this.aBoolean64 = true;
				if (this.anInt1093 > this.anInt1095) {
					local31 = new Class2_Sub38(arg0, this.anInt1095);
					this.anInt1095++;
				} else {
					@Pc(66) Class2_Sub38 local66 = (Class2_Sub38) this.aClass271_5.method7170();
					local31 = new Class2_Sub38(arg0, local66.anInt5797);
					this.aClass2_Sub38Array1[local66.anInt5796] = null;
					local66.method9825();
				}
				this.aClass2_Sub38Array1[arg0] = local31;
			} else {
				this.aBoolean64 = false;
			}
			this.aClass271_5.method7171(local31);
			return this.anIntArrayArrayArray9[local31.anInt5797];
		}
	}
}
