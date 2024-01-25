import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class2_Sub4_Sub39 extends Class2_Sub4 {

	@OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
	private int anInt9472;

	@OriginalMember(owner = "client!wea", name = "H", descriptor = "[I")
	private int[] anIntArray613;

	@OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
	private int anInt9475;

	@OriginalMember(owner = "client!wea", name = "B", descriptor = "I")
	private int anInt9470 = -1;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub39() {
		super(0, false);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7565(arg0, arg1);
		if (this.anInt9470 >= 0 && Static225.anInterface9_2 != null) {
			@Pc(27) int local27 = Static225.anInterface9_2.method1074(this.anInt9470).aBoolean602 ? 64 : 128;
			this.anIntArray613 = Static225.anInterface9_2.method1076(1.0F, local27, false, local27, this.anInt9470);
			this.anInt9472 = local27;
			this.anInt9475 = local27;
		}
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
	@Override
	public void method7558() {
		super.method7558();
		this.anIntArray613 = null;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(33) int local33 = this.anInt9475 * (this.anInt9472 == Static42.anInt782 ? arg0 : arg0 * this.anInt9472 / Static42.anInt782);
			@Pc(37) int[] local37 = local13[0];
			@Pc(41) int[] local41 = local13[1];
			@Pc(45) int[] local45 = local13[2];
			@Pc(51) int local51;
			@Pc(59) int local59;
			if (this.anInt9475 == Static143.anInt7434) {
				for (local51 = 0; local51 < Static143.anInt7434; local51++) {
					local59 = this.anIntArray613[local33++];
					local45[local51] = (local59 & 0xFF) << 4;
					local41[local51] = local59 >> 4 & 0xFF0;
					local37[local51] = local59 >> 12 & 0xFF0;
				}
			} else {
				for (local51 = 0; local51 < Static143.anInt7434; local51++) {
					local59 = local51 * this.anInt9475 / Static143.anInt7434;
					@Pc(112) int local112 = this.anIntArray613[local33 + local59];
					local45[local51] = (local112 & 0xFF) << 4;
					local41[local51] = local112 >> 4 & 0xFF0;
					local37[local51] = local112 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I")
	@Override
	public int method7557() {
		return this.anInt9470;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt9470 = arg1.method4518();
		}
	}
}
